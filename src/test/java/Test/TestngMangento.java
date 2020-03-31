package Test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestngMangento {

	@Test
	public void negative_login() throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.magento.com");
		driver.findElement(By.xpath("//*[@id=\"block-header\"]/ul/li[8]/a/span[1]/i")).click();
		driver.findElement(By.name("login[username]")).sendKeys("sii.yamujala@gmail.com");
		driver.findElement(By.name("login[password]")).sendKeys("ramindu");
		driver.findElement(By.name("send")).click();
		Thread.sleep(5000);
		String error = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div")).getText();
		System.out.println(error);
		if(error.equals("Invalid login or password."))
		{
			System.out.println("testcase Pass");
			
		}else
			
		{
			System.out.println("Test case is Fail");
		}
driver.quit();
	}


  @Test
public void g_login(){

	WebDriver driver1 = new ChromeDriver();
	driver1.manage().window().maximize();
	driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver1.get("https://www.google.com");
	driver1.findElement(By.name("q")).sendKeys("Selenium");
	driver1.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]/div/span")).click();
	driver1.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div[1]/div/div[1]/a/h3")).click();
	
	String title = driver1.getTitle();
	
	if(title.equals("SeleniumHQ Browser Automation"))
	{
		System.out.println("TestCase Pass");
		
	}
	else 
	{
		System.out.println("Test case is failed");
	}
}
			}
		
	

