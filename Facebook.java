package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		String title=driver.getTitle();
		
		System.out.println(title);
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//create account Create New Account
		driver.findElement(By.linkText("Create New Account")).click(); 
		
		// enter first name firstnameI
		driver.findElement(By.name("firstname")).sendKeys("Test");
		
		// enter surname name    lastname
		driver.findElement(By.name("lastname")).sendKeys("Leaf");
		
		// phone number  reg_email__
		driver.findElement(By.name("reg_email__")).sendKeys("9127236987");
		
		//new password reg_passwd__
		driver.findElement(By.name("reg_passwd__")).sendKeys("test");
		
		//Date dropdown 
		WebElement datesource = driver.findElement(By.name("birthday_day"));
		Select datedrop = new Select(datesource);
		datedrop.selectByIndex(15);
		
		//month dropdown birthday_month
		WebElement monthsource = driver.findElement(By.name("birthday_month"));
		Select monthdrop =  new Select(monthsource);
		monthdrop.selectByValue("3");
		
		//year drop down birthday_year
		WebElement yearsource = driver.findElement(By.name("birthday_year"));
		Select yeardrop = new Select(yearsource);
		yeardrop.selectByVisibleText("1986");
		
		//radio female sex
		driver.findElement(By.name("sex")).click();
		
		// singin
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		

	}

}
