package udem.edu.co.heroes.service;

import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Poderes;

import java.util.List;
import java.util.Optional;

@Service
public interface PoderesService {
    public List<Poderes> findAllPoderes();
    public Optional<Poderes> findByIdPoderes(String name);
    public Poderes createPoderes(Poderes poderes);
    public Poderes updatePoderes(String name, Poderes poderes);
    public void deletePoderes(String name);


}
