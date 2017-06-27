# LIAPIGeoTaxServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBatchTaxByAddress**](LIAPIGeoTaxServiceApi.md#getBatchTaxByAddress) | **POST** /geotax/v1/tax/{taxRateTypeId}/byaddress | Post Tax By Address
[**getBatchTaxByLocation**](LIAPIGeoTaxServiceApi.md#getBatchTaxByLocation) | **POST** /geotax/v1/tax/{taxRateTypeId}/bylocation | Post Tax By Location
[**getBatchTaxRateByAddress**](LIAPIGeoTaxServiceApi.md#getBatchTaxRateByAddress) | **POST** /geotax/v1/taxrate/{taxRateTypeId}/byaddress | Post Taxrate By Address
[**getBatchTaxRateByLocation**](LIAPIGeoTaxServiceApi.md#getBatchTaxRateByLocation) | **POST** /geotax/v1/taxrate/{taxRateTypeId}/bylocation | Post Taxrate By Location
[**getSpecificTaxByAddress**](LIAPIGeoTaxServiceApi.md#getSpecificTaxByAddress) | **GET** /geotax/v1/tax/{taxRateTypeId}/byaddress | Get Tax By Address
[**getSpecificTaxByLocation**](LIAPIGeoTaxServiceApi.md#getSpecificTaxByLocation) | **GET** /geotax/v1/tax/{taxRateTypeId}/bylocation | Get Tax By Location
[**getSpecificTaxRateByAddress**](LIAPIGeoTaxServiceApi.md#getSpecificTaxRateByAddress) | **GET** /geotax/v1/taxrate/{taxRateTypeId}/byaddress | Get Taxrate By Address
[**getSpecificTaxRateByLocation**](LIAPIGeoTaxServiceApi.md#getSpecificTaxRateByLocation) | **GET** /geotax/v1/taxrate/{taxRateTypeId}/bylocation | Get Taxrate By Location


<a name="getBatchTaxByAddress"></a>
# **getBatchTaxByAddress**
> TaxResponses getBatchTaxByAddress(taxRateTypeId, body)

Post Tax By Address

This is a Batch offering for &#39;Tax By Address&#39; service. It accepts a single address, purchase amount or a list of addresses, purchase amounts and retrieve applicable taxes.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxAddressRequest body = new TaxAddressRequest(); // TaxAddressRequest | TaxAddressRequest Class Object having tax request.
try {
    TaxResponses result = apiInstance.getBatchTaxByAddress(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getBatchTaxByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxAddressRequest**](TaxAddressRequest.md)| TaxAddressRequest Class Object having tax request. |

### Return type

[**TaxResponses**](TaxResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getBatchTaxByLocation"></a>
# **getBatchTaxByLocation**
> TaxResponses getBatchTaxByLocation(taxRateTypeId, body)

Post Tax By Location

This is a Batch offering for &#39;Tax By Location&#39; service. It accepts a single location coordinate, purchase amount or a list of location coordinates, purchase amounts and retrieve applicable tax.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxLocationRequest body = new TaxLocationRequest(); // TaxLocationRequest | TaxAddressRequest Class Object having tax request.
try {
    TaxResponses result = apiInstance.getBatchTaxByLocation(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getBatchTaxByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxLocationRequest**](TaxLocationRequest.md)| TaxAddressRequest Class Object having tax request. |

### Return type

[**TaxResponses**](TaxResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getBatchTaxRateByAddress"></a>
# **getBatchTaxRateByAddress**
> TaxResponses getBatchTaxRateByAddress(taxRateTypeId, body)

Post Taxrate By Address

This is a Batch offering for &#39;Taxrate By Address&#39; service. It accepts a single address or a list of addresses and retrieve applicable tax rates.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxRateAddressRequest body = new TaxRateAddressRequest(); // TaxRateAddressRequest | TaxRateAddressRequest Class Object having tax rate request.
try {
    TaxResponses result = apiInstance.getBatchTaxRateByAddress(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getBatchTaxRateByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxRateAddressRequest**](TaxRateAddressRequest.md)| TaxRateAddressRequest Class Object having tax rate request. |

### Return type

[**TaxResponses**](TaxResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getBatchTaxRateByLocation"></a>
# **getBatchTaxRateByLocation**
> TaxResponses getBatchTaxRateByLocation(taxRateTypeId, body)

Post Taxrate By Location

This is a Batch offering for &#39;Taxrate By Location&#39; service. It accepts a single location coordinate or a list of location coordinates and retrieve applicable tax rates.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
TaxRateLocationRequest body = new TaxRateLocationRequest(); // TaxRateLocationRequest | TaxRateLocationRequest Class Object having tax rate request.
try {
    TaxResponses result = apiInstance.getBatchTaxRateByLocation(taxRateTypeId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getBatchTaxRateByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **body** | [**TaxRateLocationRequest**](TaxRateLocationRequest.md)| TaxRateLocationRequest Class Object having tax rate request. |

### Return type

[**TaxResponses**](TaxResponses.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/xml, application/json
 - **Accept**: application/xml, application/json

<a name="getSpecificTaxByAddress"></a>
# **getSpecificTaxByAddress**
> TaxResponse getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount)

Get Tax By Address

This service calculates and returns taxes applicable at a specific address. Address, purchase amount and supported tax rate type are inputs to the service.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String address = "address_example"; // String | The address to be searched.
String purchaseAmount = "purchaseAmount_example"; // String | The amount on which tax to be calculated.
try {
    TaxResponse result = apiInstance.getSpecificTaxByAddress(taxRateTypeId, address, purchaseAmount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getSpecificTaxByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **address** | **String**| The address to be searched. |
 **purchaseAmount** | **String**| The amount on which tax to be calculated. |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxByLocation"></a>
# **getSpecificTaxByLocation**
> TaxResponse getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount)

Get Tax By Location

This service calculates and returns tax applicable at a specific location. Longitude, latitude, purchase amount and supported tax rate type are inputs to the service.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String latitude = "latitude_example"; // String | Latitude of the location.
String longitude = "longitude_example"; // String | Longitude of the location.
String purchaseAmount = "purchaseAmount_example"; // String | The amount on which tax to be calculated.
try {
    TaxResponse result = apiInstance.getSpecificTaxByLocation(taxRateTypeId, latitude, longitude, purchaseAmount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getSpecificTaxByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **latitude** | **String**| Latitude of the location. |
 **longitude** | **String**| Longitude of the location. |
 **purchaseAmount** | **String**| The amount on which tax to be calculated. |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxRateByAddress"></a>
# **getSpecificTaxRateByAddress**
> TaxResponse getSpecificTaxRateByAddress(taxRateTypeId, address)

Get Taxrate By Address

Retrieves tax rates applicable to a specific address. This service accepts address and supported tax rate type as inputs to retrieve applicable tax rates.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String address = "address_example"; // String | The address to be searched.
try {
    TaxResponse result = apiInstance.getSpecificTaxRateByAddress(taxRateTypeId, address);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getSpecificTaxRateByAddress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **address** | **String**| The address to be searched. |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

<a name="getSpecificTaxRateByLocation"></a>
# **getSpecificTaxRateByLocation**
> TaxResponse getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude)

Get Taxrate By Location

Retrieves tax rates applicable to a specific location. This service accepts longitude, latitude and supported tax rate type as inputs to retrieve applicable tax rates.

### Example
```java
// Import classes:
//import pb.ApiClient;
//import pb.ApiException;
//import pb.Configuration;
//import pb.auth.*;
//import pb.locationintelligence.LIAPIGeoTaxServiceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API_KEY and SECRET for authorization: oAuth2Password
 ApiClient defaultClient = Configuration.getDefaultApiClient();
 defaultClient.setoAuthApiKey("<YOUR API KEY>");
 defaultClient.setoAuthSecret("<YOUR SECRET>");

LIAPIGeoTaxServiceApi apiInstance = new LIAPIGeoTaxServiceApi();
String taxRateTypeId = "taxRateTypeId_example"; // String | The tax rate id.
String latitude = "latitude_example"; // String | Latitude of the location.
String longitude = "longitude_example"; // String | Longitude of the location.
try {
    TaxResponse result = apiInstance.getSpecificTaxRateByLocation(taxRateTypeId, latitude, longitude);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoTaxServiceApi#getSpecificTaxRateByLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **taxRateTypeId** | **String**| The tax rate id. | [enum: General, Auto, Medical, Construction]
 **latitude** | **String**| Latitude of the location. |
 **longitude** | **String**| Longitude of the location. |

### Return type

[**TaxResponse**](TaxResponse.md)

### Authorization

[oAuth2Password](../README.md#oAuth2Password)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

