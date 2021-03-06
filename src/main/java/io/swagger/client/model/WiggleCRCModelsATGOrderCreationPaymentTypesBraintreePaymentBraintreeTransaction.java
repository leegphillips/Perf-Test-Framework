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
 * WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction {
  @SerializedName("Id")
  private String id = null;

  @SerializedName("PaymentAmount")
  private Double paymentAmount = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("MerchantAccountId")
  private String merchantAccountId = null;

  @SerializedName("Status")
  private String status = null;

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction paymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * Get paymentAmount
   * @return paymentAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getPaymentAmount() {
    return paymentAmount;
  }

  public void setPaymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction merchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
    return this;
  }

   /**
   * Get merchantAccountId
   * @return merchantAccountId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMerchantAccountId() {
    return merchantAccountId;
  }

  public void setMerchantAccountId(String merchantAccountId) {
    this.merchantAccountId = merchantAccountId;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction = (WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction) o;
    return Objects.equals(this.id, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction.id) &&
        Objects.equals(this.paymentAmount, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction.paymentAmount) &&
        Objects.equals(this.currency, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction.currency) &&
        Objects.equals(this.merchantAccountId, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction.merchantAccountId) &&
        Objects.equals(this.status, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, paymentAmount, currency, merchantAccountId, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeTransaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    merchantAccountId: ").append(toIndentedString(merchantAccountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

