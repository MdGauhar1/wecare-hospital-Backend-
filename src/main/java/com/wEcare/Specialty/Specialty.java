package com.wEcare.Specialty;



import com.wEcare.doctor.Doctor;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "specialty", cascade = CascadeType.ALL)
    private List<Doctor> doctors;

    // Constructors
    public Specialty() {}

    public Specialty(String name) {
        this.name = name;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}


