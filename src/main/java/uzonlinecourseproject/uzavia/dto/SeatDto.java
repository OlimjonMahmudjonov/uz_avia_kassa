package uzonlinecourseproject.uzavia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.SeatStatus;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class SeatDto {
    private Integer id;
    private  String seat_number;
    private SeatStatus status;
    private boolean isAvailable;
}
