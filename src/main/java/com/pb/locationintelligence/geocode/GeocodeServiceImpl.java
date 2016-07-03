/*******************************************************************************
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  
 *  See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/
package com.pb.locationintelligence.geocode;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import com.pb.locationintelligence.geocode.model.Reverse.Point;
import com.pb.locationintelligence.geocode.model.Reverse.ReverseGeocodeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.pb.locationintelligence.RequestObserver;
import com.pb.locationintelligence.exception.SdkException;
import com.pb.locationintelligence.geocode.model.dictionaries.ConfiguredDictionariesResponse;
import com.pb.locationintelligence.geocode.model.forward.Address;
import com.pb.locationintelligence.geocode.custompreferences.ICustomPreference;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceAUS;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceCAN;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceDEU;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceFRA;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceGBR;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceNZL;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferencePRT;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceSGP;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceSWE;
import com.pb.locationintelligence.geocode.custompreferences.impl.CustomPreferenceUSA;
import com.pb.locationintelligence.geocode.model.GeocodeServiceRequest;
import com.pb.locationintelligence.geocode.model.GeocodeServiceResponseList;
import com.pb.locationintelligence.geocode.model.capabilities.GeocodeCapabilitiesResponse;
import com.pb.locationintelligence.geocode.preferences.GeocodePreferenceBuilder;
import com.pb.locationintelligence.utils.UrlMaker;
import com.pb.locationintelligence.utils.Utility;

public class GeocodeServiceImpl implements GeocodeService {

	private static final Logger _LOG = LoggerFactory.getLogger(GeocodeServiceImpl.class);

	private static final String COUNTRY_ISO_NAME_FIELD = "countryISO";

	private static final String COUNTRY_FIELD = "Country";

	private static final String DOT = ".";

	private static final String SPACE = " ";

	private static final String BLANK = "";

	private static final String RETURNED_CUSTOM_FIELD_KEYS = "returnedCustomFieldKeys";

	private static final String geocodeURL = "/geocode-service/v1/transient/{bundleName}/";

	private static final String dictionaryURL = "dictionaries";

	private static final String capabilityURL = "capabilities";

	private static final String forwardGeocodeURL = "geocode";

	private static final String reverseGeocodeURL = "reverseGeocode";

	@Override
	public ConfiguredDictionariesResponse getConfiguredDictionaries(Countries countries, BundleType bundleType)
			throws SdkException {
		return processDictionaries(countries, bundleType);
	}

	@Override
	public ConfiguredDictionariesResponse getConfiguredDictionaries(BundleType bundleType) throws SdkException {
		return processDictionaries(null, bundleType);
	}

	@Override
	public void getConfigureDictionariesAsync(final Countries countries, final BundleType bundleType,
			final RequestObserver<ConfiguredDictionariesResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {

					ConfiguredDictionariesResponse dictionaries = getConfiguredDictionaries(countries, bundleType);
					requestObserver.onSuccess(dictionaries);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public void getConfigureDictionariesAsync(final BundleType bundleType,
			final RequestObserver<ConfiguredDictionariesResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {

					ConfiguredDictionariesResponse dictionaries = getConfiguredDictionaries(bundleType);
					requestObserver.onSuccess(dictionaries);
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	private ConfiguredDictionariesResponse processDictionaries(Countries countries, BundleType bundleType)
			throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();
		String url = Utility.decoratedURL(geocodeURL, bundleType.value(), dictionaryURL);
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));
		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		if (countries != null) {
			keyValueMap.put("country", Utility.getCountryCode(countries.value()));
		}
		Utility.appendIfNotNull(urlBuilder, keyValueMap);
		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), ConfiguredDictionariesResponse.class);
	}

	@Override
	public GeocodeCapabilitiesResponse getCapabilities(BundleType bundleName) throws SdkException {
		String bundle = bundleName.value();

		return processCapabilities(null, null, bundle);

	}

	@Override
	public GeocodeCapabilitiesResponse getCapabilities(Countries countryName, BundleType bundleName)
			throws SdkException {
		String country = countryName.value();
		String bundle = bundleName.value();

		return processCapabilities(country, null, bundle);
	}

	@Override
	public GeocodeCapabilitiesResponse getCapabilities(OperationType operation, BundleType bundleName)
			throws SdkException {
		String opration = operation.value();
		String bundle = bundleName.value();

		return processCapabilities(null, opration, bundle);
	}

	@Override
	public GeocodeCapabilitiesResponse getCapabilities(Countries countryName, OperationType operation,
			BundleType bundleName) throws SdkException {
		String country = countryName.value();
		String opration = operation.value();
		String bundle = bundleName.value();

		return processCapabilities(country, opration, bundle);
	}

	@Override
	public void getCapabilitiesAsync(BundleType bundleName,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		String bundle = bundleName.value();

		processCapabilitiesAsync(null, null, bundle, requestObserver);
	}

	@Override
	public void getCapabilitiesAsync(Countries countryName, BundleType bundleName,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		String country = countryName.value();
		String bundle = bundleName.value();

		processCapabilitiesAsync(country, null, bundle, requestObserver);
	}

	@Override
	public void getCapabilitiesAsync(OperationType operation, BundleType bundleName,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		String opration = operation.value();
		String bundle = bundleName.value();

		processCapabilitiesAsync(null, opration, bundle, requestObserver);
	}

	@Override
	public void getCapabilitiesAsync(Countries countryName, OperationType operation, BundleType bundleName,
			RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		String country = countryName.value();
		String opration = operation.value();
		String bundle = bundleName.value();

		processCapabilitiesAsync(country, opration, bundle, requestObserver);

	}

	private GeocodeCapabilitiesResponse processCapabilities(String country, String operation, String bundle)
			throws SdkException {
		UrlMaker urlMaker = UrlMaker.getInstance();
		String url = Utility.decoratedURL(geocodeURL, bundle, capabilityURL);
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));

		Map<String, Object> keyValueMap = new HashMap<String, Object>();
		if (country != null) {
			keyValueMap.put("country", Utility.getCountryCode(country));
		}
		if (operation != null) {
			keyValueMap.put("operation", operation);
		}

		Utility.appendIfNotNull(urlBuilder, keyValueMap);

		_LOG.debug("API URL : " + urlBuilder);
		return Utility.processAPIRequest(urlBuilder.toString(), GeocodeCapabilitiesResponse.class);

	}

	private void processCapabilitiesAsync(final String country, final String operation, final String bundle,
			final RequestObserver<GeocodeCapabilitiesResponse> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {

					GeocodeCapabilitiesResponse geocodeCapabilitiesResponse = processCapabilities(country, operation,
							bundle);
					requestObserver.onSuccess(geocodeCapabilitiesResponse);
					
				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});

	}

	@Override
	public GeocodeServiceResponseList getReverseGeocode(Point points, BundleType bundleType) throws SdkException  {
		List<Point> list= new ArrayList<Point>();
		list.add(points);
		GeocodeServiceResponseList geocodeServiceResponseList= processReverseGeocodeBatch(list,bundleType,null);		
		return geocodeServiceResponseList;
	}

	@Override
	public GeocodeServiceResponseList getReverseGeocodeAdvancedBatch(List<Point> points, BundleType bundleName,
			GeocodePreferenceBuilder preferenceBuilder) throws SdkException {

		return processReverseGeocodeBatch(points, bundleName, preferenceBuilder);
	}

	@Override
	public void getReverseGeocodeAdvancedBatchAsync(final List<Point> points, final BundleType bundleName,
			final GeocodePreferenceBuilder preferenceBuilder,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					GeocodeServiceResponseList geocodeServiceResponse = processReverseGeocodeBatch(points, bundleName,
							preferenceBuilder);
					requestObserver.onSuccess(geocodeServiceResponse);

				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public GeocodeServiceResponseList getReverseGeocodeBatch(List<Point> points, BundleType bundleName)
			throws SdkException {
		return processReverseGeocodeBatch(points, bundleName, null);
	}

	@Override
	public void getReverseGeocodeBatchAsync(final List<Point> points, final BundleType bundleName,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					GeocodeServiceResponseList geocodeServiceResponse = processReverseGeocodeBatch(points, bundleName,
							null);
					requestObserver.onSuccess(geocodeServiceResponse);

				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public void getReverseGeocodeAsync(Point point, final BundleType bundleType, final RequestObserver<GeocodeServiceResponseList> requestObserver) {
		final List<Point> points= new ArrayList<Point>();
		points.add(point);
		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					GeocodeServiceResponseList geocodeServiceResponse = processReverseGeocodeBatch(points, bundleType,
							null);
					requestObserver.onSuccess(geocodeServiceResponse);

				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});

	}

	@Override
	public void getGeocodeAsync(final Address address, final BundleType bundleName,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {

		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					List<Address> addresses = new ArrayList<Address>();
					addresses.add(address);
					GeocodeServiceResponseList geocodeServiceResponseList = processGeocodeRequest(addresses, bundleName,
							null);

					requestObserver.onSuccess(geocodeServiceResponseList);

				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public GeocodeServiceResponseList getGeocode(Address address, BundleType bundleName) throws SdkException {
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		return processGeocodeRequest(addresses, bundleName, null);
	}

	@Override
	public void getGeocodeBatchAsync(final List<Address> addresses, final BundleType bundleName,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {

		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					GeocodeServiceResponseList geocodeServiceResponseList = processGeocodeRequest(addresses, bundleName,
							null);

					requestObserver.onSuccess(geocodeServiceResponseList);

				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	@Override
	public GeocodeServiceResponseList getGeocodeBatch(List<Address> addresses, BundleType bundleName)
			throws SdkException {

		return processGeocodeRequest(addresses, bundleName, null);
	}

	@Override
	public GeocodeServiceResponseList getGeocodeAdvancedBatch(List<Address> addresses, BundleType bundleName,
			GeocodePreferenceBuilder preferenceBuilder) throws SdkException {

		return processGeocodeRequest(addresses, bundleName, preferenceBuilder);
	}

	@Override
	public void getGeocodeAdvancedBatchAsync(final List<Address> addresses, final BundleType bundleName,
			final GeocodePreferenceBuilder preferenceBuilder,
			final RequestObserver<GeocodeServiceResponseList> requestObserver) {

		final ExecutorService executorService = Executors.newFixedThreadPool(1);
		executorService.submit(new Runnable() {
			@Override
			public void run() {
				try {
					GeocodeServiceResponseList geocodeServiceResponseList = processGeocodeRequest(addresses, bundleName,
							preferenceBuilder);

					requestObserver.onSuccess(geocodeServiceResponseList);

				} catch (SdkException e) {
					requestObserver.onFailure(e);
				}
				
				finally{
					executorService.shutdown();					
				}
			}
		});
	}

	private GeocodeServiceResponseList processGeocodeRequest(List<Address> addresses, BundleType bundleName,
			GeocodePreferenceBuilder preferenceBuilder) throws SdkException {

		String bundle = bundleName == null ? null : bundleName.value();
		UrlMaker urlMaker = UrlMaker.getInstance();
		String url = Utility.decoratedURL(geocodeURL, bundle, forwardGeocodeURL);
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));

		GeocodeServiceRequest request = new GeocodeServiceRequest();

		request.getAddresses().addAll(addresses);

		if (preferenceBuilder != null) {
			request.setPreferences(preferenceBuilder.getGeocodePreference());

			buildGeocodeCustomPreferences(preferenceBuilder.getCustomPreferences(), preferenceBuilder);

			request.getPreferences()
					.setCustomPreferences(preferenceBuilder.getGeocodePreference().getCustomPreferences());
		}

		Gson gson = new Gson();

		_LOG.debug("API URL : " + urlBuilder);
		Entity paramEntity = Entity.entity(gson.toJson(request), MediaType.APPLICATION_JSON_TYPE);

		return Utility.processPOSTRequest(paramEntity, urlBuilder.toString(), GeocodeServiceResponseList.class);

	}

	private GeocodeServiceResponseList processReverseGeocodeBatch(List<Point> points, BundleType bundleName,
			GeocodePreferenceBuilder preferenceBuilder) throws SdkException {
		String bundle = bundleName == null ? null : bundleName.value();
		UrlMaker urlMaker = UrlMaker.getInstance();
		String url = Utility.decoratedURL(geocodeURL, bundle, reverseGeocodeURL);
		StringBuilder urlBuilder = new StringBuilder(urlMaker.getAbsoluteUrl(url));

		ReverseGeocodeRequest request = new ReverseGeocodeRequest();
		if (preferenceBuilder != null) {
			request.setPreferences(preferenceBuilder.getGeocodePreference());
			
			buildGeocodeCustomPreferences(preferenceBuilder.getCustomPreferences(), preferenceBuilder);
			request.getPreferences().setCustomPreferences(preferenceBuilder.getGeocodePreference().getCustomPreferences());
		}
		
		request.getPoints().addAll(points);
		_LOG.debug("API URL : " + urlBuilder);
		Gson gson = new Gson();
		Entity paramEntity = Entity.entity(gson.toJson(request), MediaType.APPLICATION_JSON);
		return Utility.processPOSTRequest(paramEntity, urlBuilder.toString(), GeocodeServiceResponseList.class);

	}

	private void buildGeocodeCustomPreferences(List<ICustomPreference> customPreferences,
			GeocodePreferenceBuilder preferenceBuilder) {

		try {

			if (customPreferences != null && !customPreferences.isEmpty()) {

				Map customPreferenceMap = new LinkedHashMap();
				for (ICustomPreference customPreference : customPreferences) {
					processCustomPreferencesForDefinedCountries(customPreferenceMap, customPreference);
					processCustomPreferencesForUnDefinedCountries(customPreferenceMap, customPreference);

					processReturnedCustomFieldKeysPreference(customPreferenceMap, customPreference);

				}

				preferenceBuilder.getGeocodePreference().setCustomPreferences(customPreferenceMap);

			}

		} catch (IllegalArgumentException e) {
			_LOG.error("Error while processing custom preferences" + e.getMessage());
		} catch (IllegalAccessException e) {
			_LOG.error("Error while processing custom preferences" + e.getMessage());
		} catch (NoSuchFieldException e) {
			_LOG.error("Error while processing custom preferences" + e.getMessage());
		} catch (SecurityException e) {
			_LOG.error("Error while processing custom preferences" + e.getMessage());
		}

	}

	private void processCustomPreferencesForDefinedCountries(Map customPreferenceMap,
			ICustomPreference customPreference)
					throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		if (customPreference != null && isCustomPreferenceOfDefinedCountries(customPreference)) {

			Field[] fields = customPreference.getClass().getFields();
			Field countryIsoCodeField = customPreference.getClass().getField(COUNTRY_ISO_NAME_FIELD);
			String countryIsoCode;

			countryIsoCode = countryIsoCodeField.get(customPreference).toString();

			for (Field field : fields) {
				field.setAccessible(true);

				if (field.get(customPreference) != null) {
					String fieldValue = field.get(customPreference).toString();
					String fieldName = field.getName();
					String preferenceKEY = countryIsoCode + DOT + fieldName;
					customPreferenceMap.put(preferenceKEY, fieldValue);

				}

			}

		}

	}

	private void processCustomPreferencesForUnDefinedCountries(Map customPreferenceMap,
			ICustomPreference customPreference)
					throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {

		if (customPreference != null && !isCustomPreferenceOfDefinedCountries(customPreference)) {

			Field[] fields = customPreference.getClass().getFields();

			for (Field field : fields) {
				field.setAccessible(true);

				if (field.get(customPreference) != null) {
					String fieldValue = field.get(customPreference).toString();
					String fieldName = field.getName();
					customPreferenceMap.put(fieldName, fieldValue);

				}

			}

		}

	}

	private void processReturnedCustomFieldKeysPreference(Map customPreferenceMap, ICustomPreference customPreference)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		if (customPreference != null) {

			Field countryIsoCodeField = customPreference.getClass().getField(COUNTRY_FIELD);
			countryIsoCodeField.setAccessible(true);
			String countryIsoCode;

			if (countryIsoCodeField.get(customPreference) != null) {

				Countries countryName = (Countries) countryIsoCodeField.get(customPreference);

				countryIsoCode = Utility.getCountryCode(countryName.toString());

				Field returnedCustomFieldKeysField = customPreference.getClass().getField(RETURNED_CUSTOM_FIELD_KEYS);
				returnedCustomFieldKeysField.setAccessible(true);

				if (returnedCustomFieldKeysField.get(customPreference) != null) {

					List<String> returnedCustomFieldKeys = (ArrayList) returnedCustomFieldKeysField
							.get(customPreference);

					Iterator<String> itr = returnedCustomFieldKeys.iterator();
					String preferenceValue = BLANK;

					while (itr.hasNext()) {
						preferenceValue = preferenceValue + itr.next() + ((itr.hasNext()) ? SPACE : BLANK);
					}

					String preferenceKEY = countryIsoCode + DOT + RETURNED_CUSTOM_FIELD_KEYS;
					customPreferenceMap.put(preferenceKEY, preferenceValue);
					customPreferenceMap.values();

				}

			}

		}

	}

	private boolean isCustomPreferenceOfDefinedCountries(ICustomPreference customPreference) {

		if (customPreference instanceof CustomPreferenceAUS || customPreference instanceof CustomPreferenceCAN
				|| customPreference instanceof CustomPreferenceDEU || customPreference instanceof CustomPreferenceFRA
				|| customPreference instanceof CustomPreferenceGBR || customPreference instanceof CustomPreferenceNZL
				|| customPreference instanceof CustomPreferencePRT || customPreference instanceof CustomPreferenceSGP
				|| customPreference instanceof CustomPreferenceSWE || customPreference instanceof CustomPreferenceUSA) {
			return true;
		}

		return false;
	}

}