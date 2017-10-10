package calculatorbylorkas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
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
    //master plus lord
    
    private JCalculator view;
    private JTextField textIO;
            
    public CalculatorController(JCalculator view){
        this.view = view;
        textIO = (this.view).getIO();
        
        actionsSetUp();
        keysActionsSetUp();
        
        (this.view).setVisible(true);
    }
    
    private void keysActionsSetUp() {
    
    }
    
    
     private void actionsSetUp() {
     
         view.addActionDot(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                addDot(); 
            }
        });
        view.addActionTotal(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalAmount();
            }
        });

        view.addActionRmv(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                remove();
            }
        });
        view.addActionClr(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textIO.setText("");
            }
            
        });
        
        
         
     }
    private void addDot() {

        String text = textIO.getText();
        //AN TO TEXT EINAI ADEIO - VAZEI 0. STHN ARXH
        if (text.isEmpty()) {
            textIO.setText("0.");
            return;
        }
        //AN I EKFRASI TELEIWNEI ME TELESTI - KOLLAEI STO TELOS 0.
        if (text.charAt(text.length() - 1) == '/' || text.charAt(text.length() - 1) == '*'
                || text.charAt(text.length() - 1) == '+' || text.charAt(text.length() - 1) == '-') {
            textIO.setText(textIO.getText() + "0.");
            // return ???
        }

        text = textIO.getText();

        //TELEYTAIA THESI STIN EKFRASI
        int index = text.length() - 1;
        boolean found = false;

        //LOOPA AP TO TELOS TIS EKFRASIS PROS TIN ARXI
        //AN VRETHEI PRWTA "." - FOUND = TRUE
        //AN VRETHEI PRWTA TELESTIS - FOUND = FALSE
        for (int i = index; i >= 0; i--) {
            if (text.charAt(i) == '.') {
                found = true;
                break;
            }
            if (text.charAt(i) == '/' || text.charAt(i) == '*' || text.charAt(i) == '+' || text.charAt(i) == '-') {
                break;
            }
        }

        //AN DEN VRETHIKE - KOLLAEI STO TELOS TIS EKFRASIS "."
        if (!found) {
            textIO.setText(textIO.getText() + ".");
        }
    }
    private void totalAmount() {
    
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        try {
            textIO.setText(engine.eval(textIO.getText()).toString());
        } catch (ScriptException e1) {
            textIO.setText("Error In Formula");
        } 
    }
    private void remove() {
        if (textIO.getText().isEmpty()) {
            return;
        }
        String text = textIO.getText();
        text = text.substring(0, text.length() - 1);
        textIO.setText(text); 
    }
}
