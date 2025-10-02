package _8.pae.db;

import org.springframework.data.repository.CrudRepository;

import _8.pae.model.Course;

public interface CourseDB extends CrudRepository<Course, String> {

};
