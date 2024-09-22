package tn.esprit.examenquizz.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.examenquizz.Service.InterfaceService;
import tn.esprit.examenquizz.entities.Candidat;
import tn.esprit.examenquizz.entities.Quiz;

@RestController
@AllArgsConstructor
public class Controller {
    InterfaceService interfaceService ;

    @PostMapping("/addCondidat")
    public Candidat ajouterCandidat(@RequestBody Candidat candidat) {
        return interfaceService.ajouterCandidat(candidat);
    }
    @PostMapping("/addQuizz")
    public Quiz ajouterQuiz(@RequestBody  Quiz quiz) {
        return interfaceService.ajouterQuiz(quiz);
    }
    @PostMapping("/affecterQuizCandidat/{titreQuiz}/{idCandidat}")
    public Quiz affecterQuizCandidat(@PathVariable("titreQuiz") String titreQuiz, @PathVariable("idCandidat") Integer idCandidat) {
        return interfaceService.affecterQuizCandidat(titreQuiz, idCandidat);
    }
}
