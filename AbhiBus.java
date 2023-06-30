package Assesment.java;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notification","start-maximized");
		ChromeDriver driver = new ChromeDriver(option);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.abhibus.com/");
        driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[1]")).sendKeys("Chennai");
        driver.findElement(By.xpath("(//li[text()='Chennai'])[1]")).click();
        driver.findElement(By.id("destination")).sendKeys("Bangalore");
        driver.findElement(By.xpath("(//li[text()='Bangalore'])[1]")).click();
        driver.findElement(By.id("datepicker1")).click();
        driver.findElement(By.xpath("//a[text()='1']")).click();
        driver.findElement(By.xpath("//a[text()='Search']")).click();
        String result = driver.findElement(By.xpath("(//div[@class='search-column1'])[1]/h2")).getText();
        System.out.println(result);
        driver.findElement(By.id("Bustypes4")).click();
        String seats = driver.findElement(By.xpath("(//div[@class='search-column2-col1'])[1]/p")).getText();
        System.out.println(seats);
        driver.findElement(By.xpath("(//a[@class='btn-seatselect book1']/span)[1]")).click();
        driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[1]")).click();
        String noOfSeats = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
        System.out.println("No Of Seats : "+ noOfSeats );
        String fare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
        System.out.println("fare : "+ fare );
        WebElement bPoint = driver.findElement(By.id("boardingpoint_id"));
        Select boardingPoint = new Select(bPoint);
        boardingPoint.selectByVisibleText("Shollinganallaur-21:16");
        WebElement dPoint = driver.findElement(By.id("droppingpoint_id"));
        Select droppingPoint=new Select(dPoint);
        droppingPoint.selectByVisibleText("Electronic City Toll Gate-05:07");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();


	}


		
		

	}


