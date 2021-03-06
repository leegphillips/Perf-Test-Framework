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
import io.swagger.client.model.InlineResponse2002Item;
import io.swagger.client.model.InlineResponse2002ItemBarcode;
import io.swagger.client.model.InlineResponse2002ItemCountrySupplier;
import io.swagger.client.model.InlineResponse2002ItemDateUDA;
import io.swagger.client.model.InlineResponse2002ItemFreeFormUDA;
import io.swagger.client.model.InlineResponse2002ItemListOfValuesUDA;
import io.swagger.client.model.InlineResponse2002ItemLocationExtension;
import io.swagger.client.model.InlineResponse2002ItemLocationPhysical;
import io.swagger.client.model.InlineResponse2002ItemLocationVirtual;
import io.swagger.client.model.InlineResponse2002ItemPack;
import io.swagger.client.model.InlineResponse2002ItemSupplier;
import io.swagger.client.model.InlineResponse2002ItemSupplierCountryManufacturer;
import io.swagger.client.model.InlineResponse2002ItemSupplierDimension;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * InlineResponse2002Page
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-06-22T10:29:28.037Z")
@Document(collection = "Items")
public class InlineResponse2002Page {

  public Long getItemId() {
    return itemId;
  }

  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }

  @SerializedName("ItemId")
  @Id
  private Long itemId = null;

  @SerializedName("SequenceId")
  private Long sequenceId = null;

  @SerializedName("TimeStamp")
  private Long timeStamp = null;

  @SerializedName("ItemLocationPhysical")
  private List<InlineResponse2002ItemLocationPhysical> itemLocationPhysical = new ArrayList<InlineResponse2002ItemLocationPhysical>();

  @SerializedName("ItemLocationVirtual")
  private List<InlineResponse2002ItemLocationVirtual> itemLocationVirtual = new ArrayList<InlineResponse2002ItemLocationVirtual>();

  @SerializedName("ItemLocationExtension")
  private List<InlineResponse2002ItemLocationExtension> itemLocationExtension = new ArrayList<InlineResponse2002ItemLocationExtension>();

  @SerializedName("Item")
  private InlineResponse2002Item item = null;

  @SerializedName("ItemSupplier")
  private List<InlineResponse2002ItemSupplier> itemSupplier = new ArrayList<InlineResponse2002ItemSupplier>();

  @SerializedName("ItemCountrySupplier")
  private List<InlineResponse2002ItemCountrySupplier> itemCountrySupplier = new ArrayList<InlineResponse2002ItemCountrySupplier>();

  @SerializedName("ItemSupplierDimension")
  private List<InlineResponse2002ItemSupplierDimension> itemSupplierDimension = new ArrayList<InlineResponse2002ItemSupplierDimension>();

  @SerializedName("ItemListOfValuesUDA")
  private List<InlineResponse2002ItemListOfValuesUDA> itemListOfValuesUDA = new ArrayList<InlineResponse2002ItemListOfValuesUDA>();

  @SerializedName("ItemFreeFormUDA")
  private List<InlineResponse2002ItemFreeFormUDA> itemFreeFormUDA = new ArrayList<InlineResponse2002ItemFreeFormUDA>();

  @SerializedName("ItemDateUDA")
  private List<InlineResponse2002ItemDateUDA> itemDateUDA = new ArrayList<InlineResponse2002ItemDateUDA>();

  @SerializedName("ItemBarcode")
  private List<InlineResponse2002ItemBarcode> itemBarcode = new ArrayList<InlineResponse2002ItemBarcode>();

  @SerializedName("ItemPack")
  private List<InlineResponse2002ItemPack> itemPack = new ArrayList<InlineResponse2002ItemPack>();

  @SerializedName("ItemSupplierCountryManufacturer")
  private List<InlineResponse2002ItemSupplierCountryManufacturer> itemSupplierCountryManufacturer = new ArrayList<InlineResponse2002ItemSupplierCountryManufacturer>();

  @SerializedName("Created")
  private DateTime created = null;

  @SerializedName("Modified")
  private DateTime modified = null;

  public InlineResponse2002Page sequenceId(Long sequenceId) {
    this.sequenceId = sequenceId;
    return this;
  }

   /**
   * Get sequenceId
   * @return sequenceId
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getSequenceId() {
    return sequenceId;
  }

  public void setSequenceId(Long sequenceId) {
    this.sequenceId = sequenceId;
  }

  public InlineResponse2002Page timeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Long timeStamp) {
    this.timeStamp = timeStamp;
  }

  public InlineResponse2002Page itemLocationPhysical(List<InlineResponse2002ItemLocationPhysical> itemLocationPhysical) {
    this.itemLocationPhysical = itemLocationPhysical;
    return this;
  }

  public InlineResponse2002Page addItemLocationPhysicalItem(InlineResponse2002ItemLocationPhysical itemLocationPhysicalItem) {
    this.itemLocationPhysical.add(itemLocationPhysicalItem);
    return this;
  }

   /**
   * Get itemLocationPhysical
   * @return itemLocationPhysical
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemLocationPhysical> getItemLocationPhysical() {
    return itemLocationPhysical;
  }

  public void setItemLocationPhysical(List<InlineResponse2002ItemLocationPhysical> itemLocationPhysical) {
    this.itemLocationPhysical = itemLocationPhysical;
  }

  public InlineResponse2002Page itemLocationVirtual(List<InlineResponse2002ItemLocationVirtual> itemLocationVirtual) {
    this.itemLocationVirtual = itemLocationVirtual;
    return this;
  }

  public InlineResponse2002Page addItemLocationVirtualItem(InlineResponse2002ItemLocationVirtual itemLocationVirtualItem) {
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

  public InlineResponse2002Page itemLocationExtension(List<InlineResponse2002ItemLocationExtension> itemLocationExtension) {
    this.itemLocationExtension = itemLocationExtension;
    return this;
  }

  public InlineResponse2002Page addItemLocationExtensionItem(InlineResponse2002ItemLocationExtension itemLocationExtensionItem) {
    this.itemLocationExtension.add(itemLocationExtensionItem);
    return this;
  }

   /**
   * Get itemLocationExtension
   * @return itemLocationExtension
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemLocationExtension> getItemLocationExtension() {
    return itemLocationExtension;
  }

  public void setItemLocationExtension(List<InlineResponse2002ItemLocationExtension> itemLocationExtension) {
    this.itemLocationExtension = itemLocationExtension;
  }

  public InlineResponse2002Page item(InlineResponse2002Item item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2002Item getItem() {
    return item;
  }

  public void setItem(InlineResponse2002Item item) {
    this.item = item;
  }

  public InlineResponse2002Page itemSupplier(List<InlineResponse2002ItemSupplier> itemSupplier) {
    this.itemSupplier = itemSupplier;
    return this;
  }

  public InlineResponse2002Page addItemSupplierItem(InlineResponse2002ItemSupplier itemSupplierItem) {
    this.itemSupplier.add(itemSupplierItem);
    return this;
  }

   /**
   * Get itemSupplier
   * @return itemSupplier
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemSupplier> getItemSupplier() {
    return itemSupplier;
  }

  public void setItemSupplier(List<InlineResponse2002ItemSupplier> itemSupplier) {
    this.itemSupplier = itemSupplier;
  }

  public InlineResponse2002Page itemCountrySupplier(List<InlineResponse2002ItemCountrySupplier> itemCountrySupplier) {
    this.itemCountrySupplier = itemCountrySupplier;
    return this;
  }

  public InlineResponse2002Page addItemCountrySupplierItem(InlineResponse2002ItemCountrySupplier itemCountrySupplierItem) {
    this.itemCountrySupplier.add(itemCountrySupplierItem);
    return this;
  }

   /**
   * Get itemCountrySupplier
   * @return itemCountrySupplier
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemCountrySupplier> getItemCountrySupplier() {
    return itemCountrySupplier;
  }

  public void setItemCountrySupplier(List<InlineResponse2002ItemCountrySupplier> itemCountrySupplier) {
    this.itemCountrySupplier = itemCountrySupplier;
  }

  public InlineResponse2002Page itemSupplierDimension(List<InlineResponse2002ItemSupplierDimension> itemSupplierDimension) {
    this.itemSupplierDimension = itemSupplierDimension;
    return this;
  }

  public InlineResponse2002Page addItemSupplierDimensionItem(InlineResponse2002ItemSupplierDimension itemSupplierDimensionItem) {
    this.itemSupplierDimension.add(itemSupplierDimensionItem);
    return this;
  }

   /**
   * Get itemSupplierDimension
   * @return itemSupplierDimension
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemSupplierDimension> getItemSupplierDimension() {
    return itemSupplierDimension;
  }

  public void setItemSupplierDimension(List<InlineResponse2002ItemSupplierDimension> itemSupplierDimension) {
    this.itemSupplierDimension = itemSupplierDimension;
  }

  public InlineResponse2002Page itemListOfValuesUDA(List<InlineResponse2002ItemListOfValuesUDA> itemListOfValuesUDA) {
    this.itemListOfValuesUDA = itemListOfValuesUDA;
    return this;
  }

  public InlineResponse2002Page addItemListOfValuesUDAItem(InlineResponse2002ItemListOfValuesUDA itemListOfValuesUDAItem) {
    this.itemListOfValuesUDA.add(itemListOfValuesUDAItem);
    return this;
  }

   /**
   * Get itemListOfValuesUDA
   * @return itemListOfValuesUDA
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemListOfValuesUDA> getItemListOfValuesUDA() {
    return itemListOfValuesUDA;
  }

  public void setItemListOfValuesUDA(List<InlineResponse2002ItemListOfValuesUDA> itemListOfValuesUDA) {
    this.itemListOfValuesUDA = itemListOfValuesUDA;
  }

  public InlineResponse2002Page itemFreeFormUDA(List<InlineResponse2002ItemFreeFormUDA> itemFreeFormUDA) {
    this.itemFreeFormUDA = itemFreeFormUDA;
    return this;
  }

  public InlineResponse2002Page addItemFreeFormUDAItem(InlineResponse2002ItemFreeFormUDA itemFreeFormUDAItem) {
    this.itemFreeFormUDA.add(itemFreeFormUDAItem);
    return this;
  }

   /**
   * Get itemFreeFormUDA
   * @return itemFreeFormUDA
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemFreeFormUDA> getItemFreeFormUDA() {
    return itemFreeFormUDA;
  }

  public void setItemFreeFormUDA(List<InlineResponse2002ItemFreeFormUDA> itemFreeFormUDA) {
    this.itemFreeFormUDA = itemFreeFormUDA;
  }

  public InlineResponse2002Page itemDateUDA(List<InlineResponse2002ItemDateUDA> itemDateUDA) {
    this.itemDateUDA = itemDateUDA;
    return this;
  }

  public InlineResponse2002Page addItemDateUDAItem(InlineResponse2002ItemDateUDA itemDateUDAItem) {
    this.itemDateUDA.add(itemDateUDAItem);
    return this;
  }

   /**
   * Get itemDateUDA
   * @return itemDateUDA
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemDateUDA> getItemDateUDA() {
    return itemDateUDA;
  }

  public void setItemDateUDA(List<InlineResponse2002ItemDateUDA> itemDateUDA) {
    this.itemDateUDA = itemDateUDA;
  }

  public InlineResponse2002Page itemBarcode(List<InlineResponse2002ItemBarcode> itemBarcode) {
    this.itemBarcode = itemBarcode;
    return this;
  }

  public InlineResponse2002Page addItemBarcodeItem(InlineResponse2002ItemBarcode itemBarcodeItem) {
    this.itemBarcode.add(itemBarcodeItem);
    return this;
  }

   /**
   * Get itemBarcode
   * @return itemBarcode
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemBarcode> getItemBarcode() {
    return itemBarcode;
  }

  public void setItemBarcode(List<InlineResponse2002ItemBarcode> itemBarcode) {
    this.itemBarcode = itemBarcode;
  }

  public InlineResponse2002Page itemPack(List<InlineResponse2002ItemPack> itemPack) {
    this.itemPack = itemPack;
    return this;
  }

  public InlineResponse2002Page addItemPackItem(InlineResponse2002ItemPack itemPackItem) {
    this.itemPack.add(itemPackItem);
    return this;
  }

   /**
   * Get itemPack
   * @return itemPack
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemPack> getItemPack() {
    return itemPack;
  }

  public void setItemPack(List<InlineResponse2002ItemPack> itemPack) {
    this.itemPack = itemPack;
  }

  public InlineResponse2002Page itemSupplierCountryManufacturer(List<InlineResponse2002ItemSupplierCountryManufacturer> itemSupplierCountryManufacturer) {
    this.itemSupplierCountryManufacturer = itemSupplierCountryManufacturer;
    return this;
  }

  public InlineResponse2002Page addItemSupplierCountryManufacturerItem(InlineResponse2002ItemSupplierCountryManufacturer itemSupplierCountryManufacturerItem) {
    this.itemSupplierCountryManufacturer.add(itemSupplierCountryManufacturerItem);
    return this;
  }

   /**
   * Get itemSupplierCountryManufacturer
   * @return itemSupplierCountryManufacturer
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2002ItemSupplierCountryManufacturer> getItemSupplierCountryManufacturer() {
    return itemSupplierCountryManufacturer;
  }

  public void setItemSupplierCountryManufacturer(List<InlineResponse2002ItemSupplierCountryManufacturer> itemSupplierCountryManufacturer) {
    this.itemSupplierCountryManufacturer = itemSupplierCountryManufacturer;
  }

  public InlineResponse2002Page created(DateTime created) {
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

  public InlineResponse2002Page modified(DateTime modified) {
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
    InlineResponse2002Page inlineResponse2002Page = (InlineResponse2002Page) o;
    return Objects.equals(this.sequenceId, inlineResponse2002Page.sequenceId) &&
        Objects.equals(this.timeStamp, inlineResponse2002Page.timeStamp) &&
        Objects.equals(this.itemLocationPhysical, inlineResponse2002Page.itemLocationPhysical) &&
        Objects.equals(this.itemLocationVirtual, inlineResponse2002Page.itemLocationVirtual) &&
        Objects.equals(this.itemLocationExtension, inlineResponse2002Page.itemLocationExtension) &&
        Objects.equals(this.item, inlineResponse2002Page.item) &&
        Objects.equals(this.itemSupplier, inlineResponse2002Page.itemSupplier) &&
        Objects.equals(this.itemCountrySupplier, inlineResponse2002Page.itemCountrySupplier) &&
        Objects.equals(this.itemSupplierDimension, inlineResponse2002Page.itemSupplierDimension) &&
        Objects.equals(this.itemListOfValuesUDA, inlineResponse2002Page.itemListOfValuesUDA) &&
        Objects.equals(this.itemFreeFormUDA, inlineResponse2002Page.itemFreeFormUDA) &&
        Objects.equals(this.itemDateUDA, inlineResponse2002Page.itemDateUDA) &&
        Objects.equals(this.itemBarcode, inlineResponse2002Page.itemBarcode) &&
        Objects.equals(this.itemPack, inlineResponse2002Page.itemPack) &&
        Objects.equals(this.itemSupplierCountryManufacturer, inlineResponse2002Page.itemSupplierCountryManufacturer) &&
        Objects.equals(this.created, inlineResponse2002Page.created) &&
        Objects.equals(this.modified, inlineResponse2002Page.modified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequenceId, timeStamp, itemLocationPhysical, itemLocationVirtual, itemLocationExtension, item, itemSupplier, itemCountrySupplier, itemSupplierDimension, itemListOfValuesUDA, itemFreeFormUDA, itemDateUDA, itemBarcode, itemPack, itemSupplierCountryManufacturer, created, modified);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Page {\n");
    
    sb.append("    sequenceId: ").append(toIndentedString(sequenceId)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    itemLocationPhysical: ").append(toIndentedString(itemLocationPhysical)).append("\n");
    sb.append("    itemLocationVirtual: ").append(toIndentedString(itemLocationVirtual)).append("\n");
    sb.append("    itemLocationExtension: ").append(toIndentedString(itemLocationExtension)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemSupplier: ").append(toIndentedString(itemSupplier)).append("\n");
    sb.append("    itemCountrySupplier: ").append(toIndentedString(itemCountrySupplier)).append("\n");
    sb.append("    itemSupplierDimension: ").append(toIndentedString(itemSupplierDimension)).append("\n");
    sb.append("    itemListOfValuesUDA: ").append(toIndentedString(itemListOfValuesUDA)).append("\n");
    sb.append("    itemFreeFormUDA: ").append(toIndentedString(itemFreeFormUDA)).append("\n");
    sb.append("    itemDateUDA: ").append(toIndentedString(itemDateUDA)).append("\n");
    sb.append("    itemBarcode: ").append(toIndentedString(itemBarcode)).append("\n");
    sb.append("    itemPack: ").append(toIndentedString(itemPack)).append("\n");
    sb.append("    itemSupplierCountryManufacturer: ").append(toIndentedString(itemSupplierCountryManufacturer)).append("\n");
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

