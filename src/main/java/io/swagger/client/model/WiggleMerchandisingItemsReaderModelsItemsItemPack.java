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
 * WiggleMerchandisingItemsReaderModelsItemsItemPack
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleMerchandisingItemsReaderModelsItemsItemPack {
  @SerializedName("PackNo")
  private String packNo = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("PackQty")
  private Double packQty = null;

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public WiggleMerchandisingItemsReaderModelsItemsItemPack packNo(String packNo) {
    this.packNo = packNo;
    return this;
  }

   /**
   * Get packNo
   * @return packNo
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getPackNo() {
    return packNo;
  }

  public void setPackNo(String packNo) {
    this.packNo = packNo;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemPack itemId(String itemId) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemPack packQty(Double packQty) {
    this.packQty = packQty;
    return this;
  }

   /**
   * Get packQty
   * @return packQty
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Double getPackQty() {
    return packQty;
  }

  public void setPackQty(Double packQty) {
    this.packQty = packQty;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemPack created(DateTime created) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemPack modified(DateTime modified) {
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
    WiggleMerchandisingItemsReaderModelsItemsItemPack wiggleMerchandisingItemsReaderModelsItemsItemPack = (WiggleMerchandisingItemsReaderModelsItemsItemPack) o;
    return Objects.equals(this.packNo, wiggleMerchandisingItemsReaderModelsItemsItemPack.packNo) &&
        Objects.equals(this.itemId, wiggleMerchandisingItemsReaderModelsItemsItemPack.itemId) &&
        Objects.equals(this.packQty, wiggleMerchandisingItemsReaderModelsItemsItemPack.packQty) &&
        Objects.equals(this.created, wiggleMerchandisingItemsReaderModelsItemsItemPack.created) &&
        Objects.equals(this.modified, wiggleMerchandisingItemsReaderModelsItemsItemPack.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packNo, itemId, packQty, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleMerchandisingItemsReaderModelsItemsItemPack {\n");
    
    sb.append("    packNo: ").append(toIndentedString(packNo)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    packQty: ").append(toIndentedString(packQty)).append("\n");
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
