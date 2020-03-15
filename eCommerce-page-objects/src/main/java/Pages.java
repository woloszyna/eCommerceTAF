import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pages {

    WebDriver driver;

    public void landingPage() {

        System.setProperty("webdriver.new.chromedriver", "WebDrivers/chromedriverv80");
        driver = new ChromeDriver();
        driver.get("https://betestautomation.azurewebsites.net/");
    }

}
