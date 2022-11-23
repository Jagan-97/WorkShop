package org.example.WorkShop;
import org.junit.Assert;
import org.junit.Test;

public class ValidateTest extends Validate {
    Validate Validate = new Validate();

    @Test
    public void ValidatePositive(){
        Assert.assertEquals(true,Validate.ValidateMethod("Jagan@1234567"));
    }

    @Test
    public void ValidateNegative(){
        Assert.assertEquals(false,Validate.ValidateMethod("jagansaran123"));
    }

}