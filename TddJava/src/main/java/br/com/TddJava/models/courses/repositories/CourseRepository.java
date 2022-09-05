package br.com.TddJava.models.courses.repositories;

import br.com.TddJava.models.courses.entyties.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseRepository implements ICourseRepository{

    @Autowired
    CourseJpaRepository courseJpaRepository;

    @Override
    public Course findByName(String name) {
        return this.courseJpaRepository.findByName(name);
    }

    @Override
    public Course save(Course course) {
        return this.courseJpaRepository.save(course);
    }
}
