package com.wEcare.Specialty;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specialties")
@CrossOrigin
public class SpecialtyController {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtyController(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @GetMapping
    public List<Specialty> getAll() {
        return specialtyRepository.findAll();
    }

    @PostMapping
    public Specialty create(@RequestBody Specialty specialty) {
        return specialtyRepository.save(specialty);
    }
}
