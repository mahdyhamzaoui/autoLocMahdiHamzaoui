package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {

    IContratService service;

    @PostMapping("/creer")
    public Contrat creer(@RequestBody Contrat contrat) {
        return service.creer(contrat);
    }

    @GetMapping("/obtenir/{id}")
    public Contrat obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Contrat> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Contrat mettreAJour(@RequestBody Contrat contrat) {
        return service.mettreAJour(contrat);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
