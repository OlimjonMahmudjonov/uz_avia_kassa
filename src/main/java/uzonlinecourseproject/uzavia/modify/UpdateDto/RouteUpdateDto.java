package uzonlinecourseproject.uzavia.modify.UpdateDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirportCode;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RouteUpdateDto {
    private Integer id;
    private double distance;
    private Integer departureAirport;
    private Integer arrivalAirport;
    private AirportCode routeCode;

}
