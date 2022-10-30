package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    private final EtudiantRepository etudiantRepository;

    public Controller(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }

    /*
    public Controller(EtudiantRepository etudiantRepository) {
        this.etudiantRepository = etudiantRepository;
    }
    */

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @RequestMapping("/listeEtudiants")
    List<Etudiant> all(){
        return etudiantRepository.findAll();
    }


}


