
import org.testng.Assert;
import org.testng.annotations.Test;


public class MotorcycleErrorTest extends TestHelper {
    @Test
    public static void errorCylinderCapacityField() {
        homePageObjects.clickOnMotorCycleLink();
        vehicalDataDriverObjects.enterCylinderCapacity("3000");
        var actualErrorMessage = vehicalDataDriverObjects.getErrorMessageOnCylinderCapacity();

        Assert.assertEquals(actualErrorMessage, "dummy", "Error message is not expected on cylinder");
    }

}
