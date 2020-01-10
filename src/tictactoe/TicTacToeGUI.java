/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;

/**
 *
 * @author Raul
 */
public class TicTacToeGUI extends javax.swing.JFrame {

    //Globale Variablen
    protected String anfang = "X";
    int ResultatO = 0;
    int ResultatX = 0;
    final static protected Color hellBlau = Color.decode("#6699ff");
            
    public TicTacToeGUI() {
        initComponents();
        //Hacer que la ventana aparezca en el medio
        setLocationRelativeTo(null);
    }

    //Meine Methoden
    public void resultat() {
        LabelResultatO.setText(String.valueOf(ResultatO));
        LabelResultatX.setText(String.valueOf(ResultatX));
    }

    //Wächselt ab zwischen X und O
    public void spieler() {
        if (anfang.equalsIgnoreCase("X")) {
            anfang = "O";
        } else {
            anfang = "X";
        }
    }
    //Desactiviert alle knöpfe nachdem jemand gewonnen hat
    public void desactivateButton(){
        ButtonA1.setEnabled(false);
        ButtonA2.setEnabled(false);
        ButtonA3.setEnabled(false);
        ButtonB1.setEnabled(false);
        ButtonB2.setEnabled(false);
        ButtonB3.setEnabled(false);
        ButtonC1.setEnabled(false);
        ButtonC2.setEnabled(false);
        ButtonC3.setEnabled(false);
    }
    
    //Knöpfe activieren
    public void activateButton(){
        ButtonA1.setEnabled(true);
        ButtonA2.setEnabled(true);
        ButtonA3.setEnabled(true);
        ButtonB1.setEnabled(true);
        ButtonB2.setEnabled(true);
        ButtonB3.setEnabled(true);
        ButtonC1.setEnabled(true);
        ButtonC2.setEnabled(true);
        ButtonC3.setEnabled(true);
    }
    
    //Winner wird ermittelt
    public void gewinnerErmittler(){
        //Texte von den Buttons werden raus genommen
        String BotA1 = ButtonA1.getText();
        String BotA2 = ButtonA2.getText();
        String BotA3 = ButtonA3.getText();
        
        String BotB1 = ButtonB1.getText();
        String BotB2 = ButtonB2.getText();
        String BotB3 = ButtonB3.getText();
        
        String BotC1 = ButtonC1.getText();
        String BotC2 = ButtonC2.getText();
        String BotC3 = ButtonC3.getText();
        
        //Horizontale Linien prüfung für X
        if(BotA1 == "X" && BotA2 == "X" && BotA3 == "X"){
            ResultatX++;
            ButtonA1.setBackground(Color.GREEN);
            ButtonA2.setBackground(Color.GREEN);
            ButtonA3.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotB1 == "X" && BotB2 == "X" && BotB3 == "X"){
            ResultatX++;
            ButtonB1.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonB3.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotC1 == "X" && BotC2 == "X" && BotC3 == "X"){
            ResultatX++;
            ButtonC1.setBackground(Color.GREEN);
            ButtonC2.setBackground(Color.GREEN);
            ButtonC3.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        //Verticale Linien
        else if(BotA1 == "X" && BotB1 == "X" && BotC1 == "X"){
            ResultatX++;
            ButtonA1.setBackground(Color.GREEN);
            ButtonB1.setBackground(Color.GREEN);
            ButtonC1.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotA2 == "X" && BotB2 == "X" && BotC2 == "X"){
            ResultatX++;
            ButtonA2.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonC2.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotA3 == "X" && BotB3 == "X" && BotC3 == "X"){
            ResultatX++;
            ButtonA3.setBackground(Color.GREEN);
            ButtonB3.setBackground(Color.GREEN);
            ButtonC3.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        //Diagonale Linien
        else if(BotA1 == "X" && BotB2 == "X" && BotC3 == "X"){
            ResultatX++;
            ButtonA1.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonC3.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotA3 == "X" && BotB2 == "X" && BotC1 == "X"){
            ResultatX++;
            ButtonA3.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonC1.setBackground(Color.GREEN);
            LabelWinner.setText("X HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        
        //Horizontale Linien prüfung für O
        if(BotA1 == "O" && BotA2 == "O" && BotA3 == "O"){
            ResultatO++;
            ButtonA1.setBackground(Color.GREEN);
            ButtonA2.setBackground(Color.GREEN);
            ButtonA3.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotB1 == "O" && BotB2 == "O" && BotB3 == "O"){
            ResultatO++;
            ButtonB1.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonB3.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotC1 == "O" && BotC2 == "O" && BotC3 == "O"){
            ResultatO++;
            ButtonC1.setBackground(Color.GREEN);
            ButtonC2.setBackground(Color.GREEN);
            ButtonC3.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        //Verticale Linien
        else if(BotA1 == "O" && BotB1 == "O" && BotC1 == "O"){
            ResultatO++;
            ButtonA1.setBackground(Color.GREEN);
            ButtonB1.setBackground(Color.GREEN);
            ButtonC1.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotA2 == "O" && BotB2 == "O" && BotC2 == "O"){
            ResultatO++;
            ButtonA2.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonC2.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotA3 == "O" && BotB3 == "O" && BotC3 == "O"){
            ResultatO++;
            ButtonA3.setBackground(Color.GREEN);
            ButtonB3.setBackground(Color.GREEN);
            ButtonC3.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        //Diagonale Linien
        else if(BotA1 == "O" && BotB2 == "O" && BotC3 == "O"){
            ResultatO++;
            ButtonA1.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonC3.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        else if(BotA3 == "O" && BotB2 == "O" && BotC1 == "O"){
            ResultatO++;
            ButtonA3.setBackground(Color.GREEN);
            ButtonB2.setBackground(Color.GREEN);
            ButtonC1.setBackground(Color.GREEN);
            LabelWinner.setText("O HAT GEWONNEN!");
            resultat();
            desactivateButton();
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        gameFläche = new javax.swing.JPanel();
        ButtonA2 = new javax.swing.JButton();
        ButtonA1 = new javax.swing.JButton();
        ButtonA3 = new javax.swing.JButton();
        ButtonB3 = new javax.swing.JButton();
        ButtonB2 = new javax.swing.JButton();
        ButtonB1 = new javax.swing.JButton();
        ButtonC3 = new javax.swing.JButton();
        ButtonC2 = new javax.swing.JButton();
        ButtonC1 = new javax.swing.JButton();
        LabelPointsX = new javax.swing.JLabel();
        LabelPointsO = new javax.swing.JLabel();
        LabelResultatX = new javax.swing.JLabel();
        LabelResultatO = new javax.swing.JLabel();
        LabelWinner = new javax.swing.JLabel();
        ButtonResetGame = new javax.swing.JButton();
        ButtonResetPoints = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        Title.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 153, 255));
        Title.setText("Tic Tac Toe");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(437, 437, 437)
                .addComponent(Title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Title)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        gameFläche.setBackground(new java.awt.Color(51, 51, 51));
        gameFläche.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(153, 153, 255), new java.awt.Color(153, 153, 255)));

        ButtonA2.setBackground(new java.awt.Color(102, 153, 255));
        ButtonA2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonA2.setForeground(new java.awt.Color(153, 153, 255));
        ButtonA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA2ActionPerformed(evt);
            }
        });

        ButtonA1.setBackground(new java.awt.Color(102, 153, 255));
        ButtonA1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonA1.setForeground(new java.awt.Color(153, 153, 255));
        ButtonA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA1ActionPerformed(evt);
            }
        });

        ButtonA3.setBackground(new java.awt.Color(102, 153, 255));
        ButtonA3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonA3.setForeground(new java.awt.Color(153, 153, 255));
        ButtonA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonA3ActionPerformed(evt);
            }
        });

        ButtonB3.setBackground(new java.awt.Color(102, 153, 255));
        ButtonB3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonB3.setForeground(new java.awt.Color(153, 153, 255));
        ButtonB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonB3ActionPerformed(evt);
            }
        });

        ButtonB2.setBackground(new java.awt.Color(102, 153, 255));
        ButtonB2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonB2.setForeground(new java.awt.Color(153, 153, 255));
        ButtonB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonB2ActionPerformed(evt);
            }
        });

        ButtonB1.setBackground(new java.awt.Color(102, 153, 255));
        ButtonB1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonB1.setForeground(new java.awt.Color(153, 153, 255));
        ButtonB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonB1ActionPerformed(evt);
            }
        });

        ButtonC3.setBackground(new java.awt.Color(102, 153, 255));
        ButtonC3.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonC3.setForeground(new java.awt.Color(153, 153, 255));
        ButtonC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonC3ActionPerformed(evt);
            }
        });

        ButtonC2.setBackground(new java.awt.Color(102, 153, 255));
        ButtonC2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonC2.setForeground(new java.awt.Color(153, 153, 255));
        ButtonC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonC2ActionPerformed(evt);
            }
        });

        ButtonC1.setBackground(new java.awt.Color(102, 153, 255));
        ButtonC1.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        ButtonC1.setForeground(new java.awt.Color(153, 153, 255));
        ButtonC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonC1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout gameFlächeLayout = new javax.swing.GroupLayout(gameFläche);
        gameFläche.setLayout(gameFlächeLayout);
        gameFlächeLayout.setHorizontalGroup(
            gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameFlächeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameFlächeLayout.createSequentialGroup()
                        .addComponent(ButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(gameFlächeLayout.createSequentialGroup()
                            .addComponent(ButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(gameFlächeLayout.createSequentialGroup()
                            .addComponent(ButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        gameFlächeLayout.setVerticalGroup(
            gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gameFlächeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gameFlächeLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(ButtonA3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ButtonA2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonA1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonB2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonB3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonB1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gameFlächeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonC2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonC3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonC1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        LabelPointsX.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelPointsX.setForeground(new java.awt.Color(153, 153, 255));
        LabelPointsX.setText("Points X:");

        LabelPointsO.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelPointsO.setForeground(new java.awt.Color(153, 153, 255));
        LabelPointsO.setText("Points O:");

        LabelResultatX.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelResultatX.setForeground(new java.awt.Color(153, 153, 255));
        LabelResultatX.setText("0");

        LabelResultatO.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelResultatO.setForeground(new java.awt.Color(153, 153, 255));
        LabelResultatO.setText("0");

        LabelWinner.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        LabelWinner.setForeground(new java.awt.Color(153, 153, 255));
        LabelWinner.setText("PLAY, GOOD LUCK!");

        ButtonResetGame.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        ButtonResetGame.setText("Reset game");
        ButtonResetGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetGameActionPerformed(evt);
            }
        });

        ButtonResetPoints.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        ButtonResetPoints.setText("Reset points");
        ButtonResetPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonResetPointsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gameFläche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelPointsX)
                                .addGap(18, 18, 18)
                                .addComponent(LabelResultatX))
                            .addComponent(ButtonResetPoints, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonResetGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(718, 718, 718)
                        .addComponent(LabelPointsO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelResultatO))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(718, 718, 718)
                        .addComponent(LabelWinner)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gameFläche, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPointsX)
                            .addComponent(LabelResultatX))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelPointsO)
                            .addComponent(LabelResultatO))
                        .addGap(52, 52, 52)
                        .addComponent(LabelWinner)
                        .addGap(49, 49, 49)
                        .addComponent(ButtonResetGame)
                        .addGap(49, 49, 49)
                        .addComponent(ButtonResetPoints)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA1ActionPerformed
        ButtonA1.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonA1.setForeground(Color.orange);
        } else {
            ButtonA1.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonA1ActionPerformed

    private void ButtonA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA2ActionPerformed
        ButtonA2.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonA2.setForeground(Color.orange);
        } else {
            ButtonA2.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonA2ActionPerformed

    private void ButtonA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonA3ActionPerformed
        ButtonA3.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonA3.setForeground(Color.orange);
        } else {
            ButtonA3.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonA3ActionPerformed

    private void ButtonB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonB1ActionPerformed
        ButtonB1.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonB1.setForeground(Color.orange);
        } else {
            ButtonB1.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonB1ActionPerformed

    private void ButtonB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonB2ActionPerformed
       ButtonB2.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonB2.setForeground(Color.orange);
        } else {
            ButtonB2.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonB2ActionPerformed

    private void ButtonB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonB3ActionPerformed
        ButtonB3.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonB3.setForeground(Color.orange);
        } else {
            ButtonB3.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonB3ActionPerformed

    private void ButtonC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonC1ActionPerformed
        ButtonC1.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonC1.setForeground(Color.orange);
        } else {
            ButtonC1.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonC1ActionPerformed

    private void ButtonC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonC2ActionPerformed
        ButtonC2.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonC2.setForeground(Color.orange);
        } else {
            ButtonC2.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonC2ActionPerformed

    private void ButtonC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonC3ActionPerformed
        ButtonC3.setText(anfang);
        if (anfang.equalsIgnoreCase("X")) {
            ButtonC3.setForeground(Color.orange);
        } else {
            ButtonC3.setForeground(Color.MAGENTA);
        }
        spieler();
        gewinnerErmittler();
    }//GEN-LAST:event_ButtonC3ActionPerformed

    private void ButtonResetGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetGameActionPerformed
        activateButton();
        //Macht nochmal button color back
        ButtonA1.setBackground(hellBlau);
        ButtonA1.setBackground(hellBlau);
        ButtonA2.setBackground(hellBlau);
        ButtonA3.setBackground(hellBlau);
        ButtonB1.setBackground(hellBlau);
        ButtonB2.setBackground(hellBlau);
        ButtonB3.setBackground(hellBlau);
        ButtonC1.setBackground(hellBlau);
        ButtonC2.setBackground(hellBlau);
        ButtonC3.setBackground(hellBlau);
        
        //Macht inhalt nochmal null
        ButtonA1.setText(null);
        ButtonA2.setText(null);
        ButtonA3.setText(null);
        ButtonB1.setText(null);
        ButtonB2.setText(null);
        ButtonB3.setText(null);
        ButtonC1.setText(null);
        ButtonC2.setText(null);
        ButtonC3.setText(null);
        LabelWinner.setText("PLAY, GOOD LUCK!");
    }//GEN-LAST:event_ButtonResetGameActionPerformed

    private void ButtonResetPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonResetPointsActionPerformed
        this.ResultatO = 0;
        this.ResultatX = 0;
        resultat();
    }//GEN-LAST:event_ButtonResetPointsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonA1;
    private javax.swing.JButton ButtonA2;
    private javax.swing.JButton ButtonA3;
    private javax.swing.JButton ButtonB1;
    private javax.swing.JButton ButtonB2;
    private javax.swing.JButton ButtonB3;
    private javax.swing.JButton ButtonC1;
    private javax.swing.JButton ButtonC2;
    private javax.swing.JButton ButtonC3;
    private javax.swing.JButton ButtonResetGame;
    private javax.swing.JButton ButtonResetPoints;
    private javax.swing.JLabel LabelPointsO;
    private javax.swing.JLabel LabelPointsX;
    private javax.swing.JLabel LabelResultatO;
    private javax.swing.JLabel LabelResultatX;
    private javax.swing.JLabel LabelWinner;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel gameFläche;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
