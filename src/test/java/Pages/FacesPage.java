package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class FacesPage extends InitialHooks {

    Helper helper = new Helper();
    String pathObject = "(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])";

    public void adminTapBeginItem() {
        switchAdminDriver();
        helper.wait(15000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin items\"]")).click();
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForFaces(int item) {
        helper.wait(300);
        switch (item) {
            case 1 -> driver2.findElement(AppiumBy.xpath(pathObject + "[2]")).click();
            case 2, 11, 7, 6, 5 -> driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
            case 3, 4 -> driver2.findElement(AppiumBy.xpath(pathObject + "[3]")).click();
            case 8 -> driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
            case 9, 15, 10 -> driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            case 12, 14 -> driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            case 13 -> driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            case 16, 23, 19 -> driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            case 17 -> driver2.findElement(AppiumBy.xpath(pathObject + "[12]")).click();
            case 20 -> driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            case 21, 24 -> driver2.findElement(AppiumBy.xpath(pathObject + "[13]")).click();
            case 22 -> driver2.findElement(AppiumBy.xpath(pathObject + "[11]")).click();
            case 25 -> driver2.findElement(AppiumBy.xpath(pathObject + "[14]")).click();
            case 18 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                helper.wait(30000);
            }
        }
    }

    public void adminTapBeginItemSecondPart() {
        switchAdminDriver();
        helper.wait(15000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin items\"]")).click();
        helper.wait(3000);
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForFacesSecondPart(int item) {
        helper.wait(500);
        switch (item) {
            case 1 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[2]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[3]")).click();
            }
            case 2, 6 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
            }
            case 3 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 4, 5, 10 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 7 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 8 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            }
            case 9 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            }
            case 11 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 12 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 13 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[11]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[12]")).click();
            }
            case 14 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 15 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 16 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[11]")).click();
            }
            case 17 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[12]")).click();
            }
            case 18 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[12]")).click();
            }
            case 19 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[13]")).click();
            }
            case 20 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[11]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[16]")).click();
                helper.wait(45000);
            }
            case 21 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[13]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[16]")).click();
            }
            case 22 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[16]")).click();
            }
            case 23 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[12]")).click();
            }
            case 24 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[13]")).click();
            }
            case 25 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[12]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[14]")).click();
            }
        }
    }

    public void adminTapBeginItemMemoryFaces() {
        switchAdminDriver();
        helper.wait(12000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin item\"]")).click();
        switchClientDriver();
        helper.wait(5000);
    }

    public void clientSelectCorrectOptionForMemoryFaces(int item) {
        helper.wait(8500);
        switch (item) {
            case 1 -> driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
            case 2 -> driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            case 3 -> driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            case 4 -> driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            case 5 -> driver2.findElement(AppiumBy.xpath(pathObject + "[14]")).click();
            case 6 -> driver2.findElement(AppiumBy.xpath(pathObject + "[16]")).click();
            case 7 -> driver2.findElement(AppiumBy.xpath(pathObject + "[20]")).click();
            case 8, 9 -> driver2.findElement(AppiumBy.xpath(pathObject + "[18]")).click();
            case 10 -> driver2.findElement(AppiumBy.xpath(pathObject + "[30]")).click();
        }
    }

    public void adminTapBeginItemsMemoryFacesPart2() {
        switchAdminDriver();
        helper.wait(20000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin items\"]")).click();
        helper.wait(9000);
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForMemoryFacesPart2(int item) {
        helper.wait(9000);
        switch (item) {
            case 1 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[22]")).click();
            }
            case 2 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[60]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[69]")).click();
            }
            case 3 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[45]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[58]")).click();
            }
            case 4 -> {
                helper.wait(4000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[51]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[82]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[83]")).click();
            }
            case 5 -> {
                helper.wait(4000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[61]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[62]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[93]")).click();
            }
            case 6 -> {
                helper.wait(4000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[77]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[78]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[80]")).click();
            }
            case 7 -> {
                helper.wait(8000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[65]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[86]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[105]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[108]")).click();
            }
            case 8 -> {
                helper.wait(8000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[78]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[99]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[100]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[118]")).click();
            }
            case 9 -> {
                helper.wait(15000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[81]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[82]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[106]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[108]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[130]")).click();
            }
            case 10 -> {
                helper.wait(15000);
                driver2.findElement(AppiumBy.xpath(pathObject + "[94]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[96]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[118]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[141]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[143]")).click();
            }
        }
    }

    public void adminTapCompleteButton() {
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Complete\"]")).click();
    }
}

