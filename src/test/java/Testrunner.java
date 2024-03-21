import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;
import java.time.Duration;

public class Testrunner {
    public WebDriver driver;
    @Test
    public void automateExtension() throws InterruptedException {
        String extensionPath="./src/test/resources/metamask.crx";
        ChromeOptions options= new ChromeOptions();
        options.addExtensions(new File(extensionPath));
        driver= new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.get("chrome-extension://nkbihfbeogaeaoehlefnkodbefgpgknn/home.html");
    }

}
