/*
 * Wiggle.DataPortals.CRC.API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * WiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge {
  @SerializedName("AssociatedOrderId")
  private String associatedOrderId = null;

  public WiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge associatedOrderId(String associatedOrderId) {
    this.associatedOrderId = associatedOrderId;
    return this;
  }

   /**
   * Get associatedOrderId
   * @return associatedOrderId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAssociatedOrderId() {
    return associatedOrderId;
  }

  public void setAssociatedOrderId(String associatedOrderId) {
    this.associatedOrderId = associatedOrderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge wiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge = (WiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge) o;
    return Objects.equals(this.associatedOrderId, wiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge.associatedOrderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedOrderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleCRCModelsATGOrderCreationPaymentTypesFreeOfCharge {\n");
    
    sb.append("    associatedOrderId: ").append(toIndentedString(associatedOrderId)).append("\n");
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

