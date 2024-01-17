package com.stephenk.hsms.repository;

import com.stephenk.hsms.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, String> {

}