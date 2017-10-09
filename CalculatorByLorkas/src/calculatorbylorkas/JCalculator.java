package calculatorbylorkas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class JCalculator extends javax.swing.JFrame {
    //comment
    public JCalculator() {
        initComponents();
        setUp();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        headPanel = new javax.swing.JPanel();
        headline = new javax.swing.JLabel();
        textIO = new javax.swing.JTextField();
        numPad = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnTotal = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headPanel.setBackground(new java.awt.Color(0, 102, 153));

        headline.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        headline.setForeground(new java.awt.Color(255, 255, 255));
        headline.setText("CalculatorByLorkaS");

        textIO.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout headPanelLayout = new javax.swing.GroupLayout(headPanel);
        headPanel.setLayout(headPanelLayout);
        headPanelLayout.setHorizontalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headPanelLayout.createSequentialGroup()
                        .addComponent(textIO, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        headPanelLayout.setVerticalGroup(
            headPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headline, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textIO, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        numPad.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn2.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn2.setText("2");
        btn2.setPreferredSize(new java.awt.Dimension(75, 75));

        btn3.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn3.setText("3");
        btn3.setPreferredSize(new java.awt.Dimension(75, 75));

        btn1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn1.setText("1");
        btn1.setPreferredSize(new java.awt.Dimension(75, 75));

        btn4.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn4.setText("4");
        btn4.setPreferredSize(new java.awt.Dimension(75, 75));

        btn5.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn5.setText("5");
        btn5.setPreferredSize(new java.awt.Dimension(75, 75));

        btn6.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn6.setText("6");
        btn6.setPreferredSize(new java.awt.Dimension(75, 75));

        btn7.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn7.setText("7");
        btn7.setPreferredSize(new java.awt.Dimension(75, 75));

        btn8.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn8.setText("8");
        btn8.setPreferredSize(new java.awt.Dimension(75, 75));

        btn9.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn9.setText("9");
        btn9.setPreferredSize(new java.awt.Dimension(75, 75));

        btn0.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btn0.setText("0");
        btn0.setPreferredSize(new java.awt.Dimension(75, 75));

        btnTotal.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 18)); // NOI18N
        btnTotal.setText("=");
        btnTotal.setPreferredSize(new java.awt.Dimension(75, 75));

        btnMult.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnMult.setText("*");
        btnMult.setPreferredSize(new java.awt.Dimension(75, 75));

        btnPlus.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setPreferredSize(new java.awt.Dimension(75, 75));

        btnMinus.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnMinus.setText("-");
        btnMinus.setPreferredSize(new java.awt.Dimension(75, 75));

        btnDiv.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setPreferredSize(new java.awt.Dimension(75, 75));

        btnClear.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnClear.setText("C");
        btnClear.setPreferredSize(new java.awt.Dimension(75, 75));

        btnRemove.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnRemove.setText("<X");
        btnRemove.setPreferredSize(new java.awt.Dimension(75, 75));
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnDot.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        btnDot.setText(".");
        btnDot.setPreferredSize(new java.awt.Dimension(75, 75));

        javax.swing.GroupLayout numPadLayout = new javax.swing.GroupLayout(numPad);
        numPad.setLayout(numPadLayout);
        numPadLayout.setHorizontalGroup(
            numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numPadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(numPadLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(numPadLayout.createSequentialGroup()
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(numPadLayout.createSequentialGroup()
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(numPadLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(numPadLayout.createSequentialGroup()
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(numPadLayout.createSequentialGroup()
                                .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        numPadLayout.setVerticalGroup(
            numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(numPadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(numPadLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, numPadLayout.createSequentialGroup()
                                .addGap(0, 23, Short.MAX_VALUE)
                                .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(numPadLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(numPadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(numPad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(numPad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void setUp() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.pack();
        this.setResizable(false);
    }

    public JTextField getIO() { return textIO; }

    void addAction1(ActionListener listen1) { btn1.addActionListener(listen1); }
    void addAction2(ActionListener listen2) { btn2.addActionListener(listen2); }
    void addAction3(ActionListener listen3) { btn3.addActionListener(listen3); }
    void addAction4(ActionListener listen4) { btn4.addActionListener(listen4); }
    void addAction5(ActionListener listen5) { btn5.addActionListener(listen5); }
    void addAction6(ActionListener listen6) { btn6.addActionListener(listen6); }
    void addAction7(ActionListener listen7) { btn7.addActionListener(listen7); }
    void addAction8(ActionListener listen8) { btn8.addActionListener(listen8); }
    void addAction9(ActionListener listen9) { btn9.addActionListener(listen9); }
    void addAction0(ActionListener listen0) { btn0.addActionListener(listen0); }
    
    void addActionPlus(ActionListener listenPlus) { btnPlus.addActionListener(listenPlus); }
    void addActionMinus(ActionListener listenMinus) { btnMinus.addActionListener(listenMinus); }
    void addActionMult(ActionListener listenMult) { btnMult.addActionListener(listenMult); }
    void addActionDiv(ActionListener listenDiv) { btnDiv.addActionListener(listenDiv); }
    
    void addActionDot(ActionListener listenDot) { btnDot.addActionListener(listenDot); }
    void addActionTotal(ActionListener listenTotal) { btnTotal.addActionListener(listenTotal); }
    
    void addActionRmv(ActionListener listenRmv) { btnRemove.addActionListener(listenRmv); }
    void addActionClr(ActionListener listenClr) { btnClear.addActionListener(listenClr); }
    
    void addKeyAction(KeyAdapter keyAdpt) { this.addKeyListener(keyAdpt); }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnTotal;
    private javax.swing.JPanel headPanel;
    private javax.swing.JLabel headline;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel numPad;
    private javax.swing.JTextField textIO;
    // End of variables declaration//GEN-END:variables
}
