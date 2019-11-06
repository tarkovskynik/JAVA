package ua.course3.week4.day1JUnit;

import org.junit.Assert;
import org.junit.Test;

public class TestCalculator {

    @Test
    public void TestCalculator() {

        Calculator calculator = new Calculator();
        int result = calculator.add(3, 4);

        Assert.assertEquals(7, result); // - это тоже самое что это
        /*
        if (result != 7) {
            System.out.println("Error");
        } else {
            System.out.println("OK!!!");
        } */

        //Assert.fail();
    }
}
