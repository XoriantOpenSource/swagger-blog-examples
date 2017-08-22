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
# SlotsApi

All URIs are relative to *http://localhost:8080/appointmentMgmt*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSlotsById**](SlotsApi.md#deleteSlotsById) | **DELETE** /slots/{slotId} | Deletes Slots for an Id
[**getSlotsBySlotId**](SlotsApi.md#getSlotsBySlotId) | **GET** /slots/{slotId} | Find Slots by slotId
[**updateSlotsForDoctorId**](SlotsApi.md#updateSlotsForDoctorId) | **POST** /slots/{slotId} | Updates a Slot with form data


<a name="deleteSlotsById"></a>
# **deleteSlotsById**
> deleteSlotsById(slotId)

Deletes Slots for an Id

delete operation

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlotsApi;


SlotsApi apiInstance = new SlotsApi();
Long slotId = 789L; // Long | Slot Id to delete
try {
    apiInstance.deleteSlotsById(slotId);
} catch (ApiException e) {
    System.err.println("Exception when calling SlotsApi#deleteSlotsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slotId** | **Long**| Slot Id to delete |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml, application/json

<a name="getSlotsBySlotId"></a>
# **getSlotsBySlotId**
> List&lt;InlineResponse2001&gt; getSlotsBySlotId(slotId)

Find Slots by slotId

Get Slots for specified slotId

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlotsApi;


SlotsApi apiInstance = new SlotsApi();
List<String> slotId = Arrays.asList("slotId_example"); // List<String> | slotId to find
try {
    List<InlineResponse2001> result = apiInstance.getSlotsBySlotId(slotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SlotsApi#getSlotsBySlotId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slotId** | [**List&lt;String&gt;**](String.md)| slotId to find |

### Return type

[**List&lt;InlineResponse2001&gt;**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateSlotsForDoctorId"></a>
# **updateSlotsForDoctorId**
> updateSlotsForDoctorId(slotId, doctorId)

Updates a Slot with form data



### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.SlotsApi;


SlotsApi apiInstance = new SlotsApi();
Long slotId = 789L; // Long | ID of Slot that needs to be updated
Long doctorId = 789L; // Long | Updated Doctor Id
try {
    apiInstance.updateSlotsForDoctorId(slotId, doctorId);
} catch (ApiException e) {
    System.err.println("Exception when calling SlotsApi#updateSlotsForDoctorId");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **slotId** | **Long**| ID of Slot that needs to be updated |
 **doctorId** | **Long**| Updated Doctor Id | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/xml, application/json

