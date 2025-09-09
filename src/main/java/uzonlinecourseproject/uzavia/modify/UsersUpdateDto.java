package uzonlinecourseproject.uzavia.modify;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UsersUpdateDto {


    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String role;


}
