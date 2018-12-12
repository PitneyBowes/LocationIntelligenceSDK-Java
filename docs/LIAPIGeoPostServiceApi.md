# LIAPIGeoPostServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCarrierRoutesByAddress**](LIAPIGeoPostServiceApi.md#getCarrierRoutesByAddress) | **GET** /geopost/v1/carrierroute/byaddress | Carrier Route By Address.
[**getCarrierRoutesByAddressBatch**](LIAPIGeoPostServiceApi.md#getCarrierRoutesByAddressBatch) | **POST** /geopost/v1/carrierroute/byaddress | Gets GeoPost Carrier Routes for Multiple Addresses


<a name="getCarrierRoutesByAddress"></a>
# **getCarrierRoutesByAddress**
> CarrierRouteResponse getCarrierRoutesByAddress(address, includeGeometry)

Carrier Route By Address.

Get United States Postal Service (USPS) carrier route data for the requested address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPostServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPostServiceApi apiInstance = new LIAPIGeoPostServiceApi();
String address = "address_example"; // String | free form address text
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is Y) - if it is Y, then geometry will be part of response
try {
    CarrierRouteResponse result = apiInstance.getCarrierRoutesByAddress(address, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPostServiceApi#getCarrierRoutesByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **includeGeometry** | **String**| Y or N (default is Y) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**CarrierRouteResponse**](CarrierRouteResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCarrierRoutesByAddressBatch"></a>
# **getCarrierRoutesByAddressBatch**
> CarrierRouteResponseList getCarrierRoutesByAddressBatch(body)

Gets GeoPost Carrier Routes for Multiple Addresses

Gets GeoPost Carrier Routes for Multiple Addresses

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPostServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPostServiceApi apiInstance = new LIAPIGeoPostServiceApi();
CarrierRouteAddressRequest body = new CarrierRouteAddressRequest(); // CarrierRouteAddressRequest | 
try {
    CarrierRouteResponseList result = apiInstance.getCarrierRoutesByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPostServiceApi#getCarrierRoutesByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CarrierRouteAddressRequest**](CarrierRouteAddressRequest.md)|  | [optional]

### Return type

[**CarrierRouteResponseList**](CarrierRouteResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

