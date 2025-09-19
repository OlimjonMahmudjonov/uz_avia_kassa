package uzonlinecourseproject.uzavia.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import uzonlinecourseproject.uzavia.enums.Nationality;
import uzonlinecourseproject.uzavia.enums.PassportType;
import uzonlinecourseproject.uzavia.enums.SEX;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "passenger")
@Entity
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String passwordNumber;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime birthday;

    @Enumerated(EnumType.STRING)
    private SEX sex ;
    @Enumerated(EnumType.STRING)
    private Nationality nationality;
    @Enumerated(EnumType.STRING)
    private PassportType type;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime passwordDuration ;


    ///  relation for entity
    private Integer ticked_id;
    private Integer user_id;


    ///  event  for
    @CreationTimestamp
    private LocalDateTime created_at;
    @UpdateTimestamp
    private LocalDateTime updated_at;

}
