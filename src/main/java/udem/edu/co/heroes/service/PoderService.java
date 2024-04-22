package udem.edu.co.heroes.service;

import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Poder;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public interface PoderService {
    public List<Poder> findAllPoder() throws IOException, SQLException;
    public Optional<Poder> findByIdPoder(String name) throws IOException, SQLException;
    public Poder createPoder(Poder poderes) throws IOException;
    public Poder updatePoder(String name, Poder poderes) throws IOException;
    public void deletePoder(String name) throws IOException;
}
