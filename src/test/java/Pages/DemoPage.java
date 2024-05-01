package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;

public class DemoPage extends InitialHooks {

    Helper helper = new Helper();

    public void adminTapBeginDemo() {
        switchAdminDriver();
        helper.wait(7000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin demo\"]")).click();
        helper.wait(19000);
    }

    public void clientSelectCorrectImageDemo() {
        switchClientDriver();
        helper.wait(13000);
        driver2.findElement(AppiumBy.xpath("//XCUIElementTypeOther[@name=\"StimBlockOverlay\"]")).click();
    }

    public void adminTapBeginDemoForSectionB() {
        switchAdminDriver();
        helper.wait(12000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin demo\"]")).click();
        helper.wait(25000);
        helper.wait(25000);
    }

    public void adminTapBeginDemoForFaceMemorySecondPart() {
        switchAdminDriver();
        helper.wait(25000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin demo\"]")).click();
        helper.wait(27000);
    }

    public void adminTapBeginDemoForWMI() {
        switchAdminDriver();
        helper.wait(13000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin demo\"]")).click();
    }

    public void adminTapBeginDemoForWMIPart2() {
        switchAdminDriver();
        helper.wait(12000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin demo\"]")).click();
        helper.wait(34000);
    }
}
