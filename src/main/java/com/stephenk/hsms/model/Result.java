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

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    private String examId;
    @NotNull
    @NotBlank
    private String subjectId;
    @NotNull
    @NotBlank
    private String studentId;
    @NotNull
    @NotBlank
    private String teacherId;
    @NotNull
    @NotBlank
    private int marks;
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
}