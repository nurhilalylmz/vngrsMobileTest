package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import methods.MenuFilterMethods;
import methods.MoreOptionMethods;
import methods.SearchMethods;
import contants.*;

import java.net.MalformedURLException;

public class StepDefinition {

    SearchMethods searchMethods = new SearchMethods();
    MoreOptionMethods moreOptionMethods=new MoreOptionMethods();
    MenuFilterMethods menuFilterMethods=new MenuFilterMethods();

    @Given("^Navigate to the MobileApp$")
    public void navigeToTheMobileApp() throws MalformedURLException{
        searchMethods.initializeTest();
    }


    @Then("^Toolbar element is checked\\.$")
    public void toolbarElementIsChecked() {

    }

    @Then("^Search element is checked\\.$")
    public void searchElementIsChecked() {
        searchMethods.elementCheckedSearch();
    }

    @Then("^Search element is clicked\\.$")
    public void searchElementIsClicked() throws InterruptedException {
        searchMethods.clickSearch();
    }

    @Then("^Write \"([^\"]*)\" and searched$")
    public void writeAndSearched(String text) throws Throwable {
        writeAndSearched(text);
        throw new PendingException();
    }

    @Then("^More Options element is checked\\.$")
    public void moreOptionsElementIsChecked() throws InterruptedException {
        moreOptionMethods.checkedMoreOptions();
    }

    @Then("^More Options element is clicked\\.$")
    public void moreOptionsElementIsClicked() throws InterruptedException {
        moreOptionMethods.clickedMoreOptions();
    }

    @Then("^Log in to Designer News is checked\\.$")
    public void logInToDesignerNewsIsChecked() throws InterruptedException {
        moreOptionMethods.checkedLoginToDesigner();
    }

    @Then("^About is checked\\.$")
    public void aboutIsChecked() throws InterruptedException {
        moreOptionMethods.checkedMoreAbout();

    }

    @Then("^Log in to Designer News is clicked\\.$")
    public void logInToDesignerNewsIsClicked() throws InterruptedException {
        moreOptionMethods.clickedLoginToDesigner();
    }

    @Then("^About is clicked\\.$")
    public void aboutIsClicked() throws InterruptedException {
        moreOptionMethods.clickedMoreAbout();
    }

    @Then("^Menu Filter element is checked\\.$")
    public void menuFilterElementIsChecked() {
        menuFilterMethods.menuFilterElementIsChecked();
    }

    @Then("^Menu Filter element is clicked\\.$")
    public void menuFilterElementIsClicked() throws InterruptedException {
        menuFilterMethods.menuFilterElementIsClicked();
    }

    @Then("^Popular Designer News is checked\\.$")
    public void popularDesignerNewsIsChecked() {
        menuFilterMethods.popularDesignerNewsIsChecked();
    }

    @Then("^Material Design is checked\\.$")
    public void materialDesignIsChecked() {
        menuFilterMethods.materialDesignIsChecked();
    }

    @Then("^Product Hunt is checked\\.$")
    public void productHuntIsChecked() {
        menuFilterMethods.productHuntIsChecked();
    }
}

