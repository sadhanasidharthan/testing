package demo.testingNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {
	WebDriver driver;
	// directory where output is to be printed
	ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
	ExtentReports extent = new ExtentReports();
	static ExtentTest test;

	
	@BeforeMethod
	public void beforeTest()
	{
		extent.attachReporter(spark);
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		
	}
	@Test
	public void Login() throws InterruptedException {
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin",Keys.ENTER);
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123",Keys.ENTER);
		 Thread.sleep(5000);
		 String url=driver.getCurrentUrl();
		 Assert.assertEquals(url,"https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		 test=extent.createTest("TC_001","pass");
		 test.log(Status.PASS, "TC_001");
		 ;
		
	}
	
	@AfterTest
	public void afterTest() {
	driver.quit();
	
	}
	@AfterSuite
	public void tc_3()
	{
		extent.flush();
		driver.quit();
	}

	@Test(dependsOnMethods = {"Login"})
	public void Logout() throws InterruptedException{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
	}


}
