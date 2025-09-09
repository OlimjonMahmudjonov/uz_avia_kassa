package uzonlinecourseproject.uzavia.dto;

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

public class TicketDto {

    private Integer id;

    private String seat_number;
    private Book_Status status;

    private LocalDateTime purchase_time;

    private double price;

    private Integer userId;

    private Integer flightId;
}