package com.amuniz.lil.spring.data;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Data
@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "RESERVATION_ID")
    private long id;

    @Column(name = "ROOM_ID")
    private long roomID;

    @Column(name = "GUEST_ID")
    private long guessID;

    @Column(name = "RES_DATE")
    private Date reservationDate;


    @Override
    public String toString() {
        return "Reservation{" +
            "id=" + id +
            ", roomID=" + roomID +
            ", guessID=" + guessID +
            ", reservationDate=" + reservationDate +
            '}';
    }
}
