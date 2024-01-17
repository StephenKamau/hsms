package com.stephenk.hsms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    private String title;
    @NotNull
    private LocalDate examDate;
    @NotNull
    private Instant createdAt;
    @NotNull
    @NotBlank
    private String createdBy;
    @NotNull
    private Instant lastModifiedAt;
    @NotNull
    @NotBlank
    private String lastModifiedBy;
    @NotNull
    @NotBlank
    private String examLevel;
}