package uzonlinecourseproject.uzavia.modify;

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

public class PaymentUpdateDto {


    private double amount;

    private Payment_Method payment_method;

    private Payment_Status status;

    private LocalDateTime payment_time;


}