package core;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseSettings {

    private static AndroidDriver driver;
    public static AndroidDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        return driver;
    }

}
