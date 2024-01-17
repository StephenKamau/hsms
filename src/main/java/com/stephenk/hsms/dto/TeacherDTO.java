package com.stephenk.hsms.dto;

import com.stephenk.hsms.model.Teacher;

import java.time.LocalDate;

public record TeacherDTO(String firstName, String middleName, String lastName, String phoneNumber, String email,
                         String recruitmentMode, LocalDate startDate,
                         // can be deputy, senior or just a regular teacher
                         String category, String tscNumber
) {
    public Teacher toTeacher() {
        return Teacher.builder()
                .firstName(firstName)
                .lastName(lastName)
                .middleName(middleName)
                .phoneNumber(phoneNumber)
                .email(email)
                .recruitmentMode(recruitmentMode)
                .startDate(startDate)
                .category(category)
                .tscNumber(tscNumber)
                .build();
    }

    public static TeacherDTO fromTeacher(Teacher teacher) {
        return new TeacherDTO(teacher.getFirstName(), teacher.getMiddleName(), teacher.getLastName(), teacher.getPhoneNumber(), teacher.getEmail(), teacher.getRecruitmentMode(), teacher.getStartDate(), teacher.getCategory(), teacher.getTscNumber());
    }
}