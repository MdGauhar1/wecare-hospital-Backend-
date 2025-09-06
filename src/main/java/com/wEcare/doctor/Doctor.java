package com.wEcare.doctor;


import com.wEcare.Specialty.Specialty;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int yearsOfExperience;

    private String location;

    @ElementCollection
    private List<String> languages;

    @ElementCollection
    private List<String> availableDays;

    @ManyToOne
    @JoinColumn(name = "specialty_id")
    private Specialty specialty;

    // Constructors
    public Doctor() {}

    // Getters & Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getYearsOfExperience() { return yearsOfExperience; }
    public void setYearsOfExperience(int yearsOfExperience) { this.yearsOfExperience = yearsOfExperience; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public List<String> getLanguages() { return languages; }
    public void setLanguages(List<String> languages) { this.languages = languages; }

    public List<String> getAvailableDays() { return availableDays; }
    public void setAvailableDays(List<String> availableDays) { this.availableDays = availableDays; }

    public Specialty getSpecialty() { return specialty; }
    public void setSpecialty(Specialty specialty) { this.specialty = specialty; }
}
