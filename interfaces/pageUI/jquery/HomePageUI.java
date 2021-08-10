package pageUI.jquery;

public class HomePageUI {
    public static final String DYNAMIC_TEXTBOX_BY_COLUMN_NAME= "//div[text()='%s']/parent::div/following-sibling::input";
    public static final String DYNAMIC_PAGING_BY_PAGENUMBER= "//a[@class='qgrd-pagination-page-link' and text()='%s']";
    public static final String DYNAMIC_PAGING_BY_PAGE_ACTIVE= "//a[@class='qgrd-pagination-page-link active' and text()='%s']";
    public static final String DYNAMIC_DELETE_BY_COUNTRY_NAME = "//td[@data-key='country' and text()='Afghanistan']/preceding-sibling" +
            "::td[@class='qgrd-actions']/button[contains(@class,'qgrd-remove-row-btn')]";
    public static final String EDIT_BY_COUNTRY_NAME= "//td[@data-key='country' and text()='Afghanistan']/preceding-sibling" +
            "::td[@class='qgrd-actions']/button[contains(@class,'qgrd-edit-row-btn')]";
    public static final String DYNAMIC_ALL_INFOR_AT_ROW ="//td[@data-key='females' and text()='384187']" +
            "/following-sibling::td[@data-key='country' and text()='Afghanistan']" +
            "/following-sibling::td[@data-key='males' and text()='407124']" +
            "/following-sibling::td[@data-key='total' and text()='791312']";



    public static final String DYNAMIC_COLUMN_INDEX_BY_COLUMN_NAME="//th[text()='%s']/preceding-sibling::th";
    public static final String DYNAMIC_TEXTBOX_BY_COLUMN_AND_ROW_INDEX="//tr[%s]//td[%s]/input";

}
