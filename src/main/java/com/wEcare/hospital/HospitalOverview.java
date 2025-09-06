package com.wEcare.hospital;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class HospitalOverview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double rating;
    private String photoUrl;

    @JsonManagedReference
    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<HospitalLocation> locations;

    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }

    public String getPhotoUrl() { return photoUrl; }
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }

    public List<HospitalLocation> getLocations() { return locations; }
    public void setLocations(List<HospitalLocation> locations) { this.locations = locations; }
}
