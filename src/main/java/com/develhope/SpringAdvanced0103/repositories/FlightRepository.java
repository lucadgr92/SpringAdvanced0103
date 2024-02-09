package com.develhope.SpringAdvanced0103.repositories;

import com.develhope.SpringAdvanced0103.entities.FlightEntity;
import com.develhope.SpringAdvanced0103.entities.Status;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Id> {


/*
    @Transactional
    @Modifying
    @Query(value = "INSERT INTO flights" +
            "(description, from_airport, to_airport, flight_status)" +
            "VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void insertFlight(String description, String fromAirport, String toAirport, Status flightStatus);
*/

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO flights (description, from_airport, to_airport, flight_status) VALUES (?1, ?2, ?3, 'ONTIME')", nativeQuery = true)
    void insertFlight(String description, String fromAirport, String toAirport);


}
