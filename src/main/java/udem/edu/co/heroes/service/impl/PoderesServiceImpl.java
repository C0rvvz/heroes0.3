package udem.edu.co.heroes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import udem.edu.co.heroes.entities.Poderes;
import udem.edu.co.heroes.repository.PoderesRepository;
import udem.edu.co.heroes.service.PoderesService;

import java.util.List;
import java.util.Optional;

@Service
public class PoderesServiceImpl implements PoderesService{
    @Autowired
    PoderesRepository poderesRepository;

    @Override
    public List<Poderes> findAllPoderes(){
        return (List<Poderes>) poderesRepository.findAll();
    }

    @Override
    public Optional<Poderes> findByIdPoderes(String name){
        return (Optional<Poderes>) poderesRepository.findById(name);
    }

    @Override
    public Poderes createPoderes(Poderes poderes){
        return (Poderes) poderesRepository.save(poderes);
    }

    @Override
    public Poderes updatePoderes(String name, Poderes poderes) {
        return (Poderes) poderesRepository.save(poderes);
    }

    @Override
    public void deletePoderes(String name) {
        poderesRepository.deleteById(name);
    }
}
