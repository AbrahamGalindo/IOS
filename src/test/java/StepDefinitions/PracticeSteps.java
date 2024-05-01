package StepDefinitions;

import Pages.MatricesPage;
import Pages.PracticePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PracticeSteps {

    PracticePage practicePage = new PracticePage();
    MatricesPage matricesPage = new MatricesPage();

    @And("Admin tap on begin practice button")
    public void adminTapOnBeginPracticeButton() {
        practicePage.adminClickBeginPractice();
    }

    @And("Client select the correct option for practice")
    public void clientSelectTheCorrectOptionForPractice() {
        practicePage.clientSelectTheCorrectOptionForPractice();
    }

    @Then("The application show the matrices module")
    public void theApplicationShowTheMatricesModule() {
        Assert.assertTrue(matricesPage.hasMatricesPage());
    }


    @And("Admin tap on begin practice button for section B")
    public void adminTapOnBeginPracticeButtonForSectionB() {
        practicePage.adminClickBeginPracticeSectionB();
    }

    @And("Client select the correct option for practice section B")
    public void clientSelectTheCorrectOptionForPracticeSectionB() {
        practicePage.clientSelectTheCorrectOptionForPracticeSectionB();
    }

    @And("Admin tap on begin practice button for part{int}")
    public void adminTapOnBeginPracticeButtonForPart(int arg0) {
        practicePage.adminClickBeginPracticePart2();
    }

    @And("Client select the correct option for practice part{int}")
    public void clientSelectTheCorrectOptionForPracticePart(int arg0) {
        practicePage.clientSelectTheCorrectOptionForPart2();
    }

    @And("Client select the second correct option for practice part{int}")
    public void clientSelectTheSecondCorrectOptionForPracticePart(int arg0) {
        practicePage.clientSelectTheCorrectSecondOptionForPart2();
    }

    @And("Client select the third correct option for practice part{int}")
    public void clientSelectTheThirdCorrectOptionForPracticePart(int arg0) {
        practicePage.clientSelectTheCorrectThirdOptionForPart2();
    }

    @And("Admin tap on begin practice button for faces")
    public void adminTapOnBeginPracticeButtonForFaces() {
        practicePage.adminClickBeginPracticeFaces();
    }

    @And("Client select the correct option for faces practice")
    public void clientSelectTheCorrectOptionForFacesPractice() {
        practicePage.clientSelectTheCorrectOptionForFaces();
    }

    @And("Admin tap on begin practice button for second part of the faces")
    public void adminTapOnBeginPracticeButtonForSecondPartOfTheFaces() {
        practicePage.adminClickBeginPracticeFacesForPart2();
    }

    @And("Client select the correct option for faces practice second part")
    public void clientSelectTheCorrectOptionForFacesPracticeSecondPart() {
        practicePage.clientSelectTheCorrectOptionForFacesPart2();
    }

    @And("Admin tap on begin practice button for memory faces")
    public void adminTapOnBeginPracticeButtonForMemoryFaces() {
        practicePage.adminClickBeginPracticeMemoryFaces();
    }

    @And("Client select the correct option for memory faces")
    public void clientSelectTheCorrectOptionForMemoryFaces() {
        practicePage.clientSelectTheCorrectOptionForMemoryFaces();
    }

    @And("Admin tap on begin practice button for memory faces second part")
    public void adminTapOnBeginPracticeButtonForMemoryFacesSecondPart() {
        practicePage.adminClickBeginPracticeMemoryFacesSecondPart();
    }

    @And("Client select the correct option for practice memory faces second part")
    public void clientSelectTheCorrectOptionForPracticeMemoryFacesSecondPart() {
        practicePage.clientSelectTheCorrectOptionForMemoryFacesPart2();
    }
}
