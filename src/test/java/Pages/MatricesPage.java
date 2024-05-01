package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;

public class MatricesPage extends InitialHooks {
    Helper helper = new Helper();
    String path = "(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])";

    public boolean hasMatricesPage() {
        switchAdminDriver();
        helper.wait(2000);
        return driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Test overview\"])[2]")).isDisplayed();
    }

    public boolean hasMatricesSectionBPage() {
        switchAdminDriver();
        return driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Part 1 • Section B • All Ages\"])[2]")).isDisplayed();
    }

    public void adminTapBeginItem() {
        switchAdminDriver();
        helper.wait(16000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin item\"]")).click();
        switchClientDriver();
    }

    public void adminTapBeginItemForPart2() {
        switchAdminDriver();
        helper.wait(10000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin item\"]")).click();
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForMatrices(int item) {
        helper.wait(300);
        switch (item) {
            case 1 -> driver2.findElement(AppiumBy.xpath(path + "[2]")).click();
            case 2, 3 -> driver2.findElement(AppiumBy.xpath(path + "[3]")).click();
            case 4, 7, 6 -> driver2.findElement(AppiumBy.xpath(path + "[4]")).click();
            case 5, 15, 11, 8 -> driver2.findElement(AppiumBy.xpath(path + "[5]")).click();
            case 9, 20, 17, 14 -> driver2.findElement(AppiumBy.xpath(path + "[6]")).click();
            case 10, 19, 13 -> driver2.findElement(AppiumBy.xpath(path + "[8]")).click();
            case 12, 16 -> driver2.findElement(AppiumBy.xpath(path + "[7]")).click();
            case 18, 24 -> driver2.findElement(AppiumBy.xpath(path + "[10]")).click();
            case 22, 29 -> driver2.findElement(AppiumBy.xpath(path + "[13]")).click();
            case 21 -> {
                driver2.findElement(AppiumBy.xpath(path + "[14]")).click();
                helper.wait(40000);
            }
            case 23 -> driver2.findElement(AppiumBy.xpath(path + "[17]")).click();
            case 25 -> driver2.findElement(AppiumBy.xpath(path + "[12]")).click();
            case 26 -> driver2.findElement(AppiumBy.xpath(path + "[16]")).click();
            case 27 -> driver2.findElement(AppiumBy.xpath(path + "[15]")).click();
            case 28 -> driver2.findElement(AppiumBy.xpath(path + "[11]")).click();
            case 30 -> driver2.findElement(AppiumBy.xpath(path + "[18]")).click();
        }
    }

    public void adminTapBeginItemForSectionB() {
        switchAdminDriver();
        helper.wait(13000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin Item\"]")).click();
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForMatricesForSectionB(int item) {
        helper.wait(300);
        switch (item) {
            case 1 -> driver2.findElement(AppiumBy.xpath(path + "[2]")).click();
            case 2, 27, 8, 16, 19, 25, 20 -> driver2.findElement(AppiumBy.xpath(path + "[8]")).click();
            case 3, 26, 13, 14, 24, 22 -> driver2.findElement(AppiumBy.xpath(path + "[10]")).click();
            case 4, 30, 7, 11, 18 -> driver2.findElement(AppiumBy.xpath(path + "[9]")).click();
            case 5, 28, 9, 10, 15 -> driver2.findElement(AppiumBy.xpath(path + "[7]")).click();
            case 6, 29, 12, 17, 23 -> driver2.findElement(AppiumBy.xpath(path + "[6]")).click();
            case 21 -> {
                driver2.findElement(AppiumBy.xpath(path + "[6]")).click();
                helper.wait(40000);
            }
        }
    }

    public boolean hasMatricesPart2() {
        switchAdminDriver();
        helper.wait(1000);
        return driver.findElement(AppiumBy.xpath("(//XCUIElementTypeStaticText[@name=\"Part 2\"])[2]")).isDisplayed();
    }

    public void clientSelectCorrectOptionForMatricesForSecondPart(int item) {
        helper.wait(500);
        switch (item) {
            case 11 -> driver2.findElement(AppiumBy.xpath(path + "[3]")).click();
            case 12, 16, 23, 27, 29, 43 -> driver2.findElement(AppiumBy.xpath(path + "[8]")).click();
            case 13, 14, 24, 34, 36, 41, 45, 48 -> driver2.findElement(AppiumBy.xpath(path + "[9]")).click();
            case 15, 18, 20, 30, 31, 39, 40 -> driver2.findElement(AppiumBy.xpath(path + "[7]")).click();
            case 17, 19, 22, 26, 28, 33, 37, 38, 42, 46, 47 ->
                    driver2.findElement(AppiumBy.xpath(path + "[6]")).click();
            case 21, 25, 32, 35, 44, 49 -> driver2.findElement(AppiumBy.xpath(path + "[10]")).click();
        }
    }

    public void adminTapCompleteButton() {
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Complete\"]")).click();
        afterTest();
    }
}
