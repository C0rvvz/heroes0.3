package udem.edu.co.heroes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Poder;
import udem.edu.co.heroes.repository.PoderRepository;
import udem.edu.co.heroes.service.PoderService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class PoderServiceImpl implements PoderService {
    @Autowired
    PoderRepository poderRepository;

    @Override
    public List<Poder> findAllPoder() throws IOException, SQLException{
        return (List<Poder>) poderRepository.findAll();
    }

    @Override
    public Optional<Poder> findByIdPoder(String name) throws IOException, SQLException {
        return (Optional<Poder>) poderRepository.findById(name);
    }

    @Override
    public Poder createPoder(Poder poderes) throws IOException{
        return (Poder) poderRepository.save(poderes);
    }

    @Override
    public Poder updatePoder(String name, Poder poder) throws IOException{
        return (Poder) poderRepository.save(poder);
    }

    @Override
    public void deletePoder(String name) throws IOException{
        Poder poderEliminado = new Poder();
        poderEliminado.setName(name);
        poderRepository.delete(poderEliminado);
    }
}
