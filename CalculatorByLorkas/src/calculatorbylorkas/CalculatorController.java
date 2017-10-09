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

        actionsSetUp();
        keysActionsSetUp();

        (this.view).setVisible(true);
    }

    //

    private void keysActionsSetUp() {

    }

    private void actionsSetUp() {
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

    }

    private void addValue(int value) {
        textIO.setText(textIO.getText() + String.valueOf(value));
    }

}
