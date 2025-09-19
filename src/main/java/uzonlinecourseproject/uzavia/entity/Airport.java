package uzonlinecourseproject.uzavia.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.AirportCode;
import uzonlinecourseproject.uzavia.enums.AirportName;
import uzonlinecourseproject.uzavia.enums.Nationality;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "airport")
@Entity
public class Airport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(EnumType.STRING)
    private AirportName airport_name;
    private String city;
    @Enumerated(EnumType.STRING)
    private Nationality country;
    private boolean isGable_Airport;
    private AirportCode whereTo;
    private AirportCode ToWhere;

    private ZonedDateTime timeZone;

    ///  event  for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

    ///  relation
    private  Integer flight_id; // realition   for
    private Integer route_id; // yo`nalish uchun
}