package br.com.desafio.desafioCliente.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PagesController {

    private List<Client> clientes = Collections.synchronizedList(new ArrayList<>());

    @GetMapping({ "/" })
    public String home(){
        return "Home";
    }

    @GetMapping({"/client/list"})
    public Client getClientes(){
        return new Client("Antonio Aranres", "toninho@gmail.com", 25);
    }

    @PutMapping({"/client/{id}"})
    public Client updateCliente(){
        return new Client("Antonio Aranres", "toninho@gmail.com", 25);
    }

    @PostMapping({"/client"})
    public Client getUser(){
        return new Client("Antonio Aranres", "toninho@gmail.com", 25);
    }

    @GetMapping({ "/user/list" })
    public List<Client> getUserList(){
        // return new ArrayList<>() {{
        //     add(new User("Amanda", "madinha@gmail.com", 25));
        //     add(new User("Beatriz", "btriz@gmail.com", 25));
        //     add(new User("Camila", "mila@gmail.com", 30));
        // }};
        return clientes;
    }

    @GetMapping({ "/user/add" })
    public void getUserAdd(
        @RequestParam(value = "name") String name,
        @RequestParam(value = "email", defaultValue = "teste@gmail.com") String email
    ){
        clientes.add(new Client(name, email, 40));
    }

    private record Client(String name, String email, int idade){

    }



}
