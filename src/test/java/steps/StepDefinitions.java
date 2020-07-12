package steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.MainPage;

public class StepDefinitions {

    MainPage mainPage = new MainPage();

    @Given("^User open a start page$")
    public void userOpenAStartPage() {
        mainPage.openMainPage();
    }

    @When("^Add one item from Women page$")
    public void addOneItemFromWomenPage() {
        mainPage.switchToWomenTab();
        mainPage.addItemFromWomenTab();
    }

    @And("^Add one item from Dresses page$")
    public void addOneItemFromDressesPage() {
        mainPage.switchToDressesTab();
        mainPage.addItemFromDressesTab();
    }

    @And("^Add one item from Shirts page$")
    public void addOneItemFromShirtsPage() {
        mainPage.switchToShirtsTab();
        mainPage.addItemFromShirtsTab();
    }

    @And("^Delete one random item from cart$")
    public void deleteOneRandomItemFromCart() throws InterruptedException {
        mainPage.deleteRandomItemFromCart();
    }
}
