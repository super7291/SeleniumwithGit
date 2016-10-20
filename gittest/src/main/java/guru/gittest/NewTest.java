package guru.gittest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	protected WebDriver driver;
	@Test
	public void gurututorial() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String eTitle="Meet Guru99";
		String aTitle="";
		driver.get("http://www.guru99.com");
		aTitle=driver.getTitle();
		if(aTitle.contentEquals(eTitle)){
			System.out.println("Test passed!");
		}
		else{
			System.out.println("Test failed!");
		}
		driver.close();
	}
}
