package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Webdriver");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vidhyaravichandran94@gmail.com");
		driver.findElement(By.name("submitButton")).click(); 
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhyaaa");
		driver.findElement(By.name("submitButton")).click(); 
		String title_duplicate = driver.getTitle();
		System.out.println(title_duplicate);
		
		
	}

}
