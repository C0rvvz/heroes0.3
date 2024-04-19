package udem.edu.co.heroes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Poder;
import udem.edu.co.heroes.repository.PoderRepository;
import udem.edu.co.heroes.service.PoderesService;

import java.util.List;
import java.util.Optional;

@Service
public class PoderesServiceImpl implements PoderesService{
    @Autowired
    PoderRepository poderRepository;

    @Override
    public List<Poder> findAllPoder(){
        return (List<Poder>) poderRepository.findAll();
    }

    @Override
    public Optional<Poder> findByIdPoder(String name){
        return (Optional<Poder>) poderRepository.findById(name);
    }

    @Override
    public Poder createPoder(Poder poderes){
        return (Poder) poderRepository.save(poderes);
    }

    @Override
    public Poder updatePoder(String name, Poder poderes) {
        return (Poder) poderRepository.save(poderes);
    }

    @Override
    public void deletePoder(String name) {
        poderRepository.deleteById(name);
    }
}
