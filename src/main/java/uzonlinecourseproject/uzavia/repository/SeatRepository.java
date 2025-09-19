package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Seat;

public interface SeatRepository  extends JpaRepository<Seat, Integer> {
}
