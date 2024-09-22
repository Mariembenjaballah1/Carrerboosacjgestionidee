package tn.esprit.examenquizz.Service;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tn.esprit.examenquizz.Repository.CondidatRepository;
import tn.esprit.examenquizz.Repository.QuizRepository;
import tn.esprit.examenquizz.entities.Candidat;
import tn.esprit.examenquizz.entities.Quiz;

@Service
@AllArgsConstructor
@Slf4j
public class ServiceIMPL implements InterfaceService{
    CondidatRepository condidatRepository ;
    QuizRepository quizRepository ;
    @Override
    public Candidat ajouterCandidat(Candidat candidat) {

        return condidatRepository.save(candidat);
    }

    @Override
    public Quiz ajouterQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }


    @Transactional  // enregistrer les instructions ,le tout ou rien , pas besoin d'ecire @override avec @Transactional

    public Quiz affecterQuizCandidat(String titreQuiz, Integer idCandidat) {
        //affictation est la responsabilité de celle qui ne contient pas mappedBY
        Candidat candidat =  condidatRepository.findById(idCandidat).orElse(null);
        Quiz quiz = quizRepository.findByTitrequizLike(titreQuiz);
        quiz.getCandidats().add(candidat);
        candidat.setNbQuiz(candidat.getNbQuiz()+1);
        condidatRepository.save(candidat);
        return   quizRepository.save(quiz);

    }
}
