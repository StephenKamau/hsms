package com.stephenk.hsms.repository;

import com.stephenk.hsms.dto.TeacherDTO;
import com.stephenk.hsms.model.Teacher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher, String> {
    @Query(value = """
            select new com.stephenk.hsms.dto.TeacherDTO(firstName, middleName, lastName, phoneNumber, email, recruitmentMode, startDate, category, tscNumber) from Teacher
            """)
    Page<TeacherDTO> findAllTeachers(Pageable pageable);
    Optional<Teacher> findAllByTscNumberEqualsIgnoreCase(String tscNumber);
}