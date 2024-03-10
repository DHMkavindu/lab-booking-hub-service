package lk.kavi.labbookinghub.dto;

import lk.kavi.labbookinghub.entity.DoctorAppointment;
import lombok.Data;

import java.util.Set;
@Data
public class PatientDto {

    private Integer id;

    private String name;

    private String email;

    private String address;

    private Integer age;

    private String gender;

    private Set<DoctorAppointment> doctorAppointments;
}
