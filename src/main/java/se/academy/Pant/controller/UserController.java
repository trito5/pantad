package se.academy.Pant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.academy.Pant.domain.User;
import se.academy.Pant.repository.UserRepository;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //Registrera ny användare
    @PostMapping("/newUser")
    public ResponseEntity<?> newUser(@RequestBody User user) {
        if(!userRepository.existsByEmail(user.getEmail()) ){
            User result = userRepository.save(user);
            return ResponseEntity.ok().body(result);
        }
        else {
            return ResponseEntity.badRequest().body("Email finns");
        }


    }

}
