package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uzonlinecourseproject.uzavia.entity.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer> {
}
