package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
