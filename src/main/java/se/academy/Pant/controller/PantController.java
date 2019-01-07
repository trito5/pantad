package se.academy.Pant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import se.academy.Pant.domain.Pant;
import se.academy.Pant.repository.PantRepository;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/pant")
@RestController
public class PantController {

    @Autowired
    private PantRepository pantRepository;


    //Registrera ny pant
    @PostMapping("/newPant")
    public ResponseEntity<?> registerPant(@RequestBody Pant pant) {
        pantRepository.save(pant);
        return ResponseEntity.ok().build();
    }

    //Gör så att pant bli collected
    @GetMapping("/collectedPant/{pantId}")
    public ResponseEntity<?> collectedPant(@PathVariable int pantId) {
        Pant pant = pantRepository.findById(pantId).get();
        pant.setCollected(true);
        Pant result = pantRepository.save(pant);
        return ResponseEntity.ok().body(result);
    }

    //lista med all pant som inte är collected
    @GetMapping("/allPant")
    public List<Pant> getAllPant() {
        List<Pant> pantList = pantRepository.findAll();
        List<Pant> availablePant = new ArrayList<>();

        pantList.forEach(p -> {
            if (!p.isCollected()) {
                availablePant.add(p);
            }
        });
        return availablePant;
    }

}

