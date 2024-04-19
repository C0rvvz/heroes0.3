package udem.edu.co.heroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="poder")
public class Poder {

    @Id
    private String name;

    @ManyToOne
    private Heroe heroe;
}
