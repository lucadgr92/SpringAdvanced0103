package com.develhope.SpringAdvanced0103.controllers;

import com.develhope.SpringAdvanced0103.entities.FlightEntity;
import com.develhope.SpringAdvanced0103.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class FlightController {

    @Autowired
    private FlightService service;

    @PostMapping("/fiftyflights")
    public void addFiftyFlights() {
        service.addFiftyRandomFlights();
    }

    @GetMapping("/showflights")
    public List<FlightEntity> showFlights() {
        return service.showFlights();
    }

}
