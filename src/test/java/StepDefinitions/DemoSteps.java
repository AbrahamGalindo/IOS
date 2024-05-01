package StepDefinitions;

import Hooks.InitialHooks;
import Pages.DemoPage;
import Pages.HomePage;
import Pages.PracticePage;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class DemoSteps {

    HomePage homePage = new HomePage();
    DemoPage demoPage = new DemoPage();
    PracticePage practicePage = new PracticePage();

    @Given("Admin enter the client name")
    public void admin_enter_the_client_name() {
        homePage.adminInsertName();
    }

    @Given("Admin tap on evaluate button")
    public void admin_tap_on_evaluate_button() {
        homePage.adminClickEvaluate();
    }

    @Given("Client tap on evaluate button")
    public void client_tap_on_evaluate_button() {
        homePage.clientClickEvaluate();
    }

    @Given("Admin tap on Begin demo button")
    public void admin_tap_on_begin_demo_button() {
        demoPage.adminTapBeginDemo();
    }

    @Given("Client select the correct option for demo")
    public void client_select_the_correct_option_for_demo() {
        demoPage.clientSelectCorrectImageDemo();
    }

    @Then("The application show the practice module")
    public void the_application_show_the_practice_module() {
        Assert.assertTrue(practicePage.hasPracticePage());
    }

    @And("Admin tap on Begin demo button for section B")
    public void adminTapOnBeginDemoButtonForSectionB() {
        demoPage.adminTapBeginDemoForSectionB();
    }

    @And("Admin tap on begin demo button for memory faces second part")
    public void adminTapOnBeginDemoButtonForMemoryFacesSecondPart() {
        demoPage.adminTapBeginDemoForFaceMemorySecondPart();
    }
}
