package PageObjects;


import StepDefinitions.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPageObjects extends Hooks {

    static By userName = By.id("txtUsername");
    static By password = By.id("txtPassword");
    static By loginBtn = By.id("btnLogin");


    public static void loginPage(String st) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(st));
    }


    public static void checkUrl(String url1){
        String url = driver.getCurrentUrl();
        Assert.assertFalse(url.contains(url1));
    }


    public static void userNameField(String admin) {
        driver.findElement(userName).sendKeys(admin);
    }


    public static void passwordField(String admin123) {
        driver.findElement(password).sendKeys(admin123);
    }


    public static void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }


    public static void urlContains(String str) {
        String url = driver.getCurrentUrl();
        Assert.assertTrue(url.contains(str));
    }

}
