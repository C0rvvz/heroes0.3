package udem.edu.co.heroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Heroe;
import udem.edu.co.heroes.service.HeroesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/heroes")
public class HeroesController {

    @Autowired
    HeroesService heroesService;

    public HeroesController(HeroesService heroesService) {
        this.heroesService = heroesService;
    }

    @GetMapping("/heroes")
    public List<Heroe> findAllHeroes() {
        return this.heroesService.findAllHeroes();
    }

    @GetMapping("/heroes/{name}")
    public Optional<Heroe> findHeroesById(@PathVariable("name") String name) {
        return this.heroesService.findByIdHeroes(name);
    }

    @GetMapping("/heroes/alias/{alias}")
    public Optional<Heroe> findHeroesByAlias(@PathVariable("alias") String alias) {
        return this.heroesService.findByAliasHeroes(alias);
    }

    @PostMapping("/heroes")
    public Heroe createHeroes(@RequestBody() Heroe heroes) {
        return this.heroesService.createHeroes(heroes);
    }

    @PutMapping("/heroes/{name}")
    public Heroe updateHeroes(@PathVariable("name") String name , @RequestBody() Heroe heroes) {
        return this.heroesService.updateHeroes(name, heroes);
    }

    @DeleteMapping("/heroes/{name}")
    public void deleteHeroes(@PathVariable("name") String name) {
        this.heroesService.deleteHeroes(name);
    }
}
