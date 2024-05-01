package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;

public class PracticePage extends InitialHooks {
    Helper helper = new Helper();

    public boolean hasPracticePage() {
        switchAdminDriver();
        helper.wait(1000);
        return driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Practice overview\"])[2]")).isDisplayed();
    }

    public void adminClickBeginPractice() {
        switchAdminDriver();
        helper.wait(25000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForPractice() {
        switchClientDriver();
        helper.wait(6500);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
    }

    public void adminClickBeginPracticeSectionB() {
        switchAdminDriver();
        helper.wait(24000);
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForPracticeSectionB() {
        switchClientDriver();
        helper.wait(3000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[4]")).click();
    }

    public void adminClickBeginPracticePart2() {
        switchAdminDriver();
        helper.wait(10000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForPart2() {
        switchClientDriver();
        helper.wait(8000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
    }

    public void clientSelectTheCorrectSecondOptionForPart2() {
        switchClientDriver();
        helper.wait(15000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[3]")).click();
    }

    public void clientSelectTheCorrectThirdOptionForPart2() {
        switchClientDriver();
        helper.wait(13000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[2]")).click();
    }

    public void adminClickBeginPracticeFaces() {
        switchAdminDriver();
        helper.wait(8000);
        driver.findElement(AppiumBy.id("Begin practice")).click();
    }

    public void clientSelectTheCorrectOptionForFaces() {
        switchClientDriver();
        helper.wait(2000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
    }

    public void adminClickBeginPracticeFacesForPart2() {
        switchAdminDriver();
        helper.wait(15000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForFacesPart2() {
        switchClientDriver();
        helper.wait(4000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[2]")).click();
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
    }

    public void adminClickBeginPracticeMemoryFaces() {
        switchAdminDriver();
        helper.wait(15000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForMemoryFaces() {
        switchClientDriver();
        helper.wait(4000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
    }

    public void adminClickBeginPracticeMemoryFacesSecondPart() {
        switchAdminDriver();
        helper.wait(20000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForMemoryFacesPart2() {
        switchClientDriver();
        helper.wait(10000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[2]")).click();
    }

    public void clientSelectTheCorrectOptionForWMIPractice() {
        driver2.findElement(AppiumBy.id("part_1_practice557638")).click();
        driver2.findElement(AppiumBy.id("part_1_practice557440")).click();
    }

    public void adminClickBeginPracticeWMISecondPart() {
        switchAdminDriver();
        helper.wait(3000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin practice\"]")).click();
    }

    public void clientSelectTheCorrectOptionForWMIPracticeSecondPart() {
        switchClientDriver();
        helper.wait(7000);
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[1]")).click();
        driver2.findElement(AppiumBy.xpath("(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])[3]")).click();
    }
}
