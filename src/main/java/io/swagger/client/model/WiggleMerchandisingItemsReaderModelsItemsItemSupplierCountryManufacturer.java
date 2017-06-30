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
 * WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer {
  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("SupplierId")
  private Long supplierId = null;

  @SerializedName("ManufacturerCountryId")
  private String manufacturerCountryId = null;

  @SerializedName("IsPrimaryManufacturerCountry")
  private String isPrimaryManufacturerCountry = null;

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer itemId(String itemId) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer supplierId(Long supplierId) {
    this.supplierId = supplierId;
    return this;
  }

   /**
   * Get supplierId
   * @return supplierId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Long supplierId) {
    this.supplierId = supplierId;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer manufacturerCountryId(String manufacturerCountryId) {
    this.manufacturerCountryId = manufacturerCountryId;
    return this;
  }

   /**
   * Get manufacturerCountryId
   * @return manufacturerCountryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getManufacturerCountryId() {
    return manufacturerCountryId;
  }

  public void setManufacturerCountryId(String manufacturerCountryId) {
    this.manufacturerCountryId = manufacturerCountryId;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer isPrimaryManufacturerCountry(String isPrimaryManufacturerCountry) {
    this.isPrimaryManufacturerCountry = isPrimaryManufacturerCountry;
    return this;
  }

   /**
   * Get isPrimaryManufacturerCountry
   * @return isPrimaryManufacturerCountry
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getIsPrimaryManufacturerCountry() {
    return isPrimaryManufacturerCountry;
  }

  public void setIsPrimaryManufacturerCountry(String isPrimaryManufacturerCountry) {
    this.isPrimaryManufacturerCountry = isPrimaryManufacturerCountry;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer created(DateTime created) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer modified(DateTime modified) {
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
    WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer = (WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer) o;
    return Objects.equals(this.itemId, wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer.itemId) &&
        Objects.equals(this.supplierId, wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer.supplierId) &&
        Objects.equals(this.manufacturerCountryId, wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer.manufacturerCountryId) &&
        Objects.equals(this.isPrimaryManufacturerCountry, wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer.isPrimaryManufacturerCountry) &&
        Objects.equals(this.created, wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer.created) &&
        Objects.equals(this.modified, wiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, supplierId, manufacturerCountryId, isPrimaryManufacturerCountry, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleMerchandisingItemsReaderModelsItemsItemSupplierCountryManufacturer {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    manufacturerCountryId: ").append(toIndentedString(manufacturerCountryId)).append("\n");
    sb.append("    isPrimaryManufacturerCountry: ").append(toIndentedString(isPrimaryManufacturerCountry)).append("\n");
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

