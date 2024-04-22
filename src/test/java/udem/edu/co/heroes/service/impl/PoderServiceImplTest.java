package udem.edu.co.heroes.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import udem.edu.co.heroes.entities.Heroe;
import udem.edu.co.heroes.entities.Poder;
import udem.edu.co.heroes.repository.HeroeRepository;
import udem.edu.co.heroes.repository.PoderRepository;
import udem.edu.co.heroes.service.HeroeService;
import udem.edu.co.heroes.service.PoderService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PoderServiceImplTest {

    @InjectMocks
    private PoderService poderService;

    @Mock
    private PoderRepository poderRepository;

    private Poder poder;
    private Heroe heroe;

    private AutoCloseable openMock;

    @BeforeEach
    void setUp() {
        openMock = MockitoAnnotations.openMocks(this);
        poder = new Poder("Correr", heroe);
    }

    @AfterEach
    void tearDown() throws Exception {
        openMock.close();
    }

    @Test
    void findAllPoder() {
        List<Poder> poderes = new ArrayList<>();
        poderes.add(poder);
        when(poderRepository.findAll()).thenReturn(poderes);
    }

    @Test
    void findByIdPoder() {
        when(poderRepository.findById(poder.getName())).thenReturn(Optional.of(poder));
    }

    @Test
    void createPoder() {
        when(poderRepository.save(poder)).thenReturn(poder);
    }

    @Test
    void updatePoder() {
        when(poderRepository.save(poder)).thenReturn(poder);
    }

    @Test
    void deletePoder() {
    }
}