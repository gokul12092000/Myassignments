package Assesment.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("disable-notifications","start-maximized");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'])")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()='for Boys']")).click();
		String result1=driver.findElement(By.xpath("(//h1[@class='a-size-base a-text-normal']/div/div/div/div)[1]")).getText();
		System.out.println(result1);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//l[@class='a-icon a-icon-checkbox'])[4]")).click();
		WebElement sort1= driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']"));
		Select sort1=new Select(sort);
		sort1.selectByVisibleText("Newest Arrivals");
		String firstbag = driver.findElement(By.xpath("(//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2'])[1]")).getText();
		System.out.println(firstbag);
		String offer = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']/span)[2]")).getText();
		System.out.println(offer);

		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}


		
		}

	
	

	}


