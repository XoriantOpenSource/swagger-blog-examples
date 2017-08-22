/*******************************************************************************
 * Copyright 2017 Xoriant Corporation.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package io.swagger.api;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Payload;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-22T11:29:03.578Z")

@Controller
public class DoctorsApiController implements DoctorsApi {



    public ResponseEntity<Void> createDoctor(@ApiParam(value = "A single JSON object containing a Doctor definition" ,required=true )  @Valid @RequestBody Payload payload) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Void> deleteDoctor(@ApiParam(value = "Doctor Id to delete",required=true ) @PathVariable("doctorId") Long doctorId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse200>> getDoctorsById(@ApiParam(value = "Id of Doctor to find",required=true ) @PathVariable("doctorId") List<String> doctorId) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse200>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateDoctor(@ApiParam(value = "Id of Doctor that needs to be updated",required=true ) @PathVariable("doctorId") Long doctorId,
        @ApiParam(value = "Updated name of the Doctor") @RequestPart(value="name", required=false)  String name) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
