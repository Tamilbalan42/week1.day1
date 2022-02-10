package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driver = new EdgeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Email")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("balan@gmail.com");
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("10302")).click();
	driver.findElement(By.className("subMenuButton")).click();
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();
	
	
}
}
