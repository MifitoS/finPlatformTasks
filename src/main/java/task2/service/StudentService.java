package task2.service;

import task2.DTO.studentsDTO.GetAllStudentsResponseDTO;
import task2.DTO.studentsDTO.StudentDTO;

import java.util.List;

public interface StudentService {
    void add(StudentDTO studentRequest);

    List<GetAllStudentsResponseDTO> getAll();

    void deleteById(Long id);
}
