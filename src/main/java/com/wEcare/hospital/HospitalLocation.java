package com.wEcare.hospital;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

@Entity
public class HospitalLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;     // Delhi, Mumbai, etc
    private String address;  // address of branch

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private HospitalOverview hospital;



    public HospitalLocation() {}

    public HospitalLocation(String city, String address, HospitalOverview hospital) {
        this.city = city;
        this.address = address;
        this.hospital = hospital;
    }





    // getters & setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public HospitalOverview getHospital() { return hospital; }
    public void setHospital(HospitalOverview hospital) { this.hospital = hospital; }
}
