package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirportCode;
import uzonlinecourseproject.uzavia.enums.AirportName;
import uzonlinecourseproject.uzavia.enums.Nationality;

import java.time.ZonedDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirportCreteDto {

    @NotEmpty(message = "Airport name is not  empty ")
    private AirportName airport_name;

    @NotEmpty(message = "City is not  empty ")
    private String city;

    @NotEmpty(message = "Country   is not  empty ")
    private Nationality country;

    private boolean isGable_Airport;
    private AirportCode whereTo;
    private AirportCode ToWhere;

    @NotEmpty(message = "time zone    is not  empty ")
    private ZonedDateTime timeZone;
}
