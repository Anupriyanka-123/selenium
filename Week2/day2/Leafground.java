package Week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Leafground {

	public static void main(String[] args)
			{
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				driver.findElement(By.name("j_idt88:name")).sendKeys("ANU");
				driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("--INDIA");
				driver.findElement(By.id("j_idt88:j_idt95")).click();
				driver.findElement(By.id("j_idt88:j_idt95")).clear();
				driver.findElement(By.id("j_idt88:j_idt97")).click();
				driver.findElement(By.id("j_idt88:j_idt97")).sendKeys("Can you clear me, please?");
				driver.findElement(By.id("j_idt88:j_idt99")).click();
				driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("anu0505@gmail.com");
				driver.findElement(By.id("j_idt88:j_idt101")).click();
				driver.findElement(By.id("j_idt88:j_idt101")).sendKeys("I am from udt,I completed MBA");
				driver.findElement(By.id("j_idt106:thisform:age")).click();
				driver.findElement(By.id("j_idt106:float-input")).click();
				driver.findElement(By.id("j_idt106:float-input")).sendKeys("gokul");
				driver.findElement(By.id("j_idt106:auto-complete_input")).click();
				driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("gokul");
				
				driver.findElement(By.id("j_idt106:j_idt116_input")).click();
				driver.findElement(By.xpath("//a[text()='21']")).click();
				driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("100");
				driver.findElement(By.id("j_idt106:slider")).click();
				driver.findElement(By.id("j_idt106:slider")).sendKeys("25");
				driver.findElement(By.className("ql-editor ql-blank")).click();
				driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Hello");
			}
		
		
	}


