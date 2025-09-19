package uzonlinecourseproject.uzavia.modify.createDto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Luggage_;

import java.math.BigDecimal;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LuggageCreateDto {


    @Min(value = 1, message = " luggage is min weigh ")
    @Max(value = 23, message = " luggage is max weigh ")
    private float weight;
    @PositiveOrZero(message = " extra_weight is not positive ")
    private BigDecimal extra_weight;
    private Luggage_ luggage;

}
