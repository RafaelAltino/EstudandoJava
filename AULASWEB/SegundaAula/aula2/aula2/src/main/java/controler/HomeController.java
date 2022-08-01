package controler;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{
    @GetMapping({"/oi"})
    public String home(){
        return "Home...";
    }
}





