package br.com.TddJava.models.courses.services;

import br.com.TddJava.models.courses.entyties.Course;
import br.com.TddJava.models.courses.repositories.ICourseRepository;
import org.springframework.stereotype.Service;

@Service
public class CreateCourseService {

    private ICourseRepository repository;

    public CreateCourseService(ICourseRepository repository) {
        this.repository = repository;
    }

    /* @Autowired
    private CourseJpaRepository repository;*/

    public Course execute(Course course){
        //Validar se existe
        Course existedCourse = repository.findByName(course.getName());

        //Se sim - retorna erro
        if (existedCourse != null){
            throw new Error("Este curso já existe");
        }

        //Se não - Salvar e retornar novo curso
        return repository.save(course);
    }
}
