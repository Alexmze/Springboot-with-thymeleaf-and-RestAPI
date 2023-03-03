package com.amuniz.lil.spring.webservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.amuniz.lil.spring.business.ReservationService;
import com.amuniz.lil.spring.util.DateUtils;
import com.amuniz.lil.spring.business.RoomReservation;
import com.amuniz.lil.spring.data.Guest;
import com.amuniz.lil.spring.data.Room;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class WebserviceController {

    private final DateUtils dateUtils;
    private final ReservationService reservationService;

    public WebserviceController(DateUtils dateUtils, ReservationService reservationService) {
        this.dateUtils = dateUtils;
        this.reservationService = reservationService;
    }

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<RoomReservation> getReservations(@RequestParam(value = "date", required = false) String stringDate) {
        Date date = this.dateUtils.createDateFromDateString(stringDate);
        return this.reservationService.getRoomReservationsForDate(date);
    }

    @RequestMapping(path = "/guests", method = RequestMethod.GET)
    public List<Guest> getallGuests() {
        return this.reservationService.getAllGuests();
    }

    @GetMapping(path = "/rooms")
    public List<Room> getAllRooms() {
        return this.reservationService.getRooms();
    }

    @PostMapping(path = "/addGuests")
    @ResponseStatus(HttpStatus.CREATED)
    public void addGuest(@RequestBody Guest guest) {
        this.reservationService.addGuest(guest);
    }
    
}
