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
import udem.edu.co.heroes.service.HeroeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

class HeroeServiceImplTest {

    @InjectMocks
    private HeroeService heroeService;

    @Mock
    private HeroeRepository heroeRepository;

    private Heroe heroe;
    private List<Poder> poder;

    private AutoCloseable openMock;

    @BeforeEach
    void setUp() {
        openMock = MockitoAnnotations.openMocks(this);
        heroe = new Heroe("Batman", "Pepito", poder);
    }

    @AfterEach
    void tearDown() throws Exception {
         openMock.close();
    }

    @Test
    void findByAliasHeroe() {
        when(heroeRepository.findById(heroe.getAlias())).thenReturn(Optional.of(heroe));
    }

    @Test
    void findAllHeroes() {
        List<Heroe> heroes = new ArrayList<>();
        heroes.add(heroe);
        when(heroeRepository.findAll()).thenReturn(heroes);
        //assertNotNull(heroeService.findAllHeroes());
        //assertEquals(heroe,hero);
    }

    @Test
    void findByIdHeroe() {
        when(heroeRepository.findById(heroe.getName())).thenReturn(Optional.of(heroe));
    }

    @Test
    void createHeroe() {
        when(heroeRepository.save(heroe)).thenReturn(heroe);
    }

    @Test
    void updateHeroe() {
        when(heroeRepository.save(heroe)).thenReturn(heroe);
    }

    @Test
    void deleteHeroe() {

    }
}