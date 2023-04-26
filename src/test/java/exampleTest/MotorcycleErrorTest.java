package exampleTest;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;




@Epic("Motorcycle Data Tests")
@Feature("Error cylinder capacity field test")
public class MotorcycleErrorTest extends TestHelper {
    @Test
    @Description("[ERROR] Compare cylinder capcity with invalid value")
    public static void errorCylinderCapacityFieldWithInvalidComparison() {
        homePageObjects.clickOnMotorCycleLink();
        vehicalDataDriverObjects.enterCylinderCapacity("3000");
        var actualErrorMessage = vehicalDataDriverObjects.getErrorMessageOnCylinderCapacity();

        Assert.assertEquals(actualErrorMessage, RandomStringUtils.random(10), "Error message is not expected on cylinder");
    }

    @Test
    @Description("[SUCCESS] Compare cylinder capcity with correct value")
    public static void errorCylinderCapacityFieldWithCorrectComparison() {
        homePageObjects.clickOnMotorCycleLink();
        vehicalDataDriverObjects.enterCylinderCapacity("3000");
        var actualErrorMessage = vehicalDataDriverObjects.getErrorMessageOnCylinderCapacity();

        Assert.assertEquals(actualErrorMessage, RandomStringUtils.random(10), ">Must be a number between 1 and 2000");
    }
}
