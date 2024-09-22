package tn.esprit.examenquizz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenquizz.entities.Quizz;
@Repository
public interface IQuizzRepo extends JpaRepository<Quizz,Long> {
}
