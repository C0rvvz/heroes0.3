package udem.edu.co.heroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name="poder")
public class Poder {

    @Id
    private String name;

    @ManyToOne
    @JoinColumn(name = "name")
    private Heroe heroe;

    public Poder(String name, Heroe heroe) {
        this.name = name;
        this.heroe = heroe;
    }
}
