# DefaultApi

All URIs are relative to *http://localhost:8080/appointmentMgmt*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDoctor**](DefaultApi.md#createDoctor) | **POST** /doctors | Post new Doctor info


<a name="createDoctor"></a>
# **createDoctor**
> createDoctor(payload)

Post new Doctor info

endpoint for posting a newly created Doctor entity to the server

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Payload payload = new Payload(); // Payload | A single JSON object containing a Doctor definition
try {
    apiInstance.createDoctor(payload);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createDoctor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Payload**](Payload.md)| A single JSON object containing a Doctor definition |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

