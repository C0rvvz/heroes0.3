package udem.edu.co.heroes.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Heroe;
import udem.edu.co.heroes.repository.HeroeRepository;
import udem.edu.co.heroes.service.HeroeService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class HeroeServiceImpl implements HeroeService {

    @Autowired
    HeroeRepository heroeRepository;

    @Override
    public Optional<Heroe> findByAliasHeroe(String alias) throws IOException, SQLException {
        return (Optional<Heroe>) heroeRepository.findById(alias);
    }

    @Override
    public List<Heroe> findAllHeroes() throws IOException, SQLException{
        return (List<Heroe>) heroeRepository.findAll();
    }

    @Override
    public Optional<Heroe> findByIdHeroe(String name) throws IOException, SQLException{
        return (Optional<Heroe>) heroeRepository.findById(name);
    }

    @Override
    public Heroe createHeroe(Heroe heroe) throws IOException {
        return (Heroe) heroeRepository.save(heroe);
    }

    @Override
    public Heroe updateHeroe(String name, Heroe heroe) throws IOException{
        return (Heroe) heroeRepository.save(heroe);
    }

    @Override
    public void deleteHeroe(String name) throws IOException{
        Heroe heroeEliminado = new Heroe();
        heroeEliminado.setName(name);
        heroeRepository.delete(heroeEliminado);
    }
}
