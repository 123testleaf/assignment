package classroomtask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Bookmyshow {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://in.bookmyshow.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		
		String title = driver.getCurrentUrl();
		
		System.out.println(title);
		
		driver.findElement(By.xpath("//span[contains(text(),'Search for Movie')]")).click();
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("sir");
		
		driver.findElement(By.xpath("//strong[text() = 'Sir'][1]")).click();
		driver.findElement(By.xpath("//span[text() = 'Book tickets']")).click();
		String text2 = driver.findElement(By.xpath("//a[text() = 'AMB Cinemas: Gachibowli']")).getText();
		
		System.out.println(text2);
		
		driver.findElement(By.xpath("//div[text() = 'VIP SCREEN'][@class ='attribute']")).click();
		driver.findElement(By.id("btnPopupAccept")).click();
		
		driver.findElement(By.xpath("//div[contains(text() , 'Select Seats')]")).click();
		System.out.println("test");
		driver.findElement(By.xpath("//div[@id= 'A_9_0114'][a]")).click();
		driver.findElement(By.xpath("////div[@id='A_9_0111'][a]")).click();
		driver.findElement(By.xpath("//a[@id='btmcntbook'][text() = 'Pay ']")).click();
		
		
		
		
		
		
		
		
		
		

	}

}
