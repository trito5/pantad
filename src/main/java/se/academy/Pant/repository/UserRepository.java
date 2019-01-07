package se.academy.Pant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.academy.Pant.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

}
