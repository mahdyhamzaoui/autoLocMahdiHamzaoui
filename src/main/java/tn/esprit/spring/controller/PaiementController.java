package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Paiement;
import tn.esprit.spring.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    IPaiementService service;

    @PostMapping("/creer")
    public Paiement creer(@RequestBody Paiement payment) {
        return service.creer(payment);
    }

    @GetMapping("/obtenir/{id}")
    public Paiement obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Paiement> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Paiement mettreAJour(@RequestBody Paiement payment) {
        return service.mettreAJour(payment);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
