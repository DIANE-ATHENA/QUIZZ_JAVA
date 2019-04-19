package fr.epsi.mtp.poe.GestionQuestion;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GestionFichier {

    public static void ecritureQuestionnaire(Questionnaire questionnaire) throws FileNotFoundException {

        File repertoire = new File("fichiers");

        //test si répertoire existe
        if (!repertoire.exists()) {
            boolean b = repertoire.mkdir();
        }

        //Ecriture d'un fichier File
        File cheminpackage = new File("fichiers/" + questionnaire.getNom() + ".txt");

        String fichier = cheminpackage.getAbsolutePath();
        PrintWriter pw = new PrintWriter(fichier);

        int nbrQuestions = questionnaire.getQuestions().size();

        for (int i = 0; i < nbrQuestions; i++) {

            pw.println("Q : " + questionnaire.getQuestions().get(i).getQuestion());
            int nbrBonnreponse = questionnaire.getQuestions().get(i).getReponseB().size();
            int nbreFaussereponse = questionnaire.getQuestions().get(i).getReponseF().size();

            for (int j = 0; j < nbrBonnreponse; j++) {
                pw.println("B : " + questionnaire.getQuestions().get(i).getReponseB().get(j));
            }
            for (int k = 0; k < nbreFaussereponse; k++) {
                pw.println("F : " + questionnaire.getQuestions().get(i).getReponseF().get(k));
            }
        }
        pw.close();
    }

    public static Questionnaire ficherVersQuestionnaire(String nom) throws IOException {

        //Recherche du fichier .txt
        String chemin = new File(("fichiers/" + nom + ".txt")).getAbsolutePath();

        //lecture du fichier .txt et l'envoyer vers String
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(chemin), "ISO-8859-1"));

        String s1 = "";
        while (br.ready()) {
            String s = br.readLine();
            s1 = s1.concat(" " + s);
        }
        br.close();

        //Découpage du String pour recreer l'Objet Questionnaire.
        ArrayList<String> v = new ArrayList<String>(Arrays.asList(s1.split(" Q : ")));
        v.remove(0);

        List<Question> qd = new ArrayList<Question>();
        Questionnaire questionnaire = new Questionnaire();
        questionnaire.setNom(nom);
        for (int i = 0; i < v.size(); i++) {

            Question question = new Question();
            ArrayList<String> F = new ArrayList<String>(Arrays.asList(v.get(i).split(" F : ")));
            F.remove(0);
            List<String> ListFRep = new ArrayList<String>();
            for (int j = 0; j < F.size(); j++) {
                ListFRep.add(F.get(j));
            }
            question.setReponseF(ListFRep);

            int pos = v.get(i).indexOf(" F : ");
            String s2 = v.get(i).substring(0, pos);
            ArrayList<String> C = new ArrayList<String>(Arrays.asList(s2.split(" B : ")));
            C.remove(0);
            List<String> ListBRep = new ArrayList<String>();
            for (int k = 0; k < C.size(); k++) {
                ListBRep.add(C.get(k));
            }
            question.setReponseB(ListBRep);
            int pos1 = s2.indexOf(" B : ");
            String s3 = s2.substring(0, pos1);
            question.setQuestion(s3);

            qd.add(question);
        }
        questionnaire.setQuestions(qd);

        return questionnaire;
    }

    public static void supprimerQuestionnaire(String nom) {

        String cheminfichiersup = new File("fichiers/" + nom + ".txt").getAbsolutePath();
        File fichierasup = new File(cheminfichiersup);
        fichierasup.delete();

    }

    public static String[] envoieListQuestionnaireDuRepertoire() {
        File repertoire1 = new File("fichiers");
        if (!repertoire1.exists()) {
            boolean b = repertoire1.mkdir();
        }
        String chemin = new File("fichiers").getAbsolutePath();

        File repertoire = new File(chemin);
        String[] files = repertoire.list();
        String[] tableauQuestionnaire = new String[files.length];
        for (int i = 0; i < files.length; i++) {

            String[] tab = files[i].split(("\\."));
            tableauQuestionnaire[i] = tab[0];
        }
        return tableauQuestionnaire;
    }

//    public static void ecritureQuestionnaire2(Questionnaire questionnaire) throws IOException {
//
//        File repertoire = new File("fichiers");
//
//        //test si répertoire existe
//        if(!repertoire.exists()){
//            boolean b = repertoire.mkdir();
//        }
//
//        //Ecriture d'un fichier File
//        File cheminpackage = new File("fichiers/"+questionnaire.getNom()+".txt");
//
//        String fichier = cheminpackage.getAbsolutePath();
//        //PrintWriter pw =new PrintWriter(fichier);
//        BufferedWriter pw = new BufferedWriter(new FileWriter(fichier));
//
//        int nbrQuestions = questionnaire.getQuestions().size();
//
//        for (int i = 0; i < nbrQuestions; i++){
//
//            pw.write("Q : " + questionnaire.getQuestions().get(i).getQuestion()+"\n");
//            int nbrBonnreponse = questionnaire.getQuestions().get(i).getReponseB().size();
//            int nbreFaussereponse = questionnaire.getQuestions().get(i).getReponseF().size();
//
//            for (int j=0; j< nbrBonnreponse; j++) {
//                pw.write("B : " + questionnaire.getQuestions().get(i).getReponseB().get(j)+"\n");
//            }
//            for (int k=0; k<nbreFaussereponse;k++){
//                pw.write("F : " + questionnaire.getQuestions().get(i).getReponseF().get(k)+"\n");
//            }
//        }
//        pw.close();
//    }
}
