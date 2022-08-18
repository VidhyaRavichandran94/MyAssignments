package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf Software");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravichandran");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vidhya");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		
		WebElement industryEnumId=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select opt=new Select(industryEnumId);
		opt.selectByValue("IND_SOFTWARE");
		WebElement currencyUomId=driver.findElement(By.id("createLeadForm_currencyUomId"));
		Select option=new Select(currencyUomId);
		option.selectByValue("CAD");
		WebElement ownershipEnumId=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select options=new Select(ownershipEnumId);
		options.selectByValue("OWN_PARTNERSHIP");

		
		
		
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Webdriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidhyaravichandran94@gmail.com");

	}

}