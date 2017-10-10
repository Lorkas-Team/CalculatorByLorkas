package calculatorbylorkas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    public CalculatorController(JCalculator view) {
        this.view = view;
        textIO = (this.view).getIO();

        //actionsSetUp();
        //keysActionsSetUp();
        (this.view).setVisible(true);
    }

    private void keysActionsSetUp() {

    }

    private void actionsSetUp() {

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
