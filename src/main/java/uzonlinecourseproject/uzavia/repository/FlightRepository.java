package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
