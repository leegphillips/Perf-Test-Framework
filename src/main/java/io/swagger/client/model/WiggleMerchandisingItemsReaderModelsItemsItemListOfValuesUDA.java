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
 * WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA {
  @SerializedName("Id")
  private Long id = null;

  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("UdaId")
  private Long udaId = null;

  @SerializedName("UdaValueId")
  private String udaValueId = null;

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA itemId(String itemId) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA udaId(Long udaId) {
    this.udaId = udaId;
    return this;
  }

   /**
   * Get udaId
   * @return udaId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Long getUdaId() {
    return udaId;
  }

  public void setUdaId(Long udaId) {
    this.udaId = udaId;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA udaValueId(String udaValueId) {
    this.udaValueId = udaValueId;
    return this;
  }

   /**
   * Get udaValueId
   * @return udaValueId
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getUdaValueId() {
    return udaValueId;
  }

  public void setUdaValueId(String udaValueId) {
    this.udaValueId = udaValueId;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA created(DateTime created) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA modified(DateTime modified) {
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
    WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA = (WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA) o;
    return Objects.equals(this.id, wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA.id) &&
        Objects.equals(this.itemId, wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA.itemId) &&
        Objects.equals(this.udaId, wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA.udaId) &&
        Objects.equals(this.udaValueId, wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA.udaValueId) &&
        Objects.equals(this.created, wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA.created) &&
        Objects.equals(this.modified, wiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, itemId, udaId, udaValueId, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleMerchandisingItemsReaderModelsItemsItemListOfValuesUDA {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    udaId: ").append(toIndentedString(udaId)).append("\n");
    sb.append("    udaValueId: ").append(toIndentedString(udaValueId)).append("\n");
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
