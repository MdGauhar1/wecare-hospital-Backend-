package com.wEcare.hospital;


import com.wEcare.hospital.HospitalOverview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalOverviewRepository extends JpaRepository<HospitalOverview, Long> {}
