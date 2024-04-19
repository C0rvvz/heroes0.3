package udem.edu.co.heroes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import udem.edu.co.heroes.entities.Poder;

@Repository
public interface PoderRepository extends JpaRepository<Poder, String> {
}
