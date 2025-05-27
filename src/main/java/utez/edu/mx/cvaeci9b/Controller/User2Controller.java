package utez.edu.mx.cvaeci9b.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user2")
public class User2Controller {

    @GetMapping("")
    public String getMessage(){
        return "Hola desde usuario2";
    }
}
