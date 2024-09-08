package com.example.easy_calc.services;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public double sum(double x, double y) {
        return x + y;
    }
    public double sum_i(double[] a) {
        double result = 0;
        for (double v : a) result += v;
        return result;
    }
    
}
