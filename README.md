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

* [GeoLocation](http://locate.pitneybowes.com/geolocation): Device Location. The GeoLocation API returns location coordinates based on the input of an IP Address, WiFi Access point MAC address, Fixed line phone number and/or Wireless phone number. Useful for a variety of applications, business processes and workflows in eCommerce, Fraud Detection, Physical-Digital interactions, Field Service and more.
* [GeoStreets](https://locate.pitneybowes.com/geostreets): Enrich your applications, business processes, and workflows with global street information including nearest intersections and more. GeoStreets accepts an address or location and returns nearest intersection information. Useful for enriching your data and/or analytics processes with footfall potential.


The following platforms are supported by Location Intelligence SDKs:
*	[Android](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Android%20SDK/android_intro.html)
*	[JavaScript](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Java%20Script%20SDK/js_intro.html) 
*	[iOS](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#iOS%20SDK/ios_intro.html)
*	[Java](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#Java%20SDK/java_intro.html)
*	[C#](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html#C_sdk/java_intro.html)  

[Click here](https://locate.pitneybowes.com/docs/location-intelligence/v1/en/index.html) for detailed Documentation on Location Intelligence APIs 

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
    <version>8.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:LocationIntelligenceJavaSDK:8.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/LocationIntelligenceJavaSDK-8.0.0.jar
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
*LIAPIGeoEnrichServiceApi* | [**getCategoryCodeMetadata**](docs/LIAPIGeoEnrichServiceApi.md#getCategoryCodeMetadata) | **GET** /geoenrich/v1/metadata/category | Returns Category Codes with their sub-categories (if exist), descriptions and SIC Codes mapping
*LIAPIGeoEnrichServiceApi* | [**getPOIById**](docs/LIAPIGeoEnrichServiceApi.md#getPOIById) | **GET** /geoenrich/v1/poi/{id} | Point of Interest By Id.
*LIAPIGeoEnrichServiceApi* | [**getPOIsByAddress**](docs/LIAPIGeoEnrichServiceApi.md#getPOIsByAddress) | **GET** /geoenrich/v1/poi/byaddress | Points of Interest By Address.
*LIAPIGeoEnrichServiceApi* | [**getPOIsByArea**](docs/LIAPIGeoEnrichServiceApi.md#getPOIsByArea) | **GET** /geoenrich/v1/poi/byarea | Points of Interest By Area.
*LIAPIGeoEnrichServiceApi* | [**getPOIsByGeometry**](docs/LIAPIGeoEnrichServiceApi.md#getPOIsByGeometry) | **POST** /geoenrich/v1/poi/byboundary | Point of Interests By Geometry.
*LIAPIGeoEnrichServiceApi* | [**getPOIsByLocation**](docs/LIAPIGeoEnrichServiceApi.md#getPOIsByLocation) | **GET** /geoenrich/v1/poi/bylocation | Points of Interest By Location.
*LIAPIGeoEnrichServiceApi* | [**getPOIsCount**](docs/LIAPIGeoEnrichServiceApi.md#getPOIsCount) | **POST** /geoenrich/v1/poicount | Point of Interests count By Geometry.
*LIAPIGeoEnrichServiceApi* | [**getPlaceByLocation**](docs/LIAPIGeoEnrichServiceApi.md#getPlaceByLocation) | **GET** /geoenrich/v1/place/bylocation | Place By Location.
*LIAPIGeoEnrichServiceApi* | [**getSICMetadata**](docs/LIAPIGeoEnrichServiceApi.md#getSICMetadata) | **GET** /geoenrich/v1/metadata/sic | Returns SIC Codes with their Industry Titles and Category Codes mapping
*LIAPIGeoEnrichServiceApi* | [**poisAutocomplete**](docs/LIAPIGeoEnrichServiceApi.md#poisAutocomplete) | **GET** /geoenrich/v1/poi/autocomplete | Points of Interest Autocomplete.
*LIAPIGeoIdentityServiceApi* | [**getIdentityByAddress**](docs/LIAPIGeoIdentityServiceApi.md#getIdentityByAddress) | **GET** /geoidentity/v1/identity/byaddress | Gets GeoIdentityResponse
*LIAPIGeoIdentityServiceApi* | [**getIdentityByEmail**](docs/LIAPIGeoIdentityServiceApi.md#getIdentityByEmail) | **GET** /geoidentity/v1/identity/byemail | Gets Identity
*LIAPIGeoIdentityServiceApi* | [**getIdentityByPBKey**](docs/LIAPIGeoIdentityServiceApi.md#getIdentityByPBKey) | **GET** /geoidentity/v1/identity/bypbkey | Gets GeoIdentityResponse
*LIAPIGeoIdentityServiceApi* | [**getIdentityByTwitter**](docs/LIAPIGeoIdentityServiceApi.md#getIdentityByTwitter) | **GET** /geoidentity/v1/identity/bytwitter | Gets Identity
*LIAPIGeoLifeServiceApi* | [**getDemographicsByAddressV2**](docs/LIAPIGeoLifeServiceApi.md#getDemographicsByAddressV2) | **GET** /geolife/v2/demographics/byaddress | Demographics By Address.
*LIAPIGeoLifeServiceApi* | [**getDemographicsByLocationV2**](docs/LIAPIGeoLifeServiceApi.md#getDemographicsByLocationV2) | **GET** /geolife/v2/demographics/bylocation | Demographics By Location.
*LIAPIGeoLifeServiceApi* | [**getDemographicsByPBKey**](docs/LIAPIGeoLifeServiceApi.md#getDemographicsByPBKey) | **GET** /geolife/v2/demographics/bypbkey | Demographics By PBKey.
*LIAPIGeoLifeServiceApi* | [**getSegmentationByAddress**](docs/LIAPIGeoLifeServiceApi.md#getSegmentationByAddress) | **GET** /geolife/v1/segmentation/byaddress | Segmentation By Address.
*LIAPIGeoLifeServiceApi* | [**getSegmentationByLocation**](docs/LIAPIGeoLifeServiceApi.md#getSegmentationByLocation) | **GET** /geolife/v1/segmentation/bylocation | Segmentation By Location.
*LIAPIGeoLifeServiceApi* | [**getSegmentationByPBKey**](docs/LIAPIGeoLifeServiceApi.md#getSegmentationByPBKey) | **GET** /geolife/v1/segmentation/bypbkey | Segmentation By PB Key.
*LIAPIGeoLocationServiceApi* | [**getDeviceStatus**](docs/LIAPIGeoLocationServiceApi.md#getDeviceStatus) | **GET** /geolocation/v1/devicestatus | Location By Device Status.
*LIAPIGeoLocationServiceApi* | [**getLocationByIPAddress**](docs/LIAPIGeoLocationServiceApi.md#getLocationByIPAddress) | **GET** /geolocation/v1/location/byipaddress | Location By IP Address.
*LIAPIGeoLocationServiceApi* | [**getLocationByWiFiAccessPoint**](docs/LIAPIGeoLocationServiceApi.md#getLocationByWiFiAccessPoint) | **GET** /geolocation/v1/location/byaccesspoint | Location by WiFi Access Point.
*LIAPIGeoPostServiceApi* | [**getCarrierRoutesByAddress**](docs/LIAPIGeoPostServiceApi.md#getCarrierRoutesByAddress) | **GET** /geopost/v1/carrierroute/byaddress | Carrier Route By Address.
*LIAPIGeoPostServiceApi* | [**getCarrierRoutesByAddressBatch**](docs/LIAPIGeoPostServiceApi.md#getCarrierRoutesByAddressBatch) | **POST** /geopost/v1/carrierroute/byaddress | Gets GeoPost Carrier Routes for Multiple Addresses
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByAddress**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddress) | **GET** /geoproperty/v1/all/attributes/byaddress | Gets GeoPropertyResponse
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByAddressBatch**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddressBatch) | **POST** /geoproperty/v1/all/attributes/byaddress | Gets GeoPropertyResponses
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByPBKey**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByPBKey) | **GET** /geoproperty/v1/all/attributes/bypbkey | Gets GeoPropertyResponse
*LIAPIGeoPropertyServiceApi* | [**getGeoPropertyByPBKeyBatch**](docs/LIAPIGeoPropertyServiceApi.md#getGeoPropertyByPBKeyBatch) | **POST** /geoproperty/v1/all/attributes/bypbkey | Gets GeoPropertyResponses
*LIAPIGeoPropertyServiceApi* | [**getParcelBoundaryByAddress**](docs/LIAPIGeoPropertyServiceApi.md#getParcelBoundaryByAddress) | **GET** /geoproperty/v1/parcelboundary/byaddress | Gets ParcelBoundary
*LIAPIGeoPropertyServiceApi* | [**getParcelBoundaryByLocation**](docs/LIAPIGeoPropertyServiceApi.md#getParcelBoundaryByLocation) | **GET** /geoproperty/v1/parcelboundary/bylocation | Gets ParcelBoundary
*LIAPIGeoPropertyServiceApi* | [**getParcelBoundaryByPBKey**](docs/LIAPIGeoPropertyServiceApi.md#getParcelBoundaryByPBKey) | **GET** /geoproperty/v1/parcelboundary/bypbkey | Gets ParcelBoundary
*LIAPIGeoPropertyServiceApi* | [**getSchoolsByAddress**](docs/LIAPIGeoPropertyServiceApi.md#getSchoolsByAddress) | **GET** /geoproperty/v1/school/byaddress | Search Nearby Schools by Address
*LIAPIGeoPropertyServiceApi* | [**getSchoolsNearByUsingPBKey**](docs/LIAPIGeoPropertyServiceApi.md#getSchoolsNearByUsingPBKey) | **GET** /geoproperty/v1/school/bypbkey | Search Nearby Schools by PBKey
*LIAPIGeoRiskServiceApi* | [**getCrimeRiskByAddress**](docs/LIAPIGeoRiskServiceApi.md#getCrimeRiskByAddress) | **GET** /georisk/v1/crime/byaddress | Gets CrimeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getCrimeRiskByAddressBatch**](docs/LIAPIGeoRiskServiceApi.md#getCrimeRiskByAddressBatch) | **POST** /georisk/v1/crime/byaddress | Batch method for getting crime risk by address
*LIAPIGeoRiskServiceApi* | [**getCrimeRiskByLocation**](docs/LIAPIGeoRiskServiceApi.md#getCrimeRiskByLocation) | **GET** /georisk/v1/crime/bylocation | Gets CrimeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getCrimeRiskByLocationBatch**](docs/LIAPIGeoRiskServiceApi.md#getCrimeRiskByLocationBatch) | **POST** /georisk/v1/crime/bylocation | Batch method for getting crime risk by location
*LIAPIGeoRiskServiceApi* | [**getDistanceToFloodHazardByAddress**](docs/LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByAddress) | **GET** /georisk/v1/shoreline/distancetofloodhazard/byaddress | Gets WaterBodyResponse
*LIAPIGeoRiskServiceApi* | [**getDistanceToFloodHazardByAddressBatch**](docs/LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByAddressBatch) | **POST** /georisk/v1/shoreline/distancetofloodhazard/byaddress | Batch method for getting Water Bodies by address
*LIAPIGeoRiskServiceApi* | [**getDistanceToFloodHazardByLocation**](docs/LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByLocation) | **GET** /georisk/v1/shoreline/distancetofloodhazard/bylocation | Gets WaterBodyResponse
*LIAPIGeoRiskServiceApi* | [**getDistanceToFloodHazardByLocationBatch**](docs/LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByLocationBatch) | **POST** /georisk/v1/shoreline/distancetofloodhazard/bylocation | Batch method for getting Water Bodies by location
*LIAPIGeoRiskServiceApi* | [**getEarthquakeHistory**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeHistory) | **GET** /georisk/v1/earthquakehistory | Gets EarthquakeHistory
*LIAPIGeoRiskServiceApi* | [**getEarthquakeRiskByAddress**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByAddress) | **GET** /georisk/v1/earthquake/byaddress | Gets EarthquakeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getEarthquakeRiskByAddressBatch**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByAddressBatch) | **POST** /georisk/v1/earthquake/byaddress | Batch method for getting earthquake risk by address
*LIAPIGeoRiskServiceApi* | [**getEarthquakeRiskByLocation**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByLocation) | **GET** /georisk/v1/earthquake/bylocation | Gets EarthquakeRiskResponse
*LIAPIGeoRiskServiceApi* | [**getEarthquakeRiskByLocationBatch**](docs/LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByLocationBatch) | **POST** /georisk/v1/earthquake/bylocation | Batch method for getting earthquake risk by location
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
*LIAPIGeoSearchServiceApi* | [**geoSearch**](docs/LIAPIGeoSearchServiceApi.md#geoSearch) | **GET** /geosearch/v2/locations | Gets LocationList
*LIAPIGeoStreetsServiceApi* | [**getIntersectionByAddress**](docs/LIAPIGeoStreetsServiceApi.md#getIntersectionByAddress) | **GET** /geostreets/v1/intersection/byaddress | Gets NearestIntersection of major roads
*LIAPIGeoStreetsServiceApi* | [**getIntersectionByLocation**](docs/LIAPIGeoStreetsServiceApi.md#getIntersectionByLocation) | **GET** /geostreets/v1/intersection/bylocation | Gets NearestIntersection of major roads
*LIAPIGeoStreetsServiceApi* | [**getNearestSpeedLimit**](docs/LIAPIGeoStreetsServiceApi.md#getNearestSpeedLimit) | **GET** /geostreets/v1/speedlimit | Gets NearestSpeedLimit
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
*LIAPIGeoTimeServiceApi* | [**getBatchTimezoneByAddress**](docs/LIAPIGeoTimeServiceApi.md#getBatchTimezoneByAddress) | **POST** /geotime/v1/timezone/byaddress | Timezone Batch by Address
*LIAPIGeoTimeServiceApi* | [**getBatchTimezoneByLocation**](docs/LIAPIGeoTimeServiceApi.md#getBatchTimezoneByLocation) | **POST** /geotime/v1/timezone/bylocation | Timezone Batch by Location
*LIAPIGeoTimeServiceApi* | [**getTimezoneByAddress**](docs/LIAPIGeoTimeServiceApi.md#getTimezoneByAddress) | **GET** /geotime/v1/timezone/byaddress | Timezone By Address.
*LIAPIGeoTimeServiceApi* | [**getTimezoneByLocation**](docs/LIAPIGeoTimeServiceApi.md#getTimezoneByLocation) | **GET** /geotime/v1/timezone/bylocation | Timezone By Location.
*LIAPIGeoZoneServiceApi* | [**getBasicBoundaryByAddress**](docs/LIAPIGeoZoneServiceApi.md#getBasicBoundaryByAddress) | **GET** /geozone/v1/basicboundary/byaddress | Gets Basic Boundary by Address
*LIAPIGeoZoneServiceApi* | [**getBasicBoundaryByLocation**](docs/LIAPIGeoZoneServiceApi.md#getBasicBoundaryByLocation) | **GET** /geozone/v1/basicboundary/bylocation | Gets Basic Boundary by Location
*LIAPIGeoZoneServiceApi* | [**getPOIBoundaryByAddress**](docs/LIAPIGeoZoneServiceApi.md#getPOIBoundaryByAddress) | **GET** /geozone/v1/poiboundary/byaddress | Get Point of Interests Boundary by Address
*LIAPIGeoZoneServiceApi* | [**getPOIBoundaryByAddressBatch**](docs/LIAPIGeoZoneServiceApi.md#getPOIBoundaryByAddressBatch) | **POST** /geozone/v1/poiboundary/byaddress | Batch method for getting Point of Interests Boundary by Address
*LIAPIGeoZoneServiceApi* | [**getPOIBoundaryByLocation**](docs/LIAPIGeoZoneServiceApi.md#getPOIBoundaryByLocation) | **GET** /geozone/v1/poiboundary/bylocation | Get Point of Interests Boundary by Location
*LIAPIGeoZoneServiceApi* | [**getPOIBoundaryByLocationBatch**](docs/LIAPIGeoZoneServiceApi.md#getPOIBoundaryByLocationBatch) | **POST** /geozone/v1/poiboundary/bylocation | Batch method for getting Point of Interests Boundary by Location
*LIAPIGeoZoneServiceApi* | [**getPOIBoundaryByPBKey**](docs/LIAPIGeoZoneServiceApi.md#getPOIBoundaryByPBKey) | **GET** /geozone/v1/poiboundary/bypbkey | Gets Point of Interests Boundary by PBKey
*LIAPIGeoZoneServiceApi* | [**getPOIBoundaryByPBKeyBatch**](docs/LIAPIGeoZoneServiceApi.md#getPOIBoundaryByPBKeyBatch) | **POST** /geozone/v1/poiboundary/bypbkey | Batch method for getting Point of Interests Boundary by PBKey
*LIAPIGeoZoneServiceApi* | [**getTravelBoundaryByDistance**](docs/LIAPIGeoZoneServiceApi.md#getTravelBoundaryByDistance) | **GET** /geozone/v1/travelboundary/bydistance | Gets travel Boundary by Distance
*LIAPIGeoZoneServiceApi* | [**getTravelBoundaryByTime**](docs/LIAPIGeoZoneServiceApi.md#getTravelBoundaryByTime) | **GET** /geozone/v1/travelboundary/bytime | Gets travel Boundary by Time
*LIAPIGeocodeServiceApi* | [**geocode**](docs/LIAPIGeocodeServiceApi.md#geocode) | **GET** /geocode-service/v1/transient/{datapackBundle}/geocode | Gets Geocode
*LIAPIGeocodeServiceApi* | [**geocodeBatch**](docs/LIAPIGeocodeServiceApi.md#geocodeBatch) | **POST** /geocode-service/v1/transient/{datapackBundle}/geocode | Gets Geocode
*LIAPIGeocodeServiceApi* | [**getCapabilities**](docs/LIAPIGeocodeServiceApi.md#getCapabilities) | **GET** /geocode-service/v1/transient/{datapackBundle}/capabilities | Gets Capabilities
*LIAPIGeocodeServiceApi* | [**getDictionaries**](docs/LIAPIGeocodeServiceApi.md#getDictionaries) | **GET** /geocode-service/v1/transient/{datapackBundle}/dictionaries | Gets installed Dictionaries
*LIAPIGeocodeServiceApi* | [**getPBKey**](docs/LIAPIGeocodeServiceApi.md#getPBKey) | **GET** /geocode-service/v1/key/byaddress | Gets PBKey
*LIAPIGeocodeServiceApi* | [**getPBKeys**](docs/LIAPIGeocodeServiceApi.md#getPBKeys) | **POST** /geocode-service/v1/key/byaddress | Gets PBKeys
*LIAPIGeocodeServiceApi* | [**keyLookup**](docs/LIAPIGeocodeServiceApi.md#keyLookup) | **GET** /geocode-service/v1/keylookup | Get Address
*LIAPIGeocodeServiceApi* | [**keyLookupBatch**](docs/LIAPIGeocodeServiceApi.md#keyLookupBatch) | **POST** /geocode-service/v1/keylookup | Get List of Address
*LIAPIGeocodeServiceApi* | [**reverseGeocodBatch**](docs/LIAPIGeocodeServiceApi.md#reverseGeocodBatch) | **POST** /geocode-service/v1/transient/{datapackBundle}/reverseGeocode | reverse Geocode
*LIAPIGeocodeServiceApi* | [**reverseGeocode**](docs/LIAPIGeocodeServiceApi.md#reverseGeocode) | **GET** /geocode-service/v1/transient/{datapackBundle}/reverseGeocode | reverse Geocode


## Documentation for Models

 - [AHJ](docs/AHJ.md)
 - [AHJList](docs/AHJList.md)
 - [AHJPlusPSAPResponse](docs/AHJPlusPSAPResponse.md)
 - [AHJmailingAddress](docs/AHJmailingAddress.md)
 - [Accuracy](docs/Accuracy.md)
 - [Address](docs/Address.md)
 - [AddressTime](docs/AddressTime.md)
 - [Age](docs/Age.md)
 - [AgeTheme](docs/AgeTheme.md)
 - [Area](docs/Area.md)
 - [AreaCodeInfo](docs/AreaCodeInfo.md)
 - [AssetsAndWealthTheme](docs/AssetsAndWealthTheme.md)
 - [AttitudesAndMotivationTheme](docs/AttitudesAndMotivationTheme.md)
 - [AutomobileTheme](docs/AutomobileTheme.md)
 - [BaseFloodElevation](docs/BaseFloodElevation.md)
 - [BasicBoundary](docs/BasicBoundary.md)
 - [BasicBoundaryAddress](docs/BasicBoundaryAddress.md)
 - [Birthday](docs/Birthday.md)
 - [Boundaries](docs/Boundaries.md)
 - [Boundary](docs/Boundary.md)
 - [BoundaryBuffer](docs/BoundaryBuffer.md)
 - [BoundaryPoint](docs/BoundaryPoint.md)
 - [BufferRelation](docs/BufferRelation.md)
 - [Candidate](docs/Candidate.md)
 - [CandidateRange](docs/CandidateRange.md)
 - [CandidateRangeUnit](docs/CandidateRangeUnit.md)
 - [Carrier](docs/Carrier.md)
 - [CarrierRouteAddressRequest](docs/CarrierRouteAddressRequest.md)
 - [CarrierRouteBoundaries](docs/CarrierRouteBoundaries.md)
 - [CarrierRoutePreference](docs/CarrierRoutePreference.md)
 - [CarrierRouteResponse](docs/CarrierRouteResponse.md)
 - [CarrierRouteResponseList](docs/CarrierRouteResponseList.md)
 - [Category](docs/Category.md)
 - [CategoryMetadata](docs/CategoryMetadata.md)
 - [Cbsa](docs/Cbsa.md)
 - [Census](docs/Census.md)
 - [Center](docs/Center.md)
 - [ChannelPreferencesTheme](docs/ChannelPreferencesTheme.md)
 - [City](docs/City.md)
 - [CommonAddress](docs/CommonAddress.md)
 - [CommonGeometry](docs/CommonGeometry.md)
 - [CommonState](docs/CommonState.md)
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
 - [CrimeRiskByAddressRequest](docs/CrimeRiskByAddressRequest.md)
 - [CrimeRiskByLocationRequest](docs/CrimeRiskByLocationRequest.md)
 - [CrimeRiskLocationResponse](docs/CrimeRiskLocationResponse.md)
 - [CrimeRiskLocationResponseList](docs/CrimeRiskLocationResponseList.md)
 - [CrimeRiskPreferences](docs/CrimeRiskPreferences.md)
 - [CrimeRiskResponse](docs/CrimeRiskResponse.md)
 - [CrimeRiskResponseList](docs/CrimeRiskResponseList.md)
 - [Crs](docs/Crs.md)
 - [CustomObject](docs/CustomObject.md)
 - [CustomObjectMember](docs/CustomObjectMember.md)
 - [CustomPreferences](docs/CustomPreferences.md)
 - [DateTimeEarthQuake](docs/DateTimeEarthQuake.md)
 - [DemographicsThemes](docs/DemographicsThemes.md)
 - [DemographicsThemesV2](docs/DemographicsThemesV2.md)
 - [DemographicsV2](docs/DemographicsV2.md)
 - [Depth](docs/Depth.md)
 - [DeviceStatusNetwork](docs/DeviceStatusNetwork.md)
 - [Dictionary](docs/Dictionary.md)
 - [DirectionGeometry](docs/DirectionGeometry.md)
 - [Distance](docs/Distance.md)
 - [DistanceToBorder](docs/DistanceToBorder.md)
 - [DistanceToFloodHazardAddressRequest](docs/DistanceToFloodHazardAddressRequest.md)
 - [DistanceToFloodHazardLocationRequest](docs/DistanceToFloodHazardLocationRequest.md)
 - [DistanceToFloodHazardLocationResponse](docs/DistanceToFloodHazardLocationResponse.md)
 - [DistanceToFloodHazardResponse](docs/DistanceToFloodHazardResponse.md)
 - [DistrictType](docs/DistrictType.md)
 - [DomesticUltimateBusiness](docs/DomesticUltimateBusiness.md)
 - [EarthquakeEvent](docs/EarthquakeEvent.md)
 - [EarthquakeEventsResponse](docs/EarthquakeEventsResponse.md)
 - [EarthquakeHistory](docs/EarthquakeHistory.md)
 - [EarthquakeLocation](docs/EarthquakeLocation.md)
 - [EarthquakeRiskByAddressRequest](docs/EarthquakeRiskByAddressRequest.md)
 - [EarthquakeRiskByLocationRequest](docs/EarthquakeRiskByLocationRequest.md)
 - [EarthquakeRiskLocationResponse](docs/EarthquakeRiskLocationResponse.md)
 - [EarthquakeRiskLocationResponseList](docs/EarthquakeRiskLocationResponseList.md)
 - [EarthquakeRiskPreferences](docs/EarthquakeRiskPreferences.md)
 - [EarthquakeRiskResponse](docs/EarthquakeRiskResponse.md)
 - [EarthquakeRiskResponseList](docs/EarthquakeRiskResponseList.md)
 - [Education](docs/Education.md)
 - [EducationTheme](docs/EducationTheme.md)
 - [EducationalAttainmentTheme](docs/EducationalAttainmentTheme.md)
 - [Email](docs/Email.md)
 - [EmployeeCount](docs/EmployeeCount.md)
 - [Employment](docs/Employment.md)
 - [EmploymentTheme](docs/EmploymentTheme.md)
 - [End](docs/End.md)
 - [EthnicityTheme](docs/EthnicityTheme.md)
 - [EventsCount](docs/EventsCount.md)
 - [ExpenditureTheme](docs/ExpenditureTheme.md)
 - [Field](docs/Field.md)
 - [FieldV2](docs/FieldV2.md)
 - [FieldsMatching](docs/FieldsMatching.md)
 - [FinancialProductsTheme](docs/FinancialProductsTheme.md)
 - [FireDepartment](docs/FireDepartment.md)
 - [FireDepartmentContactDetails](docs/FireDepartmentContactDetails.md)
 - [FireEvent](docs/FireEvent.md)
 - [FireEventsResponse](docs/FireEventsResponse.md)
 - [FireHistory](docs/FireHistory.md)
 - [FireRiskByAddressRequest](docs/FireRiskByAddressRequest.md)
 - [FireRiskByLocationRequest](docs/FireRiskByLocationRequest.md)
 - [FireRiskLocationResponse](docs/FireRiskLocationResponse.md)
 - [FireRiskLocationResponseList](docs/FireRiskLocationResponseList.md)
 - [FireRiskResponse](docs/FireRiskResponse.md)
 - [FireRiskResponseList](docs/FireRiskResponseList.md)
 - [FireShed](docs/FireShed.md)
 - [FireStation](docs/FireStation.md)
 - [FireStationContactDetails](docs/FireStationContactDetails.md)
 - [FireStations](docs/FireStations.md)
 - [FireStationsLocation](docs/FireStationsLocation.md)
 - [FloodBoundary](docs/FloodBoundary.md)
 - [FloodHazardPreferences](docs/FloodHazardPreferences.md)
 - [FloodRiskByAddressRequest](docs/FloodRiskByAddressRequest.md)
 - [FloodRiskByLocationRequest](docs/FloodRiskByLocationRequest.md)
 - [FloodRiskLocationResponse](docs/FloodRiskLocationResponse.md)
 - [FloodRiskLocationResponseList](docs/FloodRiskLocationResponseList.md)
 - [FloodRiskPreferences](docs/FloodRiskPreferences.md)
 - [FloodRiskResponse](docs/FloodRiskResponse.md)
 - [FloodRiskResponseList](docs/FloodRiskResponseList.md)
 - [FloodZone](docs/FloodZone.md)
 - [FreeOrReducedPriceLunches](docs/FreeOrReducedPriceLunches.md)
 - [GenderTheme](docs/GenderTheme.md)
 - [GeoEnrichMetadataResponse](docs/GeoEnrichMetadataResponse.md)
 - [GeoEnrichResponse](docs/GeoEnrichResponse.md)
 - [GeoIdentityName](docs/GeoIdentityName.md)
 - [GeoIdentityPlace](docs/GeoIdentityPlace.md)
 - [GeoIdentityResponse](docs/GeoIdentityResponse.md)
 - [GeoLocationAccessPoint](docs/GeoLocationAccessPoint.md)
 - [GeoLocationCountry](docs/GeoLocationCountry.md)
 - [GeoLocationDeviceSatus](docs/GeoLocationDeviceSatus.md)
 - [GeoLocationFixedLine](docs/GeoLocationFixedLine.md)
 - [GeoLocationFixedLineCountry](docs/GeoLocationFixedLineCountry.md)
 - [GeoLocationIpAddr](docs/GeoLocationIpAddr.md)
 - [GeoLocationPlace](docs/GeoLocationPlace.md)
 - [GeoLocationState](docs/GeoLocationState.md)
 - [GeoPos](docs/GeoPos.md)
 - [GeoPostGeometry](docs/GeoPostGeometry.md)
 - [GeoPropertyAddressRequest](docs/GeoPropertyAddressRequest.md)
 - [GeoPropertyPBKeyRequest](docs/GeoPropertyPBKeyRequest.md)
 - [GeoPropertyPBKeyResponse](docs/GeoPropertyPBKeyResponse.md)
 - [GeoPropertyPBKeyResponses](docs/GeoPropertyPBKeyResponses.md)
 - [GeoPropertyResponse](docs/GeoPropertyResponse.md)
 - [GeoPropertyResponses](docs/GeoPropertyResponses.md)
 - [GeoRiskBoundaries](docs/GeoRiskBoundaries.md)
 - [GeoRiskCrimeTheme](docs/GeoRiskCrimeTheme.md)
 - [GeoRiskGeometry](docs/GeoRiskGeometry.md)
 - [GeoRiskLocations](docs/GeoRiskLocations.md)
 - [GeoRouteResponse](docs/GeoRouteResponse.md)
 - [GeoTaxLocations](docs/GeoTaxLocations.md)
 - [GeoTaxRateLocations](docs/GeoTaxRateLocations.md)
 - [GeoZoneGeometry](docs/GeoZoneGeometry.md)
 - [GeocodeAddress](docs/GeocodeAddress.md)
 - [GeocodeCapabilitiesResponse](docs/GeocodeCapabilitiesResponse.md)
 - [GeocodeCustomPreferences](docs/GeocodeCustomPreferences.md)
 - [GeocodePreferences](docs/GeocodePreferences.md)
 - [GeocodeRequest](docs/GeocodeRequest.md)
 - [GeocodeRequestAddress](docs/GeocodeRequestAddress.md)
 - [GeocodeServiceResponse](docs/GeocodeServiceResponse.md)
 - [GeocodeServiceResponseList](docs/GeocodeServiceResponseList.md)
 - [Geometry](docs/Geometry.md)
 - [GeosearchLocation](docs/GeosearchLocation.md)
 - [GeosearchLocations](docs/GeosearchLocations.md)
 - [GlobalUltimateBusiness](docs/GlobalUltimateBusiness.md)
 - [GradeLevelsTaught](docs/GradeLevelsTaught.md)
 - [Greatschools](docs/Greatschools.md)
 - [Grid](docs/Grid.md)
 - [HealthTheme](docs/HealthTheme.md)
 - [HouseholdFinance](docs/HouseholdFinance.md)
 - [HouseholdSizeTheme](docs/HouseholdSizeTheme.md)
 - [HouseholdsTheme](docs/HouseholdsTheme.md)
 - [HousingTheme](docs/HousingTheme.md)
 - [IPDTaxByAddressBatchRequest](docs/IPDTaxByAddressBatchRequest.md)
 - [IPDTaxJurisdiction](docs/IPDTaxJurisdiction.md)
 - [Identity](docs/Identity.md)
 - [IdentityDetail](docs/IdentityDetail.md)
 - [IncomeTheme](docs/IncomeTheme.md)
 - [IncomeThemeV2](docs/IncomeThemeV2.md)
 - [IndexVariable](docs/IndexVariable.md)
 - [IndividualValueVariable](docs/IndividualValueVariable.md)
 - [IndividualValueVariableV2](docs/IndividualValueVariableV2.md)
 - [InputParameter](docs/InputParameter.md)
 - [Interest](docs/Interest.md)
 - [Intersection](docs/Intersection.md)
 - [IntersectionResponse](docs/IntersectionResponse.md)
 - [IpInfo](docs/IpInfo.md)
 - [Ipd](docs/Ipd.md)
 - [KeyLookupRequest](docs/KeyLookupRequest.md)
 - [Keys](docs/Keys.md)
 - [LatLongFields](docs/LatLongFields.md)
 - [LifeStyleTheme](docs/LifeStyleTheme.md)
 - [Lifestyle](docs/Lifestyle.md)
 - [Location](docs/Location.md)
 - [LocationTime](docs/LocationTime.md)
 - [Magnitude](docs/Magnitude.md)
 - [MaritalStatusTheme](docs/MaritalStatusTheme.md)
 - [Match](docs/Match.md)
 - [MatchedAddress](docs/MatchedAddress.md)
 - [Matrix](docs/Matrix.md)
 - [Mcd](docs/Mcd.md)
 - [Neighborhood](docs/Neighborhood.md)
 - [Network](docs/Network.md)
 - [Operation](docs/Operation.md)
 - [OrganizationType](docs/OrganizationType.md)
 - [OutputParameter](docs/OutputParameter.md)
 - [PBKeyAddressRequest](docs/PBKeyAddressRequest.md)
 - [PBKeyResponse](docs/PBKeyResponse.md)
 - [PBKeyResponseList](docs/PBKeyResponseList.md)
 - [POIBoundaryAddressRequest](docs/POIBoundaryAddressRequest.md)
 - [POIBoundaryLocationRequest](docs/POIBoundaryLocationRequest.md)
 - [POIBoundaryLocations](docs/POIBoundaryLocations.md)
 - [POIBoundaryPBKey](docs/POIBoundaryPBKey.md)
 - [POIBoundaryPBKeyRequest](docs/POIBoundaryPBKeyRequest.md)
 - [POIBoundaryResponse](docs/POIBoundaryResponse.md)
 - [POIByGeometryRequest](docs/POIByGeometryRequest.md)
 - [POIPlaces](docs/POIPlaces.md)
 - [PSAPResponse](docs/PSAPResponse.md)
 - [Parcel](docs/Parcel.md)
 - [ParcelBoundary](docs/ParcelBoundary.md)
 - [ParentBusiness](docs/ParentBusiness.md)
 - [PbKey](docs/PbKey.md)
 - [Photo](docs/Photo.md)
 - [PlaceByLocations](docs/PlaceByLocations.md)
 - [PlaceByLocationsLocation](docs/PlaceByLocationsLocation.md)
 - [PlaceLocation](docs/PlaceLocation.md)
 - [PlaceLocationName](docs/PlaceLocationName.md)
 - [Poi](docs/Poi.md)
 - [PoiBoundary](docs/PoiBoundary.md)
 - [PoiBoundaryPreferences](docs/PoiBoundaryPreferences.md)
 - [PoiClassification](docs/PoiClassification.md)
 - [PoiContactDetails](docs/PoiContactDetails.md)
 - [PoiCount](docs/PoiCount.md)
 - [PoiCountRequest](docs/PoiCountRequest.md)
 - [Points](docs/Points.md)
 - [Pois](docs/Pois.md)
 - [PolygonGeometry](docs/PolygonGeometry.md)
 - [PopulationTheme](docs/PopulationTheme.md)
 - [PreferencTimeZone](docs/PreferencTimeZone.md)
 - [Preferences](docs/Preferences.md)
 - [PrimaryZone](docs/PrimaryZone.md)
 - [Profile](docs/Profile.md)
 - [Properties](docs/Properties.md)
 - [Property](docs/Property.md)
 - [Proxy](docs/Proxy.md)
 - [PurchasingBehaviorTheme](docs/PurchasingBehaviorTheme.md)
 - [RaceAndEthnicityTheme](docs/RaceAndEthnicityTheme.md)
 - [RaceTheme](docs/RaceTheme.md)
 - [RangeVariable](docs/RangeVariable.md)
 - [RangeVariableV2](docs/RangeVariableV2.md)
 - [Rate](docs/Rate.md)
 - [RateCenterResponse](docs/RateCenterResponse.md)
 - [ReturnFieldsDescriptor](docs/ReturnFieldsDescriptor.md)
 - [ReverseGeocodeRequest](docs/ReverseGeocodeRequest.md)
 - [Risk](docs/Risk.md)
 - [RiskAddress](docs/RiskAddress.md)
 - [Road](docs/Road.md)
 - [RouteBoundary](docs/RouteBoundary.md)
 - [RouteDelivery](docs/RouteDelivery.md)
 - [RouteDirection](docs/RouteDirection.md)
 - [RouteDirections](docs/RouteDirections.md)
 - [RouteGeometry](docs/RouteGeometry.md)
 - [SalesTax](docs/SalesTax.md)
 - [SalesTaxRate](docs/SalesTaxRate.md)
 - [SalesVolume](docs/SalesVolume.md)
 - [School](docs/School.md)
 - [SchoolDistrict](docs/SchoolDistrict.md)
 - [SchoolProfile](docs/SchoolProfile.md)
 - [SchoolRanking](docs/SchoolRanking.md)
 - [SchoolsNearByResponse](docs/SchoolsNearByResponse.md)
 - [Segmentation](docs/Segmentation.md)
 - [SegmentationThemes](docs/SegmentationThemes.md)
 - [ShoreLineDistance](docs/ShoreLineDistance.md)
 - [Sic](docs/Sic.md)
 - [SicMetadata](docs/SicMetadata.md)
 - [SiteDetails](docs/SiteDetails.md)
 - [SpecialPurposeDistrict](docs/SpecialPurposeDistrict.md)
 - [SpecialPurposeDistrictTax](docs/SpecialPurposeDistrictTax.md)
 - [SpecialPurposeDistrictTaxRate](docs/SpecialPurposeDistrictTaxRate.md)
 - [SpeedLimit](docs/SpeedLimit.md)
 - [SpeedRoad](docs/SpeedRoad.md)
 - [Start](docs/Start.md)
 - [StartEndPoint](docs/StartEndPoint.md)
 - [Status](docs/Status.md)
 - [StudentEthnicity](docs/StudentEthnicity.md)
 - [SupplyAndDemandTheme](docs/SupplyAndDemandTheme.md)
 - [SupportLevel](docs/SupportLevel.md)
 - [TaxAddress](docs/TaxAddress.md)
 - [TaxAddressRequest](docs/TaxAddressRequest.md)
 - [TaxBatchLocationResponse](docs/TaxBatchLocationResponse.md)
 - [TaxBatchResponse](docs/TaxBatchResponse.md)
 - [TaxCounty](docs/TaxCounty.md)
 - [TaxDistrictResponse](docs/TaxDistrictResponse.md)
 - [TaxDistrictResponseList](docs/TaxDistrictResponseList.md)
 - [TaxJurisdiction](docs/TaxJurisdiction.md)
 - [TaxLocationPreferences](docs/TaxLocationPreferences.md)
 - [TaxLocationRequest](docs/TaxLocationRequest.md)
 - [TaxLocationResponses](docs/TaxLocationResponses.md)
 - [TaxPlace](docs/TaxPlace.md)
 - [TaxRateAddress](docs/TaxRateAddress.md)
 - [TaxRateAddressRequest](docs/TaxRateAddressRequest.md)
 - [TaxRateBatchLocationResponse](docs/TaxRateBatchLocationResponse.md)
 - [TaxRateBatchResponse](docs/TaxRateBatchResponse.md)
 - [TaxRateLocationRequest](docs/TaxRateLocationRequest.md)
 - [TaxRateLocationResponses](docs/TaxRateLocationResponses.md)
 - [TaxRateResponse](docs/TaxRateResponse.md)
 - [TaxRateResponses](docs/TaxRateResponses.md)
 - [TaxResponse](docs/TaxResponse.md)
 - [TaxResponses](docs/TaxResponses.md)
 - [TaxState](docs/TaxState.md)
 - [Time](docs/Time.md)
 - [Timezone](docs/Timezone.md)
 - [TimezoneAddressRequest](docs/TimezoneAddressRequest.md)
 - [TimezoneLocation](docs/TimezoneLocation.md)
 - [TimezoneLocationRequest](docs/TimezoneLocationRequest.md)
 - [TimezoneLocationResponse](docs/TimezoneLocationResponse.md)
 - [TimezoneResponse](docs/TimezoneResponse.md)
 - [Topic](docs/Topic.md)
 - [TravelBoundaries](docs/TravelBoundaries.md)
 - [TravelBoundary](docs/TravelBoundary.md)
 - [TravelCostMatrixResponse](docs/TravelCostMatrixResponse.md)
 - [Type](docs/Type.md)
 - [Unit](docs/Unit.md)
 - [Url](docs/Url.md)
 - [UseTax](docs/UseTax.md)
 - [UseTaxRate](docs/UseTaxRate.md)
 - [WaterBody](docs/WaterBody.md)
 - [WaterBodyLocationResponse](docs/WaterBodyLocationResponse.md)
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

## Author



