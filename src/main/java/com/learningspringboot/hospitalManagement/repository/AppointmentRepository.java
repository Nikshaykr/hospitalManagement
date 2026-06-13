package com.learningspringboot.hospitalManagement.repository;

import com.learningspringboot.hospitalManagement.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
