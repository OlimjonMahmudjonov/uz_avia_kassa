package uzonlinecourseproject.uzavia.modify.UpdateDto;

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
public class PaymentUpdateDto {

    private Integer id;
    private BigDecimal amount;
    private BigDecimal taxAmound;
    private BigDecimal totalAmount;
    private Payment_Method payment_method;
    private Payment_Status payment_status;
    private CurrencyCourse currency_course;
    private LocalDate payment_date;
    private String transaction_id;
    private BigDecimal refund_amount;
}
