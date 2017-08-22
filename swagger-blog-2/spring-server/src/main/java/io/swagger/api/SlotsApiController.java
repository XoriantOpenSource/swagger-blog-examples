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

import io.swagger.model.InlineResponse2001;

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
public class SlotsApiController implements SlotsApi {



    public ResponseEntity<Void> deleteSlotsById(@ApiParam(value = "Slot Id to delete",required=true ) @PathVariable("slotId") Long slotId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<List<InlineResponse2001>> getSlotsBySlotId(@ApiParam(value = "slotId to find",required=true ) @PathVariable("slotId") List<String> slotId) {
        // do some magic!
        return new ResponseEntity<List<InlineResponse2001>>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateSlotsForDoctorId(@ApiParam(value = "ID of Slot that needs to be updated",required=true ) @PathVariable("slotId") Long slotId,
        @ApiParam(value = "Updated Doctor Id") @RequestPart(value="doctorId", required=false)  Long doctorId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
