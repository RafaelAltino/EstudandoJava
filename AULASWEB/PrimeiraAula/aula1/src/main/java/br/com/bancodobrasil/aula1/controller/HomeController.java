package br.com.bancodobrasil.aula1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private List<User> users = Collections.synchronizedList(new ArrayList<>());

    @GetMapping({ "/home" })
    public String home(){
        return "Seja bem vindo!";
    }

    @GetMapping({ "/client/list" })
    public List<User> getUser(){
        return users;
    }

    @PutMapping({ "/client/{id}" })
    public User getUserList(){
        // return new ArrayList<>() {{
        //     add(new User("Amanda", "madinha@gmail.com", 25));
        //     add(new User("Beatriz", "btriz@gmail.com", 25));
        //     add(new User("Camila", "mila@gmail.com", 30));
        // }};
        return users.get(0);
    }

    @GetMapping({ "/user/add" })
    public void getUserAdd(
        @RequestParam(value = "name") String name,
        @RequestParam(value = "email", defaultValue = "teste@gmail.com") String email
    ){
        users.add(new User(name, email, 40));
    }

    private record User(String name, int age, String vatNumber, String email){

    }



}
