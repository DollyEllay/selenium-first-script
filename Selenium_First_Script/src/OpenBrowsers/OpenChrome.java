package OpenBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class OpenChrome {


    public static void main(String[] args) {

        //System.getProperty("user.dir");

        // 1- Bridge between my code and my browser, so it can understand the code purposes (translator to the browser)

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\Bowsers\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\csp\\Documents\\Projects\\Selenium_First_Script\\Selenium_First_Script\\Bowsers\\chromedriver.exe");

        // 2- To pass the security issue for 111 -v of chrome very important step needed to open the website
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        // 3- Create new object from WebDriver
        WebDriver driver = new ChromeDriver(options);

        // 4- Configuration to the browser
            // 3.1- Maximize browser
        driver.manage().window().maximize();

            // 3.2- Set implicit wait (time)
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        // 5- Navigate website
        //driver.navigate().to("https://www.vconnexservices.com/");
        driver.get("https://www.google.com/");

        // Test Steps:
        // Locate the elements + Excute actions



        // Quit driver

        // driver.close();  // this command to close the browser as if you close it manually using the mouse BUT it's not close it in the background, it'll still running in the background
        driver.quit();  // this command shut down the browser also in the background

    }
}
