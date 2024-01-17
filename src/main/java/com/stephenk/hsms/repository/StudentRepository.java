package com.stephenk.hsms.repository;

import com.stephenk.hsms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,String> {
    
}