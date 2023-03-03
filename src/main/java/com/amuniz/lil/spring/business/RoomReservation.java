package com.amuniz.lil.spring.business;

import lombok.Data;

import java.util.Date;

@Data
public class RoomReservation {

    private long roomID;
    private long guestID;
    private String roomName;
    private String roomNumber;
    private String firstName;
    private String lastName;
    private Date date;

    @Override
    public String toString() {
        return "RoomReservation{" +
            "roomID=" + roomID +
            ", guestID=" + guestID +
            ", roomName='" + roomName + '\'' +
            ", roomNumber='" + roomNumber + '\'' +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", date=" + date +
            '}';
    }
}
