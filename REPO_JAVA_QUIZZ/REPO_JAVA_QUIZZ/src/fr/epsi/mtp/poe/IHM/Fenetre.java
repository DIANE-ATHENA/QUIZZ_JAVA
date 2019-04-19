package fr.epsi.mtp.poe.IHM;

import fr.epsi.mtp.poe.GestionQuestion.Questionnaire;
import java.awt.CardLayout;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {

    Accueil accueil = new Accueil(this);
    Jouer1 jeu = new Jouer1(this);
    Creer1 creer = new Creer1(this);
    Jouer2 jeu2 = new Jouer2(this);
    Creer2 creer2 = new Creer2(this);
    CardLayout cardLayout;
    JPanel panel;
    ImageIcon logo;
    private Questionnaire enCours;

    // Constructeur
    public Fenetre() {

        cardLayout = new CardLayout();
        setSize(800, 500);
        setResizable(false);
        setTitle("! QUIZZ MASTER ?");
        setIconImage(logoQuizz().getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        panel = new JPanel(cardLayout);
        getRootPane().getContentPane().add(panel);
        // j'ajoute le panel au cardLayoutPanel :
        //	cardLayoutPanel.add(panel, identifiantPanel);
        panel.add(accueil, "accueil");
        //panel.add(jeu,"jouer");

        panel.add(jeu, "jeu");
        panel.add(jeu2, "jeu2");
        panel.add(creer, "creer");
        panel.add(creer2, "creer2");

        change("accueil");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>

    // Getter and Setter
    public Questionnaire getEnCours() {
        return enCours;
    }

    public void setEnCours(Questionnaire enCours) {
        this.enCours = enCours;
    }

    //Methodes
    public ImageIcon imageAccueil() {
        ImageIcon image1 = new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/mtp/poe/IHM/Accueil.png")); // NOI18N
        //ImageIcon image1 = new ImageIcon(new File("images/Accueil.png").getAbsolutePath());
        ImageIcon image = new ImageIcon(image1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

        return image;
    }

    public ImageIcon logoQuizz() {
        ImageIcon image = new javax.swing.ImageIcon(getClass().getResource("/fr/epsi/mtp/poe/IHM/Logo.png"));
        ImageIcon image1 = new ImageIcon(image.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        return image1;
    }

    public void change(String pan) {

        switch (pan) {
            case "accueil": {
                cardLayout.show(panel, "accueil");
                repaint();

                break;
            }
            case "jeu": {
                cardLayout.show(panel, "jeu");

                repaint();
                break;
            }
            case "jeu2": {
                cardLayout.show(panel, "jeu2");

                repaint();
                break;
            }
            case "creer": {
                cardLayout.show(panel, "creer");

                repaint();
                break;
            }
            case "creer2": {
                cardLayout.show(panel, "creer2");
                repaint();
                break;
            }
            case "accueilrefresh": {
                new Fenetre().setVisible(true);
                this.dispose();
                break;
            }
        }
    }

    //MAIN
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
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fenetre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Fenetre().setVisible(true);
        });
    }

}
