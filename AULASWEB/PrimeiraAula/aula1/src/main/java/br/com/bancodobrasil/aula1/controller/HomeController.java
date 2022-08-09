package br.com.bancodobrasil.aula1.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    private List<User> users = Collections.synchronizedList(new ArrayList<>());

    @GetMapping({ "/home" })
    public String home(){
        return "{\"name\":\"Antonio Aranres\",\"email\":\"toninho@gmail.com\"}";
    }

    @GetMapping({ "/user" })
    public User getUser(){
        return new User("Antonio Aranres", "toninho@gmail.com", 25);
    }

    @GetMapping({ "/user/list" })
    public List<User> getUserList(){
        // return new ArrayList<>() {{
        //     add(new User("Amanda", "madinha@gmail.com", 25));
        //     add(new User("Beatriz", "btriz@gmail.com", 25));
        //     add(new User("Camila", "mila@gmail.com", 30));
        // }};
        return users;
    }

    @GetMapping({ "/user/add" })
    public void getUserAdd(
        @RequestParam(value = "name") String name,
        @RequestParam(value = "email", defaultValue = "teste@gmail.com") String email
    ){
        users.add(new User(name, email, 40));
    }

    private record User(String name, String email, int idade){

    }



}
