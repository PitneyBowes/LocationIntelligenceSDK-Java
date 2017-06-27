# LIAPIGeoZoneServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTravelBoundaryByDistance**](LIAPIGeoZoneServiceApi.md#getTravelBoundaryByDistance) | **GET** /geozone/v1/travelboundary/bydistance | Gets travel Boundary by Distance
[**getTravelBoundaryByTime**](LIAPIGeoZoneServiceApi.md#getTravelBoundaryByTime) | **GET** /geozone/v1/travelboundary/bytime | Gets travel Boundary by Time


<a name="getTravelBoundaryByDistance"></a>
# **getTravelBoundaryByDistance**
> TravelBoundaries getTravelBoundaryByDistance(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket)

Gets travel Boundary by Distance

Returns the travel boundary based on travel distance.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoZoneServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoZoneServiceApi apiInstance = new LIAPIGeoZoneServiceApi();
String costs = "costs_example"; // String | Travel distance(s)
String point = "point_example"; // String | Starting point from where the travel boundary is calculated. Point in 'Lat,Long,coordsys' format
String address = "address_example"; // String | Starting address from where the travel boundary is calculated.
String costUnit = "m"; // String | Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String db = "driving"; // String | Mode of commute.
String country = "USA"; // String | Three digit ISO country code.
String maxOffroadDistance = "maxOffroadDistance_example"; // String | Maximum distance to allow travel off the road network.
String maxOffroadDistanceUnit = "maxOffroadDistanceUnit_example"; // String | MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String destinationSrs = "destinationSrs_example"; // String | Desired coordinate system of the travel boundary.
String majorRoads = "false"; // String | Whether to include all roads in the calculation or just major roads.
String returnHoles = "false"; // String | Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance.
String returnIslands = "false"; // String | Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance.
String simplificationFactor = "0.5"; // String | Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex.
String bandingStyle = "Donut"; // String | Style of banding to be used in the result.
String historicTrafficTimeBucket = "None"; // String | Whether routing calculation uses the historic traffic speeds.
try {
    TravelBoundaries result = apiInstance.getTravelBoundaryByDistance(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoZoneServiceApi#getTravelBoundaryByDistance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **costs** | **String**| Travel distance(s) |
 **point** | **String**| Starting point from where the travel boundary is calculated. Point in &#39;Lat,Long,coordsys&#39; format | [optional]
 **address** | **String**| Starting address from where the travel boundary is calculated. | [optional]
 **costUnit** | **String**| Travel distance such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [default to m] [enum: m, ft, km, mi, yd]
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **country** | **String**| Three digit ISO country code. | [optional] [default to USA]
 **maxOffroadDistance** | **String**| Maximum distance to allow travel off the road network. | [optional]
 **maxOffroadDistanceUnit** | **String**| MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional]
 **destinationSrs** | **String**| Desired coordinate system of the travel boundary. | [optional]
 **majorRoads** | **String**| Whether to include all roads in the calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **returnHoles** | **String**| Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired distance. | [optional] [default to false] [enum: true, false]
 **returnIslands** | **String**| Whether to return islands, which are small areas outside the main boundary that can be reached within the desired distance. | [optional] [default to false] [enum: true, false]
 **simplificationFactor** | **String**| Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. | [optional] [default to 0.5]
 **bandingStyle** | **String**| Style of banding to be used in the result. | [optional] [default to Donut] [enum: Donut, Encompassing]
 **historicTrafficTimeBucket** | **String**| Whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]

### Return type

[**TravelBoundaries**](TravelBoundaries.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

<a name="getTravelBoundaryByTime"></a>
# **getTravelBoundaryByTime**
> TravelBoundaries getTravelBoundaryByTime(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket)

Gets travel Boundary by Time

Travel boundary based on travel time.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoZoneServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoZoneServiceApi apiInstance = new LIAPIGeoZoneServiceApi();
String costs = "costs_example"; // String | Travel time used to calculate the travel boundary.
String point = "point_example"; // String | Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format
String address = "address_example"; // String | Starting address from where the travel boundary is calculated.
String costUnit = "min"; // String | Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond).
String db = "driving"; // String | Mode of commute.
String country = "USA"; // String | 3 character ISO code or country name.
String maxOffroadDistance = "maxOffroadDistance_example"; // String | Maximum distance to allow travel off the road network.
String maxOffroadDistanceUnit = "maxOffroadDistanceUnit_example"; // String | MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard).
String destinationSrs = "destinationSrs_example"; // String | Desired coordinate system of the travel boundary.
String majorRoads = "false"; // String | Whether to include all roads in the calculation or just major roads.
String returnHoles = "false"; // String | Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time.
String returnIslands = "false"; // String | Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time.
String simplificationFactor = "0.5"; // String | Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex.
String bandingStyle = "Donut"; // String | Style of banding to be used in the result.
String historicTrafficTimeBucket = "None"; // String | Whether routing calculation uses the historic traffic speeds.
try {
    TravelBoundaries result = apiInstance.getTravelBoundaryByTime(costs, point, address, costUnit, db, country, maxOffroadDistance, maxOffroadDistanceUnit, destinationSrs, majorRoads, returnHoles, returnIslands, simplificationFactor, bandingStyle, historicTrafficTimeBucket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoZoneServiceApi#getTravelBoundaryByTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **costs** | **String**| Travel time used to calculate the travel boundary. |
 **point** | **String**| Starting point from where the travel boundary is calculated. Point in Lat,Long,coordsys format | [optional]
 **address** | **String**| Starting address from where the travel boundary is calculated. | [optional]
 **costUnit** | **String**| Travel time unit such as min(Minute), h(Hour), s(Second) or msec(Millisecond). | [optional] [default to min] [enum: min, msec, s, h]
 **db** | **String**| Mode of commute. | [optional] [default to driving] [enum: driving, walking]
 **country** | **String**| 3 character ISO code or country name. | [optional] [default to USA]
 **maxOffroadDistance** | **String**| Maximum distance to allow travel off the road network. | [optional]
 **maxOffroadDistanceUnit** | **String**| MaxOffroad Distance Unit such as ft(Foot), km(Kilometer), mi(Mile), m(Meter) or yd(Yard). | [optional] [enum: m, km, yd, ft, mi]
 **destinationSrs** | **String**| Desired coordinate system of the travel boundary. | [optional]
 **majorRoads** | **String**| Whether to include all roads in the calculation or just major roads. | [optional] [default to false] [enum: true, false]
 **returnHoles** | **String**| Whether to return holes, which are areas within the larger boundary that cannot be reached within the desired time. | [optional] [default to false] [enum: true, false]
 **returnIslands** | **String**| Whether to return islands, which are small areas outside the main boundary that can be reached within the desired time. | [optional] [default to false] [enum: true, false]
 **simplificationFactor** | **String**| Number between 0.0 and 1.0 where 0.0 is very simple and 1.0 means the most complex. | [optional] [default to 0.5]
 **bandingStyle** | **String**| Style of banding to be used in the result. | [optional] [default to Donut] [enum: Donut, Encompassing]
 **historicTrafficTimeBucket** | **String**| Whether routing calculation uses the historic traffic speeds. | [optional] [default to None] [enum: None, AMPeak, PMPeak, OffPeak, Night]

### Return type

[**TravelBoundaries**](TravelBoundaries.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json

