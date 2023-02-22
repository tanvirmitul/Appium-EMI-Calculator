package setup;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Setup {
    public AndroidDriver driver;
    public static final String Package_Name="com.continuum.emi.calculator";
    @BeforeTest
    public AndroidDriver setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appPackage", "com.continuum.emi.calculator");
        caps.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        caps.setCapability("app",System.getProperty("user.dir")+"/src/test/resources/emicalculator.apk");
        caps.setCapability("autoGrantPermissions", true);
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url, caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }
}
