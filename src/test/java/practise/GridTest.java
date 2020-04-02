package practise;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
@Test
public void test() throws MalformedURLException {

DesiredCapabilities cap=new DesiredCapabilities();
cap.setBrowserName("chrome");
cap.setPlatform(Platform.WINDOWS);

//Chrome option
ChromeOptions options = new ChromeOptions();
options.merge(cap);

//Hub URL
String huburl ="http://localhost:4444/wd/hub";

// Create driver with hub address and capability
WebDriver driver=new RemoteWebDriver(new URL(huburl), options);

//URL url=new URL("http://localhost:4444/wd/hub");
// WebDriver driver=new RemoteWebDriver(url,options);

driver.get("http://demosite.center/wordpress/wp-login.php");
driver.manage().window().maximize();
System.out.println(driver.getTitle());
driver.quit();
}
}
