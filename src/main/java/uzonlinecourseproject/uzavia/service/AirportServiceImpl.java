package uzonlinecourseproject.uzavia.service;

import uzonlinecourseproject.uzavia.dto.AirportDto;
import uzonlinecourseproject.uzavia.modify.AirportCreateDto;
import uzonlinecourseproject.uzavia.modify.AirportUpdateDto;

import java.util.List;

public interface AirportServiceImpl {

    void deleteAirportById(Integer airportId);

    AirportDto updateAirportById(Integer airportId, AirportUpdateDto airportDto);

    AirportDto createAirport(AirportCreateDto airportDto);

    AirportDto getAirportById(Integer airportId);

    List<AirportDto> getRecentlyAirports(int limit);

    List<AirportDto> getAllAirportsByName(String airportName);

    List<AirportDto> getAirportsByCity(String cityName);

    boolean existsAirportById(Integer airportId);

}
