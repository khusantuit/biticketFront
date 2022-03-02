package com.railway.biticketfront.user;

import lombok.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ProfileController {
    private final UserService userService;

    @RequestMapping("/profile")
    public String getProfile(Model model) {
        userService.getList();
        return "profile";
    }

}
