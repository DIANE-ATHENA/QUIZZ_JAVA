package fr.epsi.mtp.poe.IHM;

import fr.epsi.mtp.poe.GestionQuestion.GestionFichier;
import fr.epsi.mtp.poe.GestionQuestion.Questionnaire;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Jouer1 extends javax.swing.JPanel {

    Fenetre f;

    // Constructeur
    public Jouer1(Fenetre f) {
        this.f = f;

        initComponents();
        QuestionnaireCombo.setModel(initQuestionnaire());
        RetourAccueil.setIcon(f.imageAccueil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QuestionnaireCombo = new javax.swing.JComboBox();
        ValiderJouerQ = new javax.swing.JButton();
        Jouer1 = new javax.swing.JLabel();
        RetourAccueil = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 500));

        QuestionnaireCombo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QuestionnaireCombo.setForeground(new java.awt.Color(153, 153, 153));
        QuestionnaireCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Questionnaire" }));

        ValiderJouerQ.setBackground(new java.awt.Color(51, 204, 0));
        ValiderJouerQ.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ValiderJouerQ.setText("VALIDER");
        ValiderJouerQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderJouerQActionPerformed(evt);
            }
        });

        Jouer1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Jouer1.setForeground(new java.awt.Color(0, 102, 255));
        Jouer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jouer1.setText("JOUER");
        Jouer1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jouer1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        RetourAccueil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RetourAccueil.setText("Accueil");
        RetourAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourAccueilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(RetourAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(Jouer1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(QuestionnaireCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(ValiderJouerQ)))
                .addContainerGap(288, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(RetourAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Jouer1)
                .addGap(81, 81, 81)
                .addComponent(QuestionnaireCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(ValiderJouerQ, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Action Bouton
    private void RetourAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourAccueilActionPerformed
        f.change("accueil");
    }//GEN-LAST:event_RetourAccueilActionPerformed

    private void ValiderJouerQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderJouerQActionPerformed
        try {
            
            String s = (String) QuestionnaireCombo.getSelectedItem();
            Questionnaire q = GestionFichier.ficherVersQuestionnaire(s);
            if (q.getQuestions().isEmpty()) {
                String err = "Le questionnaire "+q.getNom()+" ne contient aucune question\n\nVeuillez renseigner les questions dans la partie 'Créer' ";
                
                JOptionPane.showMessageDialog(null, err, "ATTENTION", JOptionPane.WARNING_MESSAGE);
            }else{
                q.triageQuestions();
                q.getQuestions().get(0).melangeReponseBF();
                f.setEnCours(q);
                f.jeu2.init(0);
                f.change("jeu2");
            }
        } catch (IOException ex) {
            Logger.getLogger(Jouer1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_ValiderJouerQActionPerformed

    // Methode
    private DefaultComboBoxModel initQuestionnaire() {
        String[] questionnaireTitle = GestionFichier.envoieListQuestionnaireDuRepertoire();

        for (int i = 0; i < questionnaireTitle.length; i++) {
            QuestionnaireCombo.addItem(questionnaireTitle[i]);
        }

        return new DefaultComboBoxModel(questionnaireTitle);

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jouer1;
    private javax.swing.JComboBox QuestionnaireCombo;
    private javax.swing.JButton RetourAccueil;
    private javax.swing.JButton ValiderJouerQ;
    // End of variables declaration//GEN-END:variables

}
