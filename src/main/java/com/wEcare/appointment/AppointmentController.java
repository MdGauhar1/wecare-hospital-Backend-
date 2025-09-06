package com.wEcare.appointment;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@CrossOrigin(origins = "*") // allow frontend
public class AppointmentController {

    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

//    @PostMapping
//    public Appointment book(@RequestBody Appointment appointment) {
//        return service.book(appointment);
//    }



    @PostMapping
    public Appointment book(@RequestBody AppointmentRequest request) {
        return service.bookWithPatient(request);
    }

    @GetMapping
    public List<Appointment> getAll() {
        return service.getAll();
    }
}






























