package com.learningspringboot.hospitalManagement.repository;

import com.learningspringboot.hospitalManagement.entity.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceRepository extends JpaRepository<Insurance, Long> {
}
