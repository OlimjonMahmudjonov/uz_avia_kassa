package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.AirLineNames;
import uzonlinecourseproject.uzavia.enums.Nationality;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AirLineCreteDto {

    @NotEmpty(message = "Airport name is not  empty ")
    private AirLineNames airline_name;

    @NotEmpty(message = "Airport name is not  empty ")
    private String airline_code;

    @NotEmpty(message = " Country is not  empty ")
    private Nationality country;
}
