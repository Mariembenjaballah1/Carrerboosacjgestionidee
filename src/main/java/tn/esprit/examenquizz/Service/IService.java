package tn.esprit.examenquizz.Service;

import tn.esprit.examenquizz.entities.Candidat;

import java.util.List;

public interface IService {


    Candidat addcandidat(Candidat candidat);
    Candidat getcandiabyID(Long id);




    void updatecandiat(Candidat candidat);

    void deletecandiat(Long id);
}
