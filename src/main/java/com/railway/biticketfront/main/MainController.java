package com.railway.biticketfront.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value={"", "/"})
    public String getIndex(Model model) {
        model.addAttribute("eventName", "FIFA 2018");

        return "index";
    }

    @RequestMapping("login")
    public String getLogin(Model model) {
        return "login";
    }

    @RequestMapping("/recoverpw")
    public String getRecover(Model model) {
        return "recoverpw";
    }

    @RequestMapping("/register")
    public String getRegister(Model model) {
        return "register";
    }
}
