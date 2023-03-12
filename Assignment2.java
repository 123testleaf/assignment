package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ganesh");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("yeddula");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ganesh reddy yeddula");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing team");
	driver.findElement(By.id("createLeadForm_description")).sendKeys("automation testing");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("yeddula.195@gmail.com");
	WebElement state =  driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	
    Select sta = new Select(state);
    sta.selectByVisibleText("New York");
    
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("514471");
   driver.findElement(By.name("submitButton")).click();
   
   
   driver.findElement(By.linkText("Edit")).click();
   driver.findElement(By.id("updateLeadForm_description")).clear();
   driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("forimp doc update");
   driver.findElement(By.name("submitButton")).click();
   

    String title = driver.getTitle();
    System.out.println(title);
   
    driver.close();
    
   
   
   
   

	}

}
