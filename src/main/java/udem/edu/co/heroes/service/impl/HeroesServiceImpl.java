package udem.edu.co.heroes.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Heroes;
import udem.edu.co.heroes.entities.Poderes;
import udem.edu.co.heroes.repository.HeroesRepository;
import udem.edu.co.heroes.service.HeroesService;

import java.util.List;
import java.util.Optional;

@Service
public class HeroesServiceImpl implements HeroesService {

    @Autowired
    HeroesRepository heroesRepository;

    @Override
    public List<Heroes> findAllHeroes(){
        return (List<Heroes>) heroesRepository.findAll();
    }

    @Override
    public Optional<Heroes> findByIdHeroes(String name){
        return (Optional<Heroes>) heroesRepository.findById(name);
    }

    @Override
    public Heroes createHeroes(Heroes heroes){
        return (Heroes) heroesRepository.save(heroes);
    }

    @Override
    public Heroes updateHeroes(String name, Heroes heroes){
        return (Heroes) heroesRepository.save(heroes);
    }

    @Override
    public void deleteHeroes(String name){
        heroesRepository.delete(name);
    }
}
