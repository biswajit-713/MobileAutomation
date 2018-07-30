package cucumbertutorial.screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LaunchScreen extends BaseScreen{
    private AppiumDriver appiumDriver;

    private WebElement register;

    public LaunchScreen() throws MalformedURLException {
        super();

        File app = new File("/Users/biswajip/Documents/mobile-testing/com.dbs.dbspaylah_2018-05-16.apk");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        caps.setCapability(MobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        this.appiumDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        register = ((AndroidDriver) this.appiumDriver).findElementByAndroidUIAutomator(
                "new UiSelector().text(\"REGISTER\")"
        );

    }

    public void waitForHomeScreen(){
        WebDriverWait wait = new WebDriverWait(this.appiumDriver, 30);
        wait.until(ExpectedConditions.visibilityOf(register));
    }

    public AppiumDriver registerAsDBSCustomer(){

        waitForHomeScreen();
        register.click();
        return this.appiumDriver;
    }
}
