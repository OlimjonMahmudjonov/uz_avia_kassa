package uzonlinecourseproject.uzavia.service;

import uzonlinecourseproject.uzavia.dto.FlightDto;
import uzonlinecourseproject.uzavia.modify.FlightCreateDto;
import uzonlinecourseproject.uzavia.modify.FlightUpdateDto;

import java.time.LocalTime;
import java.util.List;

public interface FlightServiceImpl {

    void deleteFlightById(Integer flightId);

    FlightDto updateFlightById(Integer flightId, FlightUpdateDto flightDto);

    FlightDto createFlight(FlightCreateDto flightCreateDto);

    FlightDto getFlightById(Integer flightId);

    List<FlightDto> getAllFlights();

    List<FlightDto> getAllFlightsByDepartureOrArrival(LocalTime departure_time);

    FlightDto getFlightByNumber(String flightNumber);
    List<FlightDto> getAllFlightsByA


}
