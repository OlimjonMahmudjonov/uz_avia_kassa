package uzonlinecourseproject.uzavia.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDto {
    private Long id;
    private String promocode;
    private LocalDateTime start_at;
    private LocalDateTime end_at;
    private float discount;
    private boolean is_active;

}
