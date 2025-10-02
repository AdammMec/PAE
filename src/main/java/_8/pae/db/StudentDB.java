package _8.pae.db;

import org.springframework.data.repository.CrudRepository;

import _8.pae.model.Student;

public interface StudentDB extends CrudRepository<Student, Integer> {

    
}

