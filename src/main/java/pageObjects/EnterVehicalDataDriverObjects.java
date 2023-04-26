package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterVehicalDataDriverObjects {

    @FindBy(id = "make")
    WebElement make;

    @FindBy(xpath = "//select[@id='model']")
    WebElement Model;


    @FindBy(xpath = "//input[@id='cylindercapacity']")
    WebElement cylinderCapacity;

    @FindBy(id = "engineperformance")
    WebElement enginePerformance;

    @FindBy(id = "dateofmanufacture")
    WebElement dateOfManufacture;

    @FindBy(id = "numberofseats")
    WebElement numberOfSeats;

    @FindBy(id = "listprice")
    WebElement listPrice;

    @FindBy(id = "annualmileage")
    WebElement annualMileage;

    @FindBy(id = "nextenterinsurandata")
    WebElement next;

    @FindBy(xpath = "//input[@id='cylindercapacity']/following-sibling::span[@class='error']")
    WebElement errorCylinderCapacity;

    public EnterVehicalDataDriverObjects(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void enterCylinderCapacity(String capacity) {
        cylinderCapacity.sendKeys(capacity);
    }

    public String getErrorMessageOnCylinderCapacity() {
        return errorCylinderCapacity.getText();
    }
}
