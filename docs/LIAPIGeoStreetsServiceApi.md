# LIAPIGeoStreetsServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIntersectionByAddress**](LIAPIGeoStreetsServiceApi.md#getIntersectionByAddress) | **GET** /geostreets/v1/intersection/byaddress | Gets NearestIntersection of major roads
[**getIntersectionByLocation**](LIAPIGeoStreetsServiceApi.md#getIntersectionByLocation) | **GET** /geostreets/v1/intersection/bylocation | Gets NearestIntersection of major roads


<a name="getIntersectionByAddress"></a>
# **getIntersectionByAddress**
> IntersectionResponse getIntersectionByAddress(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates)

Gets NearestIntersection of major roads

Gets NearestIntersection of major roads

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoStreetsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoStreetsServiceApi apiInstance = new LIAPIGeoStreetsServiceApi();
String address = "address_example"; // String | Address
String roadClass = "roadClass_example"; // String | Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All
String driveTime = "driveTime_example"; // String | Returns Intersection in specified drive time
String driveTimeUnit = "driveTimeUnit_example"; // String | Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes
String searchRadius = "searchRadius_example"; // String | Search radius within which user wants to search, default is 50 miles
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Search radius unit, allowed values are (feet, meter, kilometers and miles)
String historicSpeed = "historicSpeed_example"; // String | Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT)
String maxCandidates = "maxCandidates_example"; // String | max candidates to be returned default is 1
try {
    IntersectionResponse result = apiInstance.getIntersectionByAddress(address, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoStreetsServiceApi#getIntersectionByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |
 **roadClass** | **String**| Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All | [optional]
 **driveTime** | **String**| Returns Intersection in specified drive time | [optional]
 **driveTimeUnit** | **String**| Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes | [optional]
 **searchRadius** | **String**| Search radius within which user wants to search, default is 50 miles | [optional]
 **searchRadiusUnit** | **String**| Search radius unit, allowed values are (feet, meter, kilometers and miles) | [optional]
 **historicSpeed** | **String**| Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) | [optional]
 **maxCandidates** | **String**| max candidates to be returned default is 1 | [optional]

### Return type

[**IntersectionResponse**](IntersectionResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getIntersectionByLocation"></a>
# **getIntersectionByLocation**
> IntersectionResponse getIntersectionByLocation(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates)

Gets NearestIntersection of major roads

Gets NearestIntersection of major roads

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoStreetsServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoStreetsServiceApi apiInstance = new LIAPIGeoStreetsServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String roadClass = "roadClass_example"; // String | Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All
String driveTime = "driveTime_example"; // String | Returns Intersection in specified drive time
String driveTimeUnit = "driveTimeUnit_example"; // String | Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes
String searchRadius = "searchRadius_example"; // String | Search radius within which user wants to search, default is 50 miles
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Search radius unit, allowed values are (feet, meter, kilometers and miles)
String historicSpeed = "historicSpeed_example"; // String | Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT)
String maxCandidates = "maxCandidates_example"; // String | max candidates to be returned default is 1
try {
    IntersectionResponse result = apiInstance.getIntersectionByLocation(longitude, latitude, roadClass, driveTime, driveTimeUnit, searchRadius, searchRadiusUnit, historicSpeed, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoStreetsServiceApi#getIntersectionByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **roadClass** | **String**| Filters roads with specified class, allowed values are (Major, Motorways, Other and All), default is All | [optional]
 **driveTime** | **String**| Returns Intersection in specified drive time | [optional]
 **driveTimeUnit** | **String**| Drive time unit, allowed values are (hours, minutes, seconds and milliseconds), default is minutes | [optional]
 **searchRadius** | **String**| Search radius within which user wants to search, default is 50 miles | [optional]
 **searchRadiusUnit** | **String**| Search radius unit, allowed values are (feet, meter, kilometers and miles) | [optional]
 **historicSpeed** | **String**| Traffic flow in peak time, allowed values are (AMPEAK,PMPEAK,OFFPEAK,NIGHT) | [optional]
 **maxCandidates** | **String**| max candidates to be returned default is 1 | [optional]

### Return type

[**IntersectionResponse**](IntersectionResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

