package udem.edu.co.heroes.service;

import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Heroe;

import java.util.List;
import java.util.Optional;

@Service
public interface HeroesService {
    public List<Heroe> findAllHeroes();
    public Optional<Heroe> findByIdHeroes(String name);
    public Heroe createHeroes(Heroe heroes);
    public Heroe updateHeroes(String name, Heroe heroes);
    public Optional<Heroe> findByAliasHeroes(String alias);
    public void deleteHeroes(String name);
}
