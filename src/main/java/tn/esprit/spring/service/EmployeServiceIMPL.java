package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Employe;
import tn.esprit.spring.repository.EmployeRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeServiceIMPL implements IEmployeService{
    EmployeRepository repository;

    @Override
    public Employe creer(Employe employe) {
        return repository.save(employe);
    }

    @Override
    public Employe obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> listerTous() {
        return repository.findAll();
    }

    @Override
    public Employe mettreAJour(Employe employe) {
        return repository.save(employe);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
