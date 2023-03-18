package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		
		opt.addArguments("--remote-allow-origines=*");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://en-gb.facebook.com");
		driver.manage().window().maximize();
	
		
		driver.findElement(By.xpath("//form[@class='_9vtf']/div[@class='_6ltg']/a")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ganesh Reddy");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("yeddula");
		driver.findElement(By.xpath("//input[@id='u_j_g_Td']")).sendKeys("9642864209");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("any@1995");
		     WebElement day = driver.findElement(By.id("day"));
		     
		     Select day1 = new Select(day);
		     day1.selectByValue("14");
		     
		  WebElement month =  driver.findElement(By.id("month"));
		  Select mar = new Select(month);
		  mar.selectByValue("MAY");
		  
		  WebElement year = driver.findElement(By.id("year"));
		  
		  Select yer = new Select(year);
		  
		  yer.selectByValue("1995");
		  
		  driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba']/input)[1]")).click();
		  
		  
		
	
		
	}
}
