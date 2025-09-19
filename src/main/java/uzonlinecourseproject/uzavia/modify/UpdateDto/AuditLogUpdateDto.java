package uzonlinecourseproject.uzavia.modify.UpdateDto;

import uzonlinecourseproject.uzavia.enums.AuditAction;

import java.time.LocalDateTime;

public class AuditLogUpdateDto {
    private Integer id;
    private AuditAction action;

    private LocalDateTime timestamp;

    private String details;
}
