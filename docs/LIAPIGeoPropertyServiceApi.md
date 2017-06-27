# LIAPIGeoPropertyServiceApi

All URIs are relative to *https://api.pitneybowes.com/location-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGeoPropertyByAddress**](LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddress) | **GET** /geoproperty/v1/{category}/attributes/byaddress | Gets GeoPropertyResponse
[**getGeoPropertyByAddressBatch**](LIAPIGeoPropertyServiceApi.md#getGeoPropertyByAddressBatch) | **POST** /geoproperty/v1/{category}/attributes/byaddress | Gets GeoPropertyResponses
[**getGeoPropertyByPBKey**](LIAPIGeoPropertyServiceApi.md#getGeoPropertyByPBKey) | **GET** /geoproperty/v1/{category}/attributes/bypbkey | Gets GeoPropertyResponse
[**getGeoPropertyByPBKeyBatch**](LIAPIGeoPropertyServiceApi.md#getGeoPropertyByPBKeyBatch) | **POST** /geoproperty/v1/{category}/attributes/bypbkey | Gets GeoPropertyResponses


<a name="getGeoPropertyByAddress"></a>
# **getGeoPropertyByAddress**
> GeoPropertyResponse getGeoPropertyByAddress(address, category)

Gets GeoPropertyResponse

Gets GeoPropertyResponse

### Example
```java
// Import classes:
//import pb.ApiException;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;


LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String address = "address_example"; // String | free form address text
String category = "category_example"; // String | all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate
try {
    GeoPropertyResponse result = apiInstance.getGeoPropertyByAddress(address, category);
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
 **category** | **String**| all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate |

### Return type

[**GeoPropertyResponse**](GeoPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getGeoPropertyByAddressBatch"></a>
# **getGeoPropertyByAddressBatch**
> GeoPropertyResponses getGeoPropertyByAddressBatch(category, body)

Gets GeoPropertyResponses

Gets GeoPropertyResponses

### Example
```java
// Import classes:
//import pb.ApiException;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;


LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String category = "category_example"; // String | all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate
GeoPropertyAddressRequest body = new GeoPropertyAddressRequest(); // GeoPropertyAddressRequest | 
try {
    GeoPropertyResponses result = apiInstance.getGeoPropertyByAddressBatch(category, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getGeoPropertyByAddressBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate |
 **body** | [**GeoPropertyAddressRequest**](GeoPropertyAddressRequest.md)|  | [optional]

### Return type

[**GeoPropertyResponses**](GeoPropertyResponses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getGeoPropertyByPBKey"></a>
# **getGeoPropertyByPBKey**
> GeoPropertyResponse getGeoPropertyByPBKey(pbKey, category)

Gets GeoPropertyResponse

Gets GeoPropertyResponse

### Example
```java
// Import classes:
//import pb.ApiException;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;


LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String pbKey = "pbKey_example"; // String | free form text
String category = "category_example"; // String | all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate
try {
    GeoPropertyResponse result = apiInstance.getGeoPropertyByPBKey(pbKey, category);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getGeoPropertyByPBKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pbKey** | **String**| free form text |
 **category** | **String**| all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate |

### Return type

[**GeoPropertyResponse**](GeoPropertyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

<a name="getGeoPropertyByPBKeyBatch"></a>
# **getGeoPropertyByPBKeyBatch**
> GeoPropertyResponses getGeoPropertyByPBKeyBatch(category, body)

Gets GeoPropertyResponses

Gets GeoPropertyResponses

### Example
```java
// Import classes:
//import pb.ApiException;
//import pb.locationintelligence.LIAPIGeoPropertyServiceApi;


LIAPIGeoPropertyServiceApi apiInstance = new LIAPIGeoPropertyServiceApi();
String category = "category_example"; // String | all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate
GeoPropertyPBKeyRequest body = new GeoPropertyPBKeyRequest(); // GeoPropertyPBKeyRequest | 
try {
    GeoPropertyResponses result = apiInstance.getGeoPropertyByPBKeyBatch(category, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LIAPIGeoPropertyServiceApi#getGeoPropertyByPBKeyBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **String**| all, insuranceBasic, insuranceExtended, owner, financialServices, retail, realEstate |
 **body** | [**GeoPropertyPBKeyRequest**](GeoPropertyPBKeyRequest.md)|  | [optional]

### Return type

[**GeoPropertyResponses**](GeoPropertyResponses.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/xml, application/json

