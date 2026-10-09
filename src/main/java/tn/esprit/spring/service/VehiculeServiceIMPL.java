package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Vehicule;
import tn.esprit.spring.repository.VehiculeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeServiceIMPL implements IVehiculeService {
    VehiculeRepository repository;

    @Override
    public Vehicule creer(Vehicule vehicule) {
        return repository.save(vehicule);
    }

    @Override
    public Vehicule obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> listerTous() {
        return repository.findAll();
    }

    @Override
    public Vehicule mettreAJour(Vehicule vehicule) {
        return repository.save(vehicule);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
