package task2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "STUDENTS")
public class Student {

     @Id
     private Long id;

     private String name;
     private String surname;
     private String patronymic;

     private LocalDate birthDate;

     @ManyToOne
     @JoinColumn(name = "group_id")
     private UniversityGroup group;

}
