package Normal_Execution_topic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_pop_up_alert {
	
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sainath.dabhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//*[@name ='cusid']")).sendKeys("123");
		driver.findElement(By.xpath("//*[@name ='submit']")).click();
		
		Thread.sleep(4000);
		
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		
		
	}

}
