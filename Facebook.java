package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("Https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tamil");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Balan");
		driver.findElement(By.xpath("//input[@name='reg_email__\']")).sendKeys("841841651");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("tamil");
			
	}

}
