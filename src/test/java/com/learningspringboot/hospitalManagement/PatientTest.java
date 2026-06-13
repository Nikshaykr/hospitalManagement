package com.learningspringboot.hospitalManagement;

import com.learningspringboot.hospitalManagement.entity.Patient;
import com.learningspringboot.hospitalManagement.entity.type.BloodGroupType;
import com.learningspringboot.hospitalManagement.repository.PatientRepository;
import com.learningspringboot.hospitalManagement.service.PatientService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

@SpringBootTest
public class PatientTest {

    @Autowired
    private PatientRepository patientRepository;

    @Autowired
    private PatientService patientService;

    @Test
    public void testPatientRepository() {
        List<Patient> patientList = patientRepository.findAllPatientWithAppointment();
        System.out.println(patientList);
    }

    @Test
    public void testTransactionMethods() {
        /*Patient p1 = patientService.getPatientById(1L);

        System.out.println(p1);*/

        /*Patient patient = patientRepository.findByName("Nishu");*/

        /*List<Patient> patients = patientRepository.findAllPatient();

        for (Patient patient : patients){
            System.out.println(patient);
        }*/

        int rowsUpdated = patientRepository.updateNameWithId("Nikshay", 1L);
        System.out.println(rowsUpdated);
    }
}
