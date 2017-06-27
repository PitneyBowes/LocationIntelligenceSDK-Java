# LIAPIGeo911ServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAHJPlusPSAPByAddress**](LIAPIGeo911ServiceApi.md#getAHJPlusPSAPByAddress) | **GET** /geo911/v1/ahj-psap/byaddress | AHJ &amp; PSAP By Address.
[**getAHJPlusPSAPByLocation**](LIAPIGeo911ServiceApi.md#getAHJPlusPSAPByLocation) | **GET** /geo911/v1/ahj-psap/bylocation | AHJ &amp; PSAP By Location
[**getPSAPByAddress**](LIAPIGeo911ServiceApi.md#getPSAPByAddress) | **GET** /geo911/v1/psap/byaddress | PSAP By Address.
[**getPSAPByLocation**](LIAPIGeo911ServiceApi.md#getPSAPByLocation) | **GET** /geo911/v1/psap/bylocation | PSAP By Location.


<a name="getAHJPlusPSAPByAddress"></a>
# **getAHJPlusPSAPByAddress**
> AHJPlusPSAPResponse getAHJPlusPSAPByAddress(address)

AHJ &amp; PSAP By Address.

Accepts addresses as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts an address and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeo911ServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeo911ServiceApi apiInstance = new LIAPIGeo911ServiceApi();
String address = "address_example"; // String | The address to be searched.
try {
    AHJPlusPSAPResponse result = apiInstance.getAHJPlusPSAPByAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeo911ServiceApi#getAHJPlusPSAPByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |

### Return type

[**AHJPlusPSAPResponse**](AHJPlusPSAPResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getAHJPlusPSAPByLocation"></a>
# **getAHJPlusPSAPByLocation**
> AHJPlusPSAPResponse getAHJPlusPSAPByLocation(longitude, latitude)

AHJ &amp; PSAP By Location

Accepts latitude &amp; longitude as input and Returns contact details for Authorities Having Jurisdiction (AHJ) on-behalf-of local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns PSAP contact data plus contact data for an AHJ to communicate directly with a PSAP. Details include agency name, phone number, city name, coverage, contact person&#39;s details, site details and mailing addresses for EMS, Fire, and Police PSAP contacts.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeo911ServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeo911ServiceApi apiInstance = new LIAPIGeo911ServiceApi();
String longitude = "longitude_example"; // String | Latitude of the location.
String latitude = "latitude_example"; // String | Longitude of the location.
try {
    AHJPlusPSAPResponse result = apiInstance.getAHJPlusPSAPByLocation(longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeo911ServiceApi#getAHJPlusPSAPByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Latitude of the location. |
 **latitude** | **String**| Longitude of the location. |

### Return type

[**AHJPlusPSAPResponse**](AHJPlusPSAPResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPSAPByAddress"></a>
# **getPSAPByAddress**
> PSAPResponse getPSAPByAddress(address)

PSAP By Address.

Accepts addresses as input and returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts an address as input and returns the relevant PSAP address and contact details including agency name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeo911ServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeo911ServiceApi apiInstance = new LIAPIGeo911ServiceApi();
String address = "address_example"; // String | The address to be searched.
try {
    PSAPResponse result = apiInstance.getPSAPByAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeo911ServiceApi#getPSAPByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |

### Return type

[**PSAPResponse**](PSAPResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getPSAPByLocation"></a>
# **getPSAPByLocation**
> PSAPResponse getPSAPByLocation(longitude, latitude)

PSAP By Location.

Accepts latitude &amp; longitude as input and Returns contact details for local Public Safety Answering Points (PSAP). Geo911 accepts a location coordinate and returns the relevant PSAP address and contact details including dispatch name, phone number, county name, coverage, contact person&#39;s details, site details and mailing address.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeo911ServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeo911ServiceApi apiInstance = new LIAPIGeo911ServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
try {
    PSAPResponse result = apiInstance.getPSAPByLocation(longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeo911ServiceApi#getPSAPByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**PSAPResponse**](PSAPResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

