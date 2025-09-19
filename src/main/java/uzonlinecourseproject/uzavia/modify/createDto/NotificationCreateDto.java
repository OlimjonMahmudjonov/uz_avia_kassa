package uzonlinecourseproject.uzavia.modify.createDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Sent_Type;

import java.time.LocalDateTime;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationCreateDto {

   // @NotEmpty(message = "is not message ")
    private String message;
    private LocalDateTime send_time;
    private boolean isRead;
    private Sent_Type sent_type ;
}
