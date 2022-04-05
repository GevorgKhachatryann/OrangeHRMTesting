package StepDefinitions;

import PageObjects.AdminPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import javafaker.tests.userAdd;


public class adminSteps {
    private final userAdd userAdd = new userAdd();
    private  String usernameN = userAdd.Email();

    @And("^I click on Admin button$")
    public void ClickOnAdminButton() {
        AdminPage.ClickAdminBtn();
    }


    @And("^I click on Add button$")
    public void ClickOnAddButton() {
        AdminPage.ClickAddBtn();
    }

    @And("^I select User Role$")
    public void SelectUserRole() {
        AdminPage.SelectAdmin();
    }

    @And("^I type \"([^\"]*)\" as employee name$")
    public void TypeEmployeeName(String employeeName) {
        AdminPage.EmployeeName(employeeName);
    }

    @And("I type new username$")
    public void TypeAsNewUsername() {
        AdminPage.TypeNewUsername(usernameN);
    }

    @And("^I  select employee name$")
    public void SelectEmployeeName() {
        AdminPage.selectFirstEmployee();
    }

    @And("^I select status$")
    public void SelectStatus() {
        AdminPage.selectStatus();
    }

    @And("^I type \"([^\"]*)\" as new password$")
    public void TypeAsNewPassword(String passwordP) {
        AdminPage.TypeNewPassword(passwordP);
    }

    @And("^I type \"([^\"]*)\" as confirm password$")
    public void TypeAsConfirmPassword(String confirm) {
        AdminPage.TypeConfirmPassword(confirm);
    }

    @And("^I click Save button$")
    public void ClickSaveButton() {
        AdminPage.clickSaveBtn();
    }

    @Given("^Admin page is opened and URL should contain \"([^\"]*)\"$")
    public void adminPageIsOpenedAndURLShouldContain(String search) {
        AdminPage.SearchUrl(search);
    }

    @And("^I click on checkbox$")
    public void ClickOnCheckbox() {
        AdminPage.clickCheckbox();
    }

    @And("^I click on delete button$")
    public void ClickOnDeleteButton() {
         AdminPage.clickDelete();
    }

    @And("^I click on OK button$")
    public void ClickOnOKButton() {
        AdminPage.clickOk();
    }

    @And("^I type \"([^\"]*)\" as username for search$")
    public void TypeAsUsernameForSearch(String usernameN1) {
        AdminPage.typeUserNameForSearch(usernameN1);
    }

    @And("^I select User Role for search$")
    public void SelectUserRoleForSearch() {
       AdminPage.selectUserRoleForSearch();
    }

    @And("^I type \"([^\"]*)\" as employee name for search$")
    public void TypeAsEmployeeName(String employeee) {
        AdminPage.typeEmployeeNameForSearch(employeee);
    }

    @And("^I select status for search$")
    public void SelectStatusForSearch() {
        AdminPage.selectStatusForSearch();
    }

    @And("^I click on Search Btn$")
    public void ClickOnSearchBtn() {
        AdminPage.clickSearchBtn();
    }

    @Then("^assert the username \"([^\"]*)\"$")
    public void assertThatUsernameIs(String username) {
        AdminPage.checkUsername(username);
    }


    @And("^I click on Reset Button$")
    public void ClickOnResetButton() {
        AdminPage.clickResetBtn();
    }

    @Then("^assert that username box is empty$")
    public void assertThatUsernameBoxIsEmpty() {
        AdminPage.assertUserName();
    }


    @And("^I select status for search $")
    public void SelectStatusForSearch1() {
        AdminPage.selectStatus11();
    }


    @Then("^assert that no records found$")
    public void assertThatNoRecordsFound() {
        AdminPage.textIsDisplayed();
    }
    @Then("^assert that username is displayed$")
    public void assertThatUsernameIsDisplayed() {
        AdminPage.checkUsername(usernameN);
    }

    @And("^assert that user role is displayed$")
    public void assertThatUserRoleIsDisplayed() {
        AdminPage.checkUserRole();
    }
}
