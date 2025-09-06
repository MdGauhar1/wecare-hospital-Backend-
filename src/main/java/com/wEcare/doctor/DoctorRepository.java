package com.wEcare.doctor;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    // DoctorRepository.java
    List<Doctor> findBySpecialtyId(Long id);

}
