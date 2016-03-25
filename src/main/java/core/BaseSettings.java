package core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class BaseSettings {

    private static AndroidDriver driver;

    public static AndroidDriver getDriver() throws Throwable {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.1");

        if (driver == null)
            driver = new AndroidDriver(new URL("127.0.0.1:4838"), capabilities);

        return driver;
    }

}
