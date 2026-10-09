package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Reservation;
import tn.esprit.spring.repository.ReservationRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceIMPL implements IReservationService {
    ReservationRepository repository;

    @Override
    public Reservation creer(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public Reservation obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Reservation> listerTous() {
        return repository.findAll();
    }

    @Override
    public Reservation mettreAJour(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
