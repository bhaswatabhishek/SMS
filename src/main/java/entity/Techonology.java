package entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Techonology {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer technologyId;

    @Column(unique = true)
    private String name;
}
