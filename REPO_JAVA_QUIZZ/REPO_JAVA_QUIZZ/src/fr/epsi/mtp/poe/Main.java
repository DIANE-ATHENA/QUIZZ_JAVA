package fr.epsi.mtp.poe;

import fr.epsi.mtp.poe.GestionQuestion.Question;
import fr.epsi.mtp.poe.GestionQuestion.Questionnaire;
import fr.epsi.mtp.poe.GestionQuestion.GestionFichier;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main1(String[] args) {
        // write your code here
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setNom("test1");

        Question q = new Question();
        q.setQuestion("Quelle âge as tu?");
        List<String> repF = new ArrayList<String>();
        List<String> repB = new ArrayList<String>();
        repF.add("25ans");
        repB.add("28ans");
        repF.add("35ans");
        repF.add("15ans");
        q.setReponseF(repF);
        q.setReponseB(repB);
        questionnaire.getQuestions().add(q);

        Question q1 = new Question();
        q1.setQuestion("Quelless âge à tu?");
        List<String> repF1 = new ArrayList<String>();
        List<String> repB1 = new ArrayList<String>();
        repF1.add("25ansss");
        repB1.add("28ansss");
        repB1.add("35anss");
        repF1.add("15ansss");
        q1.setReponseF(repF1);
        q1.setReponseB(repB1);
        List<Question> questions = new ArrayList<Question>();
        questions.add(q1);
        questions.add(q);
        questionnaire.setQuestions(questions);

        try {

            GestionFichier.ecritureQuestionnaire(questionnaire);

        } catch (FileNotFoundException e) {
            System.err.println(" ca a pas marcher");
        }

        Questionnaire quest1 = new Questionnaire();
        try {
            quest1 = GestionFichier.ficherVersQuestionnaire("test1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //ouvrir test1 main en cour
        Questionnaire questionnaire1 = new Questionnaire();

        try {
            questionnaire1 = GestionFichier.ficherVersQuestionnaire("test1");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Question question1 = new Question();
        question1.setQuestion("Quel temps fait-il?");
        List<String> ListeBonneReponse = new ArrayList<String>();
        List<String> ListeFaussereponse = new ArrayList<String>();

        ListeBonneReponse.add("Il fais beau");
        ListeBonneReponse.add("Il pleut");
        ListeFaussereponse.add("C'est nuageux");
        ListeFaussereponse.add("C'est gris");

        question1.setReponseF(ListeFaussereponse);
        question1.setReponseB(ListeBonneReponse);

        questionnaire1.getQuestions().add(question1);

        try {
            GestionFichier.ecritureQuestionnaire(questionnaire1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println(questionnaire1.getQuestions().get(0).getQuestion());

    }
}
