package uzonlinecourseproject.uzavia.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.CurrencyCourse;
import uzonlinecourseproject.uzavia.enums.Payment_Method;
import uzonlinecourseproject.uzavia.enums.Payment_Status;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDto {
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
    private Integer user_id;
    private Integer ticket_id;
}
