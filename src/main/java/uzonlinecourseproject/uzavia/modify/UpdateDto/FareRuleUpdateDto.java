package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.SeatStatus;

import java.math.BigDecimal;

public class FareRuleUpdateDto {
    private Integer id;
    private SeatStatus status;
    private BigDecimal basePrice;
    private BigDecimal taxPercentage;
    private BigDecimal cancellationPrice;
    private boolean isRefundable;
}
