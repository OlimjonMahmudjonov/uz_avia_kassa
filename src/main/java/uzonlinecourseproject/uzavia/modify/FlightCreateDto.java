package uzonlinecourseproject.uzavia.modify;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class FlightCreateDto {

    @NotBlank(message = " can not be flight number  empty ")
    private String flightNumber;

    @NotNull
    private Integer departureAirportId;

    @NotNull
    private Integer arrivalAirportId;

    @NotNull
    private LocalDateTime departure_time;

    @NotNull
    private LocalDateTime arrival_time;

    @Positive(message = "price can not be zero ")
    private double price;
    @NotNull
    private int seat_count;
    @NotBlank(message = " can not be  name empty ")
    private String airline_name;


    private Integer airlineId;
}