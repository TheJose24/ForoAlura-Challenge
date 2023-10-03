package alura.foro.repository;

import alura.foro.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Topico, Long> {
}
