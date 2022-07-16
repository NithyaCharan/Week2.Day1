package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		//call the web driver manager for the browser driver
		WebDriverManager.chromedriver().setup();
		
		//launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//maximize the browser
		driver.manage().window().maximize();	
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithya");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Santhanaraman");

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Nithya");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Nithya");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working in company for 8+ years");

		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("nithya.s.raman@gmail.com");
		
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select select = new Select(dropDown1);
		
		select.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);

	}

}
