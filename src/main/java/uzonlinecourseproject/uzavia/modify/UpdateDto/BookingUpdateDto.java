package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.Book_Status;

import java.time.LocalDateTime;

public class BookingUpdateDto {
    private Integer id;
    private LocalDateTime bookingDate;
    private Book_Status bookingStatus;
}
