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
    private String heroe_name;

    public Poder(String name, String heroe_name) {
        this.name = name;
        this.heroe_name = heroe_name;
    }

    public Poder() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeroe_name() {
        return heroe_name;
    }

    public void setHeroe_name(String heroe_name) {
        this.heroe_name = heroe_name;
    }
}
