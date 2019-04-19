package fr.epsi.mtp.poe.IHM;

import fr.epsi.mtp.poe.GestionQuestion.GestionFichier;
import fr.epsi.mtp.poe.GestionQuestion.Questionnaire;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Creer1 extends javax.swing.JPanel {

    Fenetre f;

    // Constructeur
    public Creer1(Fenetre f) {
        this.f = f;
        initComponents();

        tableauquestionnaire.setModel(initQuestionnaire());
        RetourAccueil.setIcon(f.imageAccueil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomQuestionnaire = new javax.swing.JTextField();
        Creer1 = new javax.swing.JLabel();
        AjoutQuestionnaire = new javax.swing.JLabel();
        RetourAccueil = new javax.swing.JButton();
        ValiderAjoutQuestionnaire = new javax.swing.JButton();
        ModifQuestionnaire = new javax.swing.JLabel();
        tableauquestionnaire = new javax.swing.JComboBox<>();
        ValiderModificationQuestionnaire = new javax.swing.JButton();
        supressionQuestionnaire = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        nomQuestionnaire.setForeground(new java.awt.Color(153, 153, 153));
        nomQuestionnaire.setText("Veuillez entrer le nom du Questionnaire");
        nomQuestionnaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nomQuestionnaireMousePressed(evt);
            }
        });

        Creer1.setBackground(new java.awt.Color(204, 204, 204));
        Creer1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Creer1.setForeground(new java.awt.Color(51, 204, 0));
        Creer1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Creer1.setText("CREER");

        AjoutQuestionnaire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AjoutQuestionnaire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AjoutQuestionnaire.setText("Ajouter un Questionnaire");

        RetourAccueil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RetourAccueil.setText("Accueil");
        RetourAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourAccueilActionPerformed(evt);
            }
        });

        ValiderAjoutQuestionnaire.setBackground(new java.awt.Color(51, 204, 0));
        ValiderAjoutQuestionnaire.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ValiderAjoutQuestionnaire.setText("Valider");
        ValiderAjoutQuestionnaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderAjoutQuestionnaireActionPerformed(evt);
            }
        });

        ModifQuestionnaire.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ModifQuestionnaire.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ModifQuestionnaire.setText("Sélectionner un Questionnaire");

        tableauquestionnaire.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tableauquestionnaire.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ValiderModificationQuestionnaire.setBackground(new java.awt.Color(51, 204, 0));
        ValiderModificationQuestionnaire.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ValiderModificationQuestionnaire.setText("Ajouter une question ");
        ValiderModificationQuestionnaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderModificationQuestionnaireActionPerformed(evt);
            }
        });

        supressionQuestionnaire.setBackground(new java.awt.Color(51, 204, 0));
        supressionQuestionnaire.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        supressionQuestionnaire.setText("Supprimer le questionnaire");
        supressionQuestionnaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supressionQuestionnaireActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(RetourAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Creer1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AjoutQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(nomQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(ModifQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(tableauquestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addComponent(ValiderAjoutQuestionnaire))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(ValiderModificationQuestionnaire)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(supressionQuestionnaire)))
                .addGap(402, 402, 402))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Creer1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RetourAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ValiderAjoutQuestionnaire))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ModifQuestionnaire)
                    .addComponent(tableauquestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ValiderModificationQuestionnaire)
                    .addComponent(supressionQuestionnaire))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    //Action Bouton
    private void RetourAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourAccueilActionPerformed
        f.change("accueilrefresh");
    }//GEN-LAST:event_RetourAccueilActionPerformed

    private void ValiderAjoutQuestionnaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderAjoutQuestionnaireActionPerformed

        if ((!nomQuestionnaire.getText().equals("Veuillez entrer le nom du Questionnaire"))
                && (!nomQuestionnaire.getText().trim().isEmpty())) {

            String s = (String) nomQuestionnaire.getText();
            Questionnaire questionnaire = new Questionnaire();
            questionnaire.setNom(s);
            f.setEnCours(questionnaire);
            nomQuestionnaire.setText("Veuillez entrer le nom du Questionnaire");
            f.change("creer2");

        } else {
            JOptionPane.showMessageDialog(null, "Saisie du nom incorrecte", "Erreur !!!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ValiderAjoutQuestionnaireActionPerformed

    private void ValiderModificationQuestionnaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderModificationQuestionnaireActionPerformed
        try {
            String s = (String) tableauquestionnaire.getSelectedItem();
            Questionnaire q = GestionFichier.ficherVersQuestionnaire(s);
            f.setEnCours(q);
            f.change("creer2");
        } catch (IOException ex) {
            Logger.getLogger(Creer1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ValiderModificationQuestionnaireActionPerformed

    private void nomQuestionnaireMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nomQuestionnaireMousePressed
        nomQuestionnaire.setText("");
        nomQuestionnaire.setForeground(Color.BLACK);

    }//GEN-LAST:event_nomQuestionnaireMousePressed

    private void supressionQuestionnaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supressionQuestionnaireActionPerformed
        String s = (String) tableauquestionnaire.getSelectedItem();
        GestionFichier.supprimerQuestionnaire(s);
        f.change("accueilrefresh");

    }//GEN-LAST:event_supressionQuestionnaireActionPerformed

    // Méthodes
    private DefaultComboBoxModel initQuestionnaire() {
        String[] tab = GestionFichier.envoieListQuestionnaireDuRepertoire();
        return new DefaultComboBoxModel(tab);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AjoutQuestionnaire;
    private javax.swing.JLabel Creer1;
    private javax.swing.JLabel ModifQuestionnaire;
    private javax.swing.JButton RetourAccueil;
    private javax.swing.JButton ValiderAjoutQuestionnaire;
    private javax.swing.JButton ValiderModificationQuestionnaire;
    private javax.swing.JTextField nomQuestionnaire;
    private javax.swing.JButton supressionQuestionnaire;
    private javax.swing.JComboBox<String> tableauquestionnaire;
    // End of variables declaration//GEN-END:variables
}
