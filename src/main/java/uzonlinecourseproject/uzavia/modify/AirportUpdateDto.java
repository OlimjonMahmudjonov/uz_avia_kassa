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

public class AirportUpdateDto {

    private String airport_code;

    private String airport_name;

    private String city;

    private String country;

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor

    public static class FlightUpdateDto {

        private String flightNumber;

        private Integer departureAirportId;

        private Integer arrivalAirportId;

        private LocalDateTime departure_time;


        private LocalDateTime arrival_time;

        private int seat_count;
        private String airline_name;


    }
}