package com.stephenk.hsms.repository;

import com.stephenk.hsms.model.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GuardianRepository extends JpaRepository<Guardian, String> {

    Optional<Guardian> findByEmail(String email);

    Optional<Guardian> findByPhoneNumber(String phoneNumber);
}