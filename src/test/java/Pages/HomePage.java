package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.remote.HideKeyboardStrategy;
import org.openqa.selenium.By;

public class HomePage extends InitialHooks {

    Helper helper = new Helper();

    public void adminInsertName() {
        createClientDriver();
        createAdminDriver();
        helper.wait(3000);
        driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"Text input field\"])[1]")).clear();
        driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"Text input field\"])[1]")).sendKeys("Abraham");
    }

    public void adminInsertAge(int age) {
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"Text input field\"])[2]")).clear();
        driver.findElement(AppiumBy.xpath("(//XCUIElementTypeTextField[@name=\"Text input field\"])[2]")).sendKeys(String.valueOf(age));

        helper.wait(4000);
    }

    public void adminClickEvaluate() {
        driver.findElement(AppiumBy.accessibilityId("Evaluate")).click();
    }

    public void clientClickEvaluate() {
        createClientDriver();
        driver2.findElement(AppiumBy.accessibilityId("Evaluate")).click();
    }

    public void adminClickMatrices() {
        switchAdminDriver();
        driver.findElement(AppiumBy.id("Matrices")).click();
    }

    public void adminClickFaces() {
        switchAdminDriver();
        driver.findElement(AppiumBy.id("Faces")).click();
    }

    public void adminClickWMI() {
        switchAdminDriver();
        driver.findElement(AppiumBy.id("WMI")).click();
    }

    public void adminClickVocabulary() {
        switchAdminDriver();
        driver.findElement(AppiumBy.id("Vocabulary")).click();
        helper.wait(2000);
    }
}
