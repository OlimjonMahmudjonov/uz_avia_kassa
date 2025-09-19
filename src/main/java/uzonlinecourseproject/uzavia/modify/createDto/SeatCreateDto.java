package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.NotEmpty;
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

    @NotEmpty(message = "seta Number    cannot be empty")

    private String seat_number;

    private SeatStatus status;
    private boolean isAvailable;
}
