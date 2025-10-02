package _8.pae.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import _8.pae.db.CourseDB;
import _8.pae.model.Course;
import _8.pae.service.PAEService;


@Controller
public class CourseController {
    
    @Autowired
    PAEService paeService;

    @GetMapping("/courses")
    public String showCourses(Model model){
        List<Course> courses = (List<Course>) paeService.getCourses();
        model.addAttribute("newcourse", new Course());
        model.addAttribute("courses", courses);

        return "courses";
    }

    @GetMapping("/course/{courseId}") 
    public String showCourse(@PathVariable("courseId") String courseId, Model model){
        Course course = paeService.getCourseById(courseId);
        model.addAttribute("course", course);
        return "course";
    }

    @PostMapping("/urlCtrl")
    public String addCourse(@ModelAttribute("newcourse") Course course, Errors error, Model model){
        if (error.hasErrors()){
            model.addAttribute("courses", paeService.getCourses());
            return "courses";
        }
        paeService.addCourse(course);
        return "redirect:/courses";
    }
}
