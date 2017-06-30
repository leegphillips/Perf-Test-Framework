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
import io.swagger.client.model.InlineResponse200;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2001
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class InlineResponse2001 {
  @SerializedName("Page")
  private List<InlineResponse200> page = new ArrayList<InlineResponse200>();

  @SerializedName("NextLink")
  private String nextLink = null;

  public InlineResponse2001 page(List<InlineResponse200> page) {
    this.page = page;
    return this;
  }

  public InlineResponse2001 addPageItem(InlineResponse200 pageItem) {
    this.page.add(pageItem);
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse200> getPage() {
    return page;
  }

  public void setPage(List<InlineResponse200> page) {
    this.page = page;
  }

  public InlineResponse2001 nextLink(String nextLink) {
    this.nextLink = nextLink;
    return this;
  }

   /**
   * Get nextLink
   * @return nextLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNextLink() {
    return nextLink;
  }

  public void setNextLink(String nextLink) {
    this.nextLink = nextLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.page, inlineResponse2001.page) &&
        Objects.equals(this.nextLink, inlineResponse2001.nextLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, nextLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    nextLink: ").append(toIndentedString(nextLink)).append("\n");
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
