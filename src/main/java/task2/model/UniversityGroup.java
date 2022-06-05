package task2.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UniversityGroup {

    @Id
    private Long id;

    private String name;
    private LocalDate createAt;

    @OneToMany(mappedBy = "group")
    private Set<Student> students;
}
