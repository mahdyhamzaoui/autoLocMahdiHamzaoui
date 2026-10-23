package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.service.IVehiculeService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    IVehiculeService service;

    @PostMapping("/creer")
    public Vehicule creer(@RequestBody Vehicule vehicule) {
        return service.creer(vehicule);
    }

    @GetMapping("/obtenir/{id}")
    public Vehicule obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Vehicule> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Vehicule mettreAJour(@RequestBody Vehicule vehicule) {
        return service.mettreAJour(vehicule);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
