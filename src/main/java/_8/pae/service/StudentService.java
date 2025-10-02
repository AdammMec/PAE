package _8.pae.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _8.pae.db.StudentDB;
import _8.pae.model.Student;

@Service
public class StudentService {

    @Autowired
    StudentDB studentDB;

    public List<Student> getStudents(){
        return (List<Student>) studentDB.findAll();
    }

    public Student getStudent(Long matricule){
        List<Student> students = (List<Student>) studentDB.findAll();
        Student student = null;
        for (Student student2 : students) {
            if (student2.getMatricule() == matricule){
                student = student2;
            }
        }
        return student;
    }
}
