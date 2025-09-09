package uzonlinecourseproject.uzavia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uzonlinecourseproject.uzavia.entity.Airport;
import uzonlinecourseproject.uzavia.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {


}
