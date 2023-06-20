package com.yearup.dao;
import com.yearup.model.Student;

public interface RegistrationDAO {
    public Long persistStudent(Student student);
    public Student findById(Long id);
}
