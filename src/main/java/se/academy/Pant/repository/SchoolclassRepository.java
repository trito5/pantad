package se.academy.Pant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.academy.Pant.domain.Schoolclass;

public interface SchoolclassRepository extends JpaRepository<Schoolclass, Integer> {
}
