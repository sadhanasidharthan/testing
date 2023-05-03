package demo.sanpletesting;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App
{
    public static void main( String[] args ) throws InterruptedException
    {
       WebDriverManager.edgedriver().setup();
       WebDriver driver=new EdgeDriver();
       //URL
       
       driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
       
       //FIRSTNAME
       driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("churchil");
       
       //LASTNAME
       driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Antony");
       
       //EMAIL-ID
       driver.findElement(By.id("input-email")).sendKeys("churchilantony1817@gmail.com");
       
       //PASSWORD
       driver.findElement(By.id("input-password")).sendKeys("abdchurchil");
       
       Thread.sleep(5000);
       
       //NEWSLETTER
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/fieldset[3]/div/div/div[1]")).click();
     
       //PRIVACY POLICY
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
       
       //CONTINUE
       driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
       
       
    }
}