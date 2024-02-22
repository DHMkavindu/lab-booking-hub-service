package lk.kavi.labbookinghub.entity;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "Patient")
public class Patient {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    @OneToMany(mappedBy="patient")
    private Set<DoctorAppointment> doctorAppointments;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Set<DoctorAppointment> getDoctorAppointments() {
        return doctorAppointments;
    }

    public void setDoctorAppointments(Set<DoctorAppointment> doctorAppointments) {
        this.doctorAppointments = doctorAppointments;
    }
}
