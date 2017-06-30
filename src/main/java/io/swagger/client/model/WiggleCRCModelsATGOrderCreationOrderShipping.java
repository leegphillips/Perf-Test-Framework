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
 * WiggleCRCModelsATGOrderCreationOrderShipping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleCRCModelsATGOrderCreationOrderShipping {
  @SerializedName("Cost")
  private Double cost = null;

  @SerializedName("Method")
  private String method = null;

  @SerializedName("DutyPaid")
  private Double dutyPaid = null;

  @SerializedName("ShippingSLA")
  private String shippingSLA = null;

  @SerializedName("CollectionProvider")
  private String collectionProvider = null;

  @SerializedName("CollectionService")
  private String collectionService = null;

  public WiggleCRCModelsATGOrderCreationOrderShipping cost(Double cost) {
    this.cost = cost;
    return this;
  }

   /**
   * Get cost
   * @return cost
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public WiggleCRCModelsATGOrderCreationOrderShipping method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Get method
   * @return method
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
  }

  public WiggleCRCModelsATGOrderCreationOrderShipping dutyPaid(Double dutyPaid) {
    this.dutyPaid = dutyPaid;
    return this;
  }

   /**
   * Get dutyPaid
   * @return dutyPaid
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getDutyPaid() {
    return dutyPaid;
  }

  public void setDutyPaid(Double dutyPaid) {
    this.dutyPaid = dutyPaid;
  }

  public WiggleCRCModelsATGOrderCreationOrderShipping shippingSLA(String shippingSLA) {
    this.shippingSLA = shippingSLA;
    return this;
  }

   /**
   * Get shippingSLA
   * @return shippingSLA
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getShippingSLA() {
    return shippingSLA;
  }

  public void setShippingSLA(String shippingSLA) {
    this.shippingSLA = shippingSLA;
  }

  public WiggleCRCModelsATGOrderCreationOrderShipping collectionProvider(String collectionProvider) {
    this.collectionProvider = collectionProvider;
    return this;
  }

   /**
   * Get collectionProvider
   * @return collectionProvider
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCollectionProvider() {
    return collectionProvider;
  }

  public void setCollectionProvider(String collectionProvider) {
    this.collectionProvider = collectionProvider;
  }

  public WiggleCRCModelsATGOrderCreationOrderShipping collectionService(String collectionService) {
    this.collectionService = collectionService;
    return this;
  }

   /**
   * Get collectionService
   * @return collectionService
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCollectionService() {
    return collectionService;
  }

  public void setCollectionService(String collectionService) {
    this.collectionService = collectionService;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleCRCModelsATGOrderCreationOrderShipping wiggleCRCModelsATGOrderCreationOrderShipping = (WiggleCRCModelsATGOrderCreationOrderShipping) o;
    return Objects.equals(this.cost, wiggleCRCModelsATGOrderCreationOrderShipping.cost) &&
        Objects.equals(this.method, wiggleCRCModelsATGOrderCreationOrderShipping.method) &&
        Objects.equals(this.dutyPaid, wiggleCRCModelsATGOrderCreationOrderShipping.dutyPaid) &&
        Objects.equals(this.shippingSLA, wiggleCRCModelsATGOrderCreationOrderShipping.shippingSLA) &&
        Objects.equals(this.collectionProvider, wiggleCRCModelsATGOrderCreationOrderShipping.collectionProvider) &&
        Objects.equals(this.collectionService, wiggleCRCModelsATGOrderCreationOrderShipping.collectionService);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cost, method, dutyPaid, shippingSLA, collectionProvider, collectionService);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleCRCModelsATGOrderCreationOrderShipping {\n");
    
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    dutyPaid: ").append(toIndentedString(dutyPaid)).append("\n");
    sb.append("    shippingSLA: ").append(toIndentedString(shippingSLA)).append("\n");
    sb.append("    collectionProvider: ").append(toIndentedString(collectionProvider)).append("\n");
    sb.append("    collectionService: ").append(toIndentedString(collectionService)).append("\n");
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
