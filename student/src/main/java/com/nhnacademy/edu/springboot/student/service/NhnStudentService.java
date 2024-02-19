package com.nhnacademy.edu.springboot.student.service;

import com.nhnacademy.edu.springboot.student.domain.Student;
import com.nhnacademy.edu.springboot.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhnStudentService implements StudentService{
    private final StudentRepository studentRepository;

    //생성자 주입방식
    public NhnStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow();
    }

    @Override
    public Student createStudent(Student student) {
        if (studentRepository.existsById(student.getId())) {
            throw new IllegalStateException("id" + student.getId() + "is already exis ");
        }
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) { studentRepository.deleteById(id);

    }

}
