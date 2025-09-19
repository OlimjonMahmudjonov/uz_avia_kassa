package uzonlinecourseproject.uzavia.modify.createDto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
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
public class TicketCreateDto {

    @NotEmpty(message = "Ticket Number   cannot be empty")
    private String ticket_number;

    @Positive(message = "can not be price positive ")
    private BigDecimal price;
    private LocalDateTime purchase_date;
    private LocalDateTime expiry_date;
    private boolean isReturn;

    @NotEmpty(message = "barcode   cannot be empty")
    private String barcode; /// qrcode for
    private TicketStatus status;

}
