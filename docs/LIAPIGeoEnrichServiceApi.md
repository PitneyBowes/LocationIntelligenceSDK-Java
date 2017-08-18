# LIAPIGeoEnrichServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAddress**](LIAPIGeoEnrichServiceApi.md#getAddress) | **GET** /geoenrich/v1/address/bylocation | Address By Location.
[**getEntityByLocation**](LIAPIGeoEnrichServiceApi.md#getEntityByLocation) | **GET** /geoenrich/v1/poi/bylocation | Points Of Interest By Location.
[**getPlaceByLocation**](LIAPIGeoEnrichServiceApi.md#getPlaceByLocation) | **GET** /geoenrich/v1/place/bylocation | Place By Location.


<a name="getAddress"></a>
# **getAddress**
> Locations getAddress(latitude, longitude, searchRadius, searchRadiusUnit)

Address By Location.

This service accepts longitude and latitude as input and returns an address for that location.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoEnrichServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoEnrichServiceApi apiInstance = new LIAPIGeoEnrichServiceApi();
String latitude = "latitude_example"; // String | Latitude of the location.
String longitude = "longitude_example"; // String | Longitude of the location.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as feet, kilometers, miles or meters.
try {
    Locations result = apiInstance.getAddress(latitude, longitude, searchRadius, searchRadiusUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoEnrichServiceApi#getAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **latitude** | **String**| Latitude of the location. |
 **longitude** | **String**| Longitude of the location. |
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as feet, kilometers, miles or meters. | [optional] [enum: feet, kilometers, miles, meters]

### Return type

[**Locations**](Locations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEntityByLocation"></a>
# **getEntityByLocation**
> Locations getEntityByLocation(longitude, latitude, brandName, category, maxCandidates, searchRadius, searchRadiusUnit, searchDataset, searchPriority, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, mode)

Points Of Interest By Location.

Identifies and retrieves Points of Interest that exist around a specific location (ordered by distance from the location).

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoEnrichServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoEnrichServiceApi apiInstance = new LIAPIGeoEnrichServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String brandName = "brandName_example"; // String | Specifies the name of the brand to be searched. Also performs search on partially specified brand names.
String category = "category_example"; // String | Specific Category/Categories for which the POI search is performed. (Categories 10020102,10020103 are for Chinese and Italian Restaurants .https://developer2.pitneybowes.com/docs/location-intelligence/v1/en/poicategory/EightDigitPOICategoryCodes.xlsx 
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String searchDataset = "searchDataset_example"; // String | The datasets upon which the POI search can be performed.
String searchPriority = "searchPriority_example"; // String | Search order of POI datasets mentioned in searchDataset.
String travelTime = "travelTime_example"; // String | Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in 'travelTimeUnit'. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time.
String travelTimeUnit = "travelTimeUnit_example"; // String | Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds
String travelDistance = "travelDistance_example"; // String | Specifies the search boundary in terms of distance mentioned in 'travelDistanceUnit'. The results are retrieved from the polygon formed based on the travel distance specified.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters
String mode = "mode_example"; // String | Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time.Allowed values driving and walking
try {
    Locations result = apiInstance.getEntityByLocation(longitude, latitude, brandName, category, maxCandidates, searchRadius, searchRadiusUnit, searchDataset, searchPriority, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, mode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoEnrichServiceApi#getEntityByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **brandName** | **String**| Specifies the name of the brand to be searched. Also performs search on partially specified brand names. | [optional]
 **category** | **String**| Specific Category/Categories for which the POI search is performed. (Categories 10020102,10020103 are for Chinese and Italian Restaurants .https://developer2.pitneybowes.com/docs/location-intelligence/v1/en/poicategory/EightDigitPOICategoryCodes.xlsx  | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **searchDataset** | **String**| The datasets upon which the POI search can be performed. | [optional]
 **searchPriority** | **String**| Search order of POI datasets mentioned in searchDataset. | [optional]
 **travelTime** | **String**| Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in &#39;travelTimeUnit&#39;. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time. | [optional]
 **travelTimeUnit** | **String**| Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds | [optional] [enum: minutes, hours, seconds, milliseconds]
 **travelDistance** | **String**| Specifies the search boundary in terms of distance mentioned in &#39;travelDistanceUnit&#39;. The results are retrieved from the polygon formed based on the travel distance specified. | [optional]
 **travelDistanceUnit** | **String**| Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters | [optional] [enum: feet, kilometers, miles, meters]
 **mode** | **String**| Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time.Allowed values driving and walking | [optional] [enum: driving, walking]

### Return type

[**Locations**](Locations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPlaceByLocation"></a>
# **getPlaceByLocation**
> PlaceByLocations getPlaceByLocation(longitude, latitude, levelHint)

Place By Location.

Identifies and retrieves the nearest neighborhood around a specific location. This GeoEnrich service accepts latitude &amp; longitude as input and returns a place name.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoEnrichServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoEnrichServiceApi apiInstance = new LIAPIGeoEnrichServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String levelHint = "levelHint_example"; // String | Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6
try {
    PlaceByLocations result = apiInstance.getPlaceByLocation(longitude, latitude, levelHint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoEnrichServiceApi#getPlaceByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **levelHint** | **String**| Numeric code of geographic hierarchy level which is classified at six levels.Allowed values 1,2,3,4,5,6 | [optional] [enum: 1, 2, 3, 4, 5, 6]

### Return type

[**PlaceByLocations**](PlaceByLocations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

