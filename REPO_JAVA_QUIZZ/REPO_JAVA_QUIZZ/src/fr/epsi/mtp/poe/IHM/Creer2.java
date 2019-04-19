package fr.epsi.mtp.poe.IHM;

import fr.epsi.mtp.poe.GestionQuestion.GestionFichier;
import fr.epsi.mtp.poe.GestionQuestion.Question;
import fr.epsi.mtp.poe.GestionQuestion.Questionnaire;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class Creer2 extends javax.swing.JPanel {

    Fenetre f;

    // Constructeur
    public Creer2(Fenetre f) {
        this.f = f;
        initComponents();

        //Init image acceuil
        RetourAccueilCreer2.setIcon(f.imageAccueil());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RetourAccueilCreer2 = new javax.swing.JButton();
        TitreCreer2 = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        EcritQuestion = new javax.swing.JTextField();
        Réponses = new javax.swing.JLabel();
        Reponse1Creer2 = new javax.swing.JCheckBox();
        Reponse2Creer2 = new javax.swing.JCheckBox();
        Reponse3Creer2 = new javax.swing.JCheckBox();
        Reponse4Creer2 = new javax.swing.JCheckBox();
        EcritRep1Creer2 = new javax.swing.JTextField();
        EcritRep2Creer2 = new javax.swing.JTextField();
        EcritRep3Creer2 = new javax.swing.JTextField();
        EcritRep4Creer2 = new javax.swing.JTextField();
        AjoutQuestion = new javax.swing.JButton();
        ValideQuestionnaire = new javax.swing.JButton();
        Indications = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));

        RetourAccueilCreer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RetourAccueilCreer2.setText("Accueil");
        RetourAccueilCreer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourAccueilCreer2ActionPerformed(evt);
            }
        });

        TitreCreer2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        TitreCreer2.setForeground(new java.awt.Color(51, 204, 0));
        TitreCreer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitreCreer2.setText("CREER");

        Question.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Question.setText("Question");

        EcritQuestion.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        EcritQuestion.setForeground(new java.awt.Color(153, 153, 153));
        EcritQuestion.setText("Renseignez votre question");
        EcritQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EcritQuestionMousePressed(evt);
            }
        });
        EcritQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcritQuestionActionPerformed(evt);
            }
        });
        EcritQuestion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EcritQuestionKeyPressed(evt);
            }
        });

        Réponses.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Réponses.setText("Réponses : ");

        Reponse1Creer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reponse1Creer2.setText("Réponse 1");

        Reponse2Creer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reponse2Creer2.setText("Réponse 2");

        Reponse3Creer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reponse3Creer2.setText("Réponse 3");

        Reponse4Creer2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Reponse4Creer2.setText("Réponse 4");

        EcritRep1Creer2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        EcritRep1Creer2.setForeground(new java.awt.Color(153, 153, 153));
        EcritRep1Creer2.setText("Renseignez votre première réponse");
        EcritRep1Creer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EcritRep1Creer2MousePressed(evt);
            }
        });
        EcritRep1Creer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcritRep1Creer2ActionPerformed(evt);
            }
        });

        EcritRep2Creer2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        EcritRep2Creer2.setForeground(new java.awt.Color(153, 153, 153));
        EcritRep2Creer2.setText("Renseignez votre deuxième réponse");
        EcritRep2Creer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EcritRep2Creer2MousePressed(evt);
            }
        });

        EcritRep3Creer2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        EcritRep3Creer2.setForeground(new java.awt.Color(153, 153, 153));
        EcritRep3Creer2.setText("Renseignez votre troisième réponse");
        EcritRep3Creer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EcritRep3Creer2MousePressed(evt);
            }
        });

        EcritRep4Creer2.setFont(new java.awt.Font("Tahoma", 2, 13)); // NOI18N
        EcritRep4Creer2.setForeground(new java.awt.Color(153, 153, 153));
        EcritRep4Creer2.setText("Renseignez votre quatrième réponse");
        EcritRep4Creer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                EcritRep4Creer2MousePressed(evt);
            }
        });

        AjoutQuestion.setBackground(new java.awt.Color(51, 204, 0));
        AjoutQuestion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        AjoutQuestion.setText("Ajouter la question au questionnaire");
        AjoutQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutQuestionActionPerformed(evt);
            }
        });

        ValideQuestionnaire.setBackground(new java.awt.Color(51, 204, 0));
        ValideQuestionnaire.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ValideQuestionnaire.setText("Valider le questionnaire");
        ValideQuestionnaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValideQuestionnaireActionPerformed(evt);
            }
        });

        Indications.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        Indications.setText("(ne cochez que les bonnes réponses)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reponse2Creer2)
                            .addComponent(Reponse1Creer2)
                            .addComponent(Reponse3Creer2)
                            .addComponent(Reponse4Creer2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(EcritRep3Creer2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EcritRep2Creer2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EcritRep1Creer2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EcritRep4Creer2, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RetourAccueilCreer2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addComponent(TitreCreer2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EcritQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Réponses, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Indications, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)))
                .addGap(0, 129, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(AjoutQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ValideQuestionnaire, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TitreCreer2, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(RetourAccueilCreer2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Question, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EcritQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Réponses)
                    .addComponent(Indications))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Reponse1Creer2)
                    .addComponent(EcritRep1Creer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Reponse2Creer2)
                    .addComponent(EcritRep2Creer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reponse3Creer2)
                    .addComponent(EcritRep3Creer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reponse4Creer2)
                    .addComponent(EcritRep4Creer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AjoutQuestion)
                    .addComponent(ValideQuestionnaire))
                .addGap(23, 23, 23))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Action Boutton
    private void AjoutQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutQuestionActionPerformed

        if (verifPourValidationLongueurReponse()) {
            if (!verifPourValidationQuestion()) {

                //si faux --> message erreur
                JOptionPane jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "Vous n'avez pas renseigné tous les champs\nVeuillez renseigner au minimum une bonnne et une mauvaise réponse",
                        "Erreur", JOptionPane.WARNING_MESSAGE);
            } else {

                // Si ok création de l'objet Question --> ajout à la List de Questions dans Questionnaire.
                Question question = new Question();
                String s = EcritQuestion.getText();
                question.setQuestion(s);
                creationBFreponse(question);
                Questionnaire questionnaire = f.getEnCours();
                questionnaire.getQuestions().add(question);
                reset();
            }
        }

    }//GEN-LAST:event_AjoutQuestionActionPerformed

    private void ValideQuestionnaireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValideQuestionnaireActionPerformed

        if (verifPourValidationQuestionnaire()) {

            try {
                GestionFichier.ecritureQuestionnaire(f.getEnCours());
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Creer2.class.getName()).log(Level.SEVERE, null, ex);
            }
            f.change("accueilrefresh");
        } else {
            JOptionPane jop1 = new JOptionPane();
            jop1.showMessageDialog(null, "Attention une saisie a été effectué sans avoir ajouter la question au questionnaire.\n"
                    + "Veuillez ajouter votre derniere saisie ou annuler toutes les saisies avant de valider le questionnaire!",
                    "Attention!!", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_ValideQuestionnaireActionPerformed

    private void RetourAccueilCreer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourAccueilCreer2ActionPerformed
        f.change("accueilrefresh");
    }//GEN-LAST:event_RetourAccueilCreer2ActionPerformed

    private void EcritQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcritQuestionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EcritQuestionActionPerformed

    private void EcritQuestionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EcritQuestionMousePressed
        // Mise en form normal des champs une fois clicker sur le champs
        if (EcritQuestion.getText().equals("Renseignez votre question")) {
            EcritQuestion.setText("");
        }
        EcritQuestion.setForeground(Color.BLACK);
        Font fn1 = EcritQuestion.getFont();
        Font fn = new Font(fn1.getFamily(), Font.PLAIN, fn1.getSize());
        EcritQuestion.setFont(fn);
    }//GEN-LAST:event_EcritQuestionMousePressed

    private void EcritRep1Creer2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EcritRep1Creer2MousePressed
        if (EcritRep1Creer2.getText().equals("Renseignez votre première réponse")) {
            EcritRep1Creer2.setText("");
        }
        EcritRep1Creer2.setForeground(Color.BLACK);
        Font fn1 = EcritRep1Creer2.getFont();
        Font fn = new Font(fn1.getFamily(), Font.PLAIN, fn1.getSize());
        EcritRep1Creer2.setFont(fn);
    }//GEN-LAST:event_EcritRep1Creer2MousePressed

    private void EcritRep2Creer2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EcritRep2Creer2MousePressed
        if (EcritRep2Creer2.getText().equals("Renseignez votre deuxième réponse")) {
            EcritRep2Creer2.setText("");
        }
        EcritRep2Creer2.setForeground(Color.BLACK);
        Font fn1 = EcritRep2Creer2.getFont();
        Font fn = new Font(fn1.getFamily(), Font.PLAIN, fn1.getSize());
        EcritRep2Creer2.setFont(fn);
    }//GEN-LAST:event_EcritRep2Creer2MousePressed

    private void EcritRep3Creer2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EcritRep3Creer2MousePressed
        if (EcritRep3Creer2.getText().equals("Renseignez votre troisième réponse")) {
            EcritRep3Creer2.setText("");
        }
        EcritRep3Creer2.setForeground(Color.BLACK);
        Font fn1 = EcritRep3Creer2.getFont();
        Font fn = new Font(fn1.getFamily(), Font.PLAIN, fn1.getSize());
        EcritRep3Creer2.setFont(fn);
    }//GEN-LAST:event_EcritRep3Creer2MousePressed

    private void EcritRep4Creer2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EcritRep4Creer2MousePressed
        if (EcritRep4Creer2.getText().equals("Renseignez votre quatrième réponse")) {
            EcritRep4Creer2.setText("");
        }
        EcritRep4Creer2.setForeground(Color.BLACK);
        Font fn1 = EcritRep4Creer2.getFont();
        Font fn = new Font(fn1.getFamily(), Font.PLAIN, fn1.getSize());
        EcritRep4Creer2.setFont(fn);
    }//GEN-LAST:event_EcritRep4Creer2MousePressed

    private void EcritRep1Creer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcritRep1Creer2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EcritRep1Creer2ActionPerformed

    private void EcritQuestionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EcritQuestionKeyPressed

    }//GEN-LAST:event_EcritQuestionKeyPressed

    // Méthodes
    public void reset() {

        //Remise a zéro pour une nouvelle Question.
        EcritQuestion.setText("Renseignez votre question");
        EcritQuestion.setForeground(Color.LIGHT_GRAY);

        Reponse1Creer2.setSelected(false);
        Reponse2Creer2.setSelected(false);
        Reponse3Creer2.setSelected(false);
        Reponse4Creer2.setSelected(false);

        EcritRep1Creer2.setText("Renseignez votre première réponse");
        EcritRep1Creer2.setForeground(Color.LIGHT_GRAY);
        EcritRep2Creer2.setText("Renseignez votre deuxième réponse");
        EcritRep2Creer2.setForeground(Color.LIGHT_GRAY);
        EcritRep3Creer2.setText("Renseignez votre troisième réponse");
        EcritRep3Creer2.setForeground(Color.LIGHT_GRAY);
        EcritRep4Creer2.setText("Renseignez votre quatrième réponse");
        EcritRep4Creer2.setForeground(Color.LIGHT_GRAY);

    }

    public boolean verifPourValidationQuestion() {

        //Vérif qu'il y ai au moins une bonne et une mauvaise réponse
        if (Reponse1Creer2.isSelected() && Reponse2Creer2.isSelected() && Reponse3Creer2.isSelected() && Reponse4Creer2.isSelected()) {
            return false;
        }
        if (!Reponse1Creer2.isSelected() && !Reponse2Creer2.isSelected() && !Reponse3Creer2.isSelected() && !Reponse4Creer2.isSelected()) {
            return false;
        }

        //Vérif des champs de texte.
        if ((EcritQuestion.getText().trim().isEmpty()
                || EcritRep1Creer2.getText().trim().isEmpty()
                || EcritRep2Creer2.getText().trim().isEmpty()
                || EcritRep3Creer2.getText().trim().isEmpty()
                || EcritRep4Creer2.getText().trim().isEmpty())
                || (EcritQuestion.getText().equals("Renseignez votre question")
                || EcritRep1Creer2.getText().equals("Renseignez votre première réponse")
                || EcritRep2Creer2.getText().equals("Renseignez votre deuxième réponse")
                || EcritRep3Creer2.getText().equals("Renseignez votre troisième réponse")
                || EcritRep4Creer2.getText().equals("Renseignez votre quatrième réponse"))) {
            return false;
        }
        return true;
    }

    public boolean verifPourValidationLongueurReponse() {

        int rep1 = EcritRep1Creer2.getText().length();
        int rep2 = EcritRep2Creer2.getText().length();
        int rep3 = EcritRep3Creer2.getText().length();
        int rep4 = EcritRep4Creer2.getText().length();
        int[] longueurReponse = {rep1, rep2, rep3, rep4};
        for (int i = 0; i < 4; i++) {
            if (longueurReponse[i] >= 60) {
                JOptionPane jop1 = new JOptionPane();
                jop1.showMessageDialog(null, "La réponse " + (i + 1) + " est trop longue vous ne devait pas dépasser 60 caractères",
                        "Attention!!", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        return true;
    }

    public boolean verifPourValidationQuestionnaire() {

        //Vérif que aucune checkbox soient selectionnées
        if (!Reponse1Creer2.isSelected() && !Reponse2Creer2.isSelected() && !Reponse3Creer2.isSelected() && !Reponse4Creer2.isSelected()) {

            // Vérif que les champs de texte soient vides ou equals à la remise a 0.
            if ((EcritQuestion.getText().trim().isEmpty() || EcritQuestion.getText().equals("Renseignez votre question"))
                    && (EcritRep1Creer2.getText().trim().isEmpty() || EcritRep1Creer2.getText().equals("Renseignez votre première réponse"))
                    && (EcritRep2Creer2.getText().trim().isEmpty() || EcritRep2Creer2.getText().equals("Renseignez votre deuxième réponse"))
                    && (EcritRep3Creer2.getText().trim().isEmpty() || EcritRep3Creer2.getText().equals("Renseignez votre troisième réponse"))
                    && (EcritRep4Creer2.getText().trim().isEmpty() || EcritRep4Creer2.getText().equals("Renseignez votre quatrième réponse"))) {
                return true;
            }
        }
        return false;
    }

    public void creationBFreponse(Question question) {

        //Création des list Bonne et Fausse  réponse selon l'utilistaeur et ajout dans un objet Question
        String s1 = EcritRep1Creer2.getText();
        if (Reponse1Creer2.isSelected()) {
            question.getReponseB().add(s1);

        } else {
            question.getReponseF().add(s1);
        }

        String s2 = EcritRep2Creer2.getText();
        if (Reponse2Creer2.isSelected()) {
            question.getReponseB().add(s2);
        } else {
            question.getReponseF().add(s2);
        }

        String s3 = EcritRep3Creer2.getText();
        if (Reponse3Creer2.isSelected()) {
            question.getReponseB().add(s3);
        } else {
            question.getReponseF().add(s3);
        }

        String s4 = EcritRep4Creer2.getText();
        if (Reponse4Creer2.isSelected()) {
            question.getReponseB().add(s4);
        } else {
            question.getReponseF().add(s4);

        }

        //private void keyPressed(KeyEvent)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjoutQuestion;
    private javax.swing.JTextField EcritQuestion;
    private javax.swing.JTextField EcritRep1Creer2;
    private javax.swing.JTextField EcritRep2Creer2;
    private javax.swing.JTextField EcritRep3Creer2;
    private javax.swing.JTextField EcritRep4Creer2;
    private javax.swing.JLabel Indications;
    private javax.swing.JLabel Question;
    private javax.swing.JCheckBox Reponse1Creer2;
    private javax.swing.JCheckBox Reponse2Creer2;
    private javax.swing.JCheckBox Reponse3Creer2;
    private javax.swing.JCheckBox Reponse4Creer2;
    private javax.swing.JButton RetourAccueilCreer2;
    private javax.swing.JLabel Réponses;
    private javax.swing.JLabel TitreCreer2;
    private javax.swing.JButton ValideQuestionnaire;
    // End of variables declaration//GEN-END:variables
}
