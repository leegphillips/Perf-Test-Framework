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
 * WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard {
  @SerializedName("Token")
  private String token = null;

  @SerializedName("CardType")
  private String cardType = null;

  @SerializedName("CardHolderName")
  private String cardHolderName = null;

  @SerializedName("MaskedNumber")
  private String maskedNumber = null;

  @SerializedName("CountryOfIssuance")
  private String countryOfIssuance = null;

  @SerializedName("IssuingBank")
  private String issuingBank = null;

  @SerializedName("CreatedAtTimestamp")
  private String createdAtTimestamp = null;

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Get cardType
   * @return cardType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard cardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
    return this;
  }

   /**
   * Get cardHolderName
   * @return cardHolderName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCardHolderName() {
    return cardHolderName;
  }

  public void setCardHolderName(String cardHolderName) {
    this.cardHolderName = cardHolderName;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard maskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
    return this;
  }

   /**
   * Get maskedNumber
   * @return maskedNumber
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMaskedNumber() {
    return maskedNumber;
  }

  public void setMaskedNumber(String maskedNumber) {
    this.maskedNumber = maskedNumber;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard countryOfIssuance(String countryOfIssuance) {
    this.countryOfIssuance = countryOfIssuance;
    return this;
  }

   /**
   * Get countryOfIssuance
   * @return countryOfIssuance
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCountryOfIssuance() {
    return countryOfIssuance;
  }

  public void setCountryOfIssuance(String countryOfIssuance) {
    this.countryOfIssuance = countryOfIssuance;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard issuingBank(String issuingBank) {
    this.issuingBank = issuingBank;
    return this;
  }

   /**
   * Get issuingBank
   * @return issuingBank
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIssuingBank() {
    return issuingBank;
  }

  public void setIssuingBank(String issuingBank) {
    this.issuingBank = issuingBank;
  }

  public WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard createdAtTimestamp(String createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
    return this;
  }

   /**
   * Get createdAtTimestamp
   * @return createdAtTimestamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCreatedAtTimestamp() {
    return createdAtTimestamp;
  }

  public void setCreatedAtTimestamp(String createdAtTimestamp) {
    this.createdAtTimestamp = createdAtTimestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard = (WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard) o;
    return Objects.equals(this.token, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.token) &&
        Objects.equals(this.cardType, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.cardType) &&
        Objects.equals(this.cardHolderName, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.cardHolderName) &&
        Objects.equals(this.maskedNumber, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.maskedNumber) &&
        Objects.equals(this.countryOfIssuance, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.countryOfIssuance) &&
        Objects.equals(this.issuingBank, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.issuingBank) &&
        Objects.equals(this.createdAtTimestamp, wiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard.createdAtTimestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(token, cardType, cardHolderName, maskedNumber, countryOfIssuance, issuingBank, createdAtTimestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleCRCModelsATGOrderCreationPaymentTypesBraintreePaymentBraintreeCard {\n");
    
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    cardHolderName: ").append(toIndentedString(cardHolderName)).append("\n");
    sb.append("    maskedNumber: ").append(toIndentedString(maskedNumber)).append("\n");
    sb.append("    countryOfIssuance: ").append(toIndentedString(countryOfIssuance)).append("\n");
    sb.append("    issuingBank: ").append(toIndentedString(issuingBank)).append("\n");
    sb.append("    createdAtTimestamp: ").append(toIndentedString(createdAtTimestamp)).append("\n");
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

