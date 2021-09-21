package one.digitalinnovation.meetingroom.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "meetingroom")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name", nullable = false, unique = true)
    private long name;

    @Column(name = "date", nullable = false)
    private long date;

    @Column(name = "startHour", nullable = false)
    private long startHour;

    @Column(name = "endHour", nullable = false)
    private long endHour;

}
