package task2.controller;

import org.springframework.web.bind.annotation.*;
import task2.DTO.studentsDTO.GetAllStudentsResponseDTO;
import task2.model.Student;
import task2.service.StudentService;
import task2.DTO.studentsDTO.StudentDTO;

import java.util.List;

@RestController
@RequestMapping(name = "student/")
public class StudentController {



    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @PostMapping(path = "/add")
    public void add(@RequestBody StudentDTO studentRequest){
        studentService.add(studentRequest);
    }

    @GetMapping("/getAll")
    public List<GetAllStudentsResponseDTO> getAll(){
        return studentService.getAll();
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteStudent (@PathVariable("id") Long id) {
        studentService.deleteById(id);

}
}
