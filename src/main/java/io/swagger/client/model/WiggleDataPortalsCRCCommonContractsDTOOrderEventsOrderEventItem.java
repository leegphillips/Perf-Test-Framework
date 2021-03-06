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
 * WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem {
  @SerializedName("ParentReferenceLineId")
  private String parentReferenceLineId = null;

  @SerializedName("ReferenceLineId")
  private String referenceLineId = null;

  @SerializedName("GroupStockId")
  private String groupStockId = null;

  @SerializedName("Quantity")
  private Integer quantity = null;

  @SerializedName("ChargeAmount")
  private Double chargeAmount = null;

  @SerializedName("Currency")
  private String currency = null;

  public WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem parentReferenceLineId(String parentReferenceLineId) {
    this.parentReferenceLineId = parentReferenceLineId;
    return this;
  }

   /**
   * Get parentReferenceLineId
   * @return parentReferenceLineId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getParentReferenceLineId() {
    return parentReferenceLineId;
  }

  public void setParentReferenceLineId(String parentReferenceLineId) {
    this.parentReferenceLineId = parentReferenceLineId;
  }

  public WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem referenceLineId(String referenceLineId) {
    this.referenceLineId = referenceLineId;
    return this;
  }

   /**
   * Get referenceLineId
   * @return referenceLineId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReferenceLineId() {
    return referenceLineId;
  }

  public void setReferenceLineId(String referenceLineId) {
    this.referenceLineId = referenceLineId;
  }

  public WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem groupStockId(String groupStockId) {
    this.groupStockId = groupStockId;
    return this;
  }

   /**
   * Get groupStockId
   * @return groupStockId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGroupStockId() {
    return groupStockId;
  }

  public void setGroupStockId(String groupStockId) {
    this.groupStockId = groupStockId;
  }

  public WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem chargeAmount(Double chargeAmount) {
    this.chargeAmount = chargeAmount;
    return this;
  }

   /**
   * Get chargeAmount
   * @return chargeAmount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getChargeAmount() {
    return chargeAmount;
  }

  public void setChargeAmount(Double chargeAmount) {
    this.chargeAmount = chargeAmount;
  }

  public WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem currency(String currency) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem = (WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem) o;
    return Objects.equals(this.parentReferenceLineId, wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem.parentReferenceLineId) &&
        Objects.equals(this.referenceLineId, wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem.referenceLineId) &&
        Objects.equals(this.groupStockId, wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem.groupStockId) &&
        Objects.equals(this.quantity, wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem.quantity) &&
        Objects.equals(this.chargeAmount, wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem.chargeAmount) &&
        Objects.equals(this.currency, wiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parentReferenceLineId, referenceLineId, groupStockId, quantity, chargeAmount, currency);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleDataPortalsCRCCommonContractsDTOOrderEventsOrderEventItem {\n");
    
    sb.append("    parentReferenceLineId: ").append(toIndentedString(parentReferenceLineId)).append("\n");
    sb.append("    referenceLineId: ").append(toIndentedString(referenceLineId)).append("\n");
    sb.append("    groupStockId: ").append(toIndentedString(groupStockId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    chargeAmount: ").append(toIndentedString(chargeAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

