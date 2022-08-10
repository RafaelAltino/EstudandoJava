package br.com.letscode.aula3.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.com.letscode.aula3.model.User;

@RestController
public class UserController {

    /*Boa prática usar private final no LOGGER */
    private final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @PostMapping({"/user"})
    public ResponseEntity<Void> userCreate(@RequestBody User user){
        if(user != null){
            /* Evitar usar sout e usar o LOGGER warn pra exibir no terminal */
            LOGGER.warn(("USER CRIADO :: " + user));
            int[] xi = new int[] {123, 456};

            try{
                Integer.valueOf(xi[10]);
            } catch(Exception e){
                LOGGER.debug("Debugando o que está acontecendo", e); // Não sei pq, mas não tá aparecendo
                LOGGER.error("Ocorreu um erro no Array!", e);
                LOGGER.trace("Traçando o que vier pela frente", e); // Não sei pq, mas não tá aparecendo
                LOGGER.warn("Alertando da parada", e);
            }
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        return ResponseEntity.noContent().build();     
    }

}
