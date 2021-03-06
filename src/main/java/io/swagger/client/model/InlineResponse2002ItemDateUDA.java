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
 * InlineResponse2002ItemDateUDA
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class InlineResponse2002ItemDateUDA {
  @SerializedName("ItemId")
  private String itemId = null;

  @SerializedName("UdaId")
  private Long udaId = null;

  @SerializedName("UdaDate")
  private DateTime udaDate = null;

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public InlineResponse2002ItemDateUDA itemId(String itemId) {
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

  public InlineResponse2002ItemDateUDA udaId(Long udaId) {
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

  public InlineResponse2002ItemDateUDA udaDate(DateTime udaDate) {
    this.udaDate = udaDate;
    return this;
  }

   /**
   * Get udaDate
   * @return udaDate
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public DateTime getUdaDate() {
    return udaDate;
  }

  public void setUdaDate(DateTime udaDate) {
    this.udaDate = udaDate;
  }

  public InlineResponse2002ItemDateUDA created(DateTime created) {
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

  public InlineResponse2002ItemDateUDA modified(DateTime modified) {
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
    InlineResponse2002ItemDateUDA inlineResponse2002ItemDateUDA = (InlineResponse2002ItemDateUDA) o;
    return Objects.equals(this.itemId, inlineResponse2002ItemDateUDA.itemId) &&
        Objects.equals(this.udaId, inlineResponse2002ItemDateUDA.udaId) &&
        Objects.equals(this.udaDate, inlineResponse2002ItemDateUDA.udaDate) &&
        Objects.equals(this.created, inlineResponse2002ItemDateUDA.created) &&
        Objects.equals(this.modified, inlineResponse2002ItemDateUDA.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, udaId, udaDate, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002ItemDateUDA {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    udaId: ").append(toIndentedString(udaId)).append("\n");
    sb.append("    udaDate: ").append(toIndentedString(udaDate)).append("\n");
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

