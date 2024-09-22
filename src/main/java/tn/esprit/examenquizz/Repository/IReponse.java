package tn.esprit.examenquizz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenquizz.entities.Reponse;
@Repository
public interface IReponse extends JpaRepository<Reponse, Long> {
}
