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
public class Calc {
  double v1;
  double v2;
  String operation;
    public void setV1 (double value){
            v1 = value;
}
    public double getV1(){
        return v1;      
    }
    public void setV2 (double value){
            v2 = value;
}
    public double getV2(){
        return v2;      
    }
    public void setOperation(String op){
     operation = op;
    }
    public String getOperation(){
        return operation;
    }
    
    public double calculate(){
       if(AppCommands.MINUS_COMMAND.equals(operation)){
           return v1 - v2;
       }else if(AppCommands.PLUS_COMMAND.equals(operation)){
           return v1 + v2;
       }else if(AppCommands.MULT_COMMAND.equals(operation)){
           return v1 * v2;
       }else if(AppCommands.DIV_COMMAND.equals(operation)){
           return v1 / v2;
       }
       return 0;
    }

    
    
    
}
