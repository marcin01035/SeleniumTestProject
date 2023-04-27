package pageObjects;

import enums.ModelDropdownValues;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class EnterVehicalDataDriverObjects {

    @FindBy(id = "make")
    WebElement make;

    @FindBy(xpath = "//select[@id='model']")
    WebElement modelOptions;


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

    @Step("Type cylinder capacity in field")
    public void enterCylinderCapacity(String capacity) {
        cylinderCapacity.sendKeys(capacity);
    }

    @Step("Get error message of wrong invalid cylinder capacity")
    public String getErrorMessageOnCylinderCapacity() {
        return errorCylinderCapacity.getText();
    }

    @Step("Get dropdown options of model")
    public WebElement getModelDropdownOption() {
        return modelOptions;
    }
}
