package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.service.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    IReservationService service;

    @PostMapping("/creer")
    public Reservation creer(@RequestBody Reservation reservation) {
        return service.creer(reservation);
    }

    @GetMapping("/obtenir/{id}")
    public Reservation obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Reservation> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Reservation mettreAJour(@RequestBody Reservation reservation) {
        return service.mettreAJour(reservation);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
