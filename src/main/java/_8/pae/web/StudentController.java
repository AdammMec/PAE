package _8.pae.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import _8.pae.model.Course;
import _8.pae.model.Student;
import _8.pae.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    
    @GetMapping("/students")
    public String showCourses(Model model){
        List<Student> students = studentService.getStudents();
        model.addAttribute("newcourse", new Course());
        model.addAttribute("students", students);

        return "students";
    }

    @GetMapping("/student/{studentMatricule}") 
    public String showCourse(@PathVariable("studentMatricule") Long studentMatricule, Model model) { 
        model.addAttribute("student", studentService.getStudent(studentMatricule));
        return "student";
    }

}
