package com.develhope.SpringAdvanced0103.services;

import com.develhope.SpringAdvanced0103.entities.FlightEntity;
import com.develhope.SpringAdvanced0103.entities.Status;
import com.develhope.SpringAdvanced0103.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class FlightService {

    @Autowired
    private FlightRepository repo;

    public void addFiftyRandomFlights () {
        int var = 0;
        while (var < 50) {
            repo.insertFlight(UUID.randomUUID().toString(), UUID.randomUUID().toString(), UUID.randomUUID().toString());
            var += 1;
        }
    }

    public List<FlightEntity> showFlights() {
        return repo.findAll();
    }

}
