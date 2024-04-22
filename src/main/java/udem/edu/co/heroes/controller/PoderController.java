package udem.edu.co.heroes.controller;

import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Poder;
import udem.edu.co.heroes.service.PoderService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/poder")
public class PoderController {

    PoderService poderService;

    @GetMapping("/poder")
    public List<Poder> findAllPoder(){
        try {
            return this.poderService.findAllPoder();
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
        } catch (SQLException e) {
            System.err.println("ERROR: No existen poderes:\n");
        }
        return List.of();
    }

    @GetMapping("/poder/{name}")
    public Optional<Poder> findPoderById(@PathVariable("name") String name){
        try {
            return this.poderService.findByIdPoder(name);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
        } catch (SQLException e) {
            System.err.println("ERROR: No existe ese poder:\n");
        }
        return Optional.empty();
    }

    @PostMapping("/poder")
    public Poder createPoder(@RequestBody() Poder poder){
        try {
            return this.poderService.createPoder(poder);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
        }
        return poder;
    }

    @PutMapping("/poder/{name}")
    public Poder updatePoder(@PathVariable("name") String name, @RequestBody() Poder poder){
        try {
            return this.poderService.updatePoder(name, poder);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
        }
        return poder;
    }

    @DeleteMapping("/poder/{name}")
    public void deletePoder(@PathVariable("name") String name){
        try {
            this.poderService.deletePoder(name);
        } catch (IOException e) {
            System.err.println("ERROR: informacion no valida:\n");
        }
    }
}
