package udem.edu.co.heroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Heroe;
import udem.edu.co.heroes.service.HeroeService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/heroe")
public class HeroeController {

    @Autowired
    HeroeService heroeService;

    @GetMapping("/heroe")
    public List<Heroe> findAllHeroes(){
        try {
            return this.heroeService.findAllHeroes();
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
            return null;
        } catch (SQLException e) {
            System.err.println("ERROR: No existen heroes:\n");
            return null;
        }
    }

    @GetMapping("/heroe/{name}")
    public Optional<Heroe> findHeroeById(@PathVariable("name") String name) {
        try {
            return this.heroeService.findByIdHeroe(name);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
            return null;
        } catch (SQLException e) {
            System.err.println("ERROR: El nombre no existe:\n");
            return null;
        }
    }

    @GetMapping("/heroe/alias/{alias}")
    public Optional<Heroe> findHeroeByAlias(@PathVariable("alias") String alias){
        try {
            return this.heroeService.findByAliasHeroe(alias);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
            return null;
        } catch (SQLException e) {
            System.err.println("ERROR: El alias no existe:\n");
            return null;
        }
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/heroe")
    public Heroe createHeroe(@RequestBody() Heroe heroe){
        try {
            return this.heroeService.createHeroe(heroe);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
            return null;
        }
    }

    @PutMapping("/heroe/{name}")
    public Heroe updateHeroe(@PathVariable("name") String name , @RequestBody() Heroe heroe){
        try {
            return this.heroeService.updateHeroe(name, heroe);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
            return null;
        }
    }

    @DeleteMapping("/heroe/{name}")
    public void deleteHeroe(@PathVariable("name") String name){
        try {
            this.heroeService.deleteHeroe(name);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
        }
    }
}
