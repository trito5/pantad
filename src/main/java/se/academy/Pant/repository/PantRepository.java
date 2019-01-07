package se.academy.Pant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.academy.Pant.domain.Pant;

public interface PantRepository extends JpaRepository<Pant, Integer> {
}
