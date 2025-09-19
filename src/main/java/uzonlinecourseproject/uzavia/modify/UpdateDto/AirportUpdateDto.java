package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.AirportCode;
import uzonlinecourseproject.uzavia.enums.AirportName;
import uzonlinecourseproject.uzavia.enums.Nationality;

import java.time.ZonedDateTime;

public class AirportUpdateDto {
    private Integer id;

    private AirportName airport_name;
    private String city;
    private Nationality country;
    private boolean isGable_Airport;
    private AirportCode whereTo;
    private AirportCode ToWhere;

    private ZonedDateTime timeZone;
}
