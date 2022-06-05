package task2.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import task2.model.UniversityGroup;

import java.util.List;

@Repository
public interface GroupRepository extends CrudRepository<UniversityGroup,Long> {



}