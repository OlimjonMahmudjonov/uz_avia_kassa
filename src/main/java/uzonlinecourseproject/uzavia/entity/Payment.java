package uzonlinecourseproject.uzavia.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.CurrencyCourse;
import uzonlinecourseproject.uzavia.enums.Payment_Method;
import uzonlinecourseproject.uzavia.enums.Payment_Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "payment")
@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal amount;
    private BigDecimal taxAmound;
    private BigDecimal totalAmount;

    @Enumerated(EnumType.STRING)
    private Payment_Method payment_method;

    @Enumerated(EnumType.STRING)
    private Payment_Status payment_status;

    @Enumerated(EnumType.STRING)
    private CurrencyCourse currency_course;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate payment_date;


    private String transaction_id;
    private BigDecimal refund_amount;

    /// relation for  entity
    private Integer user_id;
    private Integer ticket_id;
    private Integer booking_id;

    ///   event for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;
}