package com.learningspringboot.hospitalManagement;

import com.learningspringboot.hospitalManagement.entity.Appointment;
import com.learningspringboot.hospitalManagement.entity.Insurance;
import com.learningspringboot.hospitalManagement.entity.Patient;
import com.learningspringboot.hospitalManagement.repository.AppointmentRepository;
import com.learningspringboot.hospitalManagement.repository.InsuranceRepository;
import com.learningspringboot.hospitalManagement.service.AppointmentService;
import com.learningspringboot.hospitalManagement.service.InsuranceService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;

@SpringBootTest
public class InsuranceTest {

    @Autowired
    private InsuranceService insuranceService;

    @Autowired
    private AppointmentService appointmentService;

    @Test
    public void testCreateInsurance() {
        Insurance insurance = Insurance.builder()
                .policyNumber("HDFC_1234")
                .provider("HDFC")
                .validUntil(LocalDate.of(2030, 12, 12))
                .build();

        Patient patient = insuranceService.assignInsuranceToPatient(insurance, 1L);
        System.out.println(patient);

        var newPatient = insuranceService.disassociateInsuranceFromPatient(patient.getId());
        System.out.println(newPatient);
    }

    @Test
    public void testCreateAppointment() {
        Appointment appointment = Appointment.builder()
                .appointmentTime(LocalDateTime.of(2026, 10, 10, 10, 15, 30))
                .reason("cancer")
                .build();

        var newAppointment = appointmentService.createNewAppointment(appointment, 1L, 2L);
        System.out.println(newAppointment);

        var updatedAppointment = appointmentService.reassignAppointmentToNewDoctor(newAppointment.getId(),  3L);
        System.out.println(updatedAppointment);
    }
}
