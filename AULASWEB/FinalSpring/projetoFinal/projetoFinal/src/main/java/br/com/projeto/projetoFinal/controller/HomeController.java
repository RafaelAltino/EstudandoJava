package br.com.projeto.projetoFinal.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.projetoFinal.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class HomeController{

    private List<User> usuarios =  new ArrayList<>(){{
        add(new User("Arnaldo", 50, "AR1234", "arnaldo@gmail.com"));
        add(new User("Bruna", 30, "BR2222", "bruna@gmail.com"));
    }};
    private final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);


    @GetMapping({"/home"})
    public String home(){
        return "Home...";
    }

    @GetMapping({"/client/list"})
    public List<User> getAllClients(){
        return usuarios;
    }

    @PutMapping({"/client/{id}"})
    ResponseEntity<Void> putUser(@RequestBody User user){
        if(user != null){
            LOGGER.warn(("USER MODIFICADO :: " + user.toString()));
            usuarios.add(user);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return ResponseEntity.noContent().build();  
    }

    @DeleteMapping({"/client/{id}"})
    public List<User> deleteClient(){
        return usuarios;
    }

    @PostMapping({"/client"})
    public ResponseEntity<Void> postUser(@RequestBody User user){
        if(user != null){
            usuarios.add(user);
            LOGGER.warn(("USER CRIADO :: " + user.toString()));           
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return ResponseEntity.noContent().build();     
    }
}