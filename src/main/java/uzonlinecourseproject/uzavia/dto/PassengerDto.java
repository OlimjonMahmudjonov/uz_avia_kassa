package uzonlinecourseproject.uzavia.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@NoArgsConstructor
@AllArgsConstructor
public class PassengerDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private SEX sex ;
    private Nationality nationality;
    private PassportType type;
}
