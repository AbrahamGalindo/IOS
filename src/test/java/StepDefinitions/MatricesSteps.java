package StepDefinitions;

import Pages.HomePage;
import Pages.MatricesPage;
import Pages.PracticePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MatricesSteps {

    MatricesPage matricesPage = new MatricesPage();
    HomePage homePage = new HomePage();

    @And("Admin select matrices evaluation")
    public void adminSelectMatricesEvaluation() {
        homePage.adminClickMatrices();
    }

    @And("Client select the correct option for item {int}")
    public void clientSelectTheCorrectOptionForItem(int item) {
        matricesPage.clientSelectCorrectOptionForMatrices(item);
    }

    @And("Admin tap on begin item button")
    public void adminTapOnBeginItemButton() {
        matricesPage.adminTapBeginItem();
    }

    @Then("The application show the section B")
    public void theApplicationShowTheSectionB() {
        Assert.assertTrue(matricesPage.hasMatricesSectionBPage());
    }


    @And("Admin tap on begin item button for section B")
    public void adminTapOnBeginItemButtonForSectionB() {
        matricesPage.adminTapBeginItemForSectionB();
    }

    @And("Client select the correct option for item on section B {int}")
    public void clientSelectTheCorrectOptionForItemOnSectionB(int item) {
        matricesPage.clientSelectCorrectOptionForMatricesForSectionB(item);
    }

    @And("The application show the part2")
    public void theApplicationShowThePart2() {
        Assert.assertTrue(matricesPage.hasMatricesPart2());
    }

    @And("Admin tap on begin item button for part{int}")
    public void adminTapOnBeginItemButtonForPart(int arg0) {
        matricesPage.adminTapBeginItemForPart2();
    }

    @And("Client select the correct option for item on second part {int}")
    public void clientSelectTheCorrectOptionForItemOnSecondPart(int item) {
        matricesPage.clientSelectCorrectOptionForMatricesForSecondPart(item);
    }

    @And("Admin tap on complete button")
    public void adminTapOnCompleteButton() {
        matricesPage.adminTapCompleteButton();
    }
}