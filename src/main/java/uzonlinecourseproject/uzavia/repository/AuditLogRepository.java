package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.AuditLog;

public interface AuditLogRepository  extends JpaRepository<AuditLog, Integer> {
}
