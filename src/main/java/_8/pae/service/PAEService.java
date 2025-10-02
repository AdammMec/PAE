package _8.pae.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import _8.pae.db.CourseDB;
import _8.pae.model.Course;

@Service
public class PAEService{

    @Autowired
    CourseDB courseDB;

    public List<Course> getCourses() {
        return (List<Course>) courseDB.findAll();
    }

    public Course getCourseById(String courseId) {
        return courseDB.findById(courseId).orElse(null);
    }
    public void addCourse(Course cours){
        cours = courseDB.save(cours);
    }
}