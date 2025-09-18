package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.entity.Ticket;
import uzonlinecourseproject.uzavia.enums.Book_Status;

import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto {
    private Long id;
    private LocalDateTime bookingDate;
    private Book_Status bookingStatus;
    private List<Ticket> tickets;
    private Integer payment_id;
    private Integer user_id;
}
