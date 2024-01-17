package com.stephenk.hsms.dto;

import com.stephenk.hsms.model.Student;

import java.time.LocalDate;

public record StudentDTO(String firstName, String middleName, String lastName, String gender, String classId,
                         String studentNumber,
                         LocalDate dateOfBirth, String gpId) {
    public Student toStudent() {
        return Student.builder()
                .firstName(firstName)
                .middleName(middleName)
                .lastName(lastName)
                .classId(classId)
                .gpId(gpId)
                .gender(gender)
                .studentNumber(studentNumber)
                .dateOfBirth(dateOfBirth)
                .build();
    }

    public StudentDTO fromStudent(Student student) {
        return new StudentDTO(student.getFirstName(), student.getMiddleName(), student.getLastName(), student.getGender(), student.getClassId(), student.getStudentNumber(), student.getDateOfBirth(), student.getGpId());
    }
}