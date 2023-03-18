package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.id("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.xpath("//a[text() = 'Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Ganesh reddy");
		driver.findElement(By.id("lastNameField")).sendKeys("yeddula");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ganesh");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("testing team QA");
		driver.findElement(By.id("createContactForm_description")).sendKeys("QAtesting team");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("yeddula.195@gmail.com");
		WebElement cont = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select country = new Select(cont);
		
		country.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.xpath("//a[text() = 'Edit']")).click();
		// driver.findElement(By.linkText("Edit")).click();
		   driver.findElement(By.id("updateLeadForm_description")).clear();
		   driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("forimp doc update");
		   driver.findElement(By.name("submitButton")).click();
		   

		    String title = driver.getTitle();
		    System.out.println(title);
		   
		
		    
		
		

	}

}
