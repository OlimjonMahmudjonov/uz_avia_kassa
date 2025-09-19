package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.SeatStatus;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FareRuleCreateDto {

    private SeatStatus status;

    @Positive(message = "can not be base price  positive ")
    private BigDecimal basePrice;

    @Positive(message = "can not be tax Percentage  positive ")
    private BigDecimal taxPercentage;

    @Positive(message = "can not be cancellation Price  positive ")
    private BigDecimal cancellationPrice;

    private  boolean isRefundable;
}
