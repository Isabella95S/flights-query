package com.develhope.flights_query.controller;

import com.develhope.flights_query.enums.Status;
import com.develhope.flights_query.model.Flight;
import com.develhope.flights_query.repository.FlightRepository;
import com.develhope.flights_query.utils.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightRepository flightRepo;

    private final Random random = new Random();
    @PostMapping
    public String createFlight() {
        for (int i = 0; i < 50; i++) {
            Flight flight = new Flight(
                    null,
                    RandomUtils.generaStringa(45),
                    RandomUtils.generaStringa(23),
                    RandomUtils.generaStringa(8),
                    Status.ONTIME);

            flightRepo.save(flight);
        }
        return "Voli aggiunti";
    }
    @GetMapping
    public List<Flight> findFlights(){
        return flightRepo.findAll();
    }
}
