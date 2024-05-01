package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;

public class WMISteps {

    HomePage homePage = new HomePage();
    DemoPage demoPage = new DemoPage();
    PracticePage practicePage = new PracticePage();
    WMIPage wmiPage = new WMIPage();

    @And("Admin select WMI evaluation")
    public void adminSelectWMIEvaluation() {
        homePage.adminClickWMI();
    }

    @And("Admin tap on begin demo button for WMI")
    public void adminTapOnBeginDemoButtonForWMI() {
        demoPage.adminTapBeginDemoForWMI();
    }

    @And("Client select the correct option for WMI practice")
    public void clientSelectTheCorrectOptionForWMIPractice() {
        practicePage.clientSelectTheCorrectOptionForWMIPractice();
    }

    @And("Admin tap on begin item button for WMI")
    public void adminTapOnBeginItemButtonForWMI() {
        wmiPage.adminTapBeginItem();
    }

    @And("Client select the correct option for WMI item {int}")
    public void clientSelectTheCorrectOptionForWMIItem(int item) {
        wmiPage.clientSelectCorrectOptionForWMI(item);
    }

    @And("Admin tap on begin demo button for WMI second part")
    public void adminTapOnBeginDemoButtonForWMISecondPart() {
        demoPage.adminTapBeginDemoForWMIPart2();
    }

    @And("Admin tap on begin practice button for WMI second part")
    public void adminTapOnBeginPracticeButtonForWMISecondPart() {
        practicePage.adminClickBeginPracticeWMISecondPart();
    }

    @And("Client select the correct option for WMI practice second part")
    public void clientSelectTheCorrectOptionForWMIPracticeSecondPart() {
        practicePage.clientSelectTheCorrectOptionForWMIPracticeSecondPart();
    }

    @And("Admin tap on begin item button for WMI second part")
    public void adminTapOnBeginItemButtonForWMISecondPart() {
        wmiPage.adminTapBeginItemPart2();
    }

    @And("Client select the correct option for WMI item on second part {int}")
    public void clientSelectTheCorrectOptionForWMIItemOnSecondPart(int item) {
        wmiPage.clientSelectCorrectOptionForWMISecondPart(item);
    }

    @And("Admin tap on complete button for WMI")
    public void adminTapOnCompleteButtonForWMI() {
        wmiPage.adminTapCompleteButton();
    }

    @And("Admin tap on start audio")
    public void adminTapOnStartAudio() {
        wmiPage.adminTapStartAudio();
    }

    @And("Admin tap on practice button for WMI")
    public void adminTapOnPracticeButtonForWMI() {
        wmiPage.adminTapPracticeWMI();
    }
}
