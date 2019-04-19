package fr.epsi.mtp.poe.GestionQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Questionnaire {

    private String nom;
    private List<Question> questions= new ArrayList <Question> ();

    // getter/setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }



    //Mélange du questionnaire: mélange des Object Questions à l'intérieurs
    public void triageQuestions(){
        ArrayList<Question> nouvelleList = new ArrayList<Question>(this.getQuestions());
        Collections.shuffle(nouvelleList);
        this.setQuestions(nouvelleList);
    }










}
