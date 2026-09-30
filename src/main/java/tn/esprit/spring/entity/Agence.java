package tn.esprit.spring.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAgence;

    String nom;
    String ville;
    String adresse;
    String telephone;

    @ToString.Exclude
    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    List<Employe> employes;

    @ToString.Exclude
    @OneToMany(mappedBy = "agence", cascade = CascadeType.ALL)
    List<Vehicule> vehicules;
}
