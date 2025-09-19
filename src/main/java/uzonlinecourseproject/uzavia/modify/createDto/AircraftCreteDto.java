package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirCraftName;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AircraftCreteDto {

    private AirCraftName ariCraftName;

    @Positive(message = "can not be total seat  positive ")
    private  int totalSeats;

}
