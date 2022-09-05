package br.com.TddJava.models.courses.repositories;

import br.com.TddJava.models.courses.entyties.Course;

public interface ICourseRepository {

    public Course findByName(String name);

    public Course save(Course course);

}
