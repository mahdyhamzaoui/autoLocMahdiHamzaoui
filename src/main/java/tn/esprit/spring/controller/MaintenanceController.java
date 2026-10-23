package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Maintenance;
import tn.esprit.spring.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    IMaintenanceService service;

    @PostMapping("/creer")
    public Maintenance creer(@RequestBody Maintenance maintenance) {
        return service.creer(maintenance);
    }

    @GetMapping("/obtenir/{id}")
    public Maintenance obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Maintenance> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Maintenance mettreAJour(@RequestBody Maintenance maintenance) {
        return service.mettreAJour(maintenance);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
