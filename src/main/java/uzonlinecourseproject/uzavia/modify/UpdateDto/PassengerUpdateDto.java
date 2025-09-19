package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.Nationality;
import uzonlinecourseproject.uzavia.enums.PassportType;
import uzonlinecourseproject.uzavia.enums.SEX;

import java.time.LocalDateTime;

public class PassengerUpdateDto {
    private Integer id;

    private String firstName;
    private String lastName;
    private String passwordNumber;
    private LocalDateTime birthday;
    private SEX sex ;
    private Nationality nationality;
    private PassportType type;
    private LocalDateTime passwordDuration ;
}
