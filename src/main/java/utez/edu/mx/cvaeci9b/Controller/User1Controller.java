package utez.edu.mx.cvaeci9b.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user1")
public class User1Controller {

    @GetMapping("")
    public String getMessage(){
        return "Hola desde usuario1";
    }
}
