package udem.edu.co.heroes.service;

import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Heroe;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public interface HeroeService {
    public List<Heroe> findAllHeroes() throws IOException, SQLException;
    public Optional<Heroe> findByIdHeroe(String name) throws IOException, SQLException;
    public Heroe createHeroe(Heroe heroe) throws IOException;
    public Heroe updateHeroe(String name, Heroe heroe) throws IOException;
    public Optional<Heroe> findByAliasHeroe(String alias) throws IOException, SQLException;
    public void deleteHeroe(String name) throws IOException;
}


