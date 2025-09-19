package uzonlinecourseproject.uzavia.modify.UpdateDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionUpdateDto {
    private Integer id;

    private String promocode;

    private LocalDateTime start_at;

    private LocalDateTime end_at;

    private float discount;
    private boolean is_active;

}
