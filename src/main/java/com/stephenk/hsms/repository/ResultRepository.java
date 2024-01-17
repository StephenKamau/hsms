package com.stephenk.hsms.repository;

import com.stephenk.hsms.model.Result;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Result,String> {
    
}