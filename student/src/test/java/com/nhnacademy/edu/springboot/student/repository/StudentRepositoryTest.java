package com.nhnacademy.edu.springboot.student.repository;

import com.nhnacademy.edu.springboot.student.domain.Student;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    void testStudentRepository() throws Exception{
        Student JHyeok = new Student(1L, "JHyeok", 100);
        studentRepository.save(JHyeok);

        Optional<Student> actual = studentRepository.findById(1L);

        Assertions.assertThat(actual).isPresent();
        Assertions.assertThat(actual.get()).isEqualTo(JHyeok);

    }
}