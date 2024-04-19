package udem.edu.co.heroes.service;

import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Poder;

import java.util.List;
import java.util.Optional;

@Service
public interface PoderesService {
    public List<Poder> findAllPoder();
    public Optional<Poder> findByIdPoder(String name);
    public Poder createPoder(Poder poderes);
    public Poder updatePoder(String name, Poder poderes);
    public void deletePoder(String name);
}
