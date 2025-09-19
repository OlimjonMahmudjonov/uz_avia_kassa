package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
