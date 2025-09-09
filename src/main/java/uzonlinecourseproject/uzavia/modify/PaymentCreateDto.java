package uzonlinecourseproject.uzavia.modify;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Payment_Method;
import uzonlinecourseproject.uzavia.enums.Payment_Status;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PaymentCreateDto {


    @Positive(message = "amount can not be zero ")
    private double amount;

    @NotBlank(message = " can not be first name empty ")
    private Payment_Method payment_method;

    @NotBlank(message = " can not be first name empty ")
    private Payment_Status status;

    @NotNull
    private LocalDateTime payment_time;

    @NotNull
    private Integer userId;


    private Integer ticketId;
}