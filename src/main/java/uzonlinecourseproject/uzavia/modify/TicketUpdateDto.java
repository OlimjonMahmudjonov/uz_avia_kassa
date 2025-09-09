package uzonlinecourseproject.uzavia.modify;

import lombok.*;
import uzonlinecourseproject.uzavia.enums.Book_Status;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TicketUpdateDto {

    private String seat_number;
    private Book_Status status;
    private double price;


}