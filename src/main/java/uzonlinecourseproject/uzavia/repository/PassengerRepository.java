package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Passenger;

public interface PassengerRepository  extends JpaRepository<Passenger, Integer> {
}
