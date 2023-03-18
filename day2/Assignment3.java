package week2.day2;

import org.apache.commons.math3.linear.DefaultRealMatrixChangingVisitor;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("//acme-test.uipath.com/login");
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')] ")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.xpath("//a[text() = 'Log Out']")).click();
		
		driver.close();
		
		
	}

}
