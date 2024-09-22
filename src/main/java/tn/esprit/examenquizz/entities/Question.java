package tn.esprit.examenquizz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idquestion;
    private String libelle;
    @Enumerated(EnumType.STRING)
    private Complexite complexite;

    @ToString.Exclude
    @ManyToOne
    private Quiz quiz;

    @ToString.Exclude
    @OneToMany
    private Set<Reponse> reponses;

}
