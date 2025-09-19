package uzonlinecourseproject.uzavia.modify.UpdateDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.TicketStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TicketUpdateDto {
    private Integer id;
    private String ticket_number;
    private BigDecimal price;
    private LocalDateTime purchase_date;
    private LocalDateTime expiry_date;
    private boolean isReturn;
    private String barcode;
    private TicketStatus status;

}
