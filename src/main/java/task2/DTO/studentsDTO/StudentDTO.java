package task2.DTO.studentsDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private String name;
    private String surname;
    private String patronymic;

    private LocalDate birthDate;

    private Long groupId;
}
