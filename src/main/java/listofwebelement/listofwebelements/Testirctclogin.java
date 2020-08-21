package listofwebelement.listofwebelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testirctclogin {
	 
    @Test
    public void login() {
        // TODO Auto-generated method stub
        
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\piyush sinha\\\\OneDrive\\\\Desktop\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.irctc.co.in/nget/profile/user-registration/");
        
        WebElement username=driver.findElement(By.cssSelector("#userName"));
        WebElement password=driver.findElement(By.cssSelector("#usrPwd"));
        WebElement password1=driver.findElement(By.cssSelector("#cnfUsrPwd"));
  //      WebElement username=driver.findElement(By.cssSelector("#userName"));
    //    WebElement username=driver.findElement(By.cssSelector("#userName"));
      //  WebElement login=driver.findElement(By.xpath("//button[text()='Sign in']"));
        
        username.sendKeys("piyush");
        password.sendKeys("password");
        password1.sendKeys("password");
    //    username.sendKeys("piyush");
    //    username.sendKeys("piyush");
        
        
      //  login.click();
        
       /* String actualUrl="https://www.linkedin.com/feed/";
        String expectedUrl= driver.getCurrentUrl();
        
        Assert.assertEquals(expectedUrl,actualUrl);*/
        
        
        
        
    }
 
}