package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.EnterVehicalDataDriverObjects;
import pageObjects.HomePage;
public class ObjectsRepo {
   public static WebDriver driver = new ChromeDriver();
   public static HomePage homePageObjects = new HomePage(driver);
   public static EnterVehicalDataDriverObjects vehicalDataDriverObjects = new EnterVehicalDataDriverObjects(driver);
}
