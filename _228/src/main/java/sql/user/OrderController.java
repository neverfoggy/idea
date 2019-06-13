package sql.user.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sql.user.UserRepository;

@Controller

public class OrderController {
    @Autowired

    private UserRepository userRepository;
    @RequestMapping("/")
    public String controlView() {
        return "formPage";
    }

}



