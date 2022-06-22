package edu.miu.springdata.service;

import edu.miu.springdata.dto.CourseDto;

public interface CourseService {

    CourseDto findById(int id);

}
