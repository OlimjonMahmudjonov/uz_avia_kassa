package uzonlinecourseproject.uzavia.modify.createDto;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.RoleGeneral;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserCreateDto {
    @NotEmpty(message = "Username cannot be empty")
    private String firstName;
    @NotEmpty(message = "lastname  cannot be empty")
    private String lastName;

    @Email(regexp = "[A-Za-z0-9._%+-]+gmail\\.com$ ")
    private String email;

    @Pattern(regexp = "\\+998(33|50|20|70|77|93|90|91|94|88|)\\d{7}",
            message = " Invalid Number is not match Uzbekistan ")
    private String phone;


    private String password;
    private RoleGeneral role;
    private boolean isVerified;
    private int collectStart;


}
