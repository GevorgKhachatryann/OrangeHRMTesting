package StepDefinitions;

import PageObjects.LoginPageObjects;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps  {


    @Given("^Login page is opened and URL should contain \"([^\"]*)\"$")
    public void loginPageIsOpened(String st) {
        LoginPageObjects.loginPage(st);
    }

    @And("^I type \"([^\"]*)\" as username$")
    public void TypeAsUsername(String  admin) {
         LoginPageObjects.userNameField(admin);
    }

    @And("^I type \"([^\"]*)\" as password$")
    public void TypeAsPassword(String admin123) {
        LoginPageObjects.passwordField(admin123);
    }

    @When("^I click on Login button$")
    public void ClickOnLoginButton() {
        LoginPageObjects.clickLoginBtn();
    }

    @Then("^URL should contain \"([^\"]*)\"$")
    public void urlContains(String str) {
        LoginPageObjects.urlContains(str);
    }


    @Then("^URL should not contain \"([^\"]*)\"$")
    public void urlShouldNotContain(String url1) {
        LoginPageObjects.checkUrl(url1);
    }


}
