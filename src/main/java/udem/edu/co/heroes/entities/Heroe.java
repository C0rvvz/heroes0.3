package udem.edu.co.heroes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

    @OneToMany(mappedBy = "heroe", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Poder> poder;
}