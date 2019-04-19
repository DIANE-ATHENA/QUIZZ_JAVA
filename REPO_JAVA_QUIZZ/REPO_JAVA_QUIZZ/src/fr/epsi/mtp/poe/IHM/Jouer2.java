package fr.epsi.mtp.poe.IHM;

import fr.epsi.mtp.poe.GestionQuestion.Questionnaire;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Jouer2 extends javax.swing.JPanel {

    Fenetre f;
    private int numQ = 0;
    private int score = 0;

    // Constructeur
    public Jouer2(Fenetre f) {
        this.f = f;

        initComponents();
        RetourAccueil.setIcon(f.imageAccueil());

    }

    // Getter and Setter
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumQ() {
        return numQ;
    }

    public void setNumQ(int numQ) {
        this.numQ = numQ;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RetourAccueil = new javax.swing.JButton();
        Jouer2 = new javax.swing.JLabel();
        reponse1 = new javax.swing.JCheckBox();
        reponse2 = new javax.swing.JCheckBox();
        reponse3 = new javax.swing.JCheckBox();
        reponse4 = new javax.swing.JCheckBox();
        validerQuestion = new javax.swing.JButton();
        Score = new javax.swing.JLabel();
        ResultatScore = new javax.swing.JTextField();
        ScrollQuestion = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 500));

        RetourAccueil.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        RetourAccueil.setText("Accueil");
        RetourAccueil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourAccueilActionPerformed(evt);
            }
        });

        Jouer2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Jouer2.setForeground(new java.awt.Color(0, 102, 255));
        Jouer2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jouer2.setText("JOUER");

        reponse1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reponse1.setText("jCheckBox1");

        reponse2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reponse2.setText("jCheckBox2");

        reponse3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reponse3.setText("jCheckBox3");
        reponse3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reponse3ActionPerformed(evt);
            }
        });

        reponse4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        reponse4.setText("jCheckBox4");

        validerQuestion.setBackground(new java.awt.Color(51, 204, 0));
        validerQuestion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        validerQuestion.setText("Valider");
        validerQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validerQuestionActionPerformed(evt);
            }
        });

        Score.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Score.setText("Score :");

        ResultatScore.setEditable(false);
        ResultatScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultatScoreActionPerformed(evt);
            }
        });

        ScrollQuestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ScrollQuestion.setEnabled(false);

        question.setEditable(false);
        question.setBackground(new java.awt.Color(204, 204, 204));
        question.setColumns(20);
        question.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        question.setLineWrap(true);
        question.setText("Question");
        question.setWrapStyleWord(true);
        question.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ScrollQuestion.setViewportView(question);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(validerQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(343, 343, 343)
                                .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ResultatScore, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(reponse4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(reponse3, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                                .addComponent(reponse2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reponse1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(RetourAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(128, 128, 128)
                        .addComponent(Jouer2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(ScrollQuestion)
                        .addGap(15, 15, 15)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(RetourAccueil, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(Jouer2)))
                .addGap(58, 58, 58)
                .addComponent(ScrollQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(reponse1)
                .addGap(18, 18, 18)
                .addComponent(reponse2)
                .addGap(18, 18, 18)
                .addComponent(reponse3)
                .addGap(18, 18, 18)
                .addComponent(reponse4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validerQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Score)
                    .addComponent(ResultatScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Action boutton
    private void RetourAccueilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourAccueilActionPerformed
        f.change("accueilrefresh");
    }//GEN-LAST:event_RetourAccueilActionPerformed

    private void validerQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validerQuestionActionPerformed

        if (verificationRéponse(this.getNumQ())) {

            int n = this.getNumQ() + 1;
            if (n < f.getEnCours().getQuestions().size()) {
                setNumQ(n);
                init(n);
            } else {
                affichageScore();
                validationCheckBox();
            }

        }
    }//GEN-LAST:event_validerQuestionActionPerformed

    private void ResultatScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultatScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultatScoreActionPerformed

    private void reponse3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reponse3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reponse3ActionPerformed

    // Méthode
    private String addQuestion(int num) {
        Questionnaire q = f.getEnCours();
        String oneq = "";

        if (q != null) {
            oneq = q.getQuestions().get(num).getQuestion();

        }

        return oneq;
    }

    private void addReponse(int num) {
        Questionnaire q = f.getEnCours();

        if (q != null) {
            List<String> allR = q.getQuestions().get(num).melangeReponseBF();
            reponse1.setText(allR.get(0));
            reponse1.setSelected(false);
            reponse2.setText(allR.get(1));
            reponse2.setSelected(false);
            reponse3.setText(allR.get(2));
            reponse3.setSelected(false);
            reponse4.setText(allR.get(3));
            reponse4.setSelected(false);
        }
    }

    public void affichageScore() {
        int nbrQuestion = f.getEnCours().getQuestions().size();
        int scoreActuel = getScore();
        String castResultatScore = scoreActuel + "/" + nbrQuestion;

        ResultatScore.setText(castResultatScore);
    }

    void init(int num) {
        question.setText(addQuestion(num));
        addReponse(num);
        affichageScore();
    }

    private boolean verificationRéponse(int numeroQuestion) {
        boolean retour = true;
        if (reponse1.isSelected() || reponse2.isSelected() || reponse3.isSelected() || reponse4.isSelected()) {

            List<String> repVraiUtilisateur = new ArrayList<>();
            if (reponse1.isSelected()) {
                repVraiUtilisateur.add(reponse1.getText());
            }
            if (reponse2.isSelected()) {
                repVraiUtilisateur.add(reponse2.getText());
            }
            if (reponse3.isSelected()) {
                repVraiUtilisateur.add(reponse3.getText());
            }
            if (reponse4.isSelected()) {
                repVraiUtilisateur.add(reponse4.getText());
            }
            boolean juste = f.getEnCours().getQuestions().get(numeroQuestion).verificationReponseJuste(repVraiUtilisateur);

            if (juste) {
                setScore(getScore() + 1);
                JOptionPane.showMessageDialog(null, "Vous avez eu juste", "Bravo !!!!!", JOptionPane.INFORMATION_MESSAGE,imageOKOK());
            } else {
                JOptionPane.showMessageDialog(null, "Vous avez eu Faux", "Dommage !!!!!", JOptionPane.INFORMATION_MESSAGE,imageFaux());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez renseigner au moins 1 réponse", "Attention !", JOptionPane.WARNING_MESSAGE);
            retour = false;
        }
        return retour;

    }

    public void validationCheckBox() {
        String test4 = ResultatScore.getText();
        String b = "Bravo vous avez fini le quizz avec la moyenne  ou plus !!!\n\nVous avez eu " + test4 + "\n\nRevenez à l'accueil ou revenir au choix du test ";
        // new code
        String nosucess = "Presque ! vous n'avez pas la moyenne!\n\nVous avez eu " + test4 + "\n\n Rejouez ou retournez à l'accueil  ";
        Double moyenne = ((double) f.getEnCours().getQuestions().size() / 2);
        if (((double) getScore()) >= moyenne) {
            //on modifie le texte des deux boutons..
            Object[] options = {"Revenir à l'accueil", "Choix du test"};
            int t = JOptionPane.showOptionDialog(this, b, "Bravo", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, imageBravo(),
                    options, options[0]);
            if (t == JOptionPane.YES_OPTION) {
                f.change("accueilrefresh");
            } else {
                setNumQ(0);
                setScore(0);
                f.setEnCours(null);
                f.change("jeu");
            }
        } else {
            Object[] options2 = {"Rejouez", "Retour à l'accueil"};
            int no = JOptionPane.showOptionDialog(this, nosucess, "Dommage", JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE, imageTriste(),
                    options2, options2[0]);
            if (no == JOptionPane.YES_OPTION) {
                //rejouer
                setNumQ(0);
                setScore(0);
                f.getEnCours().triageQuestions();
                init(0);
                affichageScore();

            } else {
                f.change("accueilrefresh");
            }
        }
    }

    public ImageIcon imageBravo() {
        ImageIcon image1 = new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/mtp/poe/IHM/Bravo.jpg"));
        ImageIcon image = new ImageIcon(image1.getImage().getScaledInstance(110, 110, Image.SCALE_DEFAULT));
        return image;
    }

    public ImageIcon imageTriste() {
        ImageIcon image1 = new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/mtp/poe/IHM/Triste.jpg"));
        ImageIcon image = new ImageIcon(image1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
        return image;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jouer2;
    private javax.swing.JTextField ResultatScore;
    private javax.swing.JButton RetourAccueil;
    private javax.swing.JLabel Score;
    private javax.swing.JScrollPane ScrollQuestion;
    private javax.swing.JTextArea question;
    private javax.swing.JCheckBox reponse1;
    private javax.swing.JCheckBox reponse2;
    private javax.swing.JCheckBox reponse3;
    private javax.swing.JCheckBox reponse4;
    private javax.swing.JButton validerQuestion;
    // End of variables declaration//GEN-END:variables

    private Icon imageFaux() {
        
        ImageIcon image1 = new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/mtp/poe/IHM/Faux.jpg"));
        ImageIcon image = new ImageIcon(image1.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        return image;
    }

    private Icon imageOKOK() {
       
        ImageIcon image1 = new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/mtp/poe/IHM/OKOK.jpg"));
        ImageIcon image = new ImageIcon(image1.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        return image;
    }

}
