package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMM dd HH:mm:ss");
        Calendar calendar = new GregorianCalendar();
        return "Hello World from Spring Boot ! Current datetime is " +sdf.format(calendar.getTime());
    }

    @RequestMapping("/listeEtudiants")
    List<Etudiant> all(){
        return etudiantRepository.findAll();
    }


}


