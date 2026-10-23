package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.service.IEmployeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/employe")
public class EmployeController {

    IEmployeService service;

    @PostMapping("/creer")
    public Employe creer(@RequestBody Employe employe) {
        return service.creer(employe);
    }

    @GetMapping("/obtenir/{id}")
    public Employe obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Employe> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Employe mettreAJour(@RequestBody Employe employe) {
        return service.mettreAJour(employe);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
