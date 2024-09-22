package tn.esprit.examenquizz.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Quiz implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idQuiz;
    private String titrequiz;
    private String specialite;
    private Date dateQuiz;
    @ToString.Exclude
    @ManyToMany
    @JsonIgnore
    private Set<Candidat> candidats;
    @ToString.Exclude
    @OneToMany(mappedBy = "quiz")
    @JsonIgnore
    private Set<Question> questions;
}
