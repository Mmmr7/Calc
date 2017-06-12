/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

/**
 *
 * @author student
 */
public class Test {
    public static void main(String[] args) {
        Calc calc = new Calc();
    calc.setV1(10);
    calc.setV2(20);
    calc.setOperation(AppCommands.PLUS_COMMAND);
    
    double result = calc.calculate();
    System.out.println("result=" + result);
    }
    }
    

