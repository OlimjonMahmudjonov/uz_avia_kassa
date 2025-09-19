package uzonlinecourseproject.uzavia.modify.createDto;

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
public class PromotionCreateDto {

    @NotEmpty(message = "can not be promo code ")
    private String promocode;

    private LocalDateTime start_at;

    private LocalDateTime end_at;

    @Positive(message = "is not discount positive ")
    private float discount;
    private boolean is_active;

}
