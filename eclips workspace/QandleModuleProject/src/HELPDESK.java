import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HELPDESK 
{
	public static void main(String[] arg)

	{
		System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
		 WebDriver CD = new ChromeDriver();
        CD.manage().window().maximize();
        CD.get("http://prod2.qandle.com/");
        CD.findElement(By.id("login-email")).sendKeys("abc@gmail.com");
        CD.findElement(By.id("login-password")).sendKeys("12345678");
        CD.findElement(By.id("signInSubmit")).click();
        CD.findElement(By.id("linkForgotPassword")).click();
        CD.findElement(By.partialLinkText("javascript:void(0)")).click();
        
       // ChromeDriver.Click();
	}
}
