package services.ravi.spring.security.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLoginView(){
        return "login";
    }

    @GetMapping("/logout")
    public String getLogoutView(){
        return "login";
    }

    @GetMapping("/access-denied")
    public String getAccessDeniedView(){
        return "/access-denied";
    }
}
