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
 * WiggleCRCModelsATGOrderCreationPaymentTypesOnAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleCRCModelsATGOrderCreationPaymentTypesOnAccount {
  @SerializedName("GroupAccountNumber")
  private String groupAccountNumber = null;

  public WiggleCRCModelsATGOrderCreationPaymentTypesOnAccount groupAccountNumber(String groupAccountNumber) {
    this.groupAccountNumber = groupAccountNumber;
    return this;
  }

   /**
   * Get groupAccountNumber
   * @return groupAccountNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupAccountNumber() {
    return groupAccountNumber;
  }

  public void setGroupAccountNumber(String groupAccountNumber) {
    this.groupAccountNumber = groupAccountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleCRCModelsATGOrderCreationPaymentTypesOnAccount wiggleCRCModelsATGOrderCreationPaymentTypesOnAccount = (WiggleCRCModelsATGOrderCreationPaymentTypesOnAccount) o;
    return Objects.equals(this.groupAccountNumber, wiggleCRCModelsATGOrderCreationPaymentTypesOnAccount.groupAccountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupAccountNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleCRCModelsATGOrderCreationPaymentTypesOnAccount {\n");
    
    sb.append("    groupAccountNumber: ").append(toIndentedString(groupAccountNumber)).append("\n");
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
