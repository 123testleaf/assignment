package classroomtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.amazon.in/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys("boys bags");
		 String text = driver.findElement(By.xpath("//span[contains(text(),'results for')]")).getText();
		 
		 System.out.println(text);
		 
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		 driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		 String text2 = driver.findElement(By.xpath("//span[text() = 'Artistix - Quality that stands out']")).getText();
		 
		 System.out.println(text2);
		 
		 String currentUrl = driver.getCurrentUrl();
		 
		 System.out.println(currentUrl);
		 
		 driver.close();
	}

}
