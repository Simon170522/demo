package com.example.easy_calc;

import com.example.easy_calc.services.CalcService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalcServiceTest {
    @Test
    public void sumTest() {
        CalcService calcService = new CalcService();
        Assertions.assertEquals(calcService.sum(5.04, 17.0), 22.04);
    }
}
