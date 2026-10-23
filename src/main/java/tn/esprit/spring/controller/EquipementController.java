package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Equipement;
import tn.esprit.spring.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    IEquipementService service;

    @PostMapping("/creer")
    public Equipement creer(@RequestBody Equipement equipement) {
        return service.creer(equipement);
    }

    @GetMapping("/obtenir/{id}")
    public Equipement obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Equipement> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Equipement mettreAJour(@RequestBody Equipement equipement) {
        return service.mettreAJour(equipement);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
