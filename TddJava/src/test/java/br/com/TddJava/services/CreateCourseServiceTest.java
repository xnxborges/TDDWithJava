package br.com.TddJava.services;

import br.com.TddJava.models.courses.entyties.Course;
import br.com.TddJava.models.courses.repositories.CourseInMemoryRepository;
import br.com.TddJava.models.courses.services.CreateCourseService;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;

public class CreateCourseServiceTest {

    @Test
    public void should_be_able_to_create_a_new_course() {
        // Criar um novo curso
        // Criar a tabela de cursos (Entidade)
        // Id, Description, Name, Workload
        Course course = new Course();
        course.setDescription("Course_Description_Test");
        course.setName("Course_Name");
        course.setWorkload(180);

        // Criar repositorio de curso
        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        // Criar um novo service
        CreateCourseService createCourseService = new CreateCourseService(repository);
        Course createdCourse = createCourseService.execute(course);


        assertNotNull(createdCourse.getId());
    }

    @Test
    public void should_not_be_able_to_create_a_anew_course_if_exists(){
        Course course = new Course();
        course.setDescription("Not_create_course");
        course.setName("Not_create_course");
        course.setWorkload(180);

        CourseInMemoryRepository repository = new CourseInMemoryRepository();

        CreateCourseService createCourseService = new CreateCourseService(repository);
        createCourseService.execute(course);
        createCourseService.execute(course);

    }
}
