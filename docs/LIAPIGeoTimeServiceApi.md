# LIAPIGeoTimeServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimezoneByAddress**](LIAPIGeoTimeServiceApi.md#getTimezoneByAddress) | **GET** /geotime/v1/timezone/byaddress | Timezone By Address.
[**getTimezoneByLocation**](LIAPIGeoTimeServiceApi.md#getTimezoneByLocation) | **GET** /geotime/v1/timezone/bylocation | Timezone By Location.


<a name="getTimezoneByAddress"></a>
# **getTimezoneByAddress**
> Timezone getTimezoneByAddress(timestamp, address)

Timezone By Address.

Identifies and retrieves the local time of any location in the world for a given address and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTimeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTimeServiceApi apiInstance = new LIAPIGeoTimeServiceApi();
String timestamp = "timestamp_example"; // String | Timestamp in miliseconds.
String address = "address_example"; // String | The address to be searched.
try {
    Timezone result = apiInstance.getTimezoneByAddress(timestamp, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTimeServiceApi#getTimezoneByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **String**| Timestamp in miliseconds. |
 **address** | **String**| The address to be searched. |

### Return type

[**Timezone**](Timezone.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getTimezoneByLocation"></a>
# **getTimezoneByLocation**
> Timezone getTimezoneByLocation(timestamp, longitude, latitude)

Timezone By Location.

Identifies and retrieves the local time of any location in the world for a given latitude, longitude and time. The input and retrieved time format is in milliseconds.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTimeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTimeServiceApi apiInstance = new LIAPIGeoTimeServiceApi();
String timestamp = "timestamp_example"; // String | Timestamp in miliseconds.
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
try {
    Timezone result = apiInstance.getTimezoneByLocation(timestamp, longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTimeServiceApi#getTimezoneByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timestamp** | **String**| Timestamp in miliseconds. |
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**Timezone**](Timezone.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

