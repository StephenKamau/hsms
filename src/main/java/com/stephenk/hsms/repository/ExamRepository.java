package com.stephenk.hsms.repository;

import com.stephenk.hsms.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<Exam,String> {
    
}