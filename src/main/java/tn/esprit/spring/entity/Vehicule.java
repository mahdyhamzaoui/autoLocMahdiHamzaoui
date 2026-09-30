package tn.esprit.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;

    String immatriculation;
    String marque;
    String modele;

    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;

    BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    StatutVehicule statut;

    @ToString.Exclude
    @ManyToOne
    Agence agence;

    @ToString.Exclude
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    List<Maintenance> maintenances;

    @ToString.Exclude
    @ManyToMany
    List<Equipement> equipements;

    @ToString.Exclude
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.ALL)
    List<Reservation> reservations;
}
