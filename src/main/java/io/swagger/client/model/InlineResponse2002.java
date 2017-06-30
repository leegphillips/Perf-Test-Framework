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
import io.swagger.client.model.InlineResponse2002Page;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2002
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
public class InlineResponse2002 {
  @SerializedName("Page")
  private List<InlineResponse2002Page> page = new ArrayList<InlineResponse2002Page>();

  @SerializedName("NextLink")
  private String nextLink = null;

  public InlineResponse2002 page(List<InlineResponse2002Page> page) {
    this.page = page;
    return this;
  }

  public InlineResponse2002 addPageItem(InlineResponse2002Page pageItem) {
    this.page.add(pageItem);
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002Page> getPage() {
    return page;
  }

  public void setPage(List<InlineResponse2002Page> page) {
    this.page = page;
  }

  public InlineResponse2002 nextLink(String nextLink) {
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
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.page, inlineResponse2002.page) &&
        Objects.equals(this.nextLink, inlineResponse2002.nextLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, nextLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
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

