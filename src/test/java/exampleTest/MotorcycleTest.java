package exampleTest;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class MotorcycleTest extends TestHelper {

    @Test
    @Description("First example test")
    public void test1(){
        System.out.println(driver.getCurrentUrl());
    }

}
