import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LoginTest{

	@Test
	void google() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\saidi\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.cssSelector("[aria-label='Search']")).sendKeys("Testing");
		Thread.sleep(3000);
		driver.quit();
	}
}