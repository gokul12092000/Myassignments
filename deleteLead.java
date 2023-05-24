package week4day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver .get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("DemoSalesManager");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login=driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa=driver.findElement(By.id("label"));
		crmsfa.click();
		WebElement leadButton=driver.findElement(By.linkText("Leads"));
		leadButton.click();
		WebElement findlead=driver.findElement(By.linkText("Find Leads"));
		findlead.click();
		WebElement phone=driver.findElement(By.linkText("phone"));
		phone.click();
		WebElement phoneNumber=driver.findElement(By.name("phoneNumber"));
		phoneNumber.sendKeys("9087742296");
		WebElement findLeadsButton=driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeadsButton.click();
		WebElement firstLead=driver.findElement(By.xpath("//a[text()='15582']"));
		System.out.println(firstLead.getText());
		firstLead.click();
		
		
		
		
		
		

	}

}
