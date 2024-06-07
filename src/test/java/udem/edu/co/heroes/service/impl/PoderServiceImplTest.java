package udem.edu.co.heroes.service.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
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
@ExtendWith(MockitoExtension.class)
class PoderServiceImplTest {

    @Mock
    private PoderRepository poderRepository;

    @InjectMocks
    private PoderServiceImpl poderService;

    private Poder poder;
    private Heroe heroe;
    private List<Poder> poderes;

    private AutoCloseable openMock;

    @BeforeEach
    void setUp() {
        heroe = new Heroe("Batman", "Pepito");
        poderes = new ArrayList<>();
    }

    @Test
    void findAllPoderWithData() throws SQLException, IOException {
        List<Poder> poderes = new ArrayList<>();
        poderes.add(poder);
        when(poderRepository.findAll()).thenReturn(poderes);
        assertNotNull(poderService.findAllPoder());
    }

    @Test
    void findAllPoderVacio() throws SQLException, IOException {
        List<Poder> poderes = new ArrayList<>();
        when(poderRepository.findAll()).thenReturn(poderes);
        assertEquals(poderes, poderService.findAllPoder());
    }

    @Test
    void findByIdPoderWithData() throws SQLException, IOException {
        when(poderRepository.findById(poder.getName())).thenReturn(Optional.of(poder));
        assertNotNull(poderService.findByIdPoder(poder.getName()));
    }

    @Test
    void findByIdPoderNull() throws SQLException, IOException {
        when(poderRepository.findById(poder.getName())).thenReturn(null);
        assertNull(poderService.findByIdPoder(poder.getName()));
    }

    @Test
    void createPoderWithData() throws IOException {
        when(poderRepository.save(poder)).thenReturn(poder);
        assertNotNull(poderService.createPoder(poder));
    }

    @Test
    void createPoderNull() throws IOException {
        when(poderRepository.save(null)).thenReturn(null);
        assertNull(poderService.createPoder(null));
    }

    @Test
    void updatePoderWithData() throws IOException {
        when(poderRepository.save(poder)).thenReturn(poder);
        assertNotNull(poderService.updatePoder(poder.getName(),poder));
    }

    @Test
    void updatePoderNull() throws IOException {
        when(poderRepository.save(null)).thenReturn(null);
        assertNull(poderService.updatePoder(null,null));
    }
}