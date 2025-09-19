package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirportName;
import uzonlinecourseproject.uzavia.enums.Flight_Status;
import uzonlinecourseproject.uzavia.enums.WeatherCondition;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FlightCreateDto {

    @NotEmpty(message = "Flight Number   is not empty ")
    private String flightNumber;

    private Integer departureAirportId;

    private Integer arrivalAirportId;

    private LocalDateTime departure_time;

    private LocalDateTime arrival_time;

    @Positive(message = "can not be price positive ")
    private BigDecimal price;


    @Positive(message = "can not be count seat  positive ")
    private int seat_count;

    private Flight_Status status;

    @NotEmpty(message = "Airline name is not empty ")
    private AirportName airline_name;


    private WeatherCondition  weather_condition;

    @NotNull(message = " delay minutes is not not null   ")
    private int delayMinutes;
}
