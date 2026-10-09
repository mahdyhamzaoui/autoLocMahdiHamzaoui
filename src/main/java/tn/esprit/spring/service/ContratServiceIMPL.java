package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Contrat;
import tn.esprit.spring.repository.ContratRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceIMPL implements IContratService {
    ContratRepository repository;

    @Override
    public Contrat creer(Contrat contrat) {
        return repository.save(contrat);
    }

    @Override
    public Contrat obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> listerTous() {
        return repository.findAll();
    }

    @Override
    public Contrat mettreAJour(Contrat contrat) {
        return repository.save(contrat);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
