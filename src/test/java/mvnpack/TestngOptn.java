package mvnpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


  
    public class TestngOptn {
	
	
	
    @Test(priority=2)
	
	
	public void sampleMethodone() {
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Your Store";
		Assert.assertEquals(actualTitle, expectedTitle);
		driver.quit();
		
		
		
	}
	

	     @Test(priority=3)
	
	
	     public void sampleMethod() {
		
		WebDriver driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://tutorialsninja.com/demo/";
		Assert.assertEquals(actualURL, expectedURL);
		driver.quit();
		
	
	
}

}
