package tn.esprit.examenquizz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenquizz.entities.Question;
@Repository
public interface IQuestion extends JpaRepository<Question,Long> {
}
