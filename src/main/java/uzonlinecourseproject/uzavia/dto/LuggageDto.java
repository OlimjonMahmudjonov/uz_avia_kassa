package uzonlinecourseproject.uzavia.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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

public class LuggageDto {
    private Long id;
    private  float weight;
    private BigDecimal extra_weight;
    private Luggage_ luggage;

}
