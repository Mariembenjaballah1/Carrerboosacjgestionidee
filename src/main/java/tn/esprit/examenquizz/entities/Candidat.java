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
public class Candidat implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcandidat;
    private String nom;
    private String prenom;
    private Integer nbQuiz;
    @Enumerated(EnumType.STRING)
    private Niveau niveau;

    @ToString.Exclude
    @ManyToMany(mappedBy = "candidats")
    @JsonIgnore
    private Set<Quiz> quizs;


}
