package com.wEcare.appointment;

import com.wEcare.patient.Patient;
import com.wEcare.patient.PatientRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AppointmentService {
    private final AppointmentRepository repo;
    private final PatientRepository patientRepo;

    public AppointmentService(AppointmentRepository repo, PatientRepository patientRepo) {
        this.repo = repo;
        this.patientRepo = patientRepo;
    }

//    public Appointment book(Appointment appointment) {
//        return repo.save(appointment);
//    }


    public Appointment bookWithPatient(AppointmentRequest request) {
        // Save patient first
        Patient savedPatient = patientRepo.save(request.getPatient());

        // Create Appointment
        Appointment appointment = new Appointment();
        appointment.setPatient(savedPatient);
        appointment.setDoctorName(request.getDoctorName());
        appointment.setDate(request.getDate());
        appointment.setTime(request.getTime());
        appointment.setReason(request.getReason());

        return repo.save(appointment);
    }


    public List<Appointment> getAll() {
        return repo.findAll();
    }
}













