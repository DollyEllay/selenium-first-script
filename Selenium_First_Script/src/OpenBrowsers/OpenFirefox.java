package OpenBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class OpenFirefox {

    public static void main(String[] args) {

        System.setProperty("webdriver.geckodriver.driver", System.getProperty("user.dir") + "\\Bowsers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.google.com/");
        driver.quit();
    }
}
