package tn.esprit.spring.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entity.Client;
import tn.esprit.spring.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    IClientService service;

    @PostMapping("/creer")
    public Client creer(@RequestBody Client client) {
        return service.creer(client);
    }

    @GetMapping("/obtenir/{id}")
    public Client obtenirParId(@PathVariable Long id) {
        return service.obtenirParId(id);
    }

    @GetMapping("/lister")
    public List<Client> listerTous() {
        return service.listerTous();
    }

    @PutMapping("/mettreAJour")
    public Client mettreAJour(@RequestBody Client client) {
        return service.mettreAJour(client);
    }

    @DeleteMapping("/supprimer/{id}")
    public void supprimer(@PathVariable Long id) {
        service.supprimer(id);
    }
}
