package com.stephenk.hsms.repository;

import com.stephenk.hsms.model.Class;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRepository extends JpaRepository<Class,String> {
    
}