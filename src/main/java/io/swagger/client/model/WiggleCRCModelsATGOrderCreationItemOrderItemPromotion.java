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
 * WiggleCRCModelsATGOrderCreationItemOrderItemPromotion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class WiggleCRCModelsATGOrderCreationItemOrderItemPromotion {
  @SerializedName("ItemPromotionId")
  private String itemPromotionId = null;

  @SerializedName("ItemPromotionName")
  private String itemPromotionName = null;

  public WiggleCRCModelsATGOrderCreationItemOrderItemPromotion itemPromotionId(String itemPromotionId) {
    this.itemPromotionId = itemPromotionId;
    return this;
  }

   /**
   * Get itemPromotionId
   * @return itemPromotionId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getItemPromotionId() {
    return itemPromotionId;
  }

  public void setItemPromotionId(String itemPromotionId) {
    this.itemPromotionId = itemPromotionId;
  }

  public WiggleCRCModelsATGOrderCreationItemOrderItemPromotion itemPromotionName(String itemPromotionName) {
    this.itemPromotionName = itemPromotionName;
    return this;
  }

   /**
   * Get itemPromotionName
   * @return itemPromotionName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getItemPromotionName() {
    return itemPromotionName;
  }

  public void setItemPromotionName(String itemPromotionName) {
    this.itemPromotionName = itemPromotionName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WiggleCRCModelsATGOrderCreationItemOrderItemPromotion wiggleCRCModelsATGOrderCreationItemOrderItemPromotion = (WiggleCRCModelsATGOrderCreationItemOrderItemPromotion) o;
    return Objects.equals(this.itemPromotionId, wiggleCRCModelsATGOrderCreationItemOrderItemPromotion.itemPromotionId) &&
        Objects.equals(this.itemPromotionName, wiggleCRCModelsATGOrderCreationItemOrderItemPromotion.itemPromotionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemPromotionId, itemPromotionName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WiggleCRCModelsATGOrderCreationItemOrderItemPromotion {\n");
    
    sb.append("    itemPromotionId: ").append(toIndentedString(itemPromotionId)).append("\n");
    sb.append("    itemPromotionName: ").append(toIndentedString(itemPromotionName)).append("\n");
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

