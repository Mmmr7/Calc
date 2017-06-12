/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author student
 */
public class Okno extends JFrame{
    
    JTextArea text; 
    
    public Okno(){
        setTitle("Калькулятор");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        getContentPane().add(createPanel()); 
        setBounds(0, 0, 800, 600);
        
        setVisible(true);
    }    
    
    public JTextArea getTextArea(){
        return text; 
    }     
    public JPanel createPanel(){
        // 
        AppActionListener listener = new AppActionListener(this);
        
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Результат:"); 
        panel.add(label);
        text = new JTextArea(1, 40); 
        panel.add(text);
        
        //Добавляем кнопки: 0-9
        //добавить с помощью цикла!!!
        for(int i = 0; i < 10; i++){
            String bLabel = "" + i;
            //System.out.println("bLabel=" + bLabel);
            JButton bNum = new JButton(bLabel);
            bNum.addActionListener(listener);
            panel.add(bNum);
        }
        // + - * /
        //Добавляем кнопки: + - * /
        JButton plusButton = new JButton("+");
        plusButton.addActionListener(listener);
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(listener);
        JButton multButton = new JButton("*");
        multButton.addActionListener(listener);
        JButton divButton = new JButton("/");
        divButton.addActionListener(listener);
        
        panel.add(plusButton);
        panel.add(minusButton);    
        panel.add(multButton);
        panel.add(divButton);   
        
        JButton resButton = new JButton("=");
        resButton.addActionListener(listener);
        panel.add(resButton);   
        
        //добавляем кнопку Cancel
        JButton cancelButton = new JButton("C");
        cancelButton.addActionListener(listener);
        //добавляем кнопку Выход
        JButton exitButton = new JButton("Выход");
        exitButton.addActionListener(listener);
        
        panel.add(cancelButton);
        panel.add(exitButton);    
        return panel;
    }
}
