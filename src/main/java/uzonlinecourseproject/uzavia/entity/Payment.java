package uzonlinecourseproject.uzavia.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uzonlinecourseproject.uzavia.enums.Payment_Method;
import uzonlinecourseproject.uzavia.enums.Payment_Status;

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

    private double amount;
    private Payment_Method payment_method;
    private Payment_Status status;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime payment_time;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "ticket_id")
    private Integer ticketId;
}