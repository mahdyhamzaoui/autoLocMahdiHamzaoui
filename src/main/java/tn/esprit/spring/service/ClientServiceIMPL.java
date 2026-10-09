package tn.esprit.spring.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.repository.ClientRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceIMPL implements IClientService {
    ClientRepository repository;

    @Override
    public Client creer(Client client) {
        return repository.save(client);
    }

    @Override
    public Client obtenirParId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Client> listerTous() {
        return repository.findAll();
    }

    @Override
    public Client mettreAJour(Client client) {
        return repository.save(client);
    }

    @Override
    public void supprimer(Long id) {
        repository.deleteById(id);
    }
}
