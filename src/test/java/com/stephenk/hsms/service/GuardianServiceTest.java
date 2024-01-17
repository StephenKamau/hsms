package com.stephenk.hsms.service;

import com.stephenk.hsms.dto.GuardianDTO;
import com.stephenk.hsms.repository.GuardianRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GuardianServiceTest {
    @Autowired
    GuardianService guardianService;
    @Autowired
    GuardianRepository guardianRepository;

    @Test
    public void create() {
        var guardian = new GuardianDTO("Stephen", "K", "K", "Parent", "00", "s@mail.com", "01", "00");
        guardianService.create(guardian);
        assertEquals(GuardianDTO.fromGuardian(guardianService.findGuardianByPhoneNumber(guardian.phoneNumber())), guardian);
    }

    @Test
    public void index() {
        var guardian = new GuardianDTO("Stephen", "K", "K", "Parent", "00", "s@mail.com", "01", "00");
        guardianService.create(guardian);
        assertEquals(guardianService.index(Pageable.unpaged()).get().toList().size(), 1);
    }

    @Test
    public void findByEmail() {
        var guardian = new GuardianDTO("Stephen", "K", "K", "Parent", "00", "s@mail.com", "01", "00");
        guardianService.create(guardian);
        assertEquals(GuardianDTO.fromGuardian(guardianService.findGuardianByEmail(guardian.email())), guardian);
    }

    @Test
    public void findByPhoneNumber() {
        var guardian = new GuardianDTO("Stephen", "K", "K", "Parent", "00", "s@mail.com", "01", "00");
        guardianService.create(guardian);
        assertEquals(GuardianDTO.fromGuardian(guardianService.findGuardianByPhoneNumber(guardian.phoneNumber())), guardian);
    }
}