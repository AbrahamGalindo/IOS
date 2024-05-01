package Pages;

import Helpers.Helper;
import Hooks.InitialHooks;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WMIPage extends InitialHooks {

    Helper helper = new Helper();
    String pathObject = "(//XCUIElementTypeOther[@name=\"StimBlockAnimatedViewContainer\"])";

    public void adminTapBeginItem() {
        createClientDriver();
        helper.wait(10000);
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin items\"]")).click();
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForWMI(int item) {
        helper.wait(70);
        switch (item) {
            case 1 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][1]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][2]")).click();
            }
            case 2 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][5]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();

            }
            case 3, 5 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][4]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();

            }
            case 4 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][5]")).click();

            }
            case 6 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][4]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();


            }
            case 7 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][5]")).click();
            }
            case 8 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][5]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
            }
            case 9 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][5]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 10 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][5]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 11 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                helper.wait(25000);
            }
            case 12 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
            }
            case 13 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
            }
            case 14 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 15 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();

            }
            case 16 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 17 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
            }
            case 18 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
            }
            case 19 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
            }
            case 20 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                helper.wait(3000);
            }
            case 21 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
            }
            case 22 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 23 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
            }
            case 24 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 25 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
            }
            case 26 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
            }
            case 27 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
            }
            case 28 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
            }
            case 29 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
            }
            case 30 -> {
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][9]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][6]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][7]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][10]")).click();
                driver2.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeOther[`name == \"StimBlockAnimatedViewContainer\"`][8]")).click();
            }
        }
    }
       /* switch (item) {
            case 1 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[2]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[1]")).click();
            }
            case 2 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 3, 5 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 4 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
            }
            case 6 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 7 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
            }
            case 8 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 9 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 10 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 11 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            }
            case 12 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 13 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 14 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 15 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 16 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 17 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 18 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 19 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            }
            case 20 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 21 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 22 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 23 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 24 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 25 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 26 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 27 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 28 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 29 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 30 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
            }
        }
    }*/

    public void adminTapBeginItemPart2() {
        switchClientDriver();
        switchAdminDriver();
        helper.wait(15000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Begin items\"]")).click();
        switchClientDriver();
    }

    public void clientSelectCorrectOptionForWMISecondPart(int item) {
        helper.wait(8000);
        switch (item) {
            case 1 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[1]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[3]")).click();
            }
            case 2, 4 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
            }
            case 3 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
            }
            case 5 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 6 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[4]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 7 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 8 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
            }
            case 9 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
            }
            case 10 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[5]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 11, 17 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 12 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 13, 14 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 15 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 16 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 18 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 19 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 20 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
            }
            case 21 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 22 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 23 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 24 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 25 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
            case 26 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 27 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 28 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
            }
            case 29 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
            }
            case 30 -> {
                driver2.findElement(AppiumBy.xpath(pathObject + "[10]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[7]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[8]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[6]")).click();
                driver2.findElement(AppiumBy.xpath(pathObject + "[9]")).click();
            }
        }
    }

    public void adminTapCompleteButton() {
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Complete\"]")).click();
    }

    public void adminTapStartAudio() {
        helper.wait(2000);
        switchAdminDriver();
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"start button\"]")).click();
    }

    public void adminTapPracticeWMI() {
        switchAdminDriver();
        helper.wait(30000);
        switchAdminDriver();
        helper.wait(16000);
        driver.findElement(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"right-arrow-1 button\"]")).click();
    }
}
