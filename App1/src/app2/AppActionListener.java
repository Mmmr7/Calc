/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextArea;

/**
 *
 * @author student
 */
public class AppActionListener implements ActionListener{
    
    Okno okno; 
    Calc calc;
    
    public AppActionListener(Okno okno){
        this.okno = okno;    
        calc = new Calc();
    }
 
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String command = e.getActionCommand();
        
        System.out.println("command=" + command);
        if(AppCommands.EXIT_COMMAND.equals(command)){
            System.exit(0);
        }else if(AppCommands.CANCEL_COMMAND.equals(command)){
            System.out.println("DO CANCEL");
            
            JTextArea text = okno.getTextArea(); 
            text.setText("");
            
        }else if(AppCommands.RESULT_COMMAND.equals(command)){
            JTextArea text = okno.getTextArea();
            
            String value2 = text.getText();
            
            System.out.println("value2" + value2);
             double val2 = Double.parseDouble(value2);
             
            System.out.println("val2=" + val2);
            calc.setV2(val2);
            
            //String.valueOf(10.10);
            double result = calc.calculate();
            System.out.println("result=" + result);
            
            String res = String.valueOf(result);
            
            text.setText(res);
        }else if(AppCommands.PLUS_COMMAND.equals(command) ||
                 AppCommands.MINUS_COMMAND.equals(command)||
                 AppCommands.MULT_COMMAND.equals(command) ||
                 AppCommands.DIV_COMMAND.equals(command)
                  ){
            System.out.println("OPERATION=" + command);
            calc.setOperation(command);
            //
            JTextArea text = okno.getTextArea(); 
            String valuel = text.getText();
            System.out.println("FORMULA=" + valuel + command);
            //
            double val1 = Double.parseDouble(valuel);
            System.out.println("val1=" + val1);
            calc.setV1(val1);
            text.setText("");
            
        }else{
            System.out.println("NUMBER=" + command);
            
            //
            JTextArea text = okno.getTextArea(); 
            String oldText = text.getText();
            System.out.println("oldText=" + oldText);
            
            text.setText(oldText + command);
            String result = oldText + command;
            text.setText(result);
          
        }
    }
    
}
