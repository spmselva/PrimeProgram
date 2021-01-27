package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PreviousTab 
{

	public static void main(String[] args) throws AWTException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELVA\\SELENIUM\\Downloads\\chromedriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://google.co.in");
		driver.manage().window().maximize();
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Australia");
		searchBox.sendKeys(Keys.ENTER);
		String a = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.partialLinkText("History, Cities, Capital, Map")).sendKeys(a);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		WebElement sydney= driver.findElement(By.xpath("//*[@id='hdtb-msb-vis']/div[2]/a"));
		sydney.click();

		/*System.setProperty("webdriver.chrome.driver", "D:\\SELVA\\SELENIUM\\Downloads\\chromedriver86\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		WebElement element1 = driver.findElement(By.name("q"));
		element1.sendKeys("software testing help");
		element1.sendKeys(Keys.ENTER);
		String a = Keys.chord(Keys.CONTROL,Keys.RETURN);
		driver.findElement(By.partialLinkText("Software Testing Help - Free Software Testing")).sendKeys(a);
		Robot robot = new Robot(); // instantiated robot class
		robot.keyPress(KeyEvent.VK_CONTROL); // with robot class you can easily achieve anything if you know the shortcut keys
		robot.keyPress(KeyEvent.VK_2); // here, we have just pressed ctrl+2
		robot.keyRelease(KeyEvent.VK_CONTROL); // once we press and release ctrl+2, it will go to the second tab.
		robot.keyRelease(KeyEvent.VK_2); //if you again want to go back to first tab press and release vk_1
		************************
		New Features added here on 27th Jan 2021 at 1.02 pm
		2nd new feature added
*/	}
}
