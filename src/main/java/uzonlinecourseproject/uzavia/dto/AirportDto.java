package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AirportDto  {

    private Integer id;
    private String airport_code;
    private String airport_name;
    private String city;
    private String country;
}