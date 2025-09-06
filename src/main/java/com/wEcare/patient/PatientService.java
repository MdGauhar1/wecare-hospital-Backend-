package com.wEcare.patient;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repo;

    public PatientService(PatientRepository repo) {
        this.repo = repo;
    }

    // Add new patient
    public Patient addPatient(Patient patient) {
        return repo.save(patient);
    }

    // Get all patients
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    // Get single patient by id
    public Patient getPatientById(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found with id " + id));
    }

    // Update patient
    public Patient updatePatient(Long id, Patient updated) {
        Patient existing = getPatientById(id);
        existing.setName(updated.getName());
        existing.setAge(updated.getAge());
        existing.setEmail(updated.getEmail());
        return repo.save(existing);
    }

    // Delete patient
    public void deletePatient(Long id) {
        repo.deleteById(id);
    }
}
