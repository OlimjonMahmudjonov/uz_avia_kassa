package uzonlinecourseproject.uzavia.modify;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FlightUpdateDto {

    private String flightNumber;
    private Integer departureAirportId;
    private Integer arrivalAirportId;
    private LocalDateTime departure_time;
    private LocalDateTime arrival_time;
    private double price;
    private int seat_count;
    private String airline_name;


}