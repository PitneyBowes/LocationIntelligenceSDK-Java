# LIAPIGeoPlacesServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryCodeMetadata**](LIAPIGeoPlacesServiceApi.md#getCategoryCodeMetadata) | **GET** /geoplaces/v1/metadata/category | Returns Category Codes with their sub-categories (if exist), descriptions and SIC Codes mapping
[**getPOIsByAddress**](LIAPIGeoPlacesServiceApi.md#getPOIsByAddress) | **GET** /geoplaces/v1/poi/byaddress | Point of Interests By Address.
[**getPOIsByLocation**](LIAPIGeoPlacesServiceApi.md#getPOIsByLocation) | **GET** /geoplaces/v1/poi/bylocation | Point of Interests By Location.
[**getSICMetadata**](LIAPIGeoPlacesServiceApi.md#getSICMetadata) | **GET** /geoplaces/v1/metadata/sic | Returns SIC Codes with their Industry Titles and Category Codes mapping


<a name="getCategoryCodeMetadata"></a>
# **getCategoryCodeMetadata**
> GeoPlaceMetadataResponse getCategoryCodeMetadata(categoryCode)

Returns Category Codes with their sub-categories (if exist), descriptions and SIC Codes mapping

Accepts first partial digits or full category codes to filter the response

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPlacesServiceApi apiInstance = new LIAPIGeoPlacesServiceApi();
String categoryCode = "categoryCode_example"; // String | Specify starting digits or full category code to filter the response
try {
    GeoPlaceMetadataResponse result = apiInstance.getCategoryCodeMetadata(categoryCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPlacesServiceApi#getCategoryCodeMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryCode** | **String**| Specify starting digits or full category code to filter the response | [optional]

### Return type

[**GeoPlaceMetadataResponse**](GeoPlaceMetadataResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIsByAddress"></a>
# **getPOIsByAddress**
> GeoplacesResponse getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy)

Point of Interests By Address.

Accepts address as an input to retrieve nearby point of interests.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPlacesServiceApi apiInstance = new LIAPIGeoPlacesServiceApi();
String address = "address_example"; // String | Address
String country = "country_example"; // String | Country
String name = "name_example"; // String | Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1)
String type = "type_example"; // String | Matched against the content which defines the type of the poi. 
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer2.pitneybowes.com/docs/location-intelligence/v1/en/poicategory/LiApiPOICategoryCodes.xlsx 
String sicCode = "sicCode_example"; // String | Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String travelTime = "travelTime_example"; // String | Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in 'travelTimeUnit'. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time.
String travelTimeUnit = "travelTimeUnit_example"; // String | Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds
String travelDistance = "travelDistance_example"; // String | Specifies the search boundary in terms of distance mentioned in 'travelDistanceUnit'. The results are retrieved from the polygon formed based on the travel distance specified.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters
String travelMode = "travelMode_example"; // String | Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking
String sortBy = "distance"; // String | Specifies the order in which POIs are retrieved.
try {
    GeoplacesResponse result = apiInstance.getPOIsByAddress(address, country, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPlacesServiceApi#getPOIsByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **address** | **String**| Address |
 **country** | **String**| Country | [optional]
 **name** | **String**| Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1) | [optional]
 **type** | **String**| Matched against the content which defines the type of the poi.  | [optional]
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://developer2.pitneybowes.com/docs/location-intelligence/v1/en/poicategory/LiApiPOICategoryCodes.xlsx  | [optional]
 **sicCode** | **String**| Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **travelTime** | **String**| Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in &#39;travelTimeUnit&#39;. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time. | [optional]
 **travelTimeUnit** | **String**| Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds | [optional] [enum: minutes, hours, seconds and milliseconds]
 **travelDistance** | **String**| Specifies the search boundary in terms of distance mentioned in &#39;travelDistanceUnit&#39;. The results are retrieved from the polygon formed based on the travel distance specified. | [optional]
 **travelDistanceUnit** | **String**| Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters | [optional] [enum: feet, kilometers, miles and meters]
 **travelMode** | **String**| Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking | [optional] [enum: driving, walking]
 **sortBy** | **String**| Specifies the order in which POIs are retrieved. | [optional] [default to distance] [enum: distance, relevance]

### Return type

[**GeoplacesResponse**](GeoplacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getPOIsByLocation"></a>
# **getPOIsByLocation**
> GeoplacesResponse getPOIsByLocation(longitude, latitude, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy)

Point of Interests By Location.

Accepts longitude and latitude as an input to retrieve nearby point of interests.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPlacesServiceApi apiInstance = new LIAPIGeoPlacesServiceApi();
String longitude = "longitude_example"; // String | Longitude of the location.
String latitude = "latitude_example"; // String | Latitude of the location.
String name = "name_example"; // String | Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1)
String type = "type_example"; // String | Matched against the content which defines the type of the poi. 
String categoryCode = "categoryCode_example"; // String | Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://locate.pitneybowes.com/docs/location-intelligence/v1/en/poicategory/LiApiPOICategoryCodes.xlsx 
String sicCode = "sicCode_example"; // String | Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes.
String maxCandidates = "maxCandidates_example"; // String | Maximum number of POIs that can be retrieved.
String searchRadius = "searchRadius_example"; // String | Radius range within which search is performed.
String searchRadiusUnit = "searchRadiusUnit_example"; // String | Radius unit such as Feet, Kilometers, Miles or Meters.
String travelTime = "travelTime_example"; // String | Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in 'travelTimeUnit'. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time.
String travelTimeUnit = "travelTimeUnit_example"; // String | Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds
String travelDistance = "travelDistance_example"; // String | Specifies the search boundary in terms of distance mentioned in 'travelDistanceUnit'. The results are retrieved from the polygon formed based on the travel distance specified.
String travelDistanceUnit = "travelDistanceUnit_example"; // String | Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters
String travelMode = "travelMode_example"; // String | Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking
String sortBy = "distance"; // String | Specifies the order in which POIs are retrieved.
try {
    GeoplacesResponse result = apiInstance.getPOIsByLocation(longitude, latitude, name, type, categoryCode, sicCode, maxCandidates, searchRadius, searchRadiusUnit, travelTime, travelTimeUnit, travelDistance, travelDistanceUnit, travelMode, sortBy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPlacesServiceApi#getPOIsByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **longitude** | **String**| Longitude of the location. |
 **latitude** | **String**| Latitude of the location. |
 **name** | **String**| Matched against Name, BrandName and Trade Name. Partial terms are also matched with fuzziness (max edit distance is 1) | [optional]
 **type** | **String**| Matched against the content which defines the type of the poi.  | [optional]
 **categoryCode** | **String**| Specific Category/Categories Codes for the desired POIs. Accepts a mix of 4 digit (Top Category), 6 digit (Second-Level Category) and 11 digit (Low-Level Category) Category Codes. https://locate.pitneybowes.com/docs/location-intelligence/v1/en/poicategory/LiApiPOICategoryCodes.xlsx  | [optional]
 **sicCode** | **String**| Specific SIC Codes/Codes for the desired POIs. Accepts a mix of 4 digit (Top Category) and 8 digit (Low-Level Category) SIC Codes. | [optional]
 **maxCandidates** | **String**| Maximum number of POIs that can be retrieved. | [optional]
 **searchRadius** | **String**| Radius range within which search is performed. | [optional]
 **searchRadiusUnit** | **String**| Radius unit such as Feet, Kilometers, Miles or Meters. | [optional]
 **travelTime** | **String**| Specifies the travel time within which method searches for results (POIs which can be reached within travel time)the search boundary in terms of time mentioned in &#39;travelTimeUnit&#39;. The results are retrieved from the polygon formed based on the travel time specified. This means search can be done in the mentioned time results be from the mentioned time. | [optional]
 **travelTimeUnit** | **String**| Specifies acceptable time units.Allowed values Minutes,Hours,Seconds and Milliseconds | [optional] [enum: minutes, hours, seconds and milliseconds]
 **travelDistance** | **String**| Specifies the search boundary in terms of distance mentioned in &#39;travelDistanceUnit&#39;. The results are retrieved from the polygon formed based on the travel distance specified. | [optional]
 **travelDistanceUnit** | **String**| Specifies acceptable time units.Allowed values Feet,Kilometers,Miles and Meters | [optional] [enum: feet, kilometers, miles and meters]
 **travelMode** | **String**| Specifies the available mode of commute. This is required when u r trying to do search by travel distance or travel time. Allowed values driving and walking | [optional] [enum: driving, walking]
 **sortBy** | **String**| Specifies the order in which POIs are retrieved. | [optional] [default to distance] [enum: distance, relevance]

### Return type

[**GeoplacesResponse**](GeoplacesResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

<a name="getSICMetadata"></a>
# **getSICMetadata**
> GeoPlaceMetadataResponse getSICMetadata(sicCode)

Returns SIC Codes with their Industry Titles and Category Codes mapping

Accepts first few partial digits or full SIC codes to filter the response

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoPlacesServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoPlacesServiceApi apiInstance = new LIAPIGeoPlacesServiceApi();
String sicCode = "sicCode_example"; // String | Specify starting digits or full sic code to filter the response
try {
    GeoPlaceMetadataResponse result = apiInstance.getSICMetadata(sicCode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPlacesServiceApi#getSICMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sicCode** | **String**| Specify starting digits or full sic code to filter the response | [optional]

### Return type

[**GeoPlaceMetadataResponse**](GeoPlaceMetadataResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml, text/csv

