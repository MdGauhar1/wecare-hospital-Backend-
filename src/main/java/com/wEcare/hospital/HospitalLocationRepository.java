package com.wEcare.hospital;

import com.wEcare.hospital.HospitalLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalLocationRepository extends JpaRepository<HospitalLocation, Long> {}
