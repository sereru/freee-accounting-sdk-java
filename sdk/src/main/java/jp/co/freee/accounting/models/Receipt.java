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
import jp.co.freee.accounting.models.DealUser;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Receipt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Receipt {
  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

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
      return null;
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

  public static final String SERIALIZED_NAME_FILE_SRC = "file_src";
  @SerializedName(SERIALIZED_NAME_FILE_SRC)
  private String fileSrc;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INVOICE_REGISTRATION_NUMBER = "invoice_registration_number";
  @SerializedName(SERIALIZED_NAME_INVOICE_REGISTRATION_NUMBER)
  private String invoiceRegistrationNumber;

  public static final String SERIALIZED_NAME_ISSUE_DATE = "issue_date";
  @SerializedName(SERIALIZED_NAME_ISSUE_DATE)
  private String issueDate;

  public static final String SERIALIZED_NAME_MIME_TYPE = "mime_type";
  @SerializedName(SERIALIZED_NAME_MIME_TYPE)
  private String mimeType;

  /**
   * アップロード元種別
   */
  @JsonAdapter(OriginEnum.Adapter.class)
  public enum OriginEnum {
    UNKNOWN("unknown"),
    
    WEB("web"),
    
    MOBILE_CAMERA("mobile_camera"),
    
    MOBILE_ALBUM("mobile_album"),
    
    SCANSNAP("scansnap"),
    
    SCANNABLE("scannable"),
    
    DROPBOX("dropbox"),
    
    MAIL("mail"),
    
    SAFETY_CONTACT_FILE("safety_contact_file"),
    
    PUBLIC_API("public_api");

    private String value;

    OriginEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OriginEnum fromValue(String value) {
      for (OriginEnum b : OriginEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<OriginEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OriginEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OriginEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return OriginEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ORIGIN = "origin";
  @SerializedName(SERIALIZED_NAME_ORIGIN)
  private OriginEnum origin;

  /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない） 
   */
  @JsonAdapter(QualifiedInvoiceEnum.Adapter.class)
  public enum QualifiedInvoiceEnum {
    QUALIFIED("qualified"),
    
    NOT_QUALIFIED("not_qualified");

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
      return null;
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

  /**
   * ステータス(confirmed:確認済み、deleted:削除済み、ignored:無視)
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CONFIRMED("confirmed"),
    
    DELETED("deleted"),
    
    IGNORED("ignored");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private DealUser user;

  public Receipt() { 
  }

  public Receipt createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * 作成日時（ISO8601形式）
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17T18:30:24+09:00", required = true, value = "作成日時（ISO8601形式）")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Receipt description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * メモ
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "タクシー利用", value = "メモ")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Receipt documentType(DocumentTypeEnum documentType) {
    
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


  public Receipt fileSrc(String fileSrc) {
    
    this.fileSrc = fileSrc;
    return this;
  }

   /**
   * ファイルのダウンロードURL（freeeにログインした状態でのみ閲覧可能です。） &lt;br&gt; &lt;br&gt; file_srcは廃止予定の属性になります。&lt;br&gt; file_srcに替わり、証憑ファイルのダウンロード APIをご利用ください。&lt;br&gt; 証憑ファイルのダウンロードAPIを利用することで、以下のようになります。 &lt;ul&gt;   &lt;li&gt;アプリケーション利用者はfreee APIアプリケーションにログインしていれば、証憑ダウンロード毎にfreeeに改めてログインすることなくファイルが参照できるようになります。&lt;/li&gt; &lt;/ul&gt;
   * @return fileSrc
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "https://www.freee.co.jp/api/p/receipts/revisions/1234xxxxx/download", required = true, value = "ファイルのダウンロードURL（freeeにログインした状態でのみ閲覧可能です。） <br> <br> file_srcは廃止予定の属性になります。<br> file_srcに替わり、証憑ファイルのダウンロード APIをご利用ください。<br> 証憑ファイルのダウンロードAPIを利用することで、以下のようになります。 <ul>   <li>アプリケーション利用者はfreee APIアプリケーションにログインしていれば、証憑ダウンロード毎にfreeeに改めてログインすることなくファイルが参照できるようになります。</li> </ul>")

  public String getFileSrc() {
    return fileSrc;
  }


  public void setFileSrc(String fileSrc) {
    this.fileSrc = fileSrc;
  }


  public Receipt id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * ファイルボックス（証憑ファイル）ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "ファイルボックス（証憑ファイル）ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public Receipt invoiceRegistrationNumber(String invoiceRegistrationNumber) {
    
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


  public Receipt issueDate(String issueDate) {
    
    this.issueDate = issueDate;
    return this;
  }

   /**
   * 発生日
   * @return issueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019-12-17", value = "発生日")

  public String getIssueDate() {
    return issueDate;
  }


  public void setIssueDate(String issueDate) {
    this.issueDate = issueDate;
  }


  public Receipt mimeType(String mimeType) {
    
    this.mimeType = mimeType;
    return this;
  }

   /**
   * MIMEタイプ
   * @return mimeType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "image/png", required = true, value = "MIMEタイプ")

  public String getMimeType() {
    return mimeType;
  }


  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }


  public Receipt origin(OriginEnum origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * アップロード元種別
   * @return origin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "public_api", required = true, value = "アップロード元種別")

  public OriginEnum getOrigin() {
    return origin;
  }


  public void setOrigin(OriginEnum origin) {
    this.origin = origin;
  }


  public Receipt qualifiedInvoice(QualifiedInvoiceEnum qualifiedInvoice) {
    
    this.qualifiedInvoice = qualifiedInvoice;
    return this;
  }

   /**
   * この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない） 
   * @return qualifiedInvoice
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "qualified", value = "この項目はインボイス制度で利用する項目です。2023年4月頃から利用できる予定です。 適格請求書等（qualified: 該当する、not_qualified: 該当しない） ")

  public QualifiedInvoiceEnum getQualifiedInvoice() {
    return qualifiedInvoice;
  }


  public void setQualifiedInvoice(QualifiedInvoiceEnum qualifiedInvoice) {
    this.qualifiedInvoice = qualifiedInvoice;
  }


  public Receipt receiptMetadatum(DealReceiptMetadatum receiptMetadatum) {
    
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


  public Receipt status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * ステータス(confirmed:確認済み、deleted:削除済み、ignored:無視)
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "confirmed", required = true, value = "ステータス(confirmed:確認済み、deleted:削除済み、ignored:無視)")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public Receipt user(DealUser user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DealUser getUser() {
    return user;
  }


  public void setUser(DealUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Receipt receipt = (Receipt) o;
    return Objects.equals(this.createdAt, receipt.createdAt) &&
        Objects.equals(this.description, receipt.description) &&
        Objects.equals(this.documentType, receipt.documentType) &&
        Objects.equals(this.fileSrc, receipt.fileSrc) &&
        Objects.equals(this.id, receipt.id) &&
        Objects.equals(this.invoiceRegistrationNumber, receipt.invoiceRegistrationNumber) &&
        Objects.equals(this.issueDate, receipt.issueDate) &&
        Objects.equals(this.mimeType, receipt.mimeType) &&
        Objects.equals(this.origin, receipt.origin) &&
        Objects.equals(this.qualifiedInvoice, receipt.qualifiedInvoice) &&
        Objects.equals(this.receiptMetadatum, receipt.receiptMetadatum) &&
        Objects.equals(this.status, receipt.status) &&
        Objects.equals(this.user, receipt.user);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, documentType, fileSrc, id, invoiceRegistrationNumber, issueDate, mimeType, origin, qualifiedInvoice, receiptMetadatum, status, user);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Receipt {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    fileSrc: ").append(toIndentedString(fileSrc)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoiceRegistrationNumber: ").append(toIndentedString(invoiceRegistrationNumber)).append("\n");
    sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    qualifiedInvoice: ").append(toIndentedString(qualifiedInvoice)).append("\n");
    sb.append("    receiptMetadatum: ").append(toIndentedString(receiptMetadatum)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

