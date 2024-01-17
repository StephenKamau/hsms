package com.stephenk.hsms.service;

import com.stephenk.hsms.dto.TeacherDTO;
import com.stephenk.hsms.repository.TeacherRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Transactional
class TeacherServiceTest {
    @Autowired
    TeacherService teacherService;
    @Autowired
    TeacherRepository teacherRepository;

    @Test
    void create() {
        TeacherDTO teacher = new TeacherDTO("Stephen", "K", "K", "254700", "sk@mail.com", "BOM", LocalDate.of(2023, 12, 10), "Regular", "1234");
        teacherService.create(teacher);
        assertEquals(teacherService.findByTscNumber(teacher.tscNumber()), teacher);
    }

    @Test
    void index() {
        TeacherDTO teacher = new TeacherDTO("Stephen", "K", "K", "254700", "sk@mail.com", "BOM", LocalDate.of(2023, 12, 10), "Regular", "1234");
        teacherService.create(teacher);
        assertEquals(teacherService.index(Pageable.ofSize(10)).get().toList().size(), 1);
    }

    @Test
    void findByTscNumber() {
        TeacherDTO teacher = new TeacherDTO("Stephen", "K", "K", "254700", "sk@mail.com", "BOM", LocalDate.of(2023, 12, 10), "Regular", "1234");
        teacherService.create(teacher);
        var result = teacherService.findByTscNumber(teacher.tscNumber()).tscNumber();
        assertEquals(result, teacher.tscNumber());
    }
}