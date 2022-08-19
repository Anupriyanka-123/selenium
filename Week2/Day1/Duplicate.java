package Week2.Day1;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Duplicate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.id("Create Lead")).click();
		driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("Test leaf");
		driver.findElement(By.id("CreateLeadForm_firstName")).sendKeys("Anupriyanka");
		driver.findElement(By.id("CreateLeadForm_lastName")).sendKeys("B");
		driver.findElement(By.id("CreateLeadForm_firstNameLocal")).sendKeys("anu");
		driver.findElement(By.id("CreateLeadForm_description")).sendKeys("selenium");
		driver.findElement(By.id("CreateLeadForm_primaryEmail")).sendKeys("anupriyanka0505@gmail.com");
		driver.findElement(By.id("smallsubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("CreateLeadForm_companyName")).clear();
		driver.findElement(By.id("CreateLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("CreateLeadForm_firstName")).clear();
		driver.findElement(By.id("CreateLeadForm_firstName")).sendKeys("gokul");
		driver.findElement(By.id("smallsubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		
	}
		
		
		
}		