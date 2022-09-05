package br.com.TddJava.models.courses.repositories;

import br.com.TddJava.models.courses.entyties.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseJpaRepository extends JpaRepository<Course, UUID> {

    public Course findByName(String name);
}
