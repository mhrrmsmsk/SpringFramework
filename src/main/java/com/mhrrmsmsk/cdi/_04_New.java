package com.mhrrmsmsk.cdi;
import com.mhrrmsmsk.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;

@Named(value = "newtuto")
@ApplicationScoped
public class _04_New {

    @Produces
    public String producedData(StudentDto studentDto) {
       studentDto = StudentDto.builder().studentID(0L).studentName("Muharrem").build();
       return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String consumedData;
}