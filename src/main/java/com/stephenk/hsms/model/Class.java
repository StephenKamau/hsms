package com.stephenk.hsms.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String name;
    @NotNull
    @CreatedDate
    private Instant createdAt;
    @NotNull
    @NotBlank
    @CreatedBy
    private String createdBy;
    @NotNull
    @LastModifiedDate
    private Instant lastModifiedAt;
    @NotNull
    @NotBlank
    @LastModifiedBy
    private String lastModifiedBy;
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String classTeachedId;
}