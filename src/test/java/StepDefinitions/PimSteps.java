package StepDefinitions;


import PageObjects.PimPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class PimSteps {
    @And("^I click on PIM button$")
    public void ClickOnAdminButton() {
        PimPage.clickPIMBtn();
    }

    @Given("^Pim page is opened and URL should contain \"([^\"]*)\"$")
    public void pimPageIsOpenedAndURLShouldContain(String search) {
       PimPage.checkURL(search);
    }

    @And("^I type \"([^\"]*)\"  as new employee name$")
    public void TypeEmployeeName(String employee1) {
       PimPage.TypeEmployeeName(employee1);
    }

    @And("^I type \"([^\"]*)\"  as ID$")
    public void TypeID(String newID) {
        PimPage.TypeId(newID);
    }

    @And("^I select Employment status$")
    public void SelectEmploymentStatus() {
        PimPage.selectEmploymentStatus();
    }

    @And("^I select Current Employees only$")
    public void SelectCurrentEmployeesOnly() {
        PimPage.selectInclude();
    }

    @And("^I type \"([^\"]*)\" as Supervisor name$")
    public void TypeAsSupervisorName(String super1) {
        PimPage.typeSupervisorName(super1);
    }

    @And("^I select Job Title$")
    public void SelectJobTitle() {
       PimPage.selectJobTitle();
    }

    @And("^I click on Sub Unit Btn$")
    public void SelectSubUnit() {
       PimPage.selectSubUnit();
    }

    @And("^I click on search button$")
    public void ClickOnSearchButton() {
        PimPage.clickOnSearchBtn();
    }

    @Then("^assert that all of the boxes are empty$")
    public void assertThatAllOfTheBoxesAreEmpty() {
      PimPage.assertResult();
    }

    @And("^I click on Reset Btn$")
    public void ClickOnResetBtn() {
        PimPage.clickResetBtn();
    }

    @Then("^assert that employee name box is empty$")
    public void assertThatEmployeeNameBoxIsEmpty() throws InterruptedException {
        PimPage.assertEmployeeNameBox();
    }

}
