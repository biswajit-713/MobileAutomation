package cucumbertutorial.configuration;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    private AppiumDriver driver;
    private final String ANDROID = "Android";
    private final String IOS = "iOS";

    //TODO - start appium server

    //TODO - stop appium server

    //TODO - initialize appium driver

    //TODO - return appium driver
    public AppiumDriver getDriver() throws MalformedURLException {

        if (this.getMobilePlatform().equalsIgnoreCase(ANDROID)){
            driver = new AndroidDriver(new URL(this.getRemoteAppiumSession()), this.getCapabilities());
        } else if (this.getMobilePlatform().equalsIgnoreCase(IOS)) {
            driver = new IOSDriver(new URL(this.getRemoteAppiumSession()), this.getCapabilities());
        }

        return driver;
    }

    private DesiredCapabilities getCapabilities(){

        String platform = this.getMobilePlatform();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
        caps.setCapability(MobileCapabilityType.LAUNCH_TIMEOUT, 500000);
        caps.setCapability(MobileCapabilityType.APP, this.getAppPath(platform));

        return caps;
    }

    private String getAppPath(String platform){

        File app = null;
        String apkPath = "/Users/biswajip/Documents/mobile-testing/com.dbs.dbspaylah_2018-05-16.apk";
        String ipaPath = "/Users/biswajip/Documents/mobile-testing/com.dbs.dbspaylah_2018-05-16.apk";

        if (this.getMobilePlatform().equalsIgnoreCase("Android")){
            app = new File(apkPath);
        } else if (this.getMobilePlatform().equalsIgnoreCase("iOS")) {
            app = new File(ipaPath);
        }

        return app.getAbsolutePath();
    }

    private String getMobilePlatform(){
        //TODO - set the OS platform
        String mobilePlatform = "Android";

        return mobilePlatform;
    }

    private String getRemoteAppiumSession(){
        return "http://127.0.0.1:4723/wd/hub";
    }
}
