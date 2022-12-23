package co.com.pragma.setup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SetupApp {

    public static SetupApp onThePhone(){
        return new SetupApp();
    }

    public AndroidDriver getDriver(){

        DesiredCapabilities capabilities= new DesiredCapabilities();

        capabilities.setCapability(MobileCapabilityType.UDID, "343b06f4"); // modificar
        //Instale
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.google.android.calculator");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.calculator2.Calculator");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, false);

        AndroidDriver driver = null;
        try {
            driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        return driver;
    }


}
