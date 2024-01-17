package com.stephenk.hsms.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @NotNull
    @NotBlank
    private String id;
    @NotNull
    @NotBlank
    private String firstName;
    @NotNull
    @NotBlank
    private String middleName;
    @NotNull
    @NotBlank
    private String lastName;
    @NotNull
    @NotBlank
    private String phoneNumber;
    @NotNull
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
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
    private String recruitmentMode;
    @NotNull
    private LocalDate startDate;
    @NotNull
    @NotBlank
    // can be deputy, senior or just a regular teacher
    private String category;
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String tscNumber;
}