package com.develhope.SpringAdvanced0103.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "flights")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Long flightId;

    @Column(name = "description")
    private String description;
    @Column(name = "from_airport")
    private String fromAirport;
    @Column(name = "to_airport")
    private String toAirport;
    @Column(name = "flight_status")
    @Enumerated(value = EnumType.STRING)
    private Status flightStatus;
}
