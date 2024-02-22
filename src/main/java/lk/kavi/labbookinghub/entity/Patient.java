package lk.kavi.labbookinghub.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;
@Entity
@Data
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    private String address;

    private Integer age;

    private String gender;
    @OneToMany(mappedBy="patient")
    private Set<DoctorAppointment> doctorAppointments;
}
