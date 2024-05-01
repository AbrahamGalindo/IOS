package Hooks;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.junit.After;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;


public class InitialHooks {

    public AppiumDriver driver;
    public AppiumDriver driver2;
    public XCUITestOptions optionsAdmin = new XCUITestOptions();
    public XCUITestOptions optionsClient = new XCUITestOptions();
    public String driverType = "";

    public static int age = 0;

    public void createAdminDriver() {
        driverType = "Admin";
        optionsAdmin.setDeviceName("iPad Pro (12.9-inch) (6th generation)").setPlatformVersion("16.4").autoAcceptAlerts();//.setIsHeadless(true);//.setBundleId("com.summitdigitalgp.wps.ies").setNoReset(true);
        try {
            driver = new IOSDriver(new URL("http://0.0.0.0:10001"), optionsAdmin);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void createClientDriver() {
        driverType = "Client";
        optionsClient.setDeviceName("iPad (10th generation)").setPlatformVersion("16.4").autoAcceptAlerts();//.setIsHeadless(true);//.setBundleId("com.summitdigitalgp.wps.ies").setNoReset(true);
        try {
            driver2 = new IOSDriver(new URL("http://0.0.0.0:10000"), optionsClient);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchAdminDriver() {
        try {
            driver2.quit();
        } catch (Exception e) {

        }
        createAdminDriver();
    }

    public void switchClientDriver() {
        try {
            driver.quit();
        } catch (Exception e) {

        }
        createClientDriver();
    }

    @After
    public void afterTest() {
        driver.quit();
    }
}
