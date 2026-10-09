package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Maintenance;
import tn.esprit.spring.repository.MaintenanceRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class MaintenanceServiceIMPL implements IMaintenanceService {
    MaintenanceRepository repository;

    @Override
    public Maintenance creer(Maintenance maintenance) {
        return repository.save(maintenance);
    }

    @Override
    public Maintenance obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> listerTous() {
        return repository.findAll();
    }

    @Override
    public Maintenance mettreAJour(Maintenance maintenance) {
        return repository.save(maintenance);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
