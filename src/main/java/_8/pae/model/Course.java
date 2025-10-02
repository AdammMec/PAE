package _8.pae.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Course {
    @Id
    private String sigle;
    private String titre;
    private int ects;
    @ManyToMany(mappedBy = "courses")
    @JsonManagedReference
    private List<Student> students;
}

