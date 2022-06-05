package task2.service;

import org.springframework.stereotype.Service;
import task2.DTO.studentsDTO.GetAllStudentsResponseDTO;
import task2.model.Student;
import task2.model.UniversityGroup;
import task2.repository.GroupRepository;
import task2.repository.StudentRepository;

import task2.DTO.studentsDTO.StudentDTO;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService{

    private final GroupRepository groupRepository;

    private final StudentRepository studentRepository;

    public StudentServiceImpl(GroupRepository groupRepository, StudentRepository studentRepository) {
        this.groupRepository = groupRepository;
        this.studentRepository = studentRepository;
    }

    @Override
    public void add(StudentDTO studentRequest) {
        Optional<UniversityGroup> byId = groupRepository.findById(studentRequest.getGroupId());
        UniversityGroup universityGroup = byId.get();

        Student build = Student.builder()
                .name(studentRequest.getName())
                .surname(studentRequest.getSurname())
                .patronymic(studentRequest.getPatronymic())
                .group(universityGroup)
                .birthDate(LocalDate.now())
                .build();

        studentRepository.save(build);

    }

    @Override
    public List<GetAllStudentsResponseDTO> getAll() {


        List<Student> all = studentRepository.findAll();

        return all.stream()
                .map(student -> {
                    return GetAllStudentsResponseDTO.builder()
                            .id(student.getId())
                            .name(student.getName())
                            .surname(student.getSurname())
                            .patronymic(student.getPatronymic())
                            .build();
                })
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }

}
