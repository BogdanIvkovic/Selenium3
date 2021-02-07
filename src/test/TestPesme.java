package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.Home;
import objects.Pesme;

	public class TestPesme {
	
		private static WebDriver driver;
	@BeforeClass
	
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\driver\\Chromedriver.exe");
		 driver = new ChromeDriver();
}
  @Test
  public void testSearch() {
	  driver.navigate().to("https://www.youtube.com/watch?v=dQw4w9WgXcQ&ab_channel=RickAstleyVEVO");
	  Home.typeSong(driver);
	  Home.pressSearch(driver);
	  String current = driver.getCurrentUrl();
	  String Expected = Pesme.URL;
	  
	  Assert.assertEquals(current, Expected);
	  
  }
}
