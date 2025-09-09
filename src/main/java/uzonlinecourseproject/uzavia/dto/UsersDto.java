package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UsersDto {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;


}
