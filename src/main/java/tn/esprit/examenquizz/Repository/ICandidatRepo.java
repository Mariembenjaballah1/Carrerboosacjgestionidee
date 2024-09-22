package tn.esprit.examenquizz.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.examenquizz.entities.Candidat;

@Repository
public interface ICandidatRepo extends JpaRepository<Candidat,Long> {
}
