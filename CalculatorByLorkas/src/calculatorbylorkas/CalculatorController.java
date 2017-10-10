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
    //lord
    
    private JCalculator view;
    private JTextField textIO;

    public CalculatorController(JCalculator view) {
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
        
         view.addAction0(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(0);
            }
        });
        view.addAction1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(1);
            }
        });
        view.addAction2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(2);
            }
        });
        view.addAction3(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(3);
            }
        });
        view.addAction4(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(4);
            }
        });
        view.addAction5(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(5);
            }
        });
        view.addAction6(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(6);
            }
        });
        view.addAction7(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(7);
            }
        });
        view.addAction8(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(8);
            }
        });
        view.addAction9(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addValue(9);
            }
        });
        
        view.addActionPlus(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMathAction("+");
            }
        });
        view.addActionMinus(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMathAction("-");
            }
        });
        view.addActionMult(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMathAction("*");
            }
        });
        view.addActionDiv(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMathAction("/");
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

    

    private void addValue(int value) {
        textIO.setText(textIO.getText() + String.valueOf(value));
    }


    

    private void setMathAction(String action) {

        if (textIO.getText().isEmpty() && !action.equals("-")) {
            return;
        }
        if (textIO.getText().length() == 1 && textIO.getText().equals("-")) {
            return;
        }

        String text = textIO.getText();
        if (text.endsWith("/") || text.endsWith("*") || text.endsWith("+") || text.endsWith("-")) {
            text = text.substring(0, text.length() - 1);
        }
        if (text.endsWith(".")) {
            text = text.substring(0, text.length() - 1);
        }

        textIO.setText(text + action);
    }
}
