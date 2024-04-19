package udem.edu.co.heroes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udem.edu.co.heroes.entities.Heroe;

@Repository
public interface HeroeRepository extends JpaRepository<Heroe,String> {
}
