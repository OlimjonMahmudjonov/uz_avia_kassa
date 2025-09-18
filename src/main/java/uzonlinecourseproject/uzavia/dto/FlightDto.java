package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Flight_Status;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {
    private Integer id;

    private String flightNumber;

    private Integer departureAirportId;

    private Integer arrivalAirportId;

    private LocalDateTime departure_time;

    private LocalDateTime arrival_time;

    private BigDecimal price;

    private int seat_count;
    private Flight_Status status;

    private  Integer airline_id;


}
