package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.partialLinkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Tamil");
	    driver.findElement(By.id("lastNameField")).sendKeys("Balan");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Balan");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Tamil");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Civil");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("TestLeaf");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("balanvel24@gmail.com");
	    WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	    Select dd = new Select(state);
	    dd.selectByVisibleText("New York");
	    driver.findElement(By.className("smallSubmit")).click();
	    driver.findElement(By.className("subMenuButton")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("TestLeaf");
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    System.out.println(driver.getTitle());
	    
	    
	    
	    
		
		
		
		
	}

}
