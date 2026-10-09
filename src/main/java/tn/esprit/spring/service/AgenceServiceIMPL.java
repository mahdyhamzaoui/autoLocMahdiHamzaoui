package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Agence;
import tn.esprit.spring.repository.AgenceRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class AgenceServiceIMPL implements IAgenceService {
    AgenceRepository repository;

    @Override
    public Agence creer(Agence agence) {
        return repository.save(agence);
    }

    @Override
    public Agence obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> listerTous() {
        return repository.findAll();
    }

    @Override
    public Agence mettreAJour(Agence agence) {
        return repository.save(agence);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
