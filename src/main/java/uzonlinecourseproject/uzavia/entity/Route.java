package uzonlinecourseproject.uzavia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.AirportCode;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "route")
@Entity
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private double distance;
    private Integer departureAirport;
    private Integer arrivalAirport;
    private AirportCode routeCode;

    /// relation
    private Integer airport_id;
    private Integer flight_id;
    private Integer fareRule_id;

    ///  event for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;
}
