package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.Sent_Type;

import java.time.LocalDateTime;

public class NotificationUpdateDto {
    private Long id;
    private String message;
    private LocalDateTime send_time;
    private boolean isRead;
    private Sent_Type sent_type ;
}
