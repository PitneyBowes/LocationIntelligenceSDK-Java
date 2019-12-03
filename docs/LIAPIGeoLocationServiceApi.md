# LIAPIGeoLocationServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeviceStatus**](LIAPIGeoLocationServiceApi.md#getDeviceStatus) | **GET** /geolocation/v1/devicestatus | Location By Device Status.
[**getLocationByIPAddress**](LIAPIGeoLocationServiceApi.md#getLocationByIPAddress) | **GET** /geolocation/v1/location/byipaddress | Location By IP Address.
[**getLocationByWiFiAccessPoint**](LIAPIGeoLocationServiceApi.md#getLocationByWiFiAccessPoint) | **GET** /geolocation/v1/location/byaccesspoint | Location by WiFi Access Point.


<a name="getDeviceStatus"></a>
# **getDeviceStatus**
> GeoLocationDeviceSatus getDeviceStatus(deviceId, includeNetworkInfo_)

Location By Device Status.

This service accepts a phone number as input and returns details distinguishing landline and wireless numbers and also checks if a wireless number can be located.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLocationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLocationServiceApi apiInstance = new LIAPIGeoLocationServiceApi();
String deviceId = "deviceId_example"; // String | Unique identifier for the intended device. Supported identifiers are fixed line and mobile number.
String includeNetworkInfo_ = "includeNetworkInfo__example"; // String | Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response.
try {
    GeoLocationDeviceSatus result = apiInstance.getDeviceStatus(deviceId, includeNetworkInfo_);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLocationServiceApi#getDeviceStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deviceId** | **String**| Unique identifier for the intended device. Supported identifiers are fixed line and mobile number. |
 **includeNetworkInfo_** | **String**| Y or N (default is Y) – if it is N, then network/carrier details will not be added in the response. | [optional]

### Return type

[**GeoLocationDeviceSatus**](GeoLocationDeviceSatus.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getLocationByIPAddress"></a>
# **getLocationByIPAddress**
> GeoLocationIpAddr getLocationByIPAddress(ipAddress)

Location By IP Address.

This service accepts an IP address and returns the location coordinates corresponding to that IP address.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLocationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLocationServiceApi apiInstance = new LIAPIGeoLocationServiceApi();
String ipAddress = "ipAddress_example"; // String | This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address.
try {
    GeoLocationIpAddr result = apiInstance.getLocationByIPAddress(ipAddress);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLocationServiceApi#getLocationByIPAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ipAddress** | **String**| This is the ip address of network connected device. It must be a standard IPv4 octet and a valid external address. |

### Return type

[**GeoLocationIpAddr**](GeoLocationIpAddr.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getLocationByWiFiAccessPoint"></a>
# **getLocationByWiFiAccessPoint**
> GeoLocationAccessPoint getLocationByWiFiAccessPoint(mac, ssid, rsid, speed, accessPoint)

Location by WiFi Access Point.

This service accepts a WiFi access point MAC address and returns the location coordinates corresponding to that access point. Only mac or accessPoint are mandatory parameters (one of them has to be provided), rest are optional.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLocationServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLocationServiceApi apiInstance = new LIAPIGeoLocationServiceApi();
String mac = "mac_example"; // String | This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons.
String ssid = "ssid_example"; // String | The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters.
String rsid = "rsid_example"; // String | This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm.
String speed = "speed_example"; // String | This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps.
String accessPoint = "accessPoint_example"; // String | This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location.
try {
    GeoLocationAccessPoint result = apiInstance.getLocationByWiFiAccessPoint(mac, ssid, rsid, speed, accessPoint);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLocationServiceApi#getLocationByWiFiAccessPoint");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mac** | **String**| This should be the 48 bit mac address (or BSSID) of wireless access point. Accepted format is Six groups of two hexadecimal digits, separated by hyphens (-) or colons. | [optional]
 **ssid** | **String**| The service set identifier for wi-fi access point. It should be alphanumeric with maximum 32 characters. | [optional]
 **rsid** | **String**| This is the received signal strength indicator from particular wi-fi access point. It should be a number from -113 to 0 and the unit of this strength is dBm. | [optional]
 **speed** | **String**| This is the connection speed for wi-fi. It should be a number from 0 to 6930 and the unit should be Mbps. | [optional]
 **accessPoint** | **String**| This is the JSON based list of wifi access points in the vicinity of device to be located. This parameter is helpful in case, multiple wifi points are visible and we want to make sure that the location of device is best calculated considering all the access points location. | [optional]

### Return type

[**GeoLocationAccessPoint**](GeoLocationAccessPoint.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

