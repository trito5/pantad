package se.academy.Pant.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.academy.Pant.domain.Pant;
import se.academy.Pant.domain.Schoolclass;
import se.academy.Pant.domain.User;
import se.academy.Pant.repository.PantRepository;
import se.academy.Pant.repository.SchoolclassRepository;
import se.academy.Pant.repository.UserRepository;

@Component
public class PantLoader implements CommandLineRunner {

    @Autowired
    private PantRepository pantRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SchoolclassRepository schoolclassRepository;


    @Override
    public void run(String... args) throws Exception {
        User user = new User("hej@hotmail.com", "password", "Anders");
        userRepository.save(user);
        Pant pant = new Pant("130", "Helgalunden13", "45", "65", user, "Massa pant!");
        pantRepository.save(pant);

    }
}
