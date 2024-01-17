package com.stephenk.hsms.dto;

import com.stephenk.hsms.model.Guardian;

public record GuardianDTO(String firstName, String middleName, String lastName, String relationShip, String phoneNumber,
                          String email, String alternativeNumber, String emergencyContact) {
    public Guardian toGuardian() {
        return Guardian.builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .relationShip(relationShip)
                .phoneNumber(phoneNumber)
                .email(email)
                .alternativeNumber(alternativeNumber)
                .emergencyContact(emergencyContact)
                .build();
    }

    public static GuardianDTO fromGuardian(Guardian guardian) {
        return new GuardianDTO(guardian.getFirstName(), guardian.getMiddleName(), guardian.getLastName(), guardian.getRelationShip(), guardian.getPhoneNumber(), guardian.getEmail(), guardian.getAlternativeNumber(), guardian.getEmergencyContact());
    }
}