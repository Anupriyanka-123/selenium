package Week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Checkbox 
{

	public static void main(String[] args) {
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.get(" https://www.leafground.com/checkbox.xhtml");
		        driver.findElement(By.xpath("//span[text()='Basic']")).click();
		        driver.findElement(By.xpath("//span[text()='Ajax']")).click();
		        driver.findElement(By.xpath("//label[text()='Java']")).click();
		        System.out.println("Button is Disabled " +driver.findElement(By.xpath("//span[text()='Disabled']")).isDisplayed());//Verify if check box is disabled
		       
		      }

		}
		