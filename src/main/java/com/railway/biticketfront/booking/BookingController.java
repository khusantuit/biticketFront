package com.railway.biticketfront.booking;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/table")
public class BookingController {
    @RequestMapping("/bookings")
    public String showtable(Model model) {
        return "table-datatable";
    }
}
