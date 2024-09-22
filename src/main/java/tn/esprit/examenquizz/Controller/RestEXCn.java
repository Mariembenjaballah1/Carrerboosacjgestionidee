package tn.esprit.examenquizz.Controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.examenquizz.Service.ServiceImpl;
import tn.esprit.examenquizz.entities.Candidat;

import java.util.List;

@RestController
@RequestMapping("/p")
@AllArgsConstructor
public class RestEXCn {
    ServiceImpl serviceimp;
   

    @PostMapping("/createide")
    public Candidat addcandidat(@RequestBody Candidat candidat) {
        return serviceimp.addcandidat(candidat);
    }

    @GetMapping("/getcandidat/{id}")
    public Candidat getcandiabyID(@PathVariable("id") Long id) {
        return serviceimp.getcandiabyID(id);
    }

    @PutMapping("/updatecandidat")
    public void updateIdee(@RequestBody Candidat candidat) {
        serviceimp.updatecandiat(candidat);
    }

    @DeleteMapping("/deletecandidat/{id}")
    public void deletecandidat(@PathVariable("id") Long id) {
        serviceimp.deletecandiat(id);
    }
}
