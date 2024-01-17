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

import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {
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
    private String relationShip;
    @NotNull
    @NotBlank
    @Column(unique = true)
    private String phoneNumber;
    @NotNull
    @NotBlank
    @Email
    @Column(unique = true)
    private String email;
    @NotNull
    @NotBlank
    private String alternativeNumber;
    @NotNull
    @NotBlank
    private String emergencyContact;
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
}