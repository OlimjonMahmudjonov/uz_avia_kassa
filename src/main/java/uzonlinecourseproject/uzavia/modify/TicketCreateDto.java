package uzonlinecourseproject.uzavia.modify;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.*;
import uzonlinecourseproject.uzavia.enums.Book_Status;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TicketCreateDto {


    @NotEmpty(message = "can not be empty...")
    private String seat_number;
    @NotEmpty(message = "can not be empty...")
    private Book_Status status;
    @NonNull
    private LocalDateTime purchase_time;

    @Positive(message = " can not be  zero ")
    private double price;


    private Integer userId;


    private Integer flightId;
}