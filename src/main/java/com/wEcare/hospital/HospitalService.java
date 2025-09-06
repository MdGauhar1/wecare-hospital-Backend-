package com.wEcare.hospital;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {
    private final HospitalOverviewRepository overviewRepo;
    private final HospitalLocationRepository locationRepo;

    public HospitalService(HospitalOverviewRepository overviewRepo, HospitalLocationRepository locationRepo) {
        this.overviewRepo = overviewRepo;
        this.locationRepo = locationRepo;
    }

    // Get hospital overview
    public HospitalOverview getOverview() {
        return overviewRepo.findAll().stream().findFirst().orElse(null);
    }

    // Get all locations
    public List<HospitalLocation> getLocations() {
        return locationRepo.findAll();
    }

    // Get single location by id
    public HospitalLocation getLocationById(Long id) {
        return locationRepo.findById(id).orElse(null);
    }
}
