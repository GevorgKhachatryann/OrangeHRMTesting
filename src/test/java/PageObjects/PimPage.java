package PageObjects;

import StepDefinitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PimPage extends Hooks {


    static By PimBtn = By.cssSelector("#menu_pim_viewPimModule > b");
    static By employee3 =By.name("empsearch[employee_name][empName]");
    static By employee = By.id("empsearch_employee_name_empName");
    static By id = By.id("empsearch_id");
    static By employment = By.id("empsearch_employee_status");
    static By include = By.id("empsearch_termination");
    static By supervisor = By.name("empsearch[supervisor_name]");
    static By JobTitle = By.id("empsearch_job_title");
    static By subUnit = By.id("empsearch_sub_unit");
    static By searchBtn = By.id("searchBtn");
    static By searchResult = By.cssSelector("#resultTable > tbody > tr > td");
    static By resetBtn = By.id("resetBtn");
    static By subUnitClick = By.cssSelector("#empsearch_sub_unit > option:nth-child(4)");




    public static void clickPIMBtn() {
        driver.findElement(PimBtn).click();
    }

    public static void checkURL(String search) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(search));
    }

    public static void TypeEmployeeName(String employee1) {
        driver.findElement(employee).sendKeys(employee1, Keys.ENTER);
    }

    public static void TypeId(String newID) {
        driver.findElement(id).sendKeys(newID);
    }

    public static void selectEmploymentStatus() {
        WebElement testDropDown = driver.findElement(employment);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Full-Time Permanent");
    }

    public static void selectInclude() {
        WebElement testDropDown = driver.findElement(include);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByIndex(1);
    }

    public static void typeSupervisorName(String super1) {
        driver.findElement(supervisor).sendKeys(super1, Keys.ENTER);
    }

    public static void selectJobTitle() {
        WebElement testDropDown = driver.findElement(JobTitle);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("HR Associate");
    }

    public static void selectSubUnit() {
        driver.findElement(subUnit).click();
        driver.findElement(subUnitClick).click();

    }

    public static void clickOnSearchBtn() {
        driver.findElement(searchBtn).click();
    }

    public static void assertResult() {
        String actualResult = driver.findElement(searchResult).getText();
        Assert.assertEquals(actualResult, "No Records Found");
    }

    public static void clickResetBtn() {
        driver.findElement(resetBtn).click();
    }

    public static void assertEmployeeNameBox() throws InterruptedException {
        Thread.sleep(750);
        Assert.assertEquals(driver.findElement(employee3).getAttribute("value"), "Type for hints...");
    }


}

