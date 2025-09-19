package uzonlinecourseproject.uzavia.modify.createDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Book_Status;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookingCreateDto {

    private LocalDateTime bookingDate;
    private Book_Status bookingStatus;
}
