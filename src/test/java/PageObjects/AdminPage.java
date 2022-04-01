package PageObjects;

import StepDefinitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AdminPage extends Hooks {


    static By Admin = By.cssSelector("#menu_admin_viewAdminModule > b");
    static By addBtn = By.id("btnAdd");
    static By select1 = By.id("systemUser_userType");
    static By employee = By.id("systemUser_employeeName_empName");
    static By newUsername = By.name("systemUser[userName]");
    static By aliceDuval = By.cssSelector("body > div.ac_results > ul > li");
    static By select2 = By.id("systemUser_status");
    static By newPassword = By.id("systemUser_password");
    static By confirmPassword = By.id("systemUser_confirmPassword");
    static By saveBtn = By.id("btnSave");
    static By assert1 = By.cssSelector(".odd>.left:nth-child(2)");
    static By assert2 = By.cssSelector(".odd>.left:nth-child(3)");
    static By checkbox = By.id("ohrmList_chkSelectAll");
    static By delete = By.id("btnDelete");
    static By OKBtn = By.id("dialogDeleteBtn");
    static By userSearch = By.id("searchSystemUser_userName");
    static By roleSearch = By.id("searchSystemUser_userType");
    static By employeeNameSearch = By.id("searchSystemUser_employeeName_empName");
    static By statusSearch = By.id("searchSystemUser_status");
    static By searchBtn = By.id("searchBtn");
    static By resetBtn = By.id("resetBtn");
    static By textShown = By.cssSelector("#resultTable > tbody > tr > td");


    public static void ClickAdminBtn() {
        driver.findElement(Admin).click();
    }


    public static void clickCheckbox() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkbox));
        driver.findElement(checkbox).click();

    }


    public static void clickDelete() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(delete));
        driver.findElement(delete).click();
    }


    public static void clickOk() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(OKBtn));
        driver.findElement(OKBtn).click();
    }


    public static void ClickAddBtn() {
        driver.findElement(addBtn).click();
    }


    public static void SelectAdmin() {
        WebElement testDropDown = driver.findElement(select1);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Admin");

    }


    public static void EmployeeName(String employeeName) {
        driver.findElement(employee).sendKeys(employeeName, Keys.ENTER);

    }


    public static void TypeNewUsername(String usernameN) {
        driver.findElement(newUsername).sendKeys(usernameN);
    }


    public static void selectFirstEmployee() {
        driver.findElement(aliceDuval).click();
    }


    public static void selectStatus() {
        WebElement testDropDown = driver.findElement(select2);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Enabled");
    }


    public static void TypeNewPassword(String passwordP) {
        driver.findElement(newPassword).sendKeys(passwordP);
    }


    public static void TypeConfirmPassword(String confirm) {
        driver.findElement(confirmPassword).sendKeys(confirm);
    }


    public static void clickSaveBtn() {
        driver.findElement(saveBtn).click();
    }


    public static void SearchUrl(String search) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(search));
    }


    public static void checkUsername(String username) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(assert1));
        String actualUsername = driver.findElement(assert1).getText();
        Assert.assertEquals(username, actualUsername);
    }


    public static void checkUserRole() {
        Assert.assertTrue(driver.findElement(assert2).isDisplayed());
    }


    public static void typeUserNameForSearch(String usernameN1) {
        driver.findElement(userSearch).sendKeys(usernameN1);
    }


    public static void selectUserRoleForSearch() {
        WebElement testDropDown = driver.findElement(roleSearch);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Admin");
    }


    public static void typeEmployeeNameForSearch(String employeee) {
        driver.findElement(employeeNameSearch).sendKeys(employeee);
    }


    public static void selectStatusForSearch() {
        WebElement testDropDown = driver.findElement(statusSearch);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Enabled");
    }


    public static void clickSearchBtn() {
        driver.findElement(searchBtn).click();
    }


    public static void clickResetBtn() {
        driver.findElement(resetBtn).click();
    }


    public static void assertUserName() {
        Assert.assertTrue(driver.findElement(userSearch).isEnabled());
    }


    public static void selectStatus11() {
        WebElement testDropDown = driver.findElement(statusSearch);
        Select dropdown = new Select(testDropDown);
        dropdown.selectByVisibleText("Disabled");
    }


    public static void textIsDisplayed() {
        Assert.assertTrue(driver.findElement(textShown).isEnabled());

    }
}
