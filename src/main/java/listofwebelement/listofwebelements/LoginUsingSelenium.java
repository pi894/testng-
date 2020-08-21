package listofwebelement.listofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class LoginUsingSelenium {
 
    @Test
    public void login() {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\piyush sinha\\\\OneDrive\\\\Desktop\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/login/");
        
        WebElement username=driver.findElement(By.cssSelector("#email"));
        WebElement password=driver.findElement(By.cssSelector("#pass"));
      //  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        
        username.sendKeys("example@gmail.com");
        password.sendKeys("password");
      //  login.click();
        
       /* String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        
        Assert.assertEquals(expectedUrl,actualUrl);*/
        
        
        
        
    }
 
}