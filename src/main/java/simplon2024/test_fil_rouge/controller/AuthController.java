package simplon2024.test_fil_rouge.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/")
public class AuthController {

    @GetMapping("/")
    public void get() {
        System.out.println("-------------------------------------------------");
        System.out.println("Requette get recue");

    }

    @GetMapping("/{id}")
    public String getId(@PathVariable String id) {
        System.out.println("-------------------------------------------------");
        System.out.println("L'id de la requette est :" + id);
        return id;
    }

    @PostMapping("login")
    public String login(@RequestBody Map<String, String> credentials){
        String email = credentials.get("email");
        String password = credentials.get("password");

        return ("requette reçue" + email + " " + password);
    }
}
