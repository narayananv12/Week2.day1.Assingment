package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title=driver.getTitle();
		
		System.out.println(title);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//first name UserFirstName
		driver.findElement(By.name("UserFirstName")).sendKeys("Test");
		
		//Last name  UserFirstName
		driver.findElement(By.name("UserLastName")).sendKeys("Leaf");
	
		//workemail name
		driver.findElement(By.name("UserEmail")).sendKeys("test1@gmail.com");
		//companyname
		driver.findElement(By.name("CompanyName")).sendKeys("Testleaf");
		//phonenumber
		
		driver.findElement(By.name("UserPhone")).sendKeys("1235698706");
		
		//Job title dropbox
		WebElement titledrop = driver.findElement(By.name("UserTitle"));
		Select drptitle = new Select(titledrop);
		drptitle.selectByIndex(2);
		
		//compnay name CompanyName
		driver.findElement(By.name("CompanyName")).sendKeys("TestLeaf");
		
		//employees
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select drpemployee = new Select(employee);
		drpemployee.selectByValue("950");
		
		
	
		//country name CompanyCountry
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select drpcountry = new Select(country);
		drpcountry.selectByVisibleText("India");
		
		//checkbox
		driver.findElement(By.className("checkbox-ui")).click();
		
		 driver.close();
		
	}

}
