package com.learningspringboot.hospitalManagement.repository;

import com.learningspringboot.hospitalManagement.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
