# LIAPIGeoSearchServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**geoSearch**](LIAPIGeoSearchServiceApi.md#geoSearch) | **GET** /geosearch/v1/locations | Gets LocationList


<a name="geoSearch"></a>
# **geoSearch**
> Locations geoSearch(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode)

Gets LocationList

Gets LocationList

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoSearchServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoSearchServiceApi apiInstance = new LIAPIGeoSearchServiceApi();
String searchText = "searchText_example"; // String | The input to be searched.
String latitude = "latitude_example"; // String | Latitude of the location. Either the latitude or the longitude must be provided.
String longitude = "longitude_example"; // String | Longitude of the location. Either the latitude or the longitude must be provided.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of addresses that can be retrieved.
String country = "country_example"; // String | Country ISO code. We need to make sure that either Lat/Lng or Country is provided to API
String matchOnAddressNumber = "matchOnAddressNumber_example"; // String | Option so that we force api to match on address number
String autoDetectLocation = "true"; // String | Option to allow API to detect origin of API request automatically
String ipAddress = "ipAddress_example"; // String | 
String areaName1 = "areaName1_example"; // String | State province of the input to be searched
String areaName3 = "areaName3_example"; // String | City of the input to be searched
String postCode = "postCode_example"; // String | Postal Code of the input to be searched
try {
    Locations result = apiInstance.geoSearch(searchText, latitude, longitude, searchRadius, searchRadiusUnit, maxCandidates, country, matchOnAddressNumber, autoDetectLocation, ipAddress, areaName1, areaName3, postCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoSearchServiceApi#geoSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **searchText** | **String**| The input to be searched. |
 **latitude** | **String**| Latitude of the location. Either the latitude or the longitude must be provided. | [optional]
 **longitude** | **String**| Longitude of the location. Either the latitude or the longitude must be provided. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **maxCandidates** | **String**| Maximum number of addresses that can be retrieved. | [optional]
 **country** | **String**| Country ISO code. We need to make sure that either Lat/Lng or Country is provided to API | [optional]
 **matchOnAddressNumber** | **String**| Option so that we force api to match on address number | [optional]
 **autoDetectLocation** | **String**| Option to allow API to detect origin of API request automatically | [optional] [default to true]
 **ipAddress** | **String**|  | [optional]
 **areaName1** | **String**| State province of the input to be searched | [optional]
 **areaName3** | **String**| City of the input to be searched | [optional]
 **postCode** | **String**| Postal Code of the input to be searched | [optional]

### Return type

[**Locations**](Locations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

