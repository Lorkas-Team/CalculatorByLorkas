package calculatorbylorkas;

import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lorkas
 * 
 */
public class CalculatorController {
    //lordopoulos
    
    private JCalculator view;
    private JTextField textIO;
            
    public CalculatorController(JCalculator view){
        this.view = view;
        textIO = (this.view).getIO();
        
        //actionsSetUp();
        //keysActionsSetUp();
        
        (this.view).setVisible(true);
    }
    
    private void keysActionsSetUp() {
    
    }
    
    
     private void actionsSetUp() {
     
     
     }
    
}
