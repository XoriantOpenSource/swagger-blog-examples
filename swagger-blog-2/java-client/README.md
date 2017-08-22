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
# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        Payload payload = new Payload(); // Payload | A single JSON object containing a Doctor definition
        try {
            apiInstance.createDoctor(payload);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createDoctor");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080/appointmentMgmt*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**createDoctor**](docs/DefaultApi.md#createDoctor) | **POST** /doctors | Post new Doctor info
*DoctorApi* | [**deleteDoctor**](docs/DoctorApi.md#deleteDoctor) | **DELETE** /doctors/{doctorId} | Deletes a Doctor
*DoctorApi* | [**getDoctorsById**](docs/DoctorApi.md#getDoctorsById) | **GET** /doctors/{doctorId} | Find Doctos by Id
*DoctorApi* | [**updateDoctor**](docs/DoctorApi.md#updateDoctor) | **POST** /doctors/{doctorId} | Updates a Doctor with form data
*SlotsApi* | [**deleteSlotsById**](docs/SlotsApi.md#deleteSlotsById) | **DELETE** /slots/{slotId} | Deletes Slots for an Id
*SlotsApi* | [**getSlotsBySlotId**](docs/SlotsApi.md#getSlotsBySlotId) | **GET** /slots/{slotId} | Find Slots by slotId
*SlotsApi* | [**updateSlotsForDoctorId**](docs/SlotsApi.md#updateSlotsForDoctorId) | **POST** /slots/{slotId} | Updates a Slot with form data


## Documentation for Models

 - [Doctor](docs/Doctor.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [Payload](docs/Payload.md)
 - [Slot](docs/Slot.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



