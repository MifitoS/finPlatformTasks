package task2.DTO.studentsDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetAllStudentsResponseDTO {
    private Long id;
    private String name;
    private String surname;
    private String patronymic;

}
