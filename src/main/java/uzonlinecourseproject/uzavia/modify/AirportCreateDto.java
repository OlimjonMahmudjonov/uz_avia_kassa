package uzonlinecourseproject.uzavia.modify;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AirportCreateDto {

    @NotBlank(message = "airport code can not be empty ")
    private String airport_code;

    @NotBlank(message = "airport name can not be empty ")
    private String airport_name;

    @NotBlank(message = "city can not be empty ")
    private String city;

    @NotBlank(message = "country can not be empty ")
    private String country;
}