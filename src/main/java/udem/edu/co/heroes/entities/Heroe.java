package udem.edu.co.heroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="heroe")
public class Heroe {

    @Id
    private String name;
    private String alias;

    @OneToMany
    private List<Poder> poder;
}