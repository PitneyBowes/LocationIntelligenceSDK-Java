# LIAPIGeoLifeServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDemographicsByAddress**](LIAPIGeoLifeServiceApi.md#getDemographicsByAddress) | **GET** /geolife/v1/demographics/byaddress | Demographics By Address.
[**getDemographicsByLocation**](LIAPIGeoLifeServiceApi.md#getDemographicsByLocation) | **GET** /geolife/v1/demographics/bylocation | Demographics By Location.
[**getSegmentationByAddress**](LIAPIGeoLifeServiceApi.md#getSegmentationByAddress) | **GET** /geolife/v1/segmentation/byaddress | Segmentation By Address.
[**getSegmentationByLocation**](LIAPIGeoLifeServiceApi.md#getSegmentationByLocation) | **GET** /geolife/v1/segmentation/bylocation | Segmentation By Location.


<a name="getDemographicsByAddress"></a>
# **getDemographicsByAddress**
> Demographics getDemographicsByAddress(address, profile, filter, country)

Demographics By Address.

Provides the demographic details around a specified address. GeoLife &#39;byaddress&#39; service accepts address as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLifeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLifeServiceApi apiInstance = new LIAPIGeoLifeServiceApi();
String address = "address_example"; // String | The address to be searched.
String profile = "profile_example"; // String | Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending
String filter = "filter_example"; // String | The 'filter' parameter retrieves the demographic data based upon specified input themes.
String country = "country_example"; // String | 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,IND,ITA,AUS,DEU.
try {
    Demographics result = apiInstance.getDemographicsByAddress(address, profile, filter, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLifeServiceApi#getDemographicsByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **profile** | **String**| Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending | [optional] [enum: Top5Ascending, Top5Descending, Top3Ascending, Top3Descending]
 **filter** | **String**| The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. | [optional]
 **country** | **String**| 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,IND,ITA,AUS,DEU. | [optional] [enum: USA, CAN, GBR, FRA, IND, ITA, AUS, DEU]

### Return type

[**Demographics**](Demographics.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getDemographicsByLocation"></a>
# **getDemographicsByLocation**
> Demographics getDemographicsByLocation(longitude, latitude, profile, filter)

Demographics By Location.

Provides the demographic details around a specified location. GeoLife &#39;bylocation&#39; service accepts longitude and latitude as an input to return a specific population segment&#39;s age group, ethnicity, income, purchasing behaviour, commuter patterns and more.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLifeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLifeServiceApi apiInstance = new LIAPIGeoLifeServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String profile = "profile_example"; // String | Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending
String filter = "filter_example"; // String | The 'filter' parameter retrieves the demographic data based upon specified input themes.
try {
    Demographics result = apiInstance.getDemographicsByLocation(longitude, latitude, profile, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLifeServiceApi#getDemographicsByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **profile** | **String**| Retrieves the sorted demographic data on the basis of pre-defined profiles that can display the top 3 or top 5 results (by address) either in ascending or descending order.Allowed values Top5Ascending,Top5Descending,Top3Ascending,Top3Descending | [optional] [enum: Top5Ascending, Top5Descending, Top3Ascending, Top3Descending]
 **filter** | **String**| The &#39;filter&#39; parameter retrieves the demographic data based upon specified input themes. | [optional]

### Return type

[**Demographics**](Demographics.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getSegmentationByAddress"></a>
# **getSegmentationByAddress**
> Segmentation getSegmentationByAddress(address, country)

Segmentation By Address.

Provides the segmentation details around a specified address. GeoLife &#39;Segmentation by Address&#39; service accepts address as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLifeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLifeServiceApi apiInstance = new LIAPIGeoLifeServiceApi();
String address = "address_example"; // String | The address to be searched.
String country = "country_example"; // String | 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU.
try {
    Segmentation result = apiInstance.getSegmentationByAddress(address, country);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLifeServiceApi#getSegmentationByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| The address to be searched. |
 **country** | **String**| 3 letter ISO code of the country to be searched.Allowed values USA,CAN,GBR,FRA,ITA,AUS,DEU. | [optional] [enum: USA, CAN, GBR, FRA, ITA, AUS, DEU]

### Return type

[**Segmentation**](Segmentation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getSegmentationByLocation"></a>
# **getSegmentationByLocation**
> Segmentation getSegmentationByLocation(longitude, latitude)

Segmentation By Location.

Provides the segmentation details around a specified location. GeoLife &#39;segmentation bylocation&#39; service accepts longitude and latitude as an input to return the lifestyle characteristics of households in terms of their family status, children characteristics, income behaviors, financial preferences and interests.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoLifeServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoLifeServiceApi apiInstance = new LIAPIGeoLifeServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
try {
    Segmentation result = apiInstance.getSegmentationByLocation(longitude, latitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoLifeServiceApi#getSegmentationByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |

### Return type

[**Segmentation**](Segmentation.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

