# LIAPIGeocodeServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geocode**](LIAPIGeocodeServiceApi.md#geocode) | **GET** /geocode-service/v1/transient/{datapackBundle}/geocode | Gets Geocode
[**geocodeBatch**](LIAPIGeocodeServiceApi.md#geocodeBatch) | **POST** /geocode-service/v1/transient/{datapackBundle}/geocode | Gets Geocode
[**getCapabilities**](LIAPIGeocodeServiceApi.md#getCapabilities) | **GET** /geocode-service/v1/transient/{datapackBundle}/capabilities | Gets Capabilities
[**getDictionaries**](LIAPIGeocodeServiceApi.md#getDictionaries) | **GET** /geocode-service/v1/transient/{datapackBundle}/dictionaries | Gets installed Dictionaries
[**getPBKey**](LIAPIGeocodeServiceApi.md#getPBKey) | **GET** /geocode-service/v1/key/byaddress | Gets PBKey
[**getPBKeys**](LIAPIGeocodeServiceApi.md#getPBKeys) | **POST** /geocode-service/v1/key/byaddress | Gets PBKeys
[**reverseGeocodBatch**](LIAPIGeocodeServiceApi.md#reverseGeocodBatch) | **POST** /geocode-service/v1/transient/{datapackBundle}/reverseGeocode | reverse Geocode
[**reverseGeocode**](LIAPIGeocodeServiceApi.md#reverseGeocode) | **GET** /geocode-service/v1/transient/{datapackBundle}/reverseGeocode | reverse Geocode


<a name="geocode"></a>
# **geocode**
> GeocodeServiceResponse geocode(datapackBundle, country, placeName, mainAddress, lastLine, areaName1, areaName2, areaName3, areaName4, postalCode, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits)

Gets Geocode

Gets Geocode

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
String country = "USA"; // String | Country name or ISO code.
String placeName = "placeName_example"; // String | Building name, place name, Point of Interest (POI), company or firm name associated with the input address.
String mainAddress = "4750 Walnut St., Boulder CO, 80301"; // String | Single line input, treated as collection of field elements.
String lastLine = "lastLine_example"; // String | The last line of the address.
String areaName1 = "areaName1_example"; // String | Specifies the largest geographic area, typically a state or province.
String areaName2 = "areaName2_example"; // String | Specifies the secondary geographic area, typically a county or district.
String areaName3 = "areaName3_example"; // String | Specifies a city or town name.
String areaName4 = "areaName4_example"; // String | Specifies a city subdivision or locality.
Integer postalCode = 56; // Integer | The postal code in the appropriate format for the country.
String matchMode = "Standard"; // String | Match modes determine the leniency used to make a match between the input address and the reference data.
Boolean fallbackGeo = true; // Boolean | Specifies whether to attempt to determine a geographic region centroid when an address-level geocode cannot be determined.
Boolean fallbackPostal = true; // Boolean | Specifies whether to attempt to determine a post code centroid when an address-level geocode cannot be determined.
Integer maxCands = 1; // Integer | The maximum number of candidates to return. Must be an integer value.
Integer streetOffset = 7; // Integer | Indicates the offset distance from the street segments to use in street-level geocoding.
String streetOffsetUnits = "METERS"; // String | Specifies the unit of measurement for the street offset.
Integer cornerOffset = 7; // Integer | Specifies the distance to offset the street end points in street-level matching.
String cornerOffsetUnits = "METERS"; // String | Specifies the unit of measurement for the corner offset.
try {
    GeocodeServiceResponse result = apiInstance.geocode(datapackBundle, country, placeName, mainAddress, lastLine, areaName1, areaName2, areaName3, areaName4, postalCode, matchMode, fallbackGeo, fallbackPostal, maxCands, streetOffset, streetOffsetUnits, cornerOffset, cornerOffsetUnits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#geocode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium]
 **country** | **String**| Country name or ISO code. | [optional] [default to USA]
 **placeName** | **String**| Building name, place name, Point of Interest (POI), company or firm name associated with the input address. | [optional]
 **mainAddress** | **String**| Single line input, treated as collection of field elements. | [optional] [default to 4750 Walnut St., Boulder CO, 80301]
 **lastLine** | **String**| The last line of the address. | [optional]
 **areaName1** | **String**| Specifies the largest geographic area, typically a state or province. | [optional]
 **areaName2** | **String**| Specifies the secondary geographic area, typically a county or district. | [optional]
 **areaName3** | **String**| Specifies a city or town name. | [optional]
 **areaName4** | **String**| Specifies a city subdivision or locality. | [optional]
 **postalCode** | **Integer**| The postal code in the appropriate format for the country. | [optional]
 **matchMode** | **String**| Match modes determine the leniency used to make a match between the input address and the reference data. | [optional] [default to Standard] [enum: Exact, Standard, Relaxed, Custom, Interactive, CASS]
 **fallbackGeo** | **Boolean**| Specifies whether to attempt to determine a geographic region centroid when an address-level geocode cannot be determined. | [optional] [default to true]
 **fallbackPostal** | **Boolean**| Specifies whether to attempt to determine a post code centroid when an address-level geocode cannot be determined. | [optional] [default to true]
 **maxCands** | **Integer**| The maximum number of candidates to return. Must be an integer value. | [optional] [default to 1]
 **streetOffset** | **Integer**| Indicates the offset distance from the street segments to use in street-level geocoding. | [optional] [default to 7]
 **streetOffsetUnits** | **String**| Specifies the unit of measurement for the street offset. | [optional] [default to METERS] [enum: METERS, FEET]
 **cornerOffset** | **Integer**| Specifies the distance to offset the street end points in street-level matching. | [optional] [default to 7]
 **cornerOffsetUnits** | **String**| Specifies the unit of measurement for the corner offset. | [optional] [default to METERS] [enum: METERS, FEET]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="geocodeBatch"></a>
# **geocodeBatch**
> GeocodeServiceResponseList geocodeBatch(datapackBundle, body)

Gets Geocode

Gets Geocode

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
GeocodeRequest body = new GeocodeRequest(); // GeocodeRequest | Geocode Request Object
try {
    GeocodeServiceResponseList result = apiInstance.geocodeBatch(datapackBundle, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#geocodeBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium]
 **body** | [**GeocodeRequest**](GeocodeRequest.md)| Geocode Request Object | [optional]

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCapabilities"></a>
# **getCapabilities**
> GeocodeCapabilitiesResponse getCapabilities(datapackBundle, operation, country)

Gets Capabilities

Gets Capabilities

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
String operation = "geocode"; // String | Geocode or ReverseGeocode Operation.
String country = "USA"; // String | Country name or ISO code.
try {
    GeocodeCapabilitiesResponse result = apiInstance.getCapabilities(datapackBundle, operation, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#getCapabilities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium]
 **operation** | **String**| Geocode or ReverseGeocode Operation. | [optional] [default to geocode] [enum: geocode, reverseGeocode]
 **country** | **String**| Country name or ISO code. | [optional] [default to USA]

### Return type

[**GeocodeCapabilitiesResponse**](GeocodeCapabilitiesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDictionaries"></a>
# **getDictionaries**
> ConfiguredDictionaryResponse getDictionaries(datapackBundle, country)

Gets installed Dictionaries

Gets installed Dictionaries

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
String country = "USA"; // String | Three Letter ISO Country code
try {
    ConfiguredDictionaryResponse result = apiInstance.getDictionaries(datapackBundle, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#getDictionaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium]
 **country** | **String**| Three Letter ISO Country code | [optional] [default to USA]

### Return type

[**ConfiguredDictionaryResponse**](ConfiguredDictionaryResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPBKey"></a>
# **getPBKey**
> PBKeyResponse getPBKey(address)

Gets PBKey

Gets PBKey for an input free form address text

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String address = "address_example"; // String | free form address text
try {
    PBKeyResponse result = apiInstance.getPBKey(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#getPBKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |

### Return type

[**PBKeyResponse**](PBKeyResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPBKeys"></a>
# **getPBKeys**
> PBKeyResponseList getPBKeys(body)

Gets PBKeys

Gets PBKeys for multiple input addresses

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
PBKeyAddressRequest body = new PBKeyAddressRequest(); // PBKeyAddressRequest | 
try {
    PBKeyResponseList result = apiInstance.getPBKeys(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#getPBKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PBKeyAddressRequest**](PBKeyAddressRequest.md)|  | [optional]

### Return type

[**PBKeyResponseList**](PBKeyResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="reverseGeocodBatch"></a>
# **reverseGeocodBatch**
> GeocodeServiceResponseList reverseGeocodBatch(datapackBundle, body)

reverse Geocode

reverse Geocode

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
ReverseGeocodeRequest body = new ReverseGeocodeRequest(); // ReverseGeocodeRequest | Reverse Geocode Request object
try {
    GeocodeServiceResponseList result = apiInstance.reverseGeocodBatch(datapackBundle, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#reverseGeocodBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium]
 **body** | [**ReverseGeocodeRequest**](ReverseGeocodeRequest.md)| Reverse Geocode Request object | [optional]

### Return type

[**GeocodeServiceResponseList**](GeocodeServiceResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="reverseGeocode"></a>
# **reverseGeocode**
> GeocodeServiceResponse reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits)

reverse Geocode

reverse Geocode

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeocodeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeocodeServiceApi apiInstance = new LIAPIGeocodeServiceApi();
String datapackBundle = "datapackBundle_example"; // String | value of datapackBundle
BigDecimal x = new BigDecimal(); // BigDecimal | Longitude of the location.
BigDecimal y = new BigDecimal(); // BigDecimal | Latitude of the location.
String country = "country_example"; // String | Country name or ISO code.
String coordSysName = "EPSG:4326"; // String | Coordinate system to convert geometry in format codespace:code.
Integer distance = 150; // Integer | Radius in which search is performed.
String distanceUnits = "METERS"; // String | Unit of measurement for the search distance.
try {
    GeocodeServiceResponse result = apiInstance.reverseGeocode(datapackBundle, x, y, country, coordSysName, distance, distanceUnits);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeocodeServiceApi#reverseGeocode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **datapackBundle** | **String**| value of datapackBundle | [enum: basic, premium]
 **x** | **BigDecimal**| Longitude of the location. | [default to -105.240976]
 **y** | **BigDecimal**| Latitude of the location. | [default to 40.018301]
 **country** | **String**| Country name or ISO code. | [optional]
 **coordSysName** | **String**| Coordinate system to convert geometry in format codespace:code. | [optional] [default to EPSG:4326]
 **distance** | **Integer**| Radius in which search is performed. | [optional] [default to 150]
 **distanceUnits** | **String**| Unit of measurement for the search distance. | [optional] [default to METERS] [enum: METERS, FEET]

### Return type

[**GeocodeServiceResponse**](GeocodeServiceResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

