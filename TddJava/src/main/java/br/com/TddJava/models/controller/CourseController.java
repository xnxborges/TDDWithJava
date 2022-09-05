package br.com.TddJava.models.controller;

import br.com.TddJava.models.courses.entyties.Course;
import br.com.TddJava.models.courses.repositories.CourseRepository;
import br.com.TddJava.models.courses.services.CreateCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @PostMapping("/")
    public Course createCourse(@RequestBody Course course){
        CreateCourseService createCourseService = new CreateCourseService(repository);
        return createCourseService.execute(course);
    }

}
