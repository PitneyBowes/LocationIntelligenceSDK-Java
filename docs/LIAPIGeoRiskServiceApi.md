# LIAPIGeoRiskServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCrimeRiskByAddress**](LIAPIGeoRiskServiceApi.md#getCrimeRiskByAddress) | **GET** /georisk/v1/crime/byaddress | Gets CrimeRiskResponse
[**getCrimeRiskByAddressBatch**](LIAPIGeoRiskServiceApi.md#getCrimeRiskByAddressBatch) | **POST** /georisk/v1/crime/byaddress | Batch method for getting crime risk by address
[**getCrimeRiskByLocation**](LIAPIGeoRiskServiceApi.md#getCrimeRiskByLocation) | **GET** /georisk/v1/crime/bylocation | Gets CrimeRiskResponse
[**getCrimeRiskByLocationBatch**](LIAPIGeoRiskServiceApi.md#getCrimeRiskByLocationBatch) | **POST** /georisk/v1/crime/bylocation | Batch method for getting crime risk by location
[**getDistanceToFloodHazardByAddress**](LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByAddress) | **GET** /georisk/v1/shoreline/distancetofloodhazard/byaddress | Gets WaterBodyResponse
[**getDistanceToFloodHazardByAddressBatch**](LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByAddressBatch) | **POST** /georisk/v1/shoreline/distancetofloodhazard/byaddress | Batch method for getting Water Bodies by address
[**getDistanceToFloodHazardByLocation**](LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByLocation) | **GET** /georisk/v1/shoreline/distancetofloodhazard/bylocation | Gets WaterBodyResponse
[**getDistanceToFloodHazardByLocationBatch**](LIAPIGeoRiskServiceApi.md#getDistanceToFloodHazardByLocationBatch) | **POST** /georisk/v1/shoreline/distancetofloodhazard/bylocation | Batch method for getting Water Bodies by location
[**getEarthquakeHistory**](LIAPIGeoRiskServiceApi.md#getEarthquakeHistory) | **GET** /georisk/v1/earthquakehistory | Gets EarthquakeHistory
[**getEarthquakeRiskByAddress**](LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByAddress) | **GET** /georisk/v1/earthquake/byaddress | Gets EarthquakeRiskResponse
[**getEarthquakeRiskByAddressBatch**](LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByAddressBatch) | **POST** /georisk/v1/earthquake/byaddress | Batch method for getting earthquake risk by address
[**getEarthquakeRiskByLocation**](LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByLocation) | **GET** /georisk/v1/earthquake/bylocation | Gets EarthquakeRiskResponse
[**getEarthquakeRiskByLocationBatch**](LIAPIGeoRiskServiceApi.md#getEarthquakeRiskByLocationBatch) | **POST** /georisk/v1/earthquake/bylocation | Batch method for getting earthquake risk by location
[**getFireHistory**](LIAPIGeoRiskServiceApi.md#getFireHistory) | **GET** /georisk/v1/firehistory | Gets FireHistory
[**getFireRiskByAddress**](LIAPIGeoRiskServiceApi.md#getFireRiskByAddress) | **GET** /georisk/v1/fire/byaddress | Gets FireRiskResponse
[**getFireRiskByAddressBatch**](LIAPIGeoRiskServiceApi.md#getFireRiskByAddressBatch) | **POST** /georisk/v1/fire/byaddress | Batch method for getting fire risk by address
[**getFireRiskByLocation**](LIAPIGeoRiskServiceApi.md#getFireRiskByLocation) | **GET** /georisk/v1/fire/bylocation | Gets FireRiskResponse
[**getFireRiskByLocationBatch**](LIAPIGeoRiskServiceApi.md#getFireRiskByLocationBatch) | **POST** /georisk/v1/fire/bylocation | Batch method for getting fire risk by location
[**getFireStationByAddress**](LIAPIGeoRiskServiceApi.md#getFireStationByAddress) | **GET** /georisk/v1/firestation/byaddress | Gets FireStationResponse
[**getFireStationByLocation**](LIAPIGeoRiskServiceApi.md#getFireStationByLocation) | **GET** /georisk/v1/firestation/bylocation | Gets FireStationResponse
[**getFloodRiskByAddress**](LIAPIGeoRiskServiceApi.md#getFloodRiskByAddress) | **GET** /georisk/v1/flood/byaddress | Gets FloodRiskResponse
[**getFloodRiskByAddressBatch**](LIAPIGeoRiskServiceApi.md#getFloodRiskByAddressBatch) | **POST** /georisk/v1/flood/byaddress | Batch method for getting flood risk by address
[**getFloodRiskByLocation**](LIAPIGeoRiskServiceApi.md#getFloodRiskByLocation) | **GET** /georisk/v1/flood/bylocation | Gets FloodRiskResponse
[**getFloodRiskByLocationBatch**](LIAPIGeoRiskServiceApi.md#getFloodRiskByLocationBatch) | **POST** /georisk/v1/flood/bylocation | Batch method for getting flood risk by location


<a name="getCrimeRiskByAddress"></a>
# **getCrimeRiskByAddress**
> CrimeRiskResponse getCrimeRiskByAddress(address, type, includeGeometry)

Gets CrimeRiskResponse

Returns the crime data or crime indexes for a given address input.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String address = "address_example"; // String | Free-form address text.
String type = "type_example"; // String | Type of crime like violent crime, property crime, etc., multiple crime type indexes could be requested as comma separated values with 'all' as default.)
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    CrimeRiskResponse result = apiInstance.getCrimeRiskByAddress(address, type, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getCrimeRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-form address text. |
 **type** | **String**| Type of crime like violent crime, property crime, etc., multiple crime type indexes could be requested as comma separated values with &#39;all&#39; as default.) | [optional] [enum: all, violent, property, murder, rape, robbery, assault, burglary, larceny, motorvehicletheft, arson]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**CrimeRiskResponse**](CrimeRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCrimeRiskByAddressBatch"></a>
# **getCrimeRiskByAddressBatch**
> CrimeRiskResponseList getCrimeRiskByAddressBatch(body)

Batch method for getting crime risk by address

Batch method for getting crime risk by address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
CrimeRiskByAddressRequest body = new CrimeRiskByAddressRequest(); // CrimeRiskByAddressRequest | 
try {
    CrimeRiskResponseList result = apiInstance.getCrimeRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getCrimeRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrimeRiskByAddressRequest**](CrimeRiskByAddressRequest.md)|  | [optional]

### Return type

[**CrimeRiskResponseList**](CrimeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCrimeRiskByLocation"></a>
# **getCrimeRiskByLocation**
> CrimeRiskLocationResponse getCrimeRiskByLocation(longitude, latitude, type, includeGeometry)

Gets CrimeRiskResponse

Returns the crime data or crime indexes for a given location.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String longitude = "longitude_example"; // String | The longitude of the location
String latitude = "latitude_example"; // String | The latitude of the location
String type = "type_example"; // String | Refers to crime type. Valid values are following 11 crime types with 'all' as default (more than one can also be given as comma separated types)
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    CrimeRiskLocationResponse result = apiInstance.getCrimeRiskByLocation(longitude, latitude, type, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getCrimeRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **type** | **String**| Refers to crime type. Valid values are following 11 crime types with &#39;all&#39; as default (more than one can also be given as comma separated types) | [optional] [enum: all, violent, property, murder, rape, robbery, assault, burglary, larceny, motorvehicletheft, arson]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**CrimeRiskLocationResponse**](CrimeRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getCrimeRiskByLocationBatch"></a>
# **getCrimeRiskByLocationBatch**
> CrimeRiskLocationResponseList getCrimeRiskByLocationBatch(body)

Batch method for getting crime risk by location

Batch method for getting crime risk by location

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
CrimeRiskByLocationRequest body = new CrimeRiskByLocationRequest(); // CrimeRiskByLocationRequest | 
try {
    CrimeRiskLocationResponseList result = apiInstance.getCrimeRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getCrimeRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CrimeRiskByLocationRequest**](CrimeRiskByLocationRequest.md)|  | [optional]

### Return type

[**CrimeRiskLocationResponseList**](CrimeRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByAddress"></a>
# **getDistanceToFloodHazardByAddress**
> WaterBodyResponse getDistanceToFloodHazardByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit)

Gets WaterBodyResponse

Gets WaterBodyResponse

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String address = "address_example"; // String | The address of the location
String maxCandidates = "maxCandidates_example"; // String | This specifies the value of maxCandidates
String waterBodyType = "waterBodyType_example"; // String | all (default value), oceanandsea,lake,others,unknown,intermittent
String searchDistance = "searchDistance_example"; // String | This specifies the search distance
String searchDistanceUnit = "searchDistanceUnit_example"; // String | miles (default value),feet, kilometers, meters
try {
    WaterBodyResponse result = apiInstance.getDistanceToFloodHazardByAddress(address, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getDistanceToFloodHazardByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address of the location |
 **maxCandidates** | **String**| This specifies the value of maxCandidates | [optional]
 **waterBodyType** | **String**| all (default value), oceanandsea,lake,others,unknown,intermittent | [optional]
 **searchDistance** | **String**| This specifies the search distance | [optional]
 **searchDistanceUnit** | **String**| miles (default value),feet, kilometers, meters | [optional]

### Return type

[**WaterBodyResponse**](WaterBodyResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByAddressBatch"></a>
# **getDistanceToFloodHazardByAddressBatch**
> DistanceToFloodHazardResponse getDistanceToFloodHazardByAddressBatch(body)

Batch method for getting Water Bodies by address

Batch method for getting Water Bodies by address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
DistanceToFloodHazardAddressRequest body = new DistanceToFloodHazardAddressRequest(); // DistanceToFloodHazardAddressRequest | 
try {
    DistanceToFloodHazardResponse result = apiInstance.getDistanceToFloodHazardByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getDistanceToFloodHazardByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DistanceToFloodHazardAddressRequest**](DistanceToFloodHazardAddressRequest.md)|  | [optional]

### Return type

[**DistanceToFloodHazardResponse**](DistanceToFloodHazardResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByLocation"></a>
# **getDistanceToFloodHazardByLocation**
> WaterBodyLocationResponse getDistanceToFloodHazardByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit)

Gets WaterBodyResponse

Gets WaterBodyResponse

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String longitude = "longitude_example"; // String | The longitude of the location
String latitude = "latitude_example"; // String | The latitude of the location
String maxCandidates = "maxCandidates_example"; // String | This specifies the value of maxCandidates
String waterBodyType = "waterBodyType_example"; // String | all (default value), oceanandsea,lake,others,unknown,intermittent
String searchDistance = "searchDistance_example"; // String | This specifies the search distance
String searchDistanceUnit = "searchDistanceUnit_example"; // String | miles (default value),feet, kilometers, meters
try {
    WaterBodyLocationResponse result = apiInstance.getDistanceToFloodHazardByLocation(longitude, latitude, maxCandidates, waterBodyType, searchDistance, searchDistanceUnit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getDistanceToFloodHazardByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **maxCandidates** | **String**| This specifies the value of maxCandidates | [optional]
 **waterBodyType** | **String**| all (default value), oceanandsea,lake,others,unknown,intermittent | [optional]
 **searchDistance** | **String**| This specifies the search distance | [optional]
 **searchDistanceUnit** | **String**| miles (default value),feet, kilometers, meters | [optional]

### Return type

[**WaterBodyLocationResponse**](WaterBodyLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDistanceToFloodHazardByLocationBatch"></a>
# **getDistanceToFloodHazardByLocationBatch**
> DistanceToFloodHazardLocationResponse getDistanceToFloodHazardByLocationBatch(body)

Batch method for getting Water Bodies by location

Batch method for getting Water Bodies by location

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
DistanceToFloodHazardLocationRequest body = new DistanceToFloodHazardLocationRequest(); // DistanceToFloodHazardLocationRequest | 
try {
    DistanceToFloodHazardLocationResponse result = apiInstance.getDistanceToFloodHazardByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getDistanceToFloodHazardByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DistanceToFloodHazardLocationRequest**](DistanceToFloodHazardLocationRequest.md)|  | [optional]

### Return type

[**DistanceToFloodHazardLocationResponse**](DistanceToFloodHazardLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeHistory"></a>
# **getEarthquakeHistory**
> EarthquakeHistory getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates)

Gets EarthquakeHistory

Gets EarthquakeHistory

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String postCode = "postCode_example"; // String | 5 digit Postal code to search
String startDate = "startDate_example"; // String | Start time in milliseconds(UTC)
String endDate = "endDate_example"; // String | End time in milliseconds(UTC)
String minMagnitude = "minMagnitude_example"; // String | Minimum richter scale magnitude
String maxMagnitude = "maxMagnitude_example"; // String | Maximum Richter scale magnitude
String maxCandidates = "1"; // String | Maximum response events
try {
    EarthquakeHistory result = apiInstance.getEarthquakeHistory(postCode, startDate, endDate, minMagnitude, maxMagnitude, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getEarthquakeHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCode** | **String**| 5 digit Postal code to search |
 **startDate** | **String**| Start time in milliseconds(UTC) | [optional]
 **endDate** | **String**| End time in milliseconds(UTC) | [optional]
 **minMagnitude** | **String**| Minimum richter scale magnitude | [optional]
 **maxMagnitude** | **String**| Maximum Richter scale magnitude | [optional]
 **maxCandidates** | **String**| Maximum response events | [optional] [default to 1]

### Return type

[**EarthquakeHistory**](EarthquakeHistory.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByAddress"></a>
# **getEarthquakeRiskByAddress**
> EarthquakeRiskResponse getEarthquakeRiskByAddress(address, richterValue, includeGeometry)

Gets EarthquakeRiskResponse

Returns the count of earthquake events for various richter measurements and values for an input address.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String address = "address_example"; // String | Free-form address text
String richterValue = "richterValue_example"; // String | Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events >= richter scale 6), etc., multiple richter scales could be requested as comma separated values with 'all' as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    EarthquakeRiskResponse result = apiInstance.getEarthquakeRiskByAddress(address, richterValue, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getEarthquakeRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-form address text |
 **richterValue** | **String**| Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events &gt;&#x3D; richter scale 6), etc., multiple richter scales could be requested as comma separated values with &#39;all&#39; as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE | [optional] [enum: all, R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**EarthquakeRiskResponse**](EarthquakeRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByAddressBatch"></a>
# **getEarthquakeRiskByAddressBatch**
> EarthquakeRiskResponseList getEarthquakeRiskByAddressBatch(body)

Batch method for getting earthquake risk by address

Batch method for getting earthquake risk by address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
EarthquakeRiskByAddressRequest body = new EarthquakeRiskByAddressRequest(); // EarthquakeRiskByAddressRequest | 
try {
    EarthquakeRiskResponseList result = apiInstance.getEarthquakeRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getEarthquakeRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EarthquakeRiskByAddressRequest**](EarthquakeRiskByAddressRequest.md)|  | [optional]

### Return type

[**EarthquakeRiskResponseList**](EarthquakeRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByLocation"></a>
# **getEarthquakeRiskByLocation**
> EarthquakeRiskLocationResponse getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry)

Gets EarthquakeRiskResponse

Gets EarthquakeRiskResponse

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String longitude = "longitude_example"; // String | The longitude of the location
String latitude = "latitude_example"; // String | The latitude of the location
String richterValue = "richterValue_example"; // String | Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events >= richter scale 6), etc., multiple richter scales could be requested as comma separated values with 'all' as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    EarthquakeRiskLocationResponse result = apiInstance.getEarthquakeRiskByLocation(longitude, latitude, richterValue, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getEarthquakeRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| The longitude of the location |
 **latitude** | **String**| The latitude of the location |
 **richterValue** | **String**| Richter values like R5 (count of richter scale 5 events), R7 (count of richter scale 7 events), R6_GE (count of events &gt;&#x3D; richter scale 6), etc., multiple richter scales could be requested as comma separated values with &#39;all&#39; as default. Valid values: All (default value), R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE | [optional] [enum: all, R0, R1, R2, R3, R4, R5, R6, R7, R0_GE, R1_GE, R2_GE, R3_GE, R4_GE, R5_GE, R6_GE, R7_GE]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**EarthquakeRiskLocationResponse**](EarthquakeRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getEarthquakeRiskByLocationBatch"></a>
# **getEarthquakeRiskByLocationBatch**
> EarthquakeRiskLocationResponseList getEarthquakeRiskByLocationBatch(body)

Batch method for getting earthquake risk by location

Batch method for getting earthquake risk by location

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
EarthquakeRiskByLocationRequest body = new EarthquakeRiskByLocationRequest(); // EarthquakeRiskByLocationRequest | 
try {
    EarthquakeRiskLocationResponseList result = apiInstance.getEarthquakeRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getEarthquakeRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EarthquakeRiskByLocationRequest**](EarthquakeRiskByLocationRequest.md)|  | [optional]

### Return type

[**EarthquakeRiskLocationResponseList**](EarthquakeRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireHistory"></a>
# **getFireHistory**
> FireHistory getFireHistory(postCode, startDate, endDate, maxCandidates)

Gets FireHistory

Gets FireHistory

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String postCode = "postCode_example"; // String | 5 digit Postal code to search
String startDate = "startDate_example"; // String | Start time in milliseconds(UTC)
String endDate = "endDate_example"; // String | End time in milliseconds(UTC)
String maxCandidates = "1"; // String | Maximum response events
try {
    FireHistory result = apiInstance.getFireHistory(postCode, startDate, endDate, maxCandidates);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postCode** | **String**| 5 digit Postal code to search |
 **startDate** | **String**| Start time in milliseconds(UTC) | [optional]
 **endDate** | **String**| End time in milliseconds(UTC) | [optional]
 **maxCandidates** | **String**| Maximum response events | [optional] [default to 1]

### Return type

[**FireHistory**](FireHistory.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByAddress"></a>
# **getFireRiskByAddress**
> FireRiskResponse getFireRiskByAddress(address)

Gets FireRiskResponse

Returns the fire data based on address input.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String address = "address_example"; // String | Free-form address text
try {
    FireRiskResponse result = apiInstance.getFireRiskByAddress(address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-form address text |

### Return type

[**FireRiskResponse**](FireRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByAddressBatch"></a>
# **getFireRiskByAddressBatch**
> FireRiskResponseList getFireRiskByAddressBatch(body)

Batch method for getting fire risk by address

Batch method for getting fire risk by address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
FireRiskByAddressRequest body = new FireRiskByAddressRequest(); // FireRiskByAddressRequest | 
try {
    FireRiskResponseList result = apiInstance.getFireRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FireRiskByAddressRequest**](FireRiskByAddressRequest.md)|  | [optional]

### Return type

[**FireRiskResponseList**](FireRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByLocation"></a>
# **getFireRiskByLocation**
> FireRiskLocationResponse getFireRiskByLocation(longitude, latitude)

Gets FireRiskResponse

Returns the fire data based on location input.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
try {
    FireRiskLocationResponse result = apiInstance.getFireRiskByLocation(longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |

### Return type

[**FireRiskLocationResponse**](FireRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireRiskByLocationBatch"></a>
# **getFireRiskByLocationBatch**
> FireRiskLocationResponseList getFireRiskByLocationBatch(body)

Batch method for getting fire risk by location

Batch method for getting fire risk by location

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
FireRiskByLocationRequest body = new FireRiskByLocationRequest(); // FireRiskByLocationRequest | 
try {
    FireRiskLocationResponseList result = apiInstance.getFireRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FireRiskByLocationRequest**](FireRiskByLocationRequest.md)|  | [optional]

### Return type

[**FireRiskLocationResponseList**](FireRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireStationByAddress"></a>
# **getFireStationByAddress**
> FireStations getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket)

Gets FireStationResponse

Returns the nearest Firestations from an input address.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String address = "address_example"; // String | The address to be searched.
String maxCandidates = "maxCandidates_example"; // String | Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location.
String travelTime = "travelTime_example"; // String | Max travel time from input location to fire station. Maximum allowed is 2 hours
String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
String travelDistance = "travelDistance_example"; // String | Maximum travel distance from input location to fire station. Maximum allowed is 50 miles
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
String sortBy = "sortBy_example"; // String | Sort the fire stations results by either travel time or travel distance (nearest first). Default sorting is by travel time.
String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Historic traffic time slab
try {
    FireStations result = apiInstance.getFireStationByAddress(address, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireStationByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **maxCandidates** | **String**| Specifies the maximum number of fire stations that this service retrieves. The default value is 3 and maximum value is 5. The retrieved results are traveldistance sorted from the input location. | [optional]
 **travelTime** | **String**| Max travel time from input location to fire station. Maximum allowed is 2 hours | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional] [enum: minutes, hours, seconds, milliseconds]
 **travelDistance** | **String**| Maximum travel distance from input location to fire station. Maximum allowed is 50 miles | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional] [enum: Feet, Kilometers, Miles, Meters]
 **sortBy** | **String**| Sort the fire stations results by either travel time or travel distance (nearest first). Default sorting is by travel time. | [optional] [enum: time, distance]
 **historicTrafficTimeBucket** | **String**| Historic traffic time slab | [optional] [enum: None, AMPeak, PMPeak, OffPeak, Night]

### Return type

[**FireStations**](FireStations.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFireStationByLocation"></a>
# **getFireStationByLocation**
> FireStationsLocation getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket)

Gets FireStationResponse

Returns the nearest Firestations from an input location.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
String maxCandidates = "maxCandidates_example"; // String | Specifies the maximum number of fire stations that this service retrieves. The default value is 3. The retrieved fire stations are distance ordered from the specified location. Maximum of 5 fire stations can be retrieved.
String travelTime = "travelTime_example"; // String | Maximum travel time from input location to fire station. Maximum allowed is 2 hours
String travelTimeUnit = "travelTimeUnit_example"; // String | Travel time unit such as minutes (default), hours, seconds or milliseconds.
String travelDistance = "travelDistance_example"; // String | Maximum travel distance from input location to fire station. Maximum allowed is 50 miles
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Travel distance unit such as Feet (default), Kilometers, Miles or Meters.
String sortBy = "sortBy_example"; // String | Sorting of fire stations in result by travel time/distance (nearest first from input location).
String historicTrafficTimeBucket = "historicTrafficTimeBucket_example"; // String | Historic traffic time slab
try {
    FireStationsLocation result = apiInstance.getFireStationByLocation(longitude, latitude, maxCandidates, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, sortBy, historicTrafficTimeBucket);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFireStationByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **maxCandidates** | **String**| Specifies the maximum number of fire stations that this service retrieves. The default value is 3. The retrieved fire stations are distance ordered from the specified location. Maximum of 5 fire stations can be retrieved. | [optional]
 **travelTime** | **String**| Maximum travel time from input location to fire station. Maximum allowed is 2 hours | [optional]
 **travelTimeUnit** | **String**| Travel time unit such as minutes (default), hours, seconds or milliseconds. | [optional] [enum: minutes, hours, seconds, milliseconds]
 **travelDistance** | **String**| Maximum travel distance from input location to fire station. Maximum allowed is 50 miles | [optional]
 **travelDistanceUnit** | **String**| Travel distance unit such as Feet (default), Kilometers, Miles or Meters. | [optional] [enum: Feet, Kilometers, Miles, Meters]
 **sortBy** | **String**| Sorting of fire stations in result by travel time/distance (nearest first from input location). | [optional] [enum: time, distance]
 **historicTrafficTimeBucket** | **String**| Historic traffic time slab | [optional] [enum: None, AMPeak, PMPeak, OffPeak, Night]

### Return type

[**FireStationsLocation**](FireStationsLocation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByAddress"></a>
# **getFloodRiskByAddress**
> FloodRiskResponse getFloodRiskByAddress(address, includeZoneDesc, includeGeometry)

Gets FloodRiskResponse

Returns the Flood Risk data for flood zones based on an address.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String address = "address_example"; // String | Free-text Address
String includeZoneDesc = "includeZoneDesc_example"; // String | Specifies primary zone description. Valid Values: 'Y' or 'N'.
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    FloodRiskResponse result = apiInstance.getFloodRiskByAddress(address, includeZoneDesc, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFloodRiskByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Free-text Address |
 **includeZoneDesc** | **String**| Specifies primary zone description. Valid Values: &#39;Y&#39; or &#39;N&#39;. | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**FloodRiskResponse**](FloodRiskResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByAddressBatch"></a>
# **getFloodRiskByAddressBatch**
> FloodRiskResponseList getFloodRiskByAddressBatch(body)

Batch method for getting flood risk by address

Batch method for getting flood risk by address

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
FloodRiskByAddressRequest body = new FloodRiskByAddressRequest(); // FloodRiskByAddressRequest | 
try {
    FloodRiskResponseList result = apiInstance.getFloodRiskByAddressBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFloodRiskByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FloodRiskByAddressRequest**](FloodRiskByAddressRequest.md)|  | [optional]

### Return type

[**FloodRiskResponseList**](FloodRiskResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByLocation"></a>
# **getFloodRiskByLocation**
> FloodRiskLocationResponse getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry)

Gets FloodRiskResponse

Returns the Flood Risk data for Flood Zones and Base Flood Elevation, based on location.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
String longitude = "longitude_example"; // String | Longitude of Location
String latitude = "latitude_example"; // String | Latitude of Location
String includeZoneDesc = "includeZoneDesc_example"; // String | Specifies primary zone description. Valid Values: 'Y' or 'N'. Default: 'Y'
String includeGeometry = "includeGeometry_example"; // String | Y or N (default is N) - if it is Y, then geometry will be part of response
try {
    FloodRiskLocationResponse result = apiInstance.getFloodRiskByLocation(longitude, latitude, includeZoneDesc, includeGeometry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFloodRiskByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of Location |
 **latitude** | **String**| Latitude of Location |
 **includeZoneDesc** | **String**| Specifies primary zone description. Valid Values: &#39;Y&#39; or &#39;N&#39;. Default: &#39;Y&#39; | [optional]
 **includeGeometry** | **String**| Y or N (default is N) - if it is Y, then geometry will be part of response | [optional] [enum: Y, N]

### Return type

[**FloodRiskLocationResponse**](FloodRiskLocationResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getFloodRiskByLocationBatch"></a>
# **getFloodRiskByLocationBatch**
> FloodRiskLocationResponseList getFloodRiskByLocationBatch(body)

Batch method for getting flood risk by location

Batch method for getting flood risk by location

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoRiskServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoRiskServiceApi apiInstance = new LIAPIGeoRiskServiceApi();
FloodRiskByLocationRequest body = new FloodRiskByLocationRequest(); // FloodRiskByLocationRequest | 
try {
    FloodRiskLocationResponseList result = apiInstance.getFloodRiskByLocationBatch(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoRiskServiceApi#getFloodRiskByLocationBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FloodRiskByLocationRequest**](FloodRiskByLocationRequest.md)|  | [optional]

### Return type

[**FloodRiskLocationResponseList**](FloodRiskLocationResponseList.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

