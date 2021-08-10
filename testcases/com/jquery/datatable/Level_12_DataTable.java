package com.jquery.datatable;

import common.AbstractPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObject.jquery.HomePageObject;
import pageObject.jquery.PageGenerator;


public class Level_12_DataTable extends AbstractPage {
    WebDriver driver;
    HomePageObject homePage;
    String projectPath = System.getProperty("user.dir");


    //@Parameters("browser")
    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", projectPath +
                "\\browserDriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/CRUD-Data-Grid-Plugin-jQuery-Quickgrid/");
        driver.manage().window().maximize();
        homePage = PageGenerator.getHomePage(driver);
    }

    @Test
    public void TC_01_InputData() {
        homePage.inputToTextBoxByColumnName("Country", "AFRICA");
        homePage.inputToTextBoxByColumnName("Females", "12253515");
        homePage.inputToTextBoxByColumnName("Males", "12599691");
        homePage.inputToTextBoxByColumnName("Total", "24853148");
        homePage.sleepInSecond(10);
    }

    @Test
    public void TC_02_Navigate() {
        homePage.verifyRefresh(driver);
        homePage.navigateToPageByPageNumber("5");
        Assert.assertTrue(homePage.isPageActiveByPageNumber("5"));

        homePage.navigateToPageByPageNumber("12");
        Assert.assertTrue(homePage.isPageActiveByPageNumber("12"));
    }

    @Test
    public void TC_03_Click() {
        homePage.verifyRefresh(driver);
        homePage.clickToDeleteIconByCountryName("Afghanistan");
        homePage.sleepInSecond(2);
        homePage.verifyRefresh(driver);
        homePage.clickToEditIconByCountryName("Algeria");
    }

    @Test
    public void TC_04_IsDisplayed() {
        homePage.verifyRefresh(driver);
        Assert.assertTrue(homePage.isAllInforDisplayed("15999", "Armenia", "16456", "32487"));
    }

    public void TC_05_Index() {
        openUrl(driver, "https://www.jqueryscript.net/demo/jQuery-Dynamic-Data-Grid-Plugin-appendGrid/");
        //khac cha. input cot 2
        homePage.inputToTextBoxAtRowNumber("Contact person", "2","Automation");
        homePage.inputToTextBoxAtRowNumber("Company", "1","Viet Nam");
    }


    @AfterClass
    public void afterClass() {
        driver.quit();

    }
}
