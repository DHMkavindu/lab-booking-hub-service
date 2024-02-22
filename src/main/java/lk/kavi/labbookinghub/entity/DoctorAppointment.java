package lk.kavi.labbookinghub.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class DoctorAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private Date appointment_date;

    private Date create_date;

    private Boolean status;

    @ManyToOne
    @JoinColumn(name="doctor_id", nullable=false)
    private Doctors doctors;

    @ManyToOne
    @JoinColumn(name="patient_id", nullable=false)
    private Patient patient;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(Date appointment_date) {
        this.appointment_date = appointment_date;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Doctors getDoctors() {
        return doctors;
    }

    public void setDoctors(Doctors doctors) {
        this.doctors = doctors;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
