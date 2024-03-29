package classroomtask;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Redbus {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		
		
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
     
     driver.findElement(By.id("src")).sendKeys("chennai");
     driver.findElement(By.xpath("//li[text() = 'Chennai']")).click();
     driver.findElement(By.id("dest")).sendKeys("hyderbad");
     driver.findElement(By.xpath("//li[text() = 'Hyderabad']")).click();
     driver.findElement(By.id("onward_cal")).click();
     driver.findElement(By.xpath("(//td[@class=\"wd day\"])[1]")).click();
     
       driver.findElement(By.id("search_btn")).click();
       
       String count = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
       
       System.out.println(count);
       
      // driver.findElement(By.xpath("//input[@id='bt_SLEEPER']")).click();
       
       WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
       driver.executeScript("arguments[0].click();",sleeper);
       
       String count1 = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
       
       System.out.println(count1);
       
       String title = driver.getTitle();
       
       System.out.println(title);
       
       driver.close();
       
       
       
       
       
       
       
       
       
       

	}

}
