package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Paiement;
import tn.esprit.spring.repository.PaiementRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class PaiementServiceIMPL implements IPaiementService {
    PaiementRepository repository;

    @Override
    public Paiement creer(Paiement payment) {
        return repository.save(payment);
    }

    @Override
    public Paiement obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> listerTous() {
        return repository.findAll();
    }

    @Override
    public Paiement mettreAJour(Paiement payment) {
        return repository.save(payment);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
