import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class loginPage extends lanuchBrowser{

    @Test(priority = 2)
    public void loginIntoPage() throws InterruptedException, IOException {
        Properties p=loadProperties();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get(p.getProperty("url"));
        System.out.println(" Title = "+driver.getTitle());
        driver.findElement(By.name(p.getProperty("name"))).sendKeys(p.getProperty("username"));
        driver.findElement(By.name(p.getProperty("password"))).sendKeys(p.getProperty("password1"));
        driver.findElement(By.xpath(p.getProperty("loginButton"))).click();
        try {
            Alert alert = driver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
        }

    }
    @Test(priority = 3)
    public void myInfo() throws InterruptedException, IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Properties p=loadProperties();
        driver.findElement(By.xpath(p.getProperty("myinfo"))).click();
    }
}
