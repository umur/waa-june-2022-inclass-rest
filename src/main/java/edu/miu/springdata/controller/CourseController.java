package edu.miu.springdata.controller;

import edu.miu.springdata.dto.CourseDto;
import edu.miu.springdata.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/courses")
@CrossOrigin
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/{id}")
    public CourseDto findById(@PathVariable int id){
        return courseService.findById(id);
    }


}
