package com.bl.test.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String getResult(int first, int second, String operation) {
        switch (operation){
            case "+":
                return "Addition of "+first+" and "+second+" is "+(first+second);
            case "-":
                return "Subtraction of "+first+" and "+second+" is "+(first-second);
            case "X":
                return "Multiplication of "+first+" and "+second+" is "+(first*second);
            default:
                return "Division of "+first+" and "+second+" is "+(first/second);
        }
    }
}
