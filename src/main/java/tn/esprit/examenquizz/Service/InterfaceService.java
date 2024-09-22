package tn.esprit.examenquizz.Service;

import tn.esprit.examenquizz.entities.Candidat;
import tn.esprit.examenquizz.entities.Quiz;

public interface InterfaceService {
    public Candidat ajouterCandidat(Candidat candidat) ;
    public Quiz ajouterQuiz(Quiz quiz) ;
    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) ;


}
