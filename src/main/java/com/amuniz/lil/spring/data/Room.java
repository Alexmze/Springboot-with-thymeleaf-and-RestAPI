package com.amuniz.lil.spring.data;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ROOM_ID")
    private long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROOM_NUMBER")
    private String roomNumber;

    @Column(name = "BED_INFO")
    private String bedInfo;

    @Override
    public String toString() {
        return "Room{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", room_number='" + roomNumber + '\'' +
            ", bed_info='" + bedInfo + '\'' +
            '}';
    }
}
