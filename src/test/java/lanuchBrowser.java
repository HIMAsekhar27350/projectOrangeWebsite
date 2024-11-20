import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.PriorityQueue;
import java.util.Properties;

public class lanuchBrowser{
    WebDriver driver;
    Properties p;
    @BeforeClass
    public void lanuchWebsite() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test(priority = 1)
    public Properties loadProperties() throws IOException {
        FileInputStream file=new FileInputStream("C:\\Users\\HIMA SEKHAR V\\IdeaProjects\\projectOrangeWebsite\\src\\test\\java\\config.properties");
        Properties p=new Properties();
        p.load(file);
        return p;
    }

    @AfterClass
    public void closeBrowser()throws InterruptedException{
        Thread.sleep(7000);
        driver.quit();
    }
}
