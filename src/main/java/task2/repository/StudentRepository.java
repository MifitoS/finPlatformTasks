package task2.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import task2.model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
    List<Student> findAll();
}
