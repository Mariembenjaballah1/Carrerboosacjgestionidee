package tn.esprit.examenquizz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenquizz.entities.Candidat;
import tn.esprit.examenquizz.entities.Quiz;

@Repository
public interface QuizRepository extends JpaRepository<Quiz,Integer> {
    Quiz findByTitrequizLike(String titre);
}
