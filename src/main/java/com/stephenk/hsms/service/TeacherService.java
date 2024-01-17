package com.stephenk.hsms.service;

import com.stephenk.hsms.dto.TeacherDTO;
import com.stephenk.hsms.model.Teacher;
import com.stephenk.hsms.repository.TeacherRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class TeacherService {
    private final TeacherRepository teacherRepository;

    public void create(TeacherDTO teacherDTO) {
        log.info("Saving record: " + teacherDTO);
        teacherRepository.save(teacherDTO.toTeacher());
    }

    public Page<TeacherDTO> index(Pageable page) {
        return teacherRepository.findAllTeachers(page);
    }

    public TeacherDTO findByTscNumber(String tscNumber) {
        return TeacherDTO.fromTeacher(teacherRepository.findAllByTscNumberEqualsIgnoreCase(tscNumber).orElseThrow());
    }
}