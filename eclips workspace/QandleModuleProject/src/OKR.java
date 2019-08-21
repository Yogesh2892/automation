import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OKR {

	public static void main(String[] args)
	{
    System.setProperty("webdriver.chrome.driver", "./exefiles/chromedriver.exe");
    WebDriver  driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://prod5.qandle.com");
   // ChromeDriver.navigate().refresh();
    driver.findElement(By.id("login-email")).sendKeys("neha.gupta@mailinator.com");
    driver.findElement(By.id("login-password")).sendKeys("12345678A");
    driver.findElement(By.id("signInSubmit")).click();
    driver.findElement(By.xpath("*[@title='Objectives & Key Results']")).click();
   // driver.findElement(By.id("/html/body/div[2]/div/div/div/md-sidenav/md-content/ng-include/md-list/md-list-item[10]/button")).click();
    //driver.findElement(By.id("//*[@id=\"tab-content-84\"]/div/ng-include/div/div/div/div[2]/div[1]/div[7]/button")).click();
  //*[@id="tab-content-84"]/div/ng-include/div/div/div/div[2]/div[1]/div[7]/button/span
    //ChromeDriver.close();
    //Chromedriver.click("//*[@id="login-email"]");
///QandleModuleProject/exefiles/chromedriver.exe
    //driver.findElement(By.cssSelector(cssSelector))
	}
	
	
}

