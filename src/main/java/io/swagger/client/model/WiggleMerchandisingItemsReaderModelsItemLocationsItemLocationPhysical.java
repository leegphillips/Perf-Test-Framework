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
import io.swagger.client.model.InlineResponse2002ItemLocationVirtual;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical {
  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("PhysicalLocationId")
  private Long physicalLocationId = null;

  @SerializedName("LocationType")
  private String locationType = null;

  @SerializedName("StoreType")
  private String storeType = null;

  @SerializedName("IsHoldingStock")
  private String isHoldingStock = null;

  @SerializedName("AcceptsItemReturn")
  private String acceptsItemReturn = null;

  @SerializedName("ItemLocationVirtual")
  private List<InlineResponse2002ItemLocationVirtual> itemLocationVirtual = new ArrayList<InlineResponse2002ItemLocationVirtual>();

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical itemId(String itemId) {
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

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical physicalLocationId(Long physicalLocationId) {
    this.physicalLocationId = physicalLocationId;
    return this;
  }

   /**
   * Get physicalLocationId
   * @return physicalLocationId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getPhysicalLocationId() {
    return physicalLocationId;
  }

  public void setPhysicalLocationId(Long physicalLocationId) {
    this.physicalLocationId = physicalLocationId;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical locationType(String locationType) {
    this.locationType = locationType;
    return this;
  }

   /**
   * Get locationType
   * @return locationType
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getLocationType() {
    return locationType;
  }

  public void setLocationType(String locationType) {
    this.locationType = locationType;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical storeType(String storeType) {
    this.storeType = storeType;
    return this;
  }

   /**
   * Get storeType
   * @return storeType
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStoreType() {
    return storeType;
  }

  public void setStoreType(String storeType) {
    this.storeType = storeType;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical isHoldingStock(String isHoldingStock) {
    this.isHoldingStock = isHoldingStock;
    return this;
  }

   /**
   * Get isHoldingStock
   * @return isHoldingStock
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getIsHoldingStock() {
    return isHoldingStock;
  }

  public void setIsHoldingStock(String isHoldingStock) {
    this.isHoldingStock = isHoldingStock;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical acceptsItemReturn(String acceptsItemReturn) {
    this.acceptsItemReturn = acceptsItemReturn;
    return this;
  }

   /**
   * Get acceptsItemReturn
   * @return acceptsItemReturn
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAcceptsItemReturn() {
    return acceptsItemReturn;
  }

  public void setAcceptsItemReturn(String acceptsItemReturn) {
    this.acceptsItemReturn = acceptsItemReturn;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical itemLocationVirtual(List<InlineResponse2002ItemLocationVirtual> itemLocationVirtual) {
    this.itemLocationVirtual = itemLocationVirtual;
    return this;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical addItemLocationVirtualItem(InlineResponse2002ItemLocationVirtual itemLocationVirtualItem) {
    this.itemLocationVirtual.add(itemLocationVirtualItem);
    return this;
  }

   /**
   * Get itemLocationVirtual
   * @return itemLocationVirtual
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemLocationVirtual> getItemLocationVirtual() {
    return itemLocationVirtual;
  }

  public void setItemLocationVirtual(List<InlineResponse2002ItemLocationVirtual> itemLocationVirtual) {
    this.itemLocationVirtual = itemLocationVirtual;
  }

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical created(DateTime created) {
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

  public WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical modified(DateTime modified) {
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
    WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical = (WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical) o;
    return Objects.equals(this.itemId, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.itemId) &&
        Objects.equals(this.physicalLocationId, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.physicalLocationId) &&
        Objects.equals(this.locationType, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.locationType) &&
        Objects.equals(this.storeType, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.storeType) &&
        Objects.equals(this.isHoldingStock, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.isHoldingStock) &&
        Objects.equals(this.acceptsItemReturn, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.acceptsItemReturn) &&
        Objects.equals(this.itemLocationVirtual, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.itemLocationVirtual) &&
        Objects.equals(this.created, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.created) &&
        Objects.equals(this.modified, wiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, physicalLocationId, locationType, storeType, isHoldingStock, acceptsItemReturn, itemLocationVirtual, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleMerchandisingItemsReaderModelsItemLocationsItemLocationPhysical {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    physicalLocationId: ").append(toIndentedString(physicalLocationId)).append("\n");
    sb.append("    locationType: ").append(toIndentedString(locationType)).append("\n");
    sb.append("    storeType: ").append(toIndentedString(storeType)).append("\n");
    sb.append("    isHoldingStock: ").append(toIndentedString(isHoldingStock)).append("\n");
    sb.append("    acceptsItemReturn: ").append(toIndentedString(acceptsItemReturn)).append("\n");
    sb.append("    itemLocationVirtual: ").append(toIndentedString(itemLocationVirtual)).append("\n");
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
