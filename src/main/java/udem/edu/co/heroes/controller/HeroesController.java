package udem.edu.co.heroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Heroes;
import udem.edu.co.heroes.entities.Poderes;
import udem.edu.co.heroes.service.HeroesService;
import udem.edu.co.heroes.service.PoderesService;

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

    @GetMapping("/heroes/")
    public List<Heroes> findAllHeroes() {
        return this.heroesService.findAllHeroes();
    }

    @GetMapping("/heroes/{name}")
    public Optional<Heroes> findHeroesById(@RequestParam("name") String name) {
        return this.heroesService.findByIdHeroes(name);
    }

    @PostMapping("/heroes")
    public Heroes createHeroes(@RequestBody() Heroes heroes) {
        return this.heroesService.createHeroes(heroes);
    }

    @PutMapping("/heroes/{name}")
    public Heroes updateHeroes(@PathVariable("name") String name , @RequestBody() Heroes heroes) {
        return this.heroesService.updateHeroes(name, heroes);
    }

    @DeleteMapping("/heroes/{name}")
    public void deleteHeroes(@PathVariable("name") String name) {
        this.heroesService.deleteHeroes(name);
    }
}
