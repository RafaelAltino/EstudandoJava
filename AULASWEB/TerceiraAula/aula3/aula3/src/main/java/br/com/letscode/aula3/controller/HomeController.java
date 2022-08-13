package br.com.letscode.aula3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.letscode.aula3.model.User;

@RestController
public class HomeController {   
    @GetMapping({"/"})
    public ResponseEntity<User> home(
        @RequestParam(value="showUser", defaultValue = "false") boolean showUser
    ){
        if(showUser){
            return ResponseEntity.ok(new User("Faro", "farinho@gmail"));
        } else{
            return ResponseEntity.badRequest().build();
        }       
    }

    




    @GetMapping({"/home"})
    public User homeZe(){
        return new User("Zé da couves", "couvinha@gmail.com");
    }
}
