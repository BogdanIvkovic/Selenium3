package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pesme {
	public static final String URL = "https://www.youtube.com/results?search_query=rick+astley+never+gonna+give+you+up+";
		private static final String PESMA_XPATH = "//*[@id=\"movie_player\"]/div[1]/video";	
		
		
		public static void  PustiPesmu(WebDriver driver) {
			WebElement we = driver.findElement(By.xpath(PESMA_XPATH));
			we.click();
}
}

