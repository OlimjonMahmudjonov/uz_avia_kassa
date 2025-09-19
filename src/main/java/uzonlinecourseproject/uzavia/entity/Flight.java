package uzonlinecourseproject.uzavia.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.AirLineNames;
import uzonlinecourseproject.uzavia.enums.Flight_Status;
import uzonlinecourseproject.uzavia.enums.WeatherCondition;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "flight")
@Entity
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String flightNumber;

    @Column(name = "departure_airport_id")
    private Integer departureAirportId;

    @Column(name = "arrival_airport_id")
    private Integer arrivalAirportId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime departure_time;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime arrival_time;

    private BigDecimal price;


    private int seat_count;
    @Enumerated(EnumType.STRING)
    private Flight_Status status;
    @Enumerated(EnumType.STRING)
    private AirLineNames airline_name;


    @Enumerated(EnumType.STRING)
    private WeatherCondition weather_condition;

    private int delayMinutes;

    ///  event  for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    ///  relations for entities

    private Integer airlineId;
    private Integer aircraft_id;


}