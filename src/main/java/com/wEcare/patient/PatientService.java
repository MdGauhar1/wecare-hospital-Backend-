package com.wEcare.patient;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PatientService {

    private final PatientRepository repo;
    private final PasswordEncoder passwordEncoder;

    public PatientService(PatientRepository repo, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.passwordEncoder=passwordEncoder;
    }

//    // Add new patient
//    public Patient addPatient(Patient patient) {
//        return repo.save(patient);
//    }



    public Patient addPatient(Patient patient) {
        // Hash the password before saving
        String hashedPassword = passwordEncoder.encode(patient.getPassword());
        patient.setPassword(hashedPassword);
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



    // 👇 New login method
//    public boolean login(String username, String password) {
//        Patient patient = repo.findByUsername(username);
//        return patient != null && patient.getPassword().equals(password);
//    }


//    public boolean login(String username, String password) {
//        return repo.findByUsername(username)
//                .map(patient -> patient.getPassword().equals(password))
//                .orElse(false);
//    }


    public boolean login(String username, String password) {
        return repo.findByUsername(username)
                .map(patient -> passwordEncoder.matches(password, patient.getPassword()))
                .orElse(false);
    }


}
