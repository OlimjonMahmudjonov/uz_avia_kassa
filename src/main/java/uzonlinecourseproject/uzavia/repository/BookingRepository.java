package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Booking;

public interface BookingRepository  extends JpaRepository<Booking, Integer> {
}
