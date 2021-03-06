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
 * WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension {
  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("SupplierId")
  private String supplierId = null;

  @SerializedName("OriginCountry")
  private String originCountry = null;

  @SerializedName("DimObject")
  private String dimObject = null;

  @SerializedName("ObjectDesc")
  private String objectDesc = null;

  @SerializedName("MethodDesc")
  private String methodDesc = null;

  @SerializedName("Length")
  private Double length = null;

  @SerializedName("Width")
  private Double width = null;

  @SerializedName("Height")
  private Double height = null;

  @SerializedName("LwhUom")
  private String lwhUom = null;

  @SerializedName("Weight")
  private Double weight = null;

  @SerializedName("NetWeight")
  private Double netWeight = null;

  @SerializedName("WeightUom")
  private String weightUom = null;

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension itemId(String itemId) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension supplierId(String supplierId) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension originCountry(String originCountry) {
    this.originCountry = originCountry;
    return this;
  }

   /**
   * Get originCountry
   * @return originCountry
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getOriginCountry() {
    return originCountry;
  }

  public void setOriginCountry(String originCountry) {
    this.originCountry = originCountry;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension dimObject(String dimObject) {
    this.dimObject = dimObject;
    return this;
  }

   /**
   * Get dimObject
   * @return dimObject
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public String getDimObject() {
    return dimObject;
  }

  public void setDimObject(String dimObject) {
    this.dimObject = dimObject;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension objectDesc(String objectDesc) {
    this.objectDesc = objectDesc;
    return this;
  }

   /**
   * Get objectDesc
   * @return objectDesc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getObjectDesc() {
    return objectDesc;
  }

  public void setObjectDesc(String objectDesc) {
    this.objectDesc = objectDesc;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension methodDesc(String methodDesc) {
    this.methodDesc = methodDesc;
    return this;
  }

   /**
   * Get methodDesc
   * @return methodDesc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMethodDesc() {
    return methodDesc;
  }

  public void setMethodDesc(String methodDesc) {
    this.methodDesc = methodDesc;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension length(Double length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getLength() {
    return length;
  }

  public void setLength(Double length) {
    this.length = length;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension width(Double width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWidth() {
    return width;
  }

  public void setWidth(Double width) {
    this.width = width;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension height(Double height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension lwhUom(String lwhUom) {
    this.lwhUom = lwhUom;
    return this;
  }

   /**
   * Get lwhUom
   * @return lwhUom
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLwhUom() {
    return lwhUom;
  }

  public void setLwhUom(String lwhUom) {
    this.lwhUom = lwhUom;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension netWeight(Double netWeight) {
    this.netWeight = netWeight;
    return this;
  }

   /**
   * Get netWeight
   * @return netWeight
  **/
  @ApiModelProperty(example = "null", value = "")
  public Double getNetWeight() {
    return netWeight;
  }

  public void setNetWeight(Double netWeight) {
    this.netWeight = netWeight;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension weightUom(String weightUom) {
    this.weightUom = weightUom;
    return this;
  }

   /**
   * Get weightUom
   * @return weightUom
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getWeightUom() {
    return weightUom;
  }

  public void setWeightUom(String weightUom) {
    this.weightUom = weightUom;
  }

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension created(DateTime created) {
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

  public WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension modified(DateTime modified) {
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
    WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension = (WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension) o;
    return Objects.equals(this.itemId, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.itemId) &&
        Objects.equals(this.supplierId, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.supplierId) &&
        Objects.equals(this.originCountry, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.originCountry) &&
        Objects.equals(this.dimObject, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.dimObject) &&
        Objects.equals(this.objectDesc, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.objectDesc) &&
        Objects.equals(this.methodDesc, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.methodDesc) &&
        Objects.equals(this.length, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.length) &&
        Objects.equals(this.width, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.width) &&
        Objects.equals(this.height, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.height) &&
        Objects.equals(this.lwhUom, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.lwhUom) &&
        Objects.equals(this.weight, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.weight) &&
        Objects.equals(this.netWeight, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.netWeight) &&
        Objects.equals(this.weightUom, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.weightUom) &&
        Objects.equals(this.created, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.created) &&
        Objects.equals(this.modified, wiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, supplierId, originCountry, dimObject, objectDesc, methodDesc, length, width, height, lwhUom, weight, netWeight, weightUom, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleMerchandisingItemsReaderModelsItemsItemSupplierDimension {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    supplierId: ").append(toIndentedString(supplierId)).append("\n");
    sb.append("    originCountry: ").append(toIndentedString(originCountry)).append("\n");
    sb.append("    dimObject: ").append(toIndentedString(dimObject)).append("\n");
    sb.append("    objectDesc: ").append(toIndentedString(objectDesc)).append("\n");
    sb.append("    methodDesc: ").append(toIndentedString(methodDesc)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    lwhUom: ").append(toIndentedString(lwhUom)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    netWeight: ").append(toIndentedString(netWeight)).append("\n");
    sb.append("    weightUom: ").append(toIndentedString(weightUom)).append("\n");
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

