package exampleTest;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utils.ObjectsRepo;
import utils.PropertiesReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.List;

public class TestHelper extends ObjectsRepo{


    @BeforeSuite
    @Step("Set environment")
    public void setupEnvironment() {
        WebDriverManager.chromedriver().setup();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
    }

    @BeforeTest
    @Step("Open browser and go to website")
    public void openBrowser() {
        driver.manage().window().maximize();
        driver.get(PropertiesReader.getProperty("test.baseUrl"));
    }

    @AfterSuite
    @Step("Close website browser")
    public void closeEnvironment() {
        driver.quit();
    }

    @Step("Get dropdown options ")
    public List<String> getModelDropdownOption(WebElement webElement ) {
        Select os = new Select(webElement);
        return os.getOptions().stream().map(WebElement::getText).toList();
    }
}

