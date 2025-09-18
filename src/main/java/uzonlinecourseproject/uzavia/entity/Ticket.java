package uzonlinecourseproject.uzavia.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.TicketStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ticket")
@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ticket_number;
    private BigDecimal price;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime purchase_date;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime expiry_date;
    private boolean isReturn;
    private String barcode; /// qrcode for

    @Enumerated(EnumType.STRING)
    private TicketStatus status;

    ///  relations for   entities
    private Integer booking_id;
    private Integer flight_id;
    private Integer seat_id;
    private Integer payment_id;
    private Integer passenger_id;
    private Integer luggage_id;


    @Column(name = "departure_airport_id")
    private Integer departureAirportId;

    ///   event for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;


}