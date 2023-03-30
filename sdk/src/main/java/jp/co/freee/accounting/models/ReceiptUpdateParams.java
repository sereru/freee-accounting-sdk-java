/*
 * freee API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package jp.co.freee.accounting.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import jp.co.freee.accounting.models.DealReceiptMetadatum;

/**
 * ReceiptUpdateParams
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ReceiptUpdateParams {
  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他） 
   */
  @JsonAdapter(DocumentTypeEnum.Adapter.class)
  public enum DocumentTypeEnum {
    RECEIPT("receipt"),
    
    INVOICE("invoice"),
    
    OTHER("other");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentTypeEnum fromValue(String value) {
      for (DocumentTypeEnum b : DocumentTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocumentTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocumentTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DOCUMENT_TYPE = "document_type";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_TYPE)
  private DocumentTypeEnum documentType;

  public static final String SERIALIZED_NAME_INVOICE_REGISTRATION_NUMBER = "invoice_registration_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_REGISTRATION_NUMBER)
  private String invoiceRegistrationNumber;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない、unselected: 未選択） 
   */
  @JsonAdapter(QualifiedInvoiceEnum.Adapter.class)
  public enum QualifiedInvoiceEnum {
    QUALIFIED("qualified"),
    
    NOT_QUALIFIED("not_qualified"),
    
    UNSELECTED("unselected");

    private String value;

    QualifiedInvoiceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static QualifiedInvoiceEnum fromValue(String value) {
      for (QualifiedInvoiceEnum b : QualifiedInvoiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<QualifiedInvoiceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final QualifiedInvoiceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public QualifiedInvoiceEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return QualifiedInvoiceEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_QUALIFIED_INVOICE = "qualified_invoice";
  @SerializedName(SERIALIZED_NAME_QUALIFIED_INVOICE)
  private QualifiedInvoiceEnum qualifiedInvoice;

  public static final String SERIALIZED_NAME_RECEIPT_METADATUM = "receipt_metadatum";
  @SerializedName(SERIALIZED_NAME_RECEIPT_METADATUM)
  private DealReceiptMetadatum receiptMetadatum;

  public ReceiptUpdateParams() { 
  }

  public ReceiptUpdateParams companyId(Integer companyId) {
    
    this.companyId = companyId;
    return this;
  }

   /**
   * 事業所ID
   * minimum: 1
   * maximum: 2147483647
   * @return companyId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "事業所ID")

  public Integer getCompanyId() {
    return companyId;
  }


  public void setCompanyId(Integer companyId) {
    this.companyId = companyId;
  }


  public ReceiptUpdateParams description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * メモ (255文字以内)
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "メモ", value = "メモ (255文字以内)")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ReceiptUpdateParams documentType(DocumentTypeEnum documentType) {
    
    this.documentType = documentType;
    return this;
  }

   /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他） 
   * @return documentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "receipt", value = "この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 書類の種類（receipt: 領収書、invoice: 請求書、other: その他） ")

  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }


  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  public ReceiptUpdateParams invoiceRegistrationNumber(String invoiceRegistrationNumber) {
    
    this.invoiceRegistrationNumber = invoiceRegistrationNumber;
    return this;
  }

   /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 インボイス制度適格請求書発行事業者登録番号 - 先頭T数字13桁の固定14桁の文字列 &lt;a target&#x3D;\&quot;_blank\&quot; href&#x3D;\&quot;https://www.invoice-kohyo.nta.go.jp/index.html\&quot;&gt;国税庁インボイス制度適格請求書発行事業者公表サイト&lt;/a&gt; 
   * @return invoiceRegistrationNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T1000000000001", value = "この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 インボイス制度適格請求書発行事業者登録番号 - 先頭T数字13桁の固定14桁の文字列 <a target=\"_blank\" href=\"https://www.invoice-kohyo.nta.go.jp/index.html\">国税庁インボイス制度適格請求書発行事業者公表サイト</a> ")

  public String getInvoiceRegistrationNumber() {
    return invoiceRegistrationNumber;
  }


  public void setInvoiceRegistrationNumber(String invoiceRegistrationNumber) {
    this.invoiceRegistrationNumber = invoiceRegistrationNumber;
  }


  public ReceiptUpdateParams issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 取引日 (yyyy-mm-dd)
   * @return issueDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "取引日 (yyyy-mm-dd)")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public ReceiptUpdateParams qualifiedInvoice(QualifiedInvoiceEnum qualifiedInvoice) {
    
    this.qualifiedInvoice = qualifiedInvoice;
    return this;
  }

   /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない、unselected: 未選択） 
   * @return qualifiedInvoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qualified", value = "この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない、unselected: 未選択） ")

  public QualifiedInvoiceEnum getQualifiedInvoice() {
    return qualifiedInvoice;
  }


  public void setQualifiedInvoice(QualifiedInvoiceEnum qualifiedInvoice) {
    this.qualifiedInvoice = qualifiedInvoice;
  }


  public ReceiptUpdateParams receiptMetadatum(DealReceiptMetadatum receiptMetadatum) {
    
    this.receiptMetadatum = receiptMetadatum;
    return this;
  }

   /**
   * Get receiptMetadatum
   * @return receiptMetadatum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DealReceiptMetadatum getReceiptMetadatum() {
    return receiptMetadatum;
  }


  public void setReceiptMetadatum(DealReceiptMetadatum receiptMetadatum) {
    this.receiptMetadatum = receiptMetadatum;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptUpdateParams receiptUpdateParams = (ReceiptUpdateParams) o;
    return Objects.equals(this.companyId, receiptUpdateParams.companyId) &&
        Objects.equals(this.description, receiptUpdateParams.description) &&
        Objects.equals(this.documentType, receiptUpdateParams.documentType) &&
        Objects.equals(this.invoiceRegistrationNumber, receiptUpdateParams.invoiceRegistrationNumber) &&
        Objects.equals(this.issueDate, receiptUpdateParams.issueDate) &&
        Objects.equals(this.qualifiedInvoice, receiptUpdateParams.qualifiedInvoice) &&
        Objects.equals(this.receiptMetadatum, receiptUpdateParams.receiptMetadatum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyId, description, documentType, invoiceRegistrationNumber, issueDate, qualifiedInvoice, receiptMetadatum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptUpdateParams {\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    invoiceRegistrationNumber: ").append(toIndentedString(invoiceRegistrationNumber)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    qualifiedInvoice: ").append(toIndentedString(qualifiedInvoice)).append("\n");
    sb.append("    receiptMetadatum: ").append(toIndentedString(receiptMetadatum)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

