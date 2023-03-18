package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
    driver.get("http://leaftaps.com/opentaps");
    
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
    
   driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
   
   driver.findElement(By.xpath("//a[contains(text(), 'CRM/SFA')]")).click();
   
   driver.findElement(By.xpath("//a[contains(text(), 'Leads')]")).click();
   
  // driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')])")).click();
   
   driver.findElement(By.xpath("//a[contains(text(), 'Create Lead')]")).click();
   
   driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("AAtral");
   
   driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ganesh");
   
   driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("yeddula");
   driver.findElement(By.xpath("//input[@name='submitButton']")).click();
   
   
   

	}

}
