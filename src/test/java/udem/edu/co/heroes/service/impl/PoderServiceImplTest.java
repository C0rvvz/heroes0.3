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

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class PoderServiceImplTest {

    @InjectMocks
    private PoderServiceImpl poderService;

    @Mock
    private PoderRepository poderRepository;

    private Poder poder;
    private Heroe heroe;

    private AutoCloseable openMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        poder = new Poder("Correr", heroe);
    }

    @Test
    void findAllPoderWithData() throws SQLException, IOException {
        List<Poder> poderes = new ArrayList<>();
        poderes.add(poder);
        when(poderRepository.findAll()).thenReturn(poderes);
        assertNotNull(poderService.findAllPoder());
    }

    @Test
    void findAllPoderNull() throws SQLException, IOException {
        List<Poder> poderes = new ArrayList<>();
        poderes.add(poder);
        when(poderRepository.findAll()).thenReturn(poderes);
        assertNull(poderService.findAllPoder());
    }

    @Test
    void findByIdPoderWithData() throws SQLException, IOException {
        when(poderRepository.findById(poder.getName())).thenReturn(Optional.of(poder));
        assertNotNull(poderService.findByIdPoder(poder.getName()));
    }

    @Test
    void findByIdPoderNull() throws SQLException, IOException {
        when(poderRepository.findById(poder.getName())).thenReturn(Optional.of(poder));
        assertNull(poderService.findByIdPoder(poder.getName()));
    }

    @Test
    void createPoderWithData() throws IOException {
        when(poderRepository.save(poder)).thenReturn(poder);
        assertNotNull(poderService.createPoder(poder));
    }

    @Test
    void createPoderNull() throws IOException {
        when(poderRepository.save(poder)).thenReturn(poder);
        assertNull(poderService.createPoder(poder));
    }

    @Test
    void updatePoderWithData() throws IOException {
        when(poderRepository.save(poder)).thenReturn(poder);
        assertNotNull(poderService.updatePoder(poder.getName(),poder));
    }

    @Test
    void updatePoderNull() throws IOException {
        when(poderRepository.save(poder)).thenReturn(poder);
        assertNull(poderService.updatePoder(poder.getName(),poder));
    }
}