package uzonlinecourseproject.uzavia.modify.UpdateDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.SeatStatus;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SeatCreateDto {

    private Integer id;
    private String seat_number;
    private SeatStatus status;
    private boolean isAvailable;
}
