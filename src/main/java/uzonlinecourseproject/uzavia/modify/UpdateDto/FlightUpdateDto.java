package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.Flight_Status;
import uzonlinecourseproject.uzavia.enums.WeatherCondition;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FlightUpdateDto {
    private Integer id;

    private String flightNumber;

    private Integer departureAirportId;

    private Integer arrivalAirportId;

    private LocalDateTime departure_time;

    private LocalDateTime arrival_time;

    private BigDecimal price;


    private int seat_count;
    private Flight_Status status;
    private String airline_name;


    private WeatherCondition weather_condition;
    private int delayMinutes;
}
