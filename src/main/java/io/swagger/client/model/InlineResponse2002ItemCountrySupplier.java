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
import org.joda.time.DateTime;

/**
 * InlineResponse2002ItemCountrySupplier
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class InlineResponse2002ItemCountrySupplier {
  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("SupplierId")
  private String supplierId = null;

  @SerializedName("OriginCountryId")
  private String originCountryId = null;

  @SerializedName("IsPrimarySupplier")
  private String isPrimarySupplier = null;

  @SerializedName("IsPrimaryCountry")
  private String isPrimaryCountry = null;

  @SerializedName("UnitCost")
  private Double unitCost = null;

  @SerializedName("LeadTime")
  private Long leadTime = null;

  @SerializedName("PickupLeadTime")
  private Long pickupLeadTime = null;

  @SerializedName("SupplierPackSize")
  private Double supplierPackSize = null;

  @SerializedName("InnerPackSize")
  private Double innerPackSize = null;

  @SerializedName("RoundLvl")
  private String roundLvl = null;

  @SerializedName("MinOrderQty")
  private Double minOrderQty = null;

  @SerializedName("MaxOrderQty")
  private Double maxOrderQty = null;

  @SerializedName("DefaultUop")
  private String defaultUop = null;

  @SerializedName("CostUom")
  private String costUom = null;

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public InlineResponse2002ItemCountrySupplier itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * Get itemId
   * @return itemId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public InlineResponse2002ItemCountrySupplier supplierId(String supplierId) {
    this.supplierId = supplierId;
    return this;
  }

   /**
   * Get supplierId
   * @return supplierId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(String supplierId) {
    this.supplierId = supplierId;
  }

  public InlineResponse2002ItemCountrySupplier originCountryId(String originCountryId) {
    this.originCountryId = originCountryId;
    return this;
  }

   /**
   * Get originCountryId
   * @return originCountryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOriginCountryId() {
    return originCountryId;
  }

  public void setOriginCountryId(String originCountryId) {
    this.originCountryId = originCountryId;
  }

  public InlineResponse2002ItemCountrySupplier isPrimarySupplier(String isPrimarySupplier) {
    this.isPrimarySupplier = isPrimarySupplier;
    return this;
  }

   /**
   * Get isPrimarySupplier
   * @return isPrimarySupplier
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getIsPrimarySupplier() {
    return isPrimarySupplier;
  }

  public void setIsPrimarySupplier(String isPrimarySupplier) {
    this.isPrimarySupplier = isPrimarySupplier;
  }

  public InlineResponse2002ItemCountrySupplier isPrimaryCountry(String isPrimaryCountry) {
    this.isPrimaryCountry = isPrimaryCountry;
    return this;
  }

   /**
   * Get isPrimaryCountry
   * @return isPrimaryCountry
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getIsPrimaryCountry() {
    return isPrimaryCountry;
  }

  public void setIsPrimaryCountry(String isPrimaryCountry) {
    this.isPrimaryCountry = isPrimaryCountry;
  }

  public InlineResponse2002ItemCountrySupplier unitCost(Double unitCost) {
    this.unitCost = unitCost;
    return this;
  }

   /**
   * Get unitCost
   * @return unitCost
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getUnitCost() {
    return unitCost;
  }

  public void setUnitCost(Double unitCost) {
    this.unitCost = unitCost;
  }

  public InlineResponse2002ItemCountrySupplier leadTime(Long leadTime) {
    this.leadTime = leadTime;
    return this;
  }

   /**
   * Get leadTime
   * @return leadTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getLeadTime() {
    return leadTime;
  }

  public void setLeadTime(Long leadTime) {
    this.leadTime = leadTime;
  }

  public InlineResponse2002ItemCountrySupplier pickupLeadTime(Long pickupLeadTime) {
    this.pickupLeadTime = pickupLeadTime;
    return this;
  }

   /**
   * Get pickupLeadTime
   * @return pickupLeadTime
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getPickupLeadTime() {
    return pickupLeadTime;
  }

  public void setPickupLeadTime(Long pickupLeadTime) {
    this.pickupLeadTime = pickupLeadTime;
  }

  public InlineResponse2002ItemCountrySupplier supplierPackSize(Double supplierPackSize) {
    this.supplierPackSize = supplierPackSize;
    return this;
  }

   /**
   * Get supplierPackSize
   * @return supplierPackSize
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getSupplierPackSize() {
    return supplierPackSize;
  }

  public void setSupplierPackSize(Double supplierPackSize) {
    this.supplierPackSize = supplierPackSize;
  }

  public InlineResponse2002ItemCountrySupplier innerPackSize(Double innerPackSize) {
    this.innerPackSize = innerPackSize;
    return this;
  }

   /**
   * Get innerPackSize
   * @return innerPackSize
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getInnerPackSize() {
    return innerPackSize;
  }

  public void setInnerPackSize(Double innerPackSize) {
    this.innerPackSize = innerPackSize;
  }

  public InlineResponse2002ItemCountrySupplier roundLvl(String roundLvl) {
    this.roundLvl = roundLvl;
    return this;
  }

   /**
   * Get roundLvl
   * @return roundLvl
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getRoundLvl() {
    return roundLvl;
  }

  public void setRoundLvl(String roundLvl) {
    this.roundLvl = roundLvl;
  }

  public InlineResponse2002ItemCountrySupplier minOrderQty(Double minOrderQty) {
    this.minOrderQty = minOrderQty;
    return this;
  }

   /**
   * Get minOrderQty
   * @return minOrderQty
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMinOrderQty() {
    return minOrderQty;
  }

  public void setMinOrderQty(Double minOrderQty) {
    this.minOrderQty = minOrderQty;
  }

  public InlineResponse2002ItemCountrySupplier maxOrderQty(Double maxOrderQty) {
    this.maxOrderQty = maxOrderQty;
    return this;
  }

   /**
   * Get maxOrderQty
   * @return maxOrderQty
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getMaxOrderQty() {
    return maxOrderQty;
  }

  public void setMaxOrderQty(Double maxOrderQty) {
    this.maxOrderQty = maxOrderQty;
  }

  public InlineResponse2002ItemCountrySupplier defaultUop(String defaultUop) {
    this.defaultUop = defaultUop;
    return this;
  }

   /**
   * Get defaultUop
   * @return defaultUop
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDefaultUop() {
    return defaultUop;
  }

  public void setDefaultUop(String defaultUop) {
    this.defaultUop = defaultUop;
  }

  public InlineResponse2002ItemCountrySupplier costUom(String costUom) {
    this.costUom = costUom;
    return this;
  }

   /**
   * Get costUom
   * @return costUom
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getCostUom() {
    return costUom;
  }

  public void setCostUom(String costUom) {
    this.costUom = costUom;
  }

  public InlineResponse2002ItemCountrySupplier created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public InlineResponse2002ItemCountrySupplier modified(DateTime modified) {
    this.modified = modified;
    return this;
  }

   /**
   * Get modified
   * @return modified
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getModified() {
    return modified;
  }

  public void setModified(DateTime modified) {
    this.modified = modified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002ItemCountrySupplier inlineResponse2002ItemCountrySupplier = (InlineResponse2002ItemCountrySupplier) o;
    return Objects.equals(this.itemId, inlineResponse2002ItemCountrySupplier.itemId) &&
        Objects.equals(this.supplierId, inlineResponse2002ItemCountrySupplier.supplierId) &&
        Objects.equals(this.originCountryId, inlineResponse2002ItemCountrySupplier.originCountryId) &&
        Objects.equals(this.isPrimarySupplier, inlineResponse2002ItemCountrySupplier.isPrimarySupplier) &&
        Objects.equals(this.isPrimaryCountry, inlineResponse2002ItemCountrySupplier.isPrimaryCountry) &&
        Objects.equals(this.unitCost, inlineResponse2002ItemCountrySupplier.unitCost) &&
        Objects.equals(this.leadTime, inlineResponse2002ItemCountrySupplier.leadTime) &&
        Objects.equals(this.pickupLeadTime, inlineResponse2002ItemCountrySupplier.pickupLeadTime) &&
        Objects.equals(this.supplierPackSize, inlineResponse2002ItemCountrySupplier.supplierPackSize) &&
        Objects.equals(this.innerPackSize, inlineResponse2002ItemCountrySupplier.innerPackSize) &&
        Objects.equals(this.roundLvl, inlineResponse2002ItemCountrySupplier.roundLvl) &&
        Objects.equals(this.minOrderQty, inlineResponse2002ItemCountrySupplier.minOrderQty) &&
        Objects.equals(this.maxOrderQty, inlineResponse2002ItemCountrySupplier.maxOrderQty) &&
        Objects.equals(this.defaultUop, inlineResponse2002ItemCountrySupplier.defaultUop) &&
        Objects.equals(this.costUom, inlineResponse2002ItemCountrySupplier.costUom) &&
        Objects.equals(this.created, inlineResponse2002ItemCountrySupplier.created) &&
        Objects.equals(this.modified, inlineResponse2002ItemCountrySupplier.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, supplierId, originCountryId, isPrimarySupplier, isPrimaryCountry, unitCost, leadTime, pickupLeadTime, supplierPackSize, innerPackSize, roundLvl, minOrderQty, maxOrderQty, defaultUop, costUom, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ItemCountrySupplier {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    originCountryId: ").append(toIndentedString(originCountryId)).append("\n");
    sb.append("    isPrimarySupplier: ").append(toIndentedString(isPrimarySupplier)).append("\n");
    sb.append("    isPrimaryCountry: ").append(toIndentedString(isPrimaryCountry)).append("\n");
    sb.append("    unitCost: ").append(toIndentedString(unitCost)).append("\n");
    sb.append("    leadTime: ").append(toIndentedString(leadTime)).append("\n");
    sb.append("    pickupLeadTime: ").append(toIndentedString(pickupLeadTime)).append("\n");
    sb.append("    supplierPackSize: ").append(toIndentedString(supplierPackSize)).append("\n");
    sb.append("    innerPackSize: ").append(toIndentedString(innerPackSize)).append("\n");
    sb.append("    roundLvl: ").append(toIndentedString(roundLvl)).append("\n");
    sb.append("    minOrderQty: ").append(toIndentedString(minOrderQty)).append("\n");
    sb.append("    maxOrderQty: ").append(toIndentedString(maxOrderQty)).append("\n");
    sb.append("    defaultUop: ").append(toIndentedString(defaultUop)).append("\n");
    sb.append("    costUom: ").append(toIndentedString(costUom)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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

