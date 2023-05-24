package week4day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver .get("http://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement createNewButton = driver.findElement(By.xpath("//*[@id=\'u_0_5_oU\']"));
		createNewButton.click();
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys("gokul");
		WebElement lastName=driver.findElement(By.name("lastName"));
		lastName.sendKeys("A");
		WebElement mobileNumber=driver.findElement(By.name("reg_email_"));
		mobileNumber.sendKeys("9087742296");
		WebElement password=driver.findElement(By.id("password_step_input"));
		password.sendKeys("gokul123");
		WebElement month=driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByVisibleText("sep");
		WebElement day=driver.findElement(By.id("day"));
		Select day1=new Select(day);
		day1.selectByVisibleText("12");
		WebElement year=driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("2000");
		WebElement sex=driver.findElement(By.xpath("//label[text()='Female']"));
		sex.click();
		
		
		
		
		
		
				
		

	}

}
