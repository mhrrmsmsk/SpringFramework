package com.mhrrmsmsk;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import lombok.*;

// data transfer object = DTO
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApplicationScoped
public class StudentDto {
    private Long studentID;
    private String studentName;
    private String studentSurname;
}
