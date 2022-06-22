package edu.miu.springdata.repo;

import edu.miu.springdata.entity.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course,Integer> {

 Course findByCode(String code);

}
