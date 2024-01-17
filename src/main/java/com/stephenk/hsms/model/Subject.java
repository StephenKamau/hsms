package com.stephenk.hsms.model;

import jakarta.persistence.*;
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
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    private String subjectName;
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String level;
    @NotNull
    @NotBlank
    private String createdBy;
    @NotNull
    private Instant createdAt;
    @NotNull
    private Instant lastModifiedAt;
    @NotNull
    @NotBlank
    private String lastModifiedBy;
}