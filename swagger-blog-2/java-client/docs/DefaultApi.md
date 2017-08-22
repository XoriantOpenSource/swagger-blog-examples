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

