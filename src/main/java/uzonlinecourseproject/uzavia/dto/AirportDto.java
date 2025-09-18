package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirportCode;

import java.time.ZonedDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class AirportDto {

    private Integer id;
    private String airport_name;
    private String city;
    private String country;
    private boolean isGable_Airport;
    private AirportCode whereTo;
    private AirportCode ToWhere;
    private ZonedDateTime timeZone;
}
