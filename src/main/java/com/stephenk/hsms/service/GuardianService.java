package com.stephenk.hsms.service;

import com.stephenk.hsms.dto.GuardianDTO;
import com.stephenk.hsms.model.Guardian;
import com.stephenk.hsms.repository.GuardianRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class GuardianService {
    private final GuardianRepository guardianRepository;

    public void create(GuardianDTO guardian) {
        log.info("Saving record: " + guardian);
        guardianRepository.save(guardian.toGuardian());
    }

    public Page<Guardian> index(Pageable page) {
        return guardianRepository.findAll(page);
    }

    public Guardian findGuardianByEmail(String email) {
        return guardianRepository.findByEmail(email).orElseThrow();
    }

    public Guardian findGuardianByPhoneNumber(String phoneNumber) {
        return guardianRepository.findByPhoneNumber(phoneNumber).orElseThrow();
    }
}