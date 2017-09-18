![Pitney Bowes](/PitneyBowes_Logo.jpg)

# Pitney Bowes Location Intelligence API

### Description
[Location Intelligence APIs ](http://developer.pitneybowes.com/en/location-intelligence.html) help you to Incorporate Pitney Bowes extensive geodata into everyday applications, business processes, and workflows. Use our SDKs to get started quickly and easily integrate API calls in your applications.

### Location Intelligence APIs:

* [GeoEnrich](https://locate.pitneybowes.com/geoenrich ) : Returns addresses, place names, points-of-interest and timezones with the input of a location coordinate. Useful for enhancing & enriching your geo-tagged data.

* [GeoLife](https://locate.pitneybowes.com/geolife) : Returns household demographics and lifestyle characteristics with the input of an address or location coordinate. Useful for data analysts and commercial and corporate developers building mobile apps and services.

* [GeoSearch](https://locate.pitneybowes.com/geosearch): Returns an autocompleted list of addresses and places based on the input of a partial address. Useful for commercial developers and content providers, or anyone wanting to offer their own search.

* [GeoComm](https://locate.pitneybowes.com/geocomm): Identifies Local Exchange Carrier presence with a Rate Center area. The GeoComm API retrieves Incumbent Local Exchange Carrier (ILEC) doing-business-as names with the input of an address. Useful for local telecommunications competitive intelligence, partnerships, and provisioning subscribers.

* [Geo911](https://locate.pitneybowes.com/geo911): Integrates Public Safety Answering Point (PSAP) administrative call routing information plus Authority Having Jurisdiction (AHJ) phone numbers into your 911 products and services. The Geo911 API retrieves 10-digit phone numbers and local contact info with the input of a location coordinate. Useful for emergency services administrators, call handlers, and dispatchers.

* [GeoTax](https://locate.pitneybowes.com/geotax): Returns local tax rates with the input of a location coordinate or an address. Critical for any billing, commerce, payment, or payroll application or service.

* [GeoCode](https://locate.pitneybowes.com/geocode): Converts addresses to location coordinates and vice versa. The GeoCode API returns latitude & longitude coordinates with the input of an address and vice versa. Useful for enhancing & enriching your customer addresses.

* [GeoMap](https://locate.pitneybowes.com/geomap): Adds data and more atop Maps. Choose from three map styles - Iron, Bronze, and Steel.

* [GeoZone](https://locate.pitneybowes.com/geozone): Returns drive Distance and Drive Time Zones with the input of Location Coordinates or Addresses. Useful for anyone wanting to create smarter geofence zones for Local Engagement and Analysis.

* [GeoRoute](https://locate.pitneybowes.com/georoute): Returns Point-to-Point and Multi-Point Travel Directions by Various Travel Modes. Critical for any Simple or Complex Routing Requirement.

* [GeoRisk](https://locate.pitneybowes.com/georisk): Returns critical risk intelligence with the input of Location Coordinates or Addresses. Critical for any Risk Mitigation Analyses involving threats to lives or property.

* [GeoProperty](https://locate.pitneybowes.com/geoproperty)::  Property Details. Capture property details for analysis and planning. The GeoProperty API returns extensive property attributes with the input of address or PB key. Critical for any property investment, insurance or risk analysis and mitigation.

* [GeoTime](https://locate.pitneybowes.com/geotime): Local time. The GeoTime API returns timezones and UTC offsets with the input of a location coordinate or address. Useful for do-not-call, logistics, and customer engagement applications, business processes and workflows.

The following platforms are supported by Location Intelligence SDKs:
*	[Android](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Android%20SDK/android_intro.html)
*	[JavaScript](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Java%20Script%20SDK/js_intro.html) 
*	[iOS](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#iOS%20SDK/ios_intro.html)
*	[Java](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Java%20SDK/java_intro.html)
*	[C#](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#C_sdk/java_intro.html)  

[Click here](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html) for detailed Documentation on Location Intelligence APIs 


# Location Intelligence Java SDK
### Description
Location Intelligence Java SDK facilitates you to build Java applications using Location Intelligence APIs.
### Getting Started
To get started with Java SDK, you must first register at [Location Intelligence API Home Page](http://developer.pitneybowes.com/en/location-intelligence.html) and obtain your API Key and Secret to get started with the Java SDK and call Location Intelligence APIs.
For more information refer to [‘Getting Started with Java SDK’](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Java%20SDK/java_intro.html) section in documentation.


# LocationIntelligenceJavaSDK

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>LocationIntelligenceJavaSDK</artifactId>
    <version>3.6.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:LocationIntelligenceJavaSDK:3.6.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/LocationIntelligenceJavaSDK-3.6.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import pb.*;
import pb.auth.*;
import pb.model.*;
import pb.locationintelligence.LIAPIGeo911ServiceApi;

import java.io.File;
import java.util.*;

public class LIAPIGeo911ServiceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: oAuth2Password
        OAuth oAuth2Password = (OAuth) defaultClient.getAuthentication("oAuth2Password");
        oAuth2Password.setApiKey("YOUR API KEY");
        oAuth2Password.setSecret("YOUR SECRET"); 

        LIAPIGeo911ServiceApi apiInstance = new LIAPIGeo911ServiceApi();
        String address = "address_example"; // String | The address to be searched.
        try {
            AHJPlusPSAPResponse result = apiInstance.getAHJPlusPSAPByAddress(address);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LIAPIGeo911ServiceApi#getAHJPlusPSAPByAddress");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*LIAPIGeo911ServiceApi* | [**getAHJPlusPSAPByAddress**](docs/LIAPIGeo911ServiceApi.md#getAHJPlusPSAPByAddress) | **GET** /geo911/v1/ahj-psap/byaddress | AHJ &amp; PSAP By Address.
*LIAPIGeo911ServiceApi* | [**getAHJPlusPSAPByLocation**](docs/LIAPIGeo911ServiceApi.md#getAHJPlusPSAPByLocation) | **GET** /geo911/v1/ahj-psap/bylocation | AHJ &amp; PSAP By Location
*LIAPIGeo911ServiceApi* | [**getPSAPByAddress**](docs/LIAPIGeo911ServiceApi.md#getPSAPByAddress) | **GET** /geo911/v1/psap/byaddress | PSAP By Address.
*LIAPIGeo911ServiceApi* | [**getPSAPByLocation**](docs/LIAPIGeo911ServiceApi.md#getPSAPByLocation) | **GET** /geo911/v1/psap/bylocation | PSAP By Location.
*LIAPIGeoCommServiceApi* | [**getRateCenterByAddress**](docs/LIAPIGeoCommServiceApi.md#getRateCenterByAddress) | **GET** /geocomm/v1/ratecenter/byaddress | Rate Center By Address.
*LIAPIGeoCommServiceApi* | [**getRateCenterByLocation**](docs/LIAPIGeoCommServiceApi.md#getRateCenterByLocation) | **GET** /geocomm/v1/ratecenter/bylocation | Rate Center By Location.
*LIAPIGeoEnrichServiceApi* | [**getAddress**](docs/LIAPIGeoEnrichServiceApi.md#getAddress) | **GET** /geoenrich/v1/address/bylocation | Address By Location.
*LIAPIGeoEnrichServiceApi* | [**getEntityByLocation**](docs/LIAPIGeoEnrichServiceApi.md#getEntityByLocation) | **GET** /geoenrich/v1/poi/bylocation | Points Of Interest By Location.
*LIAPIGeoEnrichServiceApi* | [**getPlaceByLocation**](docs/LIAPIGeoEnrichServiceApi.md#getPlaceByLocation) | **GET** /geoenrich/v1/place/bylocation | Place By Location.
*LIAPIGeoLifeServiceApi* | [**getDemographicsByAddress**](docs/LIAPIGeoLifeServiceApi.md#getDemographicsByAddress) | **GET** /geolife/v1/demographics/byaddress | Demographics By Address.
*LIAPIGeoLifeServiceApi* | [**getDemographicsByLocation**](docs/LIAPIGeoLifeServiceApi.md#getDemographicsByLocation) | **GET** /geolife/v1/demographics/bylocation | Demographics By Location.
*LIAPIGeoLifeServiceApi* | [**getSegmentationByAddress**](docs/LIAPIGeoLifeServiceApi.md#getSegmentationByAddress) | **GET** /geolife/v1/segmentation/byaddress | Segmentation By Address.
*LIAPIGeoLifeServiceApi* | [**getSegmentationByLocation**](docs/LIAPIGeoLifeServiceApi.md#getSegmentationByLocation) | **GET** /geolife/v1/segmentation/bylocation | Segmentation By Location.
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByAddress**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddress) | **GET** /geoproperty/v1/all/attributes/byaddress | Gets GeoPropertyResponse
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByAddressBatch**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddressBatch) | **POST** /geoproperty/v1/all/attributes/byaddress | Gets GeoPropertyResponses
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByPBKey**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByPBKey) | **GET** /geoproperty/v1/all/attributes/bypbkey | Gets GeoPropertyResponse
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByPBKeyBatch**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByPBKeyBatch) | **POST** /geoproperty/v1/all/attributes/bypbkey | Gets GeoPropertyResponses
*LIAPIGeoRiskServiceApi* | [**getCrimeRiskByAddress**](docs/LIAPIGeoRiskServiceApi.md#getCrimeRiskByAddress) | **GET** /georisk/v1/crime/byaddress | Gets CrimeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getCrimeRiskByLocation**](docs/LIAPIGeoRiskServiceApi.md#getCrimeRiskByLocation) | **GET** /georisk/v1/crime/bylocation | Gets CrimeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getDistanceToCoastByAddress**](docs/LIAPIGeoRiskServiceApi.md#getDistanceToCoastByAddress) | **GET** /georisk/v1/shoreline/distancetocoast/byaddress | Gets WaterBodyResponse
*LIAPIGeoRiskServiceApi* | [**getDistanceToCoastByLocation**](docs/LIAPIGeoRiskServiceApi.md#getDistanceToCoastByLocation) | **GET** /georisk/v1/shoreline/distancetocoast/bylocation | Gets WaterBodyResponse
*LIAPIGeoRiskServiceApi* | [**getEarthquakeHistory**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeHistory) | **GET** /georisk/v1/earthquakehistory | Gets EarthquakeHistory
*LIAPIGeoRiskServiceApi* | [**getEarthquakeRiskByAddress**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByAddress) | **GET** /georisk/v1/earthquake/byaddress | Gets EarthquakeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getEarthquakeRiskByLocation**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByLocation) | **GET** /georisk/v1/earthquake/bylocation | Gets EarthquakeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getFireHistory**](docs/LIAPIGeoRiskServiceApi.md#getFireHistory) | **GET** /georisk/v1/firehistory | Gets FireHistory
*LIAPIGeoRiskServiceApi* | [**getFireRiskByAddress**](docs/LIAPIGeoRiskServiceApi.md#getFireRiskByAddress) | **GET** /georisk/v1/fire/byaddress | Gets FireRiskResponse
*LIAPIGeoRiskServiceApi* | [**getFireRiskByAddressBatch**](docs/LIAPIGeoRiskServiceApi.md#getFireRiskByAddressBatch) | **POST** /georisk/v1/fire/byaddress | Batch method for getting fire risk by address
*LIAPIGeoRiskServiceApi* | [**getFireRiskByLocation**](docs/LIAPIGeoRiskServiceApi.md#getFireRiskByLocation) | **GET** /georisk/v1/fire/bylocation | Gets FireRiskResponse
*LIAPIGeoRiskServiceApi* | [**getFireRiskByLocationBatch**](docs/LIAPIGeoRiskServiceApi.md#getFireRiskByLocationBatch) | **POST** /georisk/v1/fire/bylocation | Batch method for getting fire risk by location
*LIAPIGeoRiskServiceApi* | [**getFireStationByAddress**](docs/LIAPIGeoRiskServiceApi.md#getFireStationByAddress) | **GET** /georisk/v1/firestation/byaddress | Gets FireStationResponse
*LIAPIGeoRiskServiceApi* | [**getFireStationByLocation**](docs/LIAPIGeoRiskServiceApi.md#getFireStationByLocation) | **GET** /georisk/v1/firestation/bylocation | Gets FireStationResponse
*LIAPIGeoRiskServiceApi* | [**getFloodRiskByAddress**](docs/LIAPIGeoRiskServiceApi.md#getFloodRiskByAddress) | **GET** /georisk/v1/flood/byaddress | Gets FloodRiskResponse
*LIAPIGeoRiskServiceApi* | [**getFloodRiskByAddressBatch**](docs/LIAPIGeoRiskServiceApi.md#getFloodRiskByAddressBatch) | **POST** /georisk/v1/flood/byaddress | Batch method for getting flood risk by address
*LIAPIGeoRiskServiceApi* | [**getFloodRiskByLocation**](docs/LIAPIGeoRiskServiceApi.md#getFloodRiskByLocation) | **GET** /georisk/v1/flood/bylocation | Gets FloodRiskResponse
*LIAPIGeoRiskServiceApi* | [**getFloodRiskByLocationBatch**](docs/LIAPIGeoRiskServiceApi.md#getFloodRiskByLocationBatch) | **POST** /georisk/v1/flood/bylocation | Batch method for getting flood risk by location
*LIAPIGeoRouteServiceApi* | [**getRouteByAddress**](docs/LIAPIGeoRouteServiceApi.md#getRouteByAddress) | **GET** /georoute/v1/route/byaddress | Gets Route by Address
*LIAPIGeoRouteServiceApi* | [**getRouteByLocation**](docs/LIAPIGeoRouteServiceApi.md#getRouteByLocation) | **GET** /georoute/v1/route/bylocation | Gets Route by Location
*LIAPIGeoRouteServiceApi* | [**getTravelCostMatrixByAddress**](docs/LIAPIGeoRouteServiceApi.md#getTravelCostMatrixByAddress) | **GET** /georoute/v1/travelcostmatrix/byaddress | Gets Cost Matrix by Address
*LIAPIGeoRouteServiceApi* | [**getTravelCostMatrixByLocation**](docs/LIAPIGeoRouteServiceApi.md#getTravelCostMatrixByLocation) | **GET** /georoute/v1/travelcostmatrix/bylocation | Gets Cost Matrix by Location
*LIAPIGeoSearchServiceApi* | [**geoSearch**](docs/LIAPIGeoSearchServiceApi.md#geoSearch) | **GET** /geosearch/v1/locations | Gets LocationList
*LIAPIGeoTaxServiceApi* | [**getBatchTaxByAddress**](docs/LIAPIGeoTaxServiceApi.md#getBatchTaxByAddress) | **POST** /geotax/v1/tax/{taxRateTypeId}/byaddress | Post Tax By Address
*LIAPIGeoTaxServiceApi* | [**getBatchTaxByLocation**](docs/LIAPIGeoTaxServiceApi.md#getBatchTaxByLocation) | **POST** /geotax/v1/tax/{taxRateTypeId}/bylocation | Post Tax By Location
*LIAPIGeoTaxServiceApi* | [**getBatchTaxRateByAddress**](docs/LIAPIGeoTaxServiceApi.md#getBatchTaxRateByAddress) | **POST** /geotax/v1/taxrate/{taxRateTypeId}/byaddress | Post Taxrate By Address
*LIAPIGeoTaxServiceApi* | [**getBatchTaxRateByLocation**](docs/LIAPIGeoTaxServiceApi.md#getBatchTaxRateByLocation) | **POST** /geotax/v1/taxrate/{taxRateTypeId}/bylocation | Post Taxrate By Location
*LIAPIGeoTaxServiceApi* | [**getIPDTaxByAddress**](docs/LIAPIGeoTaxServiceApi.md#getIPDTaxByAddress) | **GET** /geotax/v1/taxdistrict/ipd/byaddress | Get IPD Tax by Address
*LIAPIGeoTaxServiceApi* | [**getIPDTaxByAddressBatch**](docs/LIAPIGeoTaxServiceApi.md#getIPDTaxByAddressBatch) | **POST** /geotax/v1/taxdistrict/ipd/byaddress | Get IPD Tax for batch requests
*LIAPIGeoTaxServiceApi* | [**getSpecificTaxByAddress**](docs/LIAPIGeoTaxServiceApi.md#getSpecificTaxByAddress) | **GET** /geotax/v1/tax/{taxRateTypeId}/byaddress | Get Tax By Address
*LIAPIGeoTaxServiceApi* | [**getSpecificTaxByLocation**](docs/LIAPIGeoTaxServiceApi.md#getSpecificTaxByLocation) | **GET** /geotax/v1/tax/{taxRateTypeId}/bylocation | Get Tax By Location
*LIAPIGeoTaxServiceApi* | [**getSpecificTaxRateByAddress**](docs/LIAPIGeoTaxServiceApi.md#getSpecificTaxRateByAddress) | **GET** /geotax/v1/taxrate/{taxRateTypeId}/byaddress | Get Taxrate By Address
*LIAPIGeoTaxServiceApi* | [**getSpecificTaxRateByLocation**](docs/LIAPIGeoTaxServiceApi.md#getSpecificTaxRateByLocation) | **GET** /geotax/v1/taxrate/{taxRateTypeId}/bylocation | Get Taxrate By Location
*LIAPIGeoTimeServiceApi* | [**getTimezoneByAddress**](docs/LIAPIGeoTimeServiceApi.md#getTimezoneByAddress) | **GET** /geotime/v1/timezone/byaddress | Timezone By Address.
*LIAPIGeoTimeServiceApi* | [**getTimezoneByLocation**](docs/LIAPIGeoTimeServiceApi.md#getTimezoneByLocation) | **GET** /geotime/v1/timezone/bylocation | Timezone By Location.
*LIAPIGeoZoneServiceApi* | [**getTravelBoundaryByDistance**](docs/LIAPIGeoZoneServiceApi.md#getTravelBoundaryByDistance) | **GET** /geozone/v1/travelboundary/bydistance | Gets travel Boundary by Distance
*LIAPIGeoZoneServiceApi* | [**getTravelBoundaryByTime**](docs/LIAPIGeoZoneServiceApi.md#getTravelBoundaryByTime) | **GET** /geozone/v1/travelboundary/bytime | Gets travel Boundary by Time
*LIAPIGeocodeServiceApi* | [**geocode**](docs/LIAPIGeocodeServiceApi.md#geocode) | **GET** /geocode-service/v1/transient/{datapackBundle}/geocode | Gets Geocode
*LIAPIGeocodeServiceApi* | [**geocodeBatch**](docs/LIAPIGeocodeServiceApi.md#geocodeBatch) | **POST** /geocode-service/v1/transient/{datapackBundle}/geocode | Gets Geocode
*LIAPIGeocodeServiceApi* | [**getCapabilities**](docs/LIAPIGeocodeServiceApi.md#getCapabilities) | **GET** /geocode-service/v1/transient/{datapackBundle}/capabilities | Gets Capabilities
*LIAPIGeocodeServiceApi* | [**getDictionaries**](docs/LIAPIGeocodeServiceApi.md#getDictionaries) | **GET** /geocode-service/v1/transient/{datapackBundle}/dictionaries | Gets installed Dictionaries
*LIAPIGeocodeServiceApi* | [**getPBKey**](docs/LIAPIGeocodeServiceApi.md#getPBKey) | **GET** /geocode-service/v1/key/byaddress | Gets PBKey
*LIAPIGeocodeServiceApi* | [**getPBKeys**](docs/LIAPIGeocodeServiceApi.md#getPBKeys) | **POST** /geocode-service/v1/key/byaddress | Gets PBKeys
*LIAPIGeocodeServiceApi* | [**reverseGeocodBatch**](docs/LIAPIGeocodeServiceApi.md#reverseGeocodBatch) | **POST** /geocode-service/v1/transient/{datapackBundle}/reverseGeocode | reverse Geocode
*LIAPIGeocodeServiceApi* | [**reverseGeocode**](docs/LIAPIGeocodeServiceApi.md#reverseGeocode) | **GET** /geocode-service/v1/transient/{datapackBundle}/reverseGeocode | reverse Geocode


## Documentation for Models

 - [AHJ](docs/AHJ.md)
 - [AHJList](docs/AHJList.md)
 - [AHJPlusPSAPResponse](docs/AHJPlusPSAPResponse.md)
 - [Address](docs/Address.md)
 - [AdjacentBody](docs/AdjacentBody.md)
 - [AgeTheme](docs/AgeTheme.md)
 - [Area](docs/Area.md)
 - [AreaCodeInfo](docs/AreaCodeInfo.md)
 - [AttitudesAndMotivationTheme](docs/AttitudesAndMotivationTheme.md)
 - [AutomobileTheme](docs/AutomobileTheme.md)
 - [BaseFloodElevation](docs/BaseFloodElevation.md)
 - [Boundaries](docs/Boundaries.md)
 - [Boundary](docs/Boundary.md)
 - [BoundaryBuffer](docs/BoundaryBuffer.md)
 - [BufferRelation](docs/BufferRelation.md)
 - [Candidate](docs/Candidate.md)
 - [CandidateRange](docs/CandidateRange.md)
 - [CandidateRangeUnit](docs/CandidateRangeUnit.md)
 - [Cbsa](docs/Cbsa.md)
 - [Census](docs/Census.md)
 - [ChannelPreferencesTheme](docs/ChannelPreferencesTheme.md)
 - [Community](docs/Community.md)
 - [CommuterPatternsTheme](docs/CommuterPatternsTheme.md)
 - [ConfiguredDictionaryResponse](docs/ConfiguredDictionaryResponse.md)
 - [ContactDetails](docs/ContactDetails.md)
 - [ContactPerson](docs/ContactPerson.md)
 - [Cost](docs/Cost.md)
 - [Costs](docs/Costs.md)
 - [CountrySupport](docs/CountrySupport.md)
 - [County](docs/County.md)
 - [Coverage](docs/Coverage.md)
 - [CrimeBoundary](docs/CrimeBoundary.md)
 - [CrimeIndexTheme](docs/CrimeIndexTheme.md)
 - [CrimeRiskResponse](docs/CrimeRiskResponse.md)
 - [Crs](docs/Crs.md)
 - [CustomObject](docs/CustomObject.md)
 - [CustomObjectMember](docs/CustomObjectMember.md)
 - [DateTimeEarthQuake](docs/DateTimeEarthQuake.md)
 - [Demographics](docs/Demographics.md)
 - [DemographicsThemes](docs/DemographicsThemes.md)
 - [Depth](docs/Depth.md)
 - [Dictionary](docs/Dictionary.md)
 - [DirectionGeometry](docs/DirectionGeometry.md)
 - [Distance](docs/Distance.md)
 - [DistanceToBorder](docs/DistanceToBorder.md)
 - [DistrictType](docs/DistrictType.md)
 - [EarthquakeEvent](docs/EarthquakeEvent.md)
 - [EarthquakeEventsResponse](docs/EarthquakeEventsResponse.md)
 - [EarthquakeHistory](docs/EarthquakeHistory.md)
 - [EarthquakeLocation](docs/EarthquakeLocation.md)
 - [EarthquakeRiskResponse](docs/EarthquakeRiskResponse.md)
 - [EducationalAttainmentTheme](docs/EducationalAttainmentTheme.md)
 - [EthnicityTheme](docs/EthnicityTheme.md)
 - [EventsCount](docs/EventsCount.md)
 - [Field](docs/Field.md)
 - [FieldsMatching](docs/FieldsMatching.md)
 - [FinancialProductsTheme](docs/FinancialProductsTheme.md)
 - [FireDepartment](docs/FireDepartment.md)
 - [FireEvent](docs/FireEvent.md)
 - [FireEventsResponse](docs/FireEventsResponse.md)
 - [FireHistory](docs/FireHistory.md)
 - [FireRiskByAddressRequest](docs/FireRiskByAddressRequest.md)
 - [FireRiskByLocationRequest](docs/FireRiskByLocationRequest.md)
 - [FireRiskResponse](docs/FireRiskResponse.md)
 - [FireRiskResponseList](docs/FireRiskResponseList.md)
 - [FireShed](docs/FireShed.md)
 - [FireStation](docs/FireStation.md)
 - [FireStations](docs/FireStations.md)
 - [FloodBoundary](docs/FloodBoundary.md)
 - [FloodRiskByAddressRequest](docs/FloodRiskByAddressRequest.md)
 - [FloodRiskByLocationRequest](docs/FloodRiskByLocationRequest.md)
 - [FloodRiskResponse](docs/FloodRiskResponse.md)
 - [FloodRiskResponseList](docs/FloodRiskResponseList.md)
 - [FloodZone](docs/FloodZone.md)
 - [GenderTheme](docs/GenderTheme.md)
 - [GeoPos](docs/GeoPos.md)
 - [GeoPropertyAddressRequest](docs/GeoPropertyAddressRequest.md)
 - [GeoPropertyPBKeyRequest](docs/GeoPropertyPBKeyRequest.md)
 - [GeoPropertyResponse](docs/GeoPropertyResponse.md)
 - [GeoPropertyResponses](docs/GeoPropertyResponses.md)
 - [GeoRiskBoundaries](docs/GeoRiskBoundaries.md)
 - [GeoRiskCrimeTheme](docs/GeoRiskCrimeTheme.md)
 - [GeoRiskGeometry](docs/GeoRiskGeometry.md)
 - [GeoRouteResponse](docs/GeoRouteResponse.md)
 - [GeoTaxLocations](docs/GeoTaxLocations.md)
 - [GeocodeAddress](docs/GeocodeAddress.md)
 - [GeocodeCapabilitiesResponse](docs/GeocodeCapabilitiesResponse.md)
 - [GeocodeRequest](docs/GeocodeRequest.md)
 - [GeocodeServiceResponse](docs/GeocodeServiceResponse.md)
 - [GeocodeServiceResponseList](docs/GeocodeServiceResponseList.md)
 - [Geometry](docs/Geometry.md)
 - [GeometryPolygon](docs/GeometryPolygon.md)
 - [Grid](docs/Grid.md)
 - [HouseholdSizeTheme](docs/HouseholdSizeTheme.md)
 - [IPDTaxByAddressBatchRequest](docs/IPDTaxByAddressBatchRequest.md)
 - [IPDTaxJurisdiction](docs/IPDTaxJurisdiction.md)
 - [IncomeTheme](docs/IncomeTheme.md)
 - [IndexVariable](docs/IndexVariable.md)
 - [IndividualValueVariable](docs/IndividualValueVariable.md)
 - [InputParameter](docs/InputParameter.md)
 - [Ipd](docs/Ipd.md)
 - [LatLongFields](docs/LatLongFields.md)
 - [LifeStyleTheme](docs/LifeStyleTheme.md)
 - [Location](docs/Location.md)
 - [Locations](docs/Locations.md)
 - [Magnitude](docs/Magnitude.md)
 - [MaritalStatusTheme](docs/MaritalStatusTheme.md)
 - [Match](docs/Match.md)
 - [Mcd](docs/Mcd.md)
 - [Name](docs/Name.md)
 - [Operation](docs/Operation.md)
 - [OutputParameter](docs/OutputParameter.md)
 - [PBKeyAddressRequest](docs/PBKeyAddressRequest.md)
 - [PBKeyResponse](docs/PBKeyResponse.md)
 - [PBKeyResponseList](docs/PBKeyResponseList.md)
 - [PSAPResponse](docs/PSAPResponse.md)
 - [Pbkey](docs/Pbkey.md)
 - [Place](docs/Place.md)
 - [PlaceByLocations](docs/PlaceByLocations.md)
 - [PlaceByLocationsLocation](docs/PlaceByLocationsLocation.md)
 - [PlaceLocation](docs/PlaceLocation.md)
 - [PlaceLocationName](docs/PlaceLocationName.md)
 - [Poi](docs/Poi.md)
 - [Point](docs/Point.md)
 - [Points](docs/Points.md)
 - [Polygon](docs/Polygon.md)
 - [Preferences](docs/Preferences.md)
 - [PrimaryZone](docs/PrimaryZone.md)
 - [Properties](docs/Properties.md)
 - [PurchasingBehaviorTheme](docs/PurchasingBehaviorTheme.md)
 - [RaceTheme](docs/RaceTheme.md)
 - [RangeVariable](docs/RangeVariable.md)
 - [Rate](docs/Rate.md)
 - [RateCenterResponse](docs/RateCenterResponse.md)
 - [ReturnFieldsDescriptor](docs/ReturnFieldsDescriptor.md)
 - [ReverseGeocodeRequest](docs/ReverseGeocodeRequest.md)
 - [Risk](docs/Risk.md)
 - [RiskAddress](docs/RiskAddress.md)
 - [RiskPreferences](docs/RiskPreferences.md)
 - [RouteDirection](docs/RouteDirection.md)
 - [RouteDirections](docs/RouteDirections.md)
 - [RouteGeometry](docs/RouteGeometry.md)
 - [SalesTax](docs/SalesTax.md)
 - [Segmentation](docs/Segmentation.md)
 - [SegmentationThemes](docs/SegmentationThemes.md)
 - [ShoreLineCounty](docs/ShoreLineCounty.md)
 - [ShoreLineDistance](docs/ShoreLineDistance.md)
 - [SiteDetails](docs/SiteDetails.md)
 - [SpecialPurposeDistrict](docs/SpecialPurposeDistrict.md)
 - [SpecialPurposeDistrictTax](docs/SpecialPurposeDistrictTax.md)
 - [State](docs/State.md)
 - [Status](docs/Status.md)
 - [SupportLevel](docs/SupportLevel.md)
 - [TaxAddress](docs/TaxAddress.md)
 - [TaxAddressRequest](docs/TaxAddressRequest.md)
 - [TaxDistrictResponse](docs/TaxDistrictResponse.md)
 - [TaxDistrictResponseList](docs/TaxDistrictResponseList.md)
 - [TaxJurisdiction](docs/TaxJurisdiction.md)
 - [TaxLocationRequest](docs/TaxLocationRequest.md)
 - [TaxRateAddress](docs/TaxRateAddress.md)
 - [TaxRateAddressRequest](docs/TaxRateAddressRequest.md)
 - [TaxRateLocationRequest](docs/TaxRateLocationRequest.md)
 - [TaxResponse](docs/TaxResponse.md)
 - [TaxResponses](docs/TaxResponses.md)
 - [Time](docs/Time.md)
 - [Timezone](docs/Timezone.md)
 - [TravelBoundaries](docs/TravelBoundaries.md)
 - [TravelBoundary](docs/TravelBoundary.md)
 - [TravelCostMatrixResponse](docs/TravelCostMatrixResponse.md)
 - [TravelCostMatrixResponseEndPoint](docs/TravelCostMatrixResponseEndPoint.md)
 - [TravelCostMatrixResponseEndPointCrs](docs/TravelCostMatrixResponseEndPointCrs.md)
 - [TravelCostMatrixResponseEndPointCrsProperties](docs/TravelCostMatrixResponseEndPointCrsProperties.md)
 - [TravelCostMatrixResponseMatrix](docs/TravelCostMatrixResponseMatrix.md)
 - [Type](docs/Type.md)
 - [UseTax](docs/UseTax.md)
 - [WaterBody](docs/WaterBody.md)
 - [WaterBodyResponse](docs/WaterBodyResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oAuth2Password

- **Type**: OAuth
- **Flow**: password
- **Authorizatoin URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.








