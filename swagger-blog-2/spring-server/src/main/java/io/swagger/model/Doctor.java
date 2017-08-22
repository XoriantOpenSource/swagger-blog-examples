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
package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Doctor
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-08-22T11:29:03.578Z")

public class Doctor   {
  @JsonProperty("doctorId")
  private Long doctorId = null;

  @JsonProperty("doctorName")
  private String doctorName = null;

  @JsonProperty("visitingCharge")
  private Long visitingCharge = null;

  @JsonProperty("availability")
  private Long availability = null;

  @JsonProperty("speciality")
  private String speciality = null;

  public Doctor doctorId(Long doctorId) {
    this.doctorId = doctorId;
    return this;
  }

   /**
   * Get doctorId
   * @return doctorId
  **/
  @ApiModelProperty(value = "")


  public Long getDoctorId() {
    return doctorId;
  }

  public void setDoctorId(Long doctorId) {
    this.doctorId = doctorId;
  }

  public Doctor doctorName(String doctorName) {
    this.doctorName = doctorName;
    return this;
  }

   /**
   * Get doctorName
   * @return doctorName
  **/
  @ApiModelProperty(value = "")


  public String getDoctorName() {
    return doctorName;
  }

  public void setDoctorName(String doctorName) {
    this.doctorName = doctorName;
  }

  public Doctor visitingCharge(Long visitingCharge) {
    this.visitingCharge = visitingCharge;
    return this;
  }

   /**
   * Get visitingCharge
   * @return visitingCharge
  **/
  @ApiModelProperty(value = "")


  public Long getVisitingCharge() {
    return visitingCharge;
  }

  public void setVisitingCharge(Long visitingCharge) {
    this.visitingCharge = visitingCharge;
  }

  public Doctor availability(Long availability) {
    this.availability = availability;
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @ApiModelProperty(value = "")


  public Long getAvailability() {
    return availability;
  }

  public void setAvailability(Long availability) {
    this.availability = availability;
  }

  public Doctor speciality(String speciality) {
    this.speciality = speciality;
    return this;
  }

   /**
   * Get speciality
   * @return speciality
  **/
  @ApiModelProperty(value = "")


  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doctor doctor = (Doctor) o;
    return Objects.equals(this.doctorId, doctor.doctorId) &&
        Objects.equals(this.doctorName, doctor.doctorName) &&
        Objects.equals(this.visitingCharge, doctor.visitingCharge) &&
        Objects.equals(this.availability, doctor.availability) &&
        Objects.equals(this.speciality, doctor.speciality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(doctorId, doctorName, visitingCharge, availability, speciality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doctor {\n");
    
    sb.append("    doctorId: ").append(toIndentedString(doctorId)).append("\n");
    sb.append("    doctorName: ").append(toIndentedString(doctorName)).append("\n");
    sb.append("    visitingCharge: ").append(toIndentedString(visitingCharge)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    speciality: ").append(toIndentedString(speciality)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

