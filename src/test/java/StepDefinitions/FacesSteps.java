package StepDefinitions;

import Pages.FacesPage;
import Pages.HomePage;
import Pages.MatricesPage;
import io.cucumber.java.en.And;

public class FacesSteps {

    FacesPage facesPage = new FacesPage();
    HomePage homePage   = new HomePage();
    @And("Admin select faces evaluation")
    public void adminSelectFacesEvaluation() {
        homePage.adminClickFaces();
    }
    @And("Admin tap on begin item button for faces")
    public void adminTapOnBeginItemButtonForFaces() {
        facesPage.adminTapBeginItem();
    }

    @And("Client select faces the correct option for item {int}")
    public void clientSelectFacesTheCorrectOptionForItem(int item) {
        facesPage.clientSelectCorrectOptionForFaces(item);
    }

    @And("Admin tap on begin item button for faces second part")
    public void adminTapOnBeginItemButtonForFacesSecondPart() {
        facesPage.adminTapBeginItemSecondPart();
    }

    @And("Client select faces the correct second part option for item {int}")
    public void clientSelectFacesTheCorrectSecondPartOptionForItem(int item) {
        facesPage.clientSelectCorrectOptionForFacesSecondPart(item);
    }

    @And("Admin tap on begin item button for memory faces")
    public void adminTapOnBeginItemButtonForMemoryFaces() {
        facesPage.adminTapBeginItemMemoryFaces();
    }

    @And("Client select memory faces the correct option for item {int}")
    public void clientSelectMemoryFacesTheCorrectOptionForItem(int item) {
        facesPage.clientSelectCorrectOptionForMemoryFaces(item);
    }

    @And("Admin tap on begin items button for memory faces second part")
    public void adminTapOnBeginItemsButtonForMemoryFacesSecondPart() {
        facesPage.adminTapBeginItemsMemoryFacesPart2();
    }

    @And("Client select memory faces second part the correct option for item {int}")
    public void clientSelectMemoryFacesSecondPartTheCorrectOptionForItem(int item) {
        facesPage.clientSelectCorrectOptionForMemoryFacesPart2(item);
    }

    @And("Admin tap on complete button for faces")
    public void adminTapOnCompleteButtonForFaces() {
        facesPage.adminTapCompleteButton();
    }
}
