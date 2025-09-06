package com.wEcare.doctor;



import com.wEcare.Specialty.Specialty;
import com.wEcare.Specialty.SpecialtyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepo;
    private final SpecialtyRepository specialtyRepo;

    public DoctorService(DoctorRepository doctorRepo, SpecialtyRepository specialtyRepo) {
        this.doctorRepo = doctorRepo;
        this.specialtyRepo = specialtyRepo;
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepo.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepo.findById(id).orElseThrow(() -> new RuntimeException("Doctor not found"));
    }

    public Doctor addDoctor(Doctor doctor) {
        Specialty specialty = specialtyRepo.findById(doctor.getSpecialty().getId())
                .orElseThrow(() -> new RuntimeException("Specialty not found"));

        doctor.setSpecialty(specialty);
        return doctorRepo.save(doctor);
    }

    public void deleteDoctor(Long id) {
        doctorRepo.deleteById(id);
    }
}

