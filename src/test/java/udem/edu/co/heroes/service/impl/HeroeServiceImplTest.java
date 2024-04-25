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

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

class HeroeServiceImplTest {

    @Mock
    private HeroeRepository heroeRepository;

    @InjectMocks
    private HeroeServiceImpl heroeService;

    private Heroe heroe;
    private Poder poder;
    private List<Poder> poderes;

    private AutoCloseable openMock;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        heroe = new Heroe("Batman", "Pepito");
        poder = new Poder("Correr", heroe);
        poderes = new ArrayList<>();
    }

    @Test
    void findAllHeroesWithData() throws SQLException, IOException {
        List<Heroe> heroes = new ArrayList<>();
        heroes.add(heroe);
        when(heroeRepository.findAll()).thenReturn(heroes);
        assertNotNull(heroeService.findAllHeroes());
    }

    @Test
    void findAllHeroesNull() throws SQLException, IOException {
        List<Heroe> heroes = new ArrayList<>();
        heroes.add(heroe);
        when(heroeRepository.findAll()).thenReturn(heroes);
        assertNull(heroeService.findAllHeroes());
    }

    @Test
    void findByIdHeroeWithData() throws SQLException, IOException {
        when(heroeRepository.findById(heroe.getName())).thenReturn(Optional.of(heroe));
        assertNotNull(heroeService.findByIdHeroe(heroe.getName()));
    }

    @Test
    void findByIdHeroeNull() throws SQLException, IOException {
        when(heroeRepository.findById(heroe.getName())).thenReturn(Optional.of(heroe));
        assertNull(heroeService.findByIdHeroe(heroe.getName()));
    }

    @Test
    void findByAliasHeroeWithData() throws SQLException, IOException {
        when(heroeRepository.findById(heroe.getAlias())).thenReturn(Optional.of(heroe));
        assertNotNull(heroeService.findByAliasHeroe(heroe.getAlias()));
    }

    @Test
    void findByAliasHeroeNull() throws SQLException, IOException {
        when(heroeRepository.findById(heroe.getAlias())).thenReturn(Optional.of(heroe));
        assertNull(heroeService.findByAliasHeroe(heroe.getAlias()));
    }

    @Test
    void createHeroeWithData() throws IOException {
        when(heroeRepository.save(heroe)).thenReturn(heroe);
        assertNotNull(heroeService.createHeroe(heroe));
    }

    @Test
    void createHeroeNull() throws IOException {
        when(heroeRepository.save(heroe)).thenReturn(heroe);
        assertNull(heroeService.createHeroe(heroe));
    }

    @Test
    void updateHeroeWithData() throws IOException {
        when(heroeRepository.save(heroe)).thenReturn(heroe);
        assertNotNull(heroeService.createHeroe(heroe));
    }
    @Test
    void updateHeroeNull() throws IOException {
        when(heroeRepository.save(heroe)).thenReturn(heroe);
        assertNotNull(heroeService.updateHeroe(heroe.getName(),heroe));
    }
}