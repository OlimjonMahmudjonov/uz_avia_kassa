package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.TicketStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {

    private Integer id;
    private String ticket_number;
    private BigDecimal price;
    private LocalDateTime purchase_date;
    private LocalDateTime expiry_date;
    private boolean isReturn;
    private String barcode; /// qrcode for
    private TicketStatus status;
    private Integer booking_id;
    private Integer flight_id;
}
