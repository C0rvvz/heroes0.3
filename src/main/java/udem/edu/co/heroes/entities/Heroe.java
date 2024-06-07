package udem.edu.co.heroes.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="heroe")
public class Heroe{

    @Id
    private String name;
    private String alias;

    @OneToMany(mappedBy = "heroe_name", cascade = CascadeType.ALL)
    private List<Poder> poder;

    public Heroe(String batman, String pepito) {
    }

    public Heroe() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public List<Poder> getPoder() {
        return poder;
    }

    public void setPoder(List<Poder> poder) {
        this.poder = poder;
    }
}