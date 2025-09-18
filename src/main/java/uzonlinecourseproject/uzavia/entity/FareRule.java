package uzonlinecourseproject.uzavia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.SeatStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "fareRule")
@Entity
public class FareRule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private SeatStatus status;
    private BigDecimal basePrice;
    private BigDecimal taxPercentage;
    private BigDecimal cancellationPrice;
    private  boolean isRefundable;

    ///  relation
    private  Integer flight_id ;
    private Integer route_id ;//TODO fix
    private Integer ticket_id ;

    ///  event for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;




}
