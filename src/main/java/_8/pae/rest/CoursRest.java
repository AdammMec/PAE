package _8.pae.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import _8.pae.model.Course;
import _8.pae.service.PAEService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CoursRest {
    @Autowired
    PAEService paeService;

    @GetMapping("/courses")
    public List<Course> task(){
        return paeService.getCourses();
    }

    
}
