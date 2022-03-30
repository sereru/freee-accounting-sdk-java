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
import jp.co.freee.accounting.models.PartnerResponsePartnerAddressAttributes;
import jp.co.freee.accounting.models.PartnerResponsePartnerInvoicePaymentTermAttributes;
import jp.co.freee.accounting.models.PartnerResponsePartnerPartnerBankAccountAttributes;
import jp.co.freee.accounting.models.PartnerResponsePartnerPartnerDocSettingAttributes;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * PartnerResponsePartner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PartnerResponsePartner {
  public static final String SERIALIZED_NAME_ADDRESS_ATTRIBUTES = "address_attributes";
  @SerializedName(SERIALIZED_NAME_ADDRESS_ATTRIBUTES)
  private PartnerResponsePartnerAddressAttributes addressAttributes;

  public static final String SERIALIZED_NAME_AVAILABLE = "available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_COMPANY_ID = "company_id";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private Integer companyId;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName;

  public static final String SERIALIZED_NAME_COUNTRY_CODE = "country_code";
  @SerializedName(SERIALIZED_NAME_COUNTRY_CODE)
  private String countryCode;

  public static final String SERIALIZED_NAME_DEFAULT_TITLE = "default_title";
  @SerializedName(SERIALIZED_NAME_DEFAULT_TITLE)
  private String defaultTitle;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_INVOICE_PAYMENT_TERM_ATTRIBUTES = "invoice_payment_term_attributes";
  @SerializedName(SERIALIZED_NAME_INVOICE_PAYMENT_TERM_ATTRIBUTES)
  private PartnerResponsePartnerInvoicePaymentTermAttributes invoicePaymentTermAttributes;

  public static final String SERIALIZED_NAME_LONG_NAME = "long_name";
  @SerializedName(SERIALIZED_NAME_LONG_NAME)
  private String longName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAME_KANA = "name_kana";
  @SerializedName(SERIALIZED_NAME_NAME_KANA)
  private String nameKana;

  public static final String SERIALIZED_NAME_ORG_CODE = "org_code";
  @SerializedName(SERIALIZED_NAME_ORG_CODE)
  private Integer orgCode;

  public static final String SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES = "partner_bank_account_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_BANK_ACCOUNT_ATTRIBUTES)
  private PartnerResponsePartnerPartnerBankAccountAttributes partnerBankAccountAttributes;

  public static final String SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES = "partner_doc_setting_attributes";
  @SerializedName(SERIALIZED_NAME_PARTNER_DOC_SETTING_ATTRIBUTES)
  private PartnerResponsePartnerPartnerDocSettingAttributes partnerDocSettingAttributes;

  public static final String SERIALIZED_NAME_PAYER_WALLETABLE_ID = "payer_walletable_id";
  @SerializedName(SERIALIZED_NAME_PAYER_WALLETABLE_ID)
  private Integer payerWalletableId;

  public static final String SERIALIZED_NAME_PAYMENT_TERM_ATTRIBUTES = "payment_term_attributes";
  @SerializedName(SERIALIZED_NAME_PAYMENT_TERM_ATTRIBUTES)
  private PartnerResponsePartnerInvoicePaymentTermAttributes paymentTermAttributes;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_SHORTCUT1 = "shortcut1";
  @SerializedName(SERIALIZED_NAME_SHORTCUT1)
  private String shortcut1;

  public static final String SERIALIZED_NAME_SHORTCUT2 = "shortcut2";
  @SerializedName(SERIALIZED_NAME_SHORTCUT2)
  private String shortcut2;

  /**
   * 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)
   */
  @JsonAdapter(TransferFeeHandlingSideEnum.Adapter.class)
  public enum TransferFeeHandlingSideEnum {
    PAYER("payer"),
    
    PAYEE("payee");

    private String value;

    TransferFeeHandlingSideEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransferFeeHandlingSideEnum fromValue(String value) {
      for (TransferFeeHandlingSideEnum b : TransferFeeHandlingSideEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransferFeeHandlingSideEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransferFeeHandlingSideEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransferFeeHandlingSideEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransferFeeHandlingSideEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSFER_FEE_HANDLING_SIDE = "transfer_fee_handling_side";
  @SerializedName(SERIALIZED_NAME_TRANSFER_FEE_HANDLING_SIDE)
  private TransferFeeHandlingSideEnum transferFeeHandlingSide;

  public static final String SERIALIZED_NAME_UPDATE_DATE = "update_date";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATE)
  private String updateDate;

  public PartnerResponsePartner() { 
  }

  public PartnerResponsePartner addressAttributes(PartnerResponsePartnerAddressAttributes addressAttributes) {
    
    this.addressAttributes = addressAttributes;
    return this;
  }

   /**
   * Get addressAttributes
   * @return addressAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerResponsePartnerAddressAttributes getAddressAttributes() {
    return addressAttributes;
  }


  public void setAddressAttributes(PartnerResponsePartnerAddressAttributes addressAttributes) {
    this.addressAttributes = addressAttributes;
  }


  public PartnerResponsePartner available(Boolean available) {
    
    this.available = available;
    return this;
  }

   /**
   * 取引先の使用設定（true: 使用する、false: 使用しない） &lt;br&gt; &lt;ul&gt;   &lt;li&gt;     本APIでpartnerを作成した場合はtrueになります。   &lt;/li&gt;   &lt;li&gt;     falseにする場合はWeb画面から変更できます。   &lt;/li&gt;   &lt;li&gt;     trueの場合、Web画面での取引登録時などに入力候補として表示されます。   &lt;/li&gt;   &lt;li&gt;     falseの場合、取引先自体は削除せず、Web画面での取引登録時などに入力候補として表示されません。ただし取引（収入／支出）の作成APIなどでfalseの取引先をパラメータに指定すれば、取引などにfalseの取引先を設定できます。   &lt;/li&gt; &lt;/ul&gt;
   * @return available
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "取引先の使用設定（true: 使用する、false: 使用しない） <br> <ul>   <li>     本APIでpartnerを作成した場合はtrueになります。   </li>   <li>     falseにする場合はWeb画面から変更できます。   </li>   <li>     trueの場合、Web画面での取引登録時などに入力候補として表示されます。   </li>   <li>     falseの場合、取引先自体は削除せず、Web画面での取引登録時などに入力候補として表示されません。ただし取引（収入／支出）の作成APIなどでfalseの取引先をパラメータに指定すれば、取引などにfalseの取引先を設定できます。   </li> </ul>")

  public Boolean getAvailable() {
    return available;
  }


  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public PartnerResponsePartner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 取引先コード
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "code001", required = true, value = "取引先コード")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public PartnerResponsePartner companyId(Integer companyId) {
    
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


  public PartnerResponsePartner contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 担当者 氏名
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "営業担当", value = "担当者 氏名")

  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public PartnerResponsePartner countryCode(String countryCode) {
    
    this.countryCode = countryCode;
    return this;
  }

   /**
   * 地域（JP: 国内、ZZ:国外）
   * @return countryCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "JP", value = "地域（JP: 国内、ZZ:国外）")

  public String getCountryCode() {
    return countryCode;
  }


  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }


  public PartnerResponsePartner defaultTitle(String defaultTitle) {
    
    this.defaultTitle = defaultTitle;
    return this;
  }

   /**
   * 敬称（御中、様、(空白)の3つから選択）
   * @return defaultTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "御中", value = "敬称（御中、様、(空白)の3つから選択）")

  public String getDefaultTitle() {
    return defaultTitle;
  }


  public void setDefaultTitle(String defaultTitle) {
    this.defaultTitle = defaultTitle;
  }


  public PartnerResponsePartner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 担当者 メールアドレス
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "contact@example.com", value = "担当者 メールアドレス")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public PartnerResponsePartner id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * 取引先ID
   * minimum: 1
   * maximum: 2147483647
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "取引先ID")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PartnerResponsePartner invoicePaymentTermAttributes(PartnerResponsePartnerInvoicePaymentTermAttributes invoicePaymentTermAttributes) {
    
    this.invoicePaymentTermAttributes = invoicePaymentTermAttributes;
    return this;
  }

   /**
   * Get invoicePaymentTermAttributes
   * @return invoicePaymentTermAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerResponsePartnerInvoicePaymentTermAttributes getInvoicePaymentTermAttributes() {
    return invoicePaymentTermAttributes;
  }


  public void setInvoicePaymentTermAttributes(PartnerResponsePartnerInvoicePaymentTermAttributes invoicePaymentTermAttributes) {
    this.invoicePaymentTermAttributes = invoicePaymentTermAttributes;
  }


  public PartnerResponsePartner longName(String longName) {
    
    this.longName = longName;
    return this;
  }

   /**
   * 正式名称（255文字以内）
   * @return longName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "新しい取引先正式名称", value = "正式名称（255文字以内）")

  public String getLongName() {
    return longName;
  }


  public void setLongName(String longName) {
    this.longName = longName;
  }


  public PartnerResponsePartner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 取引先名
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ABC商店", required = true, value = "取引先名")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PartnerResponsePartner nameKana(String nameKana) {
    
    this.nameKana = nameKana;
    return this;
  }

   /**
   * カナ名称（255文字以内）
   * @return nameKana
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "アタラシイトリヒキサキメイショウ", value = "カナ名称（255文字以内）")

  public String getNameKana() {
    return nameKana;
  }


  public void setNameKana(String nameKana) {
    this.nameKana = nameKana;
  }


  public PartnerResponsePartner orgCode(Integer orgCode) {
    
    this.orgCode = orgCode;
    return this;
  }

   /**
   * 事業所種別（null: 未設定、1: 法人、2: 個人）
   * minimum: 1
   * maximum: 2
   * @return orgCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "事業所種別（null: 未設定、1: 法人、2: 個人）")

  public Integer getOrgCode() {
    return orgCode;
  }


  public void setOrgCode(Integer orgCode) {
    this.orgCode = orgCode;
  }


  public PartnerResponsePartner partnerBankAccountAttributes(PartnerResponsePartnerPartnerBankAccountAttributes partnerBankAccountAttributes) {
    
    this.partnerBankAccountAttributes = partnerBankAccountAttributes;
    return this;
  }

   /**
   * Get partnerBankAccountAttributes
   * @return partnerBankAccountAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerResponsePartnerPartnerBankAccountAttributes getPartnerBankAccountAttributes() {
    return partnerBankAccountAttributes;
  }


  public void setPartnerBankAccountAttributes(PartnerResponsePartnerPartnerBankAccountAttributes partnerBankAccountAttributes) {
    this.partnerBankAccountAttributes = partnerBankAccountAttributes;
  }


  public PartnerResponsePartner partnerDocSettingAttributes(PartnerResponsePartnerPartnerDocSettingAttributes partnerDocSettingAttributes) {
    
    this.partnerDocSettingAttributes = partnerDocSettingAttributes;
    return this;
  }

   /**
   * Get partnerDocSettingAttributes
   * @return partnerDocSettingAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerResponsePartnerPartnerDocSettingAttributes getPartnerDocSettingAttributes() {
    return partnerDocSettingAttributes;
  }


  public void setPartnerDocSettingAttributes(PartnerResponsePartnerPartnerDocSettingAttributes partnerDocSettingAttributes) {
    this.partnerDocSettingAttributes = partnerDocSettingAttributes;
  }


  public PartnerResponsePartner payerWalletableId(Integer payerWalletableId) {
    
    this.payerWalletableId = payerWalletableId;
    return this;
  }

   /**
   * 振込元口座ID（一括振込ファイル用）:（未設定の場合は、nullです。）
   * minimum: 1
   * maximum: 2147483647
   * @return payerWalletableId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "振込元口座ID（一括振込ファイル用）:（未設定の場合は、nullです。）")

  public Integer getPayerWalletableId() {
    return payerWalletableId;
  }


  public void setPayerWalletableId(Integer payerWalletableId) {
    this.payerWalletableId = payerWalletableId;
  }


  public PartnerResponsePartner paymentTermAttributes(PartnerResponsePartnerInvoicePaymentTermAttributes paymentTermAttributes) {
    
    this.paymentTermAttributes = paymentTermAttributes;
    return this;
  }

   /**
   * Get paymentTermAttributes
   * @return paymentTermAttributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PartnerResponsePartnerInvoicePaymentTermAttributes getPaymentTermAttributes() {
    return paymentTermAttributes;
  }


  public void setPaymentTermAttributes(PartnerResponsePartnerInvoicePaymentTermAttributes paymentTermAttributes) {
    this.paymentTermAttributes = paymentTermAttributes;
  }


  public PartnerResponsePartner phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 電話番号
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "03-1234-xxxx", value = "電話番号")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public PartnerResponsePartner shortcut1(String shortcut1) {
    
    this.shortcut1 = shortcut1;
    return this;
  }

   /**
   * ショートカット1 (255文字以内)
   * @return shortcut1
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ABC", value = "ショートカット1 (255文字以内)")

  public String getShortcut1() {
    return shortcut1;
  }


  public void setShortcut1(String shortcut1) {
    this.shortcut1 = shortcut1;
  }


  public PartnerResponsePartner shortcut2(String shortcut2) {
    
    this.shortcut2 = shortcut2;
    return this;
  }

   /**
   * ショートカット2 (255文字以内)
   * @return shortcut2
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "501", value = "ショートカット2 (255文字以内)")

  public String getShortcut2() {
    return shortcut2;
  }


  public void setShortcut2(String shortcut2) {
    this.shortcut2 = shortcut2;
  }


  public PartnerResponsePartner transferFeeHandlingSide(TransferFeeHandlingSideEnum transferFeeHandlingSide) {
    
    this.transferFeeHandlingSide = transferFeeHandlingSide;
    return this;
  }

   /**
   * 振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)
   * @return transferFeeHandlingSide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "payer", value = "振込手数料負担（一括振込ファイル用）: (振込元(当方): payer, 振込先(先方): payee)")

  public TransferFeeHandlingSideEnum getTransferFeeHandlingSide() {
    return transferFeeHandlingSide;
  }


  public void setTransferFeeHandlingSide(TransferFeeHandlingSideEnum transferFeeHandlingSide) {
    this.transferFeeHandlingSide = transferFeeHandlingSide;
  }


  public PartnerResponsePartner updateDate(String updateDate) {
    
    this.updateDate = updateDate;
    return this;
  }

   /**
   * 更新日 (yyyy-mm-dd)
   * @return updateDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "2019-12-17", required = true, value = "更新日 (yyyy-mm-dd)")

  public String getUpdateDate() {
    return updateDate;
  }


  public void setUpdateDate(String updateDate) {
    this.updateDate = updateDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerResponsePartner partnerResponsePartner = (PartnerResponsePartner) o;
    return Objects.equals(this.addressAttributes, partnerResponsePartner.addressAttributes) &&
        Objects.equals(this.available, partnerResponsePartner.available) &&
        Objects.equals(this.code, partnerResponsePartner.code) &&
        Objects.equals(this.companyId, partnerResponsePartner.companyId) &&
        Objects.equals(this.contactName, partnerResponsePartner.contactName) &&
        Objects.equals(this.countryCode, partnerResponsePartner.countryCode) &&
        Objects.equals(this.defaultTitle, partnerResponsePartner.defaultTitle) &&
        Objects.equals(this.email, partnerResponsePartner.email) &&
        Objects.equals(this.id, partnerResponsePartner.id) &&
        Objects.equals(this.invoicePaymentTermAttributes, partnerResponsePartner.invoicePaymentTermAttributes) &&
        Objects.equals(this.longName, partnerResponsePartner.longName) &&
        Objects.equals(this.name, partnerResponsePartner.name) &&
        Objects.equals(this.nameKana, partnerResponsePartner.nameKana) &&
        Objects.equals(this.orgCode, partnerResponsePartner.orgCode) &&
        Objects.equals(this.partnerBankAccountAttributes, partnerResponsePartner.partnerBankAccountAttributes) &&
        Objects.equals(this.partnerDocSettingAttributes, partnerResponsePartner.partnerDocSettingAttributes) &&
        Objects.equals(this.payerWalletableId, partnerResponsePartner.payerWalletableId) &&
        Objects.equals(this.paymentTermAttributes, partnerResponsePartner.paymentTermAttributes) &&
        Objects.equals(this.phone, partnerResponsePartner.phone) &&
        Objects.equals(this.shortcut1, partnerResponsePartner.shortcut1) &&
        Objects.equals(this.shortcut2, partnerResponsePartner.shortcut2) &&
        Objects.equals(this.transferFeeHandlingSide, partnerResponsePartner.transferFeeHandlingSide) &&
        Objects.equals(this.updateDate, partnerResponsePartner.updateDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressAttributes, available, code, companyId, contactName, countryCode, defaultTitle, email, id, invoicePaymentTermAttributes, longName, name, nameKana, orgCode, partnerBankAccountAttributes, partnerDocSettingAttributes, payerWalletableId, paymentTermAttributes, phone, shortcut1, shortcut2, transferFeeHandlingSide, updateDate);
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
    sb.append("class PartnerResponsePartner {\n");
    sb.append("    addressAttributes: ").append(toIndentedString(addressAttributes)).append("\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    defaultTitle: ").append(toIndentedString(defaultTitle)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invoicePaymentTermAttributes: ").append(toIndentedString(invoicePaymentTermAttributes)).append("\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameKana: ").append(toIndentedString(nameKana)).append("\n");
    sb.append("    orgCode: ").append(toIndentedString(orgCode)).append("\n");
    sb.append("    partnerBankAccountAttributes: ").append(toIndentedString(partnerBankAccountAttributes)).append("\n");
    sb.append("    partnerDocSettingAttributes: ").append(toIndentedString(partnerDocSettingAttributes)).append("\n");
    sb.append("    payerWalletableId: ").append(toIndentedString(payerWalletableId)).append("\n");
    sb.append("    paymentTermAttributes: ").append(toIndentedString(paymentTermAttributes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    shortcut1: ").append(toIndentedString(shortcut1)).append("\n");
    sb.append("    shortcut2: ").append(toIndentedString(shortcut2)).append("\n");
    sb.append("    transferFeeHandlingSide: ").append(toIndentedString(transferFeeHandlingSide)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
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

