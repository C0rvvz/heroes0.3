package udem.edu.co.heroes.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Heroe;
import udem.edu.co.heroes.repository.HeroeRepository;
import udem.edu.co.heroes.service.HeroesService;

import java.util.List;
import java.util.Optional;

@Service
public class HeroesServiceImpl implements HeroesService {

    @Autowired
    HeroeRepository heroeRepository;

    @Override
    public Optional<Heroe> findByAliasHeroes(String alias) {
        return (Optional<Heroe>) heroeRepository.findById(alias);
    }

    @Override
    public List<Heroe> findAllHeroes(){
        return (List<Heroe>) heroeRepository.findAll();
    }

    @Override
    public Optional<Heroe> findByIdHeroes(String name){
        return (Optional<Heroe>) heroeRepository.findById(name);
    }

    @Override
    public Heroe createHeroes(Heroe heroes){
        return (Heroe) heroeRepository.save(heroes);
    }

    @Override
    public Heroe updateHeroes(String name, Heroe heroes){
        return (Heroe) heroeRepository.save(heroes);
    }

    @Override
    public void deleteHeroes(String name){
        Heroe heroeEliminado = new Heroe();
        heroeEliminado.setName(name);
        heroeRepository.delete(heroeEliminado);
    }
}
