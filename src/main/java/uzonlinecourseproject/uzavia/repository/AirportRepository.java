package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uzonlinecourseproject.uzavia.entity.Airport;
import uzonlinecourseproject.uzavia.entity.Flight;
@Repository
public interface AirportRepository extends JpaRepository<Airport, Integer> {

}
