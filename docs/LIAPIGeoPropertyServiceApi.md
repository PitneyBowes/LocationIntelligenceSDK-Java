# LIAPIGeoPropertyServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGeoPropertyByAddress**](LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddress) | **GET** /geoproperty/v1/all/attributes/byaddress | Gets GeoPropertyResponse
[**getGeoPropertyByAddressBatch**](LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddressBatch) | **POST** /geoproperty/v1/all/attributes/byaddress | Gets GeoPropertyResponses
[**getParcelBoundaryByAddress**](LIAPIGeoPropertyServiceApi.md#getParcelBoundaryByAddress) | **GET** /geoproperty/v1/parcelboundary/byaddress | Gets ParcelBoundary
[**getParcelBoundaryByLocation**](LIAPIGeoPropertyServiceApi.md#getParcelBoundaryByLocation) | **GET** /geoproperty/v1/parcelboundary/bylocation | Gets ParcelBoundary
[**getSchoolsByAddress**](LIAPIGeoPropertyServiceApi.md#getSchoolsByAddress) | **GET** /geoproperty/v1/school/byaddress | Search Nearby Schools by Address


<a name="getGeoPropertyByAddress"></a>
# **getGeoPropertyByAddress**
> GeoPropertyResponse getGeoPropertyByAddress(address)

Gets GeoPropertyResponse

Gets GeoPropertyResponse

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String address = "address_example"; // String | free form address text
try {
    GeoPropertyResponse result = apiInstance.getGeoPropertyByAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getGeoPropertyByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |

### Return type

[**GeoPropertyResponse**](GeoPropertyResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getGeoPropertyByAddressBatch"></a>
# **getGeoPropertyByAddressBatch**
> GeoPropertyResponses getGeoPropertyByAddressBatch(body)

Gets GeoPropertyResponses

Gets GeoPropertyResponses

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
GeoPropertyAddressRequest body = new GeoPropertyAddressRequest(); // GeoPropertyAddressRequest | 
try {
    GeoPropertyResponses result = apiInstance.getGeoPropertyByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getGeoPropertyByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GeoPropertyAddressRequest**](GeoPropertyAddressRequest.md)|  | [optional]

### Return type

[**GeoPropertyResponses**](GeoPropertyResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getParcelBoundaryByAddress"></a>
# **getParcelBoundaryByAddress**
> ParcelBoundary getParcelBoundaryByAddress(address, accept)

Gets ParcelBoundary

Gets ParcelBoundary

### Example
```java
// Import classes:
//import pb.ApiException;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;


LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String address = "address_example"; // String | free form address text
String accept = "accept_example"; // String | 
try {
    ParcelBoundary result = apiInstance.getParcelBoundaryByAddress(address, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getParcelBoundaryByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **accept** | **String**|  | [optional]

### Return type

[**ParcelBoundary**](ParcelBoundary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getParcelBoundaryByLocation"></a>
# **getParcelBoundaryByLocation**
> ParcelBoundary getParcelBoundaryByLocation(longitude, latitude, accept)

Gets ParcelBoundary

Gets ParcelBoundary

### Example
```java
// Import classes:
//import pb.ApiException;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;


LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
String accept = "accept_example"; // String | 
try {
    ParcelBoundary result = apiInstance.getParcelBoundaryByLocation(longitude, latitude, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getParcelBoundaryByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **accept** | **String**|  | [optional]

### Return type

[**ParcelBoundary**](ParcelBoundary.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSchoolsByAddress"></a>
# **getSchoolsByAddress**
> SchoolsNearByResponse getSchoolsByAddress(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates)

Search Nearby Schools by Address

Search Nearby Schools by Address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String address = "address_example"; // String | free form address text
String edLevel = "edLevel_example"; // String | Single digit code for education level applicable values are P -> primary, M -> Middle, H -> High, O -> Mixed Grades for public school type andE -> Elementary , S -> Secondary , O -> Others mixed grades for private schools 
String schoolType = "schoolType_example"; // String | Single digit code for schoolTypes applicable values are PRI and PUB
String schoolSubType = "schoolSubType_example"; // String | Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education)
String gender = "gender_example"; // String | Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males)
String assignedSchoolsOnly = "assignedSchoolsOnly_example"; // String | Single digit code for assignedSchoolOnly applicable values are  Y/N 
String districtSchoolsOnly = "districtSchoolsOnly_example"; // String | Single digit code for districtSchoolOnly applicable values are Y/N 
String searchRadius = "searchRadius_example"; // String | Search Radius within which schools are searched
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Search Radius unit applicable values are feet,kilometers,miles,meters
String travelTime = "travelTime_example"; // String | Travel Time based on ‘travelMode’ within which schools are searched.
String travelTimeUnit = "travelTimeUnit_example"; // String | Travel Time unit applicable values are minutes,hours,seconds,milliseconds 
String travelDistance = "travelDistance_example"; // String | Travel Distance based on ‘travelMode’ within which schools are searched.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distanceUnit applicable values are feet,kilometers,miles,meters
String travelMode = "travelMode_example"; // String | Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving
String maxCandidates = "10"; // String | Max result to search 
try {
    SchoolsNearByResponse result = apiInstance.getSchoolsByAddress(address, edLevel, schoolType, schoolSubType, gender, assignedSchoolsOnly, districtSchoolsOnly, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getSchoolsByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| free form address text |
 **edLevel** | **String**| Single digit code for education level applicable values are P -&gt; primary, M -&gt; Middle, H -&gt; High, O -&gt; Mixed Grades for public school type andE -&gt; Elementary , S -&gt; Secondary , O -&gt; Others mixed grades for private schools  | [optional]
 **schoolType** | **String**| Single digit code for schoolTypes applicable values are PRI and PUB | [optional]
 **schoolSubType** | **String**| Single digit code for schoolSubType Applicable values are C, M, A, R, I, L, P, V, U, S (i.e. Charter, Magnet, Alternative, Regular, Indian, Military, Reportable Program, Vocational, Unknown, Special Education) | [optional]
 **gender** | **String**| Single digit code for gender Applicable values are C, F, M (Coed, All Females, All Males) | [optional]
 **assignedSchoolsOnly** | **String**| Single digit code for assignedSchoolOnly applicable values are  Y/N  | [optional]
 **districtSchoolsOnly** | **String**| Single digit code for districtSchoolOnly applicable values are Y/N  | [optional]
 **searchRadius** | **String**| Search Radius within which schools are searched | [optional]
 **searchRadiusUnit** | **String**| Search Radius unit applicable values are feet,kilometers,miles,meters | [optional]
 **travelTime** | **String**| Travel Time based on ‘travelMode’ within which schools are searched. | [optional]
 **travelTimeUnit** | **String**| Travel Time unit applicable values are minutes,hours,seconds,milliseconds  | [optional]
 **travelDistance** | **String**| Travel Distance based on ‘travelMode’ within which schools are searched. | [optional]
 **travelDistanceUnit** | **String**| Travel distanceUnit applicable values are feet,kilometers,miles,meters | [optional]
 **travelMode** | **String**| Travel mode Required when travelDistance or travelTime is specified. Accepted values are walking,driving | [optional]
 **maxCandidates** | **String**| Max result to search  | [optional] [default to 10]

### Return type

[**SchoolsNearByResponse**](SchoolsNearByResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

