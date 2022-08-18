package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8989898989");
		driver.findElement(By.xpath("//div[contains(@class,'x-panel-body x-panel-body-noborder')]//button")).click();
		String lead_id=driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]//a)[1]")).getText();
		System.out.println(lead_id);
		driver.findElement(By.xpath("(//div[contains(@class,'x-grid3-col-partyId')]//a)[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("8989898989");
		driver.findElement(By.xpath("//div[contains(@class,'x-panel-body x-panel-body-noborder')]//button")).click();
		String no_records=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		System.out.println(no_records);
		driver.close();
		
		
		
		

	}

}
