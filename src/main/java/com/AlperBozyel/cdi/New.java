package com.AlperBozyel.cdi;

import com.AlperBozyel.StudentDto;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.Getter;


@Named(value = "newtuto")
@ApplicationScoped
public class New {

    @Produces
    public String producedData(@jakarta.enterprise.inject.New StudentDto studentDto){
        studentDto = StudentDto.builder().studentId(0L).studentName("Student Name").build();
        return studentDto.getStudentName();
    }

    @Getter
    @Inject
    private String consumedData;
}
