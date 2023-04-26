package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(id = "nav_automobile")
    WebElement linkToAutoMobile;

    @FindBy(id = "nav_truck")
    WebElement linkToTruck;

    @FindBy(id = "nav_motorcycle")
    WebElement linkToMotorcycle;

    @FindBy(id = "nav_camper")
    WebElement linkToCamper;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Step("Go to motorcycle form")
    public void clickOnMotorCycleLink() {
        linkToMotorcycle.click();
    }


}

