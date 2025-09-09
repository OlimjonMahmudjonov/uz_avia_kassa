package uzonlinecourseproject.uzavia.modify;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class UsersCreateDto {


    @NotBlank(message = " can not be first name empty ")
    private String firstName;

    @NotBlank(message = " can not be last  name empty ")
    private String lastName;

    @Email(message = " email incorrect , [example@gmail.com]")
    private String email;

    @NotBlank(message = " can not be  password empty ")
    @Pattern(regexp = "")// password for regexp
    private String password;

    @NotBlank(message = " can not be role   empty ")
    private String role;


}
