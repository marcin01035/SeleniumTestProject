package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EnterInsurantDataPageObjects {

    @FindBy(xpath = "//input[@name='Gender']/parent::label")
    List <WebElement> gender;

    @FindBy(xpath = "//input[@name='Hobbies']/parent::label")
    List <WebElement> hobbies;
//*[@id="insurance-form"]/div/section[2]/div[4]/p/label[1]/span
}
