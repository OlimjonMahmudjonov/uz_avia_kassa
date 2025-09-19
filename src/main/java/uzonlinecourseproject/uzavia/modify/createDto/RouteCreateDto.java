package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirportCode;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RouteCreateDto {

    @Positive(message = " can not be positive  distance ")
    private double distance;
    private Integer departureAirport;
    private Integer arrivalAirport;

    @NotEmpty(message = "can not be route Code  ")
    private AirportCode routeCode;

}
