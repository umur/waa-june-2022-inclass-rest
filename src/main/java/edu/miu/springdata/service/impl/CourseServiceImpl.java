package edu.miu.springdata.service.impl;


import edu.miu.springdata.dto.CourseDto;
import edu.miu.springdata.repo.CourseRepo;
import edu.miu.springdata.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;
    private final ModelMapper modelMapper;

    @Override
    public CourseDto findById(int id) {
        var data = courseRepo.findById(id).get();
        var result=modelMapper.map(data,CourseDto.class);
        return result;
    }
}
