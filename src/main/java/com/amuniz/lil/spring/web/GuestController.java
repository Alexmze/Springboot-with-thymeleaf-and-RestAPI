package com.amuniz.lil.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

import com.amuniz.lil.spring.business.ReservationService;
import com.amuniz.lil.spring.data.Guest;

import java.util.List;

@Controller
@RequestMapping("/guest")
public class GuestController {

    private final ReservationService reservationService;

    public GuestController(ReservationService reservationService) { 
        this.reservationService = reservationService;
    }


    @RequestMapping(method = RequestMethod.GET)
    public String getGuests(Model model) {
        List<Guest> guests = this.reservationService.getAllGuests();
        model.addAttribute("guests", guests);
        return "allGuests";
    }
    
}
