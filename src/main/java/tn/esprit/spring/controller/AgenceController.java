package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {

    IAgenceService service;

    @PostMapping("/creer")
    public Agence creer(@RequestBody Agence agence) {
        return service.creer(agence);
    }

    @GetMapping("/obtenir/{id}")
    public Agence obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Agence> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Agence mettreAJour(@RequestBody Agence agence) {
        return service.mettreAJour(agence);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
