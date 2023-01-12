package Normal_Execution_topic;

import java.util.Set;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_multiple_windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sainath.dabhade\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		
		System.out.println(actualTitle);
		
		String ExpectedTitle = "Guru99 Bank Home Page" ;
		
		if (actualTitle == ExpectedTitle) {
			System.out.println("pass");
			
			
		}
		else {
			System.out.println("fail");
		}
		
		
		driver.findElement(By.xpath("//*[contains(text(), 'Click Here')]")).click();
		
		Set <String > set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String mainWindowid = itr.next();
		String  childwindowid = itr.next();
		driver.switchTo().window(childwindowid);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@name = 'emailid']")).sendKeys("sdabhade@gmail.com");
		driver.findElement(By.xpath("//*[@name = 'btnLogin']")).click();
		
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("//body/table//td[.='mngr76080 ']")).getText();
		
		System.out.println(text);
		
		driver.switchTo().window(mainWindowid);
		
		System.out.println(driver.getTitle());
	}

}
