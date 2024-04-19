package udem.edu.co.heroes.controller;

import org.springframework.web.bind.annotation.*;
import udem.edu.co.heroes.entities.Heroe;
import udem.edu.co.heroes.entities.Poder;
import udem.edu.co.heroes.service.PoderesService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/poderes")
public class PoderesController {

    PoderesService poderesService;

    public PoderesController(PoderesService poderesService) {
        this.poderesService = poderesService;
    }

    @GetMapping("/poderes/")
    public List<Poder> findAllPoderes() {
        return this.poderesService.findAllPoder();
    }

    @GetMapping("/poderes/{name}")
    public Optional<Poder> findPoderesById(@RequestParam("name") String name) {
        return this.poderesService.findByIdPoder(name);
    }

    @PostMapping("/poderes")
    public Poder createPoderes(@RequestBody() Poder poderes)  {
        return this.poderesService.createPoder(poderes);
    }

    @PutMapping("/poderes/{name}")
    public Poder updatePoderes(@RequestParam("name") String name, @RequestBody() Poder poderes){
        return this.poderesService.updatePoder(name, poderes);
    }

    @DeleteMapping("/poderes/{name}")
    public void deletePoderes(@PathVariable("name") String name) {
        this.poderesService.deletePoder(name);
    }
}
