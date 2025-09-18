package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirportCode;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RouteDto {
    private Integer id;
    private double distance;
    private Integer departureAirport;
    private Integer arrivalAirport;
    private AirportCode routeCode;

}
