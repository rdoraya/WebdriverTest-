package MavenDemo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class GoogleTest {
	private WebDriver driver;
 
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	//ChromeOptions options = new ChromeOptions();
	//driver = new RemoteWebDriver(new URL("http://0.0.0.0:4444/wd/hub"), options);
	driver = new ChromeDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  
  @Test
  public void f() {
	driver.get("http://www.google.com");
	System.out.println(driver.getTitle());
	Assert.assertEquals(driver.getTitle(), "Google");
  }

}
