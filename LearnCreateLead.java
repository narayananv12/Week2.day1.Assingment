package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
	
		driver.get("http://leaftaps.com/opentaps/control/main");
	
		String title=driver.getTitle();
	
		System.out.println(title);
	
		driver.manage().window().maximize();
		
		WebElement webUser = driver.findElement(By.id("username"));
		webUser.sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		
		driver.findElement (By.className("decorativeSubmit")).click();
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("Leaf");  
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test12");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tester");
		
		//Source dropdown
		WebElement DropSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpsource =  new Select (DropSource);
		drpsource.selectByIndex(1);
		

		WebElement DropMarketcampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select drpDropMarketcampaign =  new Select (DropMarketcampaign);
		drpDropMarketcampaign.selectByValue("9000");
	
			
		
		//Firstlocalname
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test12");
		
		//Last Name local
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Tester");
		
		//Salutaion
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
		
		//Date of Birth
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/15/86");
		
		
		//Title
		
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Any");
		
		//Department
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		
		//AnnualRevenue
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("10000000");
		
		
		//Prefered Currency drop down
		
		//WebElement Currency = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		//Select drpCurrency =  new Select (Currency);
		//drpCurrency.selectByValue("USD");
		
	
		//Industry drop down
		WebElement Industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpIndustry = new Select (Industry);
		drpIndustry.selectByValue("IND_SOFTWARE");
		
		//Number of employees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
	
		
		WebElement Ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpOwnership =  new Select (Ownership);
		drpOwnership.selectByValue("OWN_PROPRIETOR");
		
		//SICcode
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("05");
		
		//TickerSymbol
		
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");
		
		//Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is field for description");
		
		//Important Note
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("This is field for ImportantNote");
		
		//Country code
		WebElement CountryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		
		CountryCode.clear();
		CountryCode.sendKeys("91");

		//Areacode
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044 ");
		
		//Phone Number
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("25639874");
		
		//Extension
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("256");
		
		
		//Person to Ask for
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("no details ");
		
		//E-mailAddress
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		
		//WebURL
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
		
		
		//To Name
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Leaf ");
		
		
		//Alternatename
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Leaf1 ");
		
		//Address Line1
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("xys street" );
		
		//Address Line 2
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("adyar ");
	
		//City
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		
		//State Province dropdown
		WebElement drop6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drpdrop6 = new Select(drop6);
		drpdrop6.selectByVisibleText("Alabama");
		
		
		//Postal Code
		
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600045");
		
		//Country Dropdown
		
		//WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		//Select drpcountry = new Select(country);
		//drpcountry.selectByVisibleText("United States");
		
		
		
		//Postal code Extension
		driver.findElement(By.id("createLeadForm_generalPostalCode"));
		
	
		
		
		
		driver.findElement(By.className("smallSubmit")).click();
		
		
		String title1 = "View Lead | opentaps CRM";
		String ViewTitle = driver.getTitle();

		if(title1.equals(ViewTitle)) {
			System.out.println(" In View Lead page");
		}
		else
			System.out.println(" Not in the View Lead page");

		
		
		
	}




	}


