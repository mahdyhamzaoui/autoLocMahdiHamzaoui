package tn.esprit.spring.service;

import tn.esprit.spring.entity.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement creer(Paiement payment);

    Paiement obtenirParId(Long id);

    List<Paiement> listerTous();

    Paiement mettreAJour(Paiement payment);

    void supprimer(Long id);
}
