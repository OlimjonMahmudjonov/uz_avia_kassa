package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Nationality;
import uzonlinecourseproject.uzavia.enums.PassportType;
import uzonlinecourseproject.uzavia.enums.SEX;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PassengerCreateDto {

    @NotEmpty(message = " first Name is not empty ")
    private String firstName;
    @NotEmpty(message = " last Name is not empty ")

    private String lastName;
    @Pattern(regexp = "^[A-Z]{2}-\\d{7}$")
    private String passwordNumber;
    private LocalDateTime birthday;
    private SEX sex;
    private Nationality nationality;
    private PassportType type;
    private LocalDateTime passwordDuration;
}
