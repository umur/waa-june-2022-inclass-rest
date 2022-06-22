package edu.miu.springdata.dto;

import edu.miu.springdata.entity.Student;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
public class CourseDto {

    private int id;
    private String name;
    private String code;
    private List<Student> students;
}
