package udem.edu.co.heroes.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="poder")
public class Poder {

    @Id
    private String name;

    @ManyToOne
    private Heroe heroe;

    public Poder(String name, Heroe heroe) {
        this.name = name;
        this.heroe = heroe;
    }

    public Poder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Heroe getHeroe() {
        return heroe;
    }

    public void setHeroe(Heroe heroe) {
        this.heroe = heroe;
    }
}
