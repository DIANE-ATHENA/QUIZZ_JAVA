package fr.epsi.mtp.poe.GestionQuestion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question {

    private String question;
    private List<String> reponseB = new ArrayList<String>();
    private List<String> reponseF = new ArrayList<String>();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<String> getReponseB() {
        return reponseB;
    }

    public void setReponseB(List<String> reponseB) {
        this.reponseB = reponseB;
    }

    public List<String> getReponseF() {
        return reponseF;
    }

    public void setReponseF(List<String> reponseF) {
        this.reponseF = reponseF;
    }

    public List<String> melangeReponseBF() {
        List<String> concatList = new ArrayList<String>();
        concatList.addAll(this.reponseB);
        concatList.addAll((this.reponseF));
        Collections.shuffle(concatList);

        return concatList;
    }

    public boolean verificationReponseJuste(List<String> reponseUtilisateur) {

        if (this.getReponseB().size() != reponseUtilisateur.size()) {
            return false;
        }
        List<String> vrailist = new ArrayList<String>(this.getReponseB());
        Collections.sort(vrailist);
        Collections.sort(reponseUtilisateur);
        return vrailist.equals(reponseUtilisateur);

        //reponseUtilisateur.contains()
//        for (int i = 0; i<getReponseB().size();i++){
//
//            List<Boolean> t = new ArrayList<>()
//            for (int j =0; j<getReponseB().size();j++){
//
//                getReponseB().get(i).equals(reponseUtilisateur.get(j);
//            }
//        }
    }
}
