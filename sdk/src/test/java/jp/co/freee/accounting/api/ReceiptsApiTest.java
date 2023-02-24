package jp.co.freee.accounting.api;

import jp.co.freee.accounting.ApiClient;
import jp.co.freee.accounting.models.BadRequestError;
import jp.co.freee.accounting.models.BadRequestNotFoundError;
import java.io.File;
import jp.co.freee.accounting.models.ForbiddenError;
import jp.co.freee.accounting.models.InlineResponse2005;
import jp.co.freee.accounting.models.InternalServerError;
import jp.co.freee.accounting.models.ReceiptResponse;
import jp.co.freee.accounting.models.ReceiptUpdateParams;
import jp.co.freee.accounting.models.UnauthorizedError;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReceiptsApi
 */
public class ReceiptsApiTest {

    private ReceiptsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ReceiptsApi.class);
    }

    /**
     * ファイルボックス（証憑ファイル）のアップロード
     *
     * 
     */
    @Test
    public void createReceiptTest() {
        Integer companyId = null;
        File receipt = null;
        String description = null;
        String documentType = null;
        String issueDate = null;
        String qualifiedInvoice = null;
        Long receiptMetadatumAmount = null;
        String receiptMetadatumIssueDate = null;
        String receiptMetadatumPartnerName = null;
        // ReceiptResponse response = api.createReceipt(companyId, receipt, description, documentType, issueDate, qualifiedInvoice, receiptMetadatumAmount, receiptMetadatumIssueDate, receiptMetadatumPartnerName);

        // TODO: test validations
    }
    /**
     * ファイルボックス（証憑ファイル）の削除
     *
     * 
     */
    @Test
    public void destroyReceiptTest() {
        Integer id = null;
        Integer companyId = null;
        // api.destroyReceipt(id, companyId);

        // TODO: test validations
    }
    /**
     * ファイルボックス（証憑ファイル）のダウンロード
     *
     * 
     */
    @Test
    public void downloadReceiptTest() {
        Integer id = null;
        Integer companyId = null;
        // File response = api.downloadReceipt(id, companyId);

        // TODO: test validations
    }
    /**
     * ファイルボックス（証憑ファイル）の取得
     *
     * 
     */
    @Test
    public void getReceiptTest() {
        Integer id = null;
        Integer companyId = null;
        // ReceiptResponse response = api.getReceipt(id, companyId);

        // TODO: test validations
    }
    /**
     * ファイルボックス（証憑ファイル）一覧の取得
     *
     * 
     */
    @Test
    public void getReceiptsTest() {
        Integer companyId = null;
        String startDate = null;
        String endDate = null;
        String userName = null;
        Integer number = null;
        String commentType = null;
        Boolean commentImportant = null;
        String category = null;
        Long offset = null;
        Integer limit = null;
        // InlineResponse2005 response = api.getReceipts(companyId, startDate, endDate, userName, number, commentType, commentImportant, category, offset, limit);

        // TODO: test validations
    }
    /**
     * ファイルボックス（証憑ファイル）の更新
     *
     * 
     */
    @Test
    public void updateReceiptTest() {
        Integer id = null;
        ReceiptUpdateParams receiptUpdateParams = null;
        // ReceiptResponse response = api.updateReceipt(id, receiptUpdateParams);

        // TODO: test validations
    }
}
