package com.wEcare.hospital;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hospital")
@CrossOrigin(origins = "http://localhost:4200")
public class HospitalController {

    private final HospitalService service;

    public HospitalController(HospitalService service) {
        this.service = service;
    }

    // Get overview (name, rating, photo, etc.)
    @GetMapping("/overview")
    public HospitalOverview getOverview() {
        return service.getOverview();
    }

    // Get all locations (just list of cities)
    @GetMapping("/locations")
    public List<HospitalLocation> getLocations() {
        return service.getLocations();
    }

    // Get details of single location (address etc.)
    @GetMapping("/locations/{id}")
    public HospitalLocation getLocation(@PathVariable Long id) {
        return service.getLocationById(id);
    }
}
