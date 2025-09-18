package uzonlinecourseproject.uzavia.dto;

import lombok.*;
import uzonlinecourseproject.uzavia.enums.SeatStatus;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class FareRule {
    private Long id;
    private SeatStatus status;
    private BigDecimal basePrice;
    private BigDecimal taxPercentage;
    private BigDecimal cancellationPrice;
    private  boolean isRefundable;


}
