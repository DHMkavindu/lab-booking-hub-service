package lk.kavi.labbookinghub.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Doctors")
public class Doctors {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String doctor_name;

	private String doctor_email;

	private String doctor_specialization;

	private boolean availability;

	@OneToMany(mappedBy="doctors")
	private Set<DoctorAppointment> doctorAppointments;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getDoctor_email() {
		return doctor_email;
	}

	public void setDoctor_email(String doctor_email) {
		this.doctor_email = doctor_email;
	}

	public String getDoctor_specialization() {
		return doctor_specialization;
	}

	public void setDoctor_specialization(String doctor_specialization) {
		this.doctor_specialization = doctor_specialization;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public Set<DoctorAppointment> getDoctorAppointments() {
		return doctorAppointments;
	}

	public void setDoctorAppointments(Set<DoctorAppointment> doctorAppointments) {
		this.doctorAppointments = doctorAppointments;
	}
}
