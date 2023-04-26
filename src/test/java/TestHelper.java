
import utils.ObjectsRepo;
import utils.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import java.time.Duration;

public class TestHelper extends ObjectsRepo{


    @BeforeSuite
    public void setupEnvironment() {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
    }

    @BeforeTest
    public void openBrowser() {
        driver.manage().window().maximize();
        driver.get(PropertiesReader.getProperty("test.baseUrl"));
    }

    @AfterSuite
    public void closeEnvironment() {
        driver.quit();
    }
}

