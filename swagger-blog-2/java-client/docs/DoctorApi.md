#-------------------------------------------------------------------------------
# Copyright 2017 Xoriant Corporation.
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
# 
#      http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#-------------------------------------------------------------------------------
# DoctorApi

All URIs are relative to *http://localhost:8080/appointmentMgmt*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDoctor**](DoctorApi.md#deleteDoctor) | **DELETE** /doctors/{doctorId} | Deletes a Doctor
[**getDoctorsById**](DoctorApi.md#getDoctorsById) | **GET** /doctors/{doctorId} | Find Doctos by Id
[**updateDoctor**](DoctorApi.md#updateDoctor) | **POST** /doctors/{doctorId} | Updates a Doctor with form data


<a name="deleteDoctor"></a>
# **deleteDoctor**
> deleteDoctor(doctorId)

Deletes a Doctor

delete operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
Long doctorId = 789L; // Long | Doctor Id to delete
try {
    apiInstance.deleteDoctor(doctorId);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#deleteDoctor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **Long**| Doctor Id to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getDoctorsById"></a>
# **getDoctorsById**
> List&lt;InlineResponse200&gt; getDoctorsById(doctorId)

Find Doctos by Id

Get Doctos based on Id specified

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
List<String> doctorId = Arrays.asList("doctorId_example"); // List<String> | Id of Doctor to find
try {
    List<InlineResponse200> result = apiInstance.getDoctorsById(doctorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#getDoctorsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | [**List&lt;String&gt;**](String.md)| Id of Doctor to find |

### Return type

[**List&lt;InlineResponse200&gt;**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateDoctor"></a>
# **updateDoctor**
> updateDoctor(doctorId, name)

Updates a Doctor with form data



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.DoctorApi;


DoctorApi apiInstance = new DoctorApi();
Long doctorId = 789L; // Long | Id of Doctor that needs to be updated
String name = "name_example"; // String | Updated name of the Doctor
try {
    apiInstance.updateDoctor(doctorId, name);
} catch (ApiException e) {
    System.err.println("Exception when calling DoctorApi#updateDoctor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **doctorId** | **Long**| Id of Doctor that needs to be updated |
 **name** | **String**| Updated name of the Doctor | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

