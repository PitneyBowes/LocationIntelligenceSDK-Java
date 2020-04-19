# LIAPIGeoIdentityServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIdentityByAddress**](LIAPIGeoIdentityServiceApi.md#getIdentityByAddress) | **GET** /geoidentity/v1/identity/byaddress | Gets GeoIdentityResponse
[**getIdentityByEmail**](LIAPIGeoIdentityServiceApi.md#getIdentityByEmail) | **GET** /geoidentity/v1/identity/byemail | Gets Identity
[**getIdentityByTwitter**](LIAPIGeoIdentityServiceApi.md#getIdentityByTwitter) | **GET** /geoidentity/v1/identity/bytwitter | Gets Identity


<a name="getIdentityByAddress"></a>
# **getIdentityByAddress**
> GeoIdentityResponse getIdentityByAddress(address, givenName, familyName, confidence, maxCandidates, theme, filter)

Gets GeoIdentityResponse

Gets GeoIdentityResponse

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoIdentityServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoIdentityServiceApi apiInstance = new LIAPIGeoIdentityServiceApi();
String address = "address_example"; // String | free form address text
String givenName = "givenName_example"; // String | This filters all the associated identities of address by given Name
String familyName = "familyName_example"; // String | This filters all the associated identities of address by family Name
String confidence = "confidence_example"; // String | To adjust quality threshold of data returned. Default is HIGH
String maxCandidates = "maxCandidates_example"; // String | Number of identities returned in response
String theme = "theme_example"; // String | theme parameter for filtering results
String filter = "filter_example"; // String | filter params
try {
    GeoIdentityResponse result = apiInstance.getIdentityByAddress(address, givenName, familyName, confidence, maxCandidates, theme, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoIdentityServiceApi#getIdentityByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **givenName** | **String**| This filters all the associated identities of address by given Name | [optional]
 **familyName** | **String**| This filters all the associated identities of address by family Name | [optional]
 **confidence** | **String**| To adjust quality threshold of data returned. Default is HIGH | [optional] [enum: LOW, MED, HIGH, MAX]
 **maxCandidates** | **String**| Number of identities returned in response | [optional]
 **theme** | **String**| theme parameter for filtering results | [optional]
 **filter** | **String**| filter params | [optional]

### Return type

[**GeoIdentityResponse**](GeoIdentityResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getIdentityByEmail"></a>
# **getIdentityByEmail**
> Identity getIdentityByEmail(email, confidence, theme, filter)

Gets Identity

Gets Identity

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoIdentityServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoIdentityServiceApi apiInstance = new LIAPIGeoIdentityServiceApi();
String email = "email_example"; // String | This specifies the email address
String confidence = "confidence_example"; // String | To adjust quality threshold of data returned. Default is HIGH
String theme = "theme_example"; // String | theme parameter for filtering results
String filter = "filter_example"; // String | filter params
try {
    Identity result = apiInstance.getIdentityByEmail(email, confidence, theme, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoIdentityServiceApi#getIdentityByEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **email** | **String**| This specifies the email address |
 **confidence** | **String**| To adjust quality threshold of data returned. Default is HIGH | [optional] [enum: LOW, MED, HIGH, MAX]
 **theme** | **String**| theme parameter for filtering results | [optional]
 **filter** | **String**| filter params | [optional]

### Return type

[**Identity**](Identity.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getIdentityByTwitter"></a>
# **getIdentityByTwitter**
> Identity getIdentityByTwitter(twitter, confidence, theme, filter)

Gets Identity

Gets Identity

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoIdentityServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoIdentityServiceApi apiInstance = new LIAPIGeoIdentityServiceApi();
String twitter = "twitter_example"; // String | Twitter handle of the identity.
String confidence = "confidence_example"; // String | To adjust quality threshold of data returned. Default is HIGH
String theme = "theme_example"; // String | theme parameter for filtering results
String filter = "filter_example"; // String | filter params
try {
    Identity result = apiInstance.getIdentityByTwitter(twitter, confidence, theme, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoIdentityServiceApi#getIdentityByTwitter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **twitter** | **String**| Twitter handle of the identity. |
 **confidence** | **String**| To adjust quality threshold of data returned. Default is HIGH | [optional] [enum: LOW, MED, HIGH, MAX]
 **theme** | **String**| theme parameter for filtering results | [optional]
 **filter** | **String**| filter params | [optional]

### Return type

[**Identity**](Identity.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

