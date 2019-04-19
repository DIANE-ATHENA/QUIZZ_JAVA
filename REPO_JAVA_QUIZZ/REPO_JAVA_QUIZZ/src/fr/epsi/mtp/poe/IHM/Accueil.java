package fr.epsi.mtp.poe.IHM;

public class Accueil extends javax.swing.JPanel {

    Fenetre f;

    // Constructeur
    public Accueil(Fenetre f) {
        this.f = f;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitreAccueil = new javax.swing.JLabel();
        JouerButton = new javax.swing.JButton();
        CréerButton = new javax.swing.JButton();
        ChoixXXX = new javax.swing.JLabel();
        Interrogation = new javax.swing.JLabel();
        Exclamation = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 500));

        TitreAccueil.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TitreAccueil.setForeground(new java.awt.Color(102, 153, 255));
        TitreAccueil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitreAccueil.setText("Quizz Master ");
        TitreAccueil.setToolTipText("");

        JouerButton.setBackground(new java.awt.Color(0, 102, 255));
        JouerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JouerButton.setForeground(new java.awt.Color(255, 255, 255));
        JouerButton.setText("Jouer");
        JouerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JouerButtonActionPerformed(evt);
            }
        });

        CréerButton.setBackground(new java.awt.Color(51, 204, 0));
        CréerButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CréerButton.setForeground(new java.awt.Color(255, 255, 255));
        CréerButton.setText("Créer");
        CréerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CréerButtonActionPerformed(evt);
            }
        });

        ChoixXXX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ChoixXXX.setText("Questionnaires à choix multiples ;-) !!!");

        Interrogation.setBackground(new java.awt.Color(204, 204, 204));
        Interrogation.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Interrogation.setForeground(new java.awt.Color(0, 102, 255));
        Interrogation.setText("?");

        Exclamation.setBackground(new java.awt.Color(204, 204, 204));
        Exclamation.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Exclamation.setForeground(new java.awt.Color(51, 204, 0));
        Exclamation.setText("!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Exclamation)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CréerButton, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                .addComponent(JouerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(TitreAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Interrogation)
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ChoixXXX, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(TitreAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(Exclamation, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Interrogation, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(JouerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(CréerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(ChoixXXX)
                .addContainerGap(71, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Action Bouttons
    private void JouerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JouerButtonActionPerformed
        f.change("jeu");
    }//GEN-LAST:event_JouerButtonActionPerformed

    private void CréerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CréerButtonActionPerformed
        f.change("creer");

    }//GEN-LAST:event_CréerButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChoixXXX;
    private javax.swing.JButton CréerButton;
    private javax.swing.JLabel Exclamation;
    private javax.swing.JLabel Interrogation;
    private javax.swing.JButton JouerButton;
    private javax.swing.JLabel TitreAccueil;
    // End of variables declaration//GEN-END:variables
}
