package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.CurrencyCourse;
import uzonlinecourseproject.uzavia.enums.Payment_Method;
import uzonlinecourseproject.uzavia.enums.Payment_Status;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentCreateDto {

    @Min(value = 1000, message = "Amount must be at least 1000")
    @Max(value = 1000000, message = "Amount cannot exceed 1,000,000")
    private BigDecimal amount;

    @PositiveOrZero(message = " is not PositiveOrZer  tax amound  ")
    private BigDecimal taxAmound;

    @NotNull(message = "Total amount is required")
    private BigDecimal totalAmount;

    private Payment_Method payment_method;
    private Payment_Status payment_status;
    private CurrencyCourse currency_course;
    private LocalDate payment_date;

    @NotEmpty(message = "can not be empty")
    private String transaction_id;

    @PositiveOrZero(message = " is not PositiveOrZer   refund amound ")
    private BigDecimal refund_amount;
}
