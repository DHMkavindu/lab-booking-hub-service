package lk.kavi.labbookinghub.dto;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lk.kavi.labbookinghub.entity.Doctors;
import lk.kavi.labbookinghub.entity.Patient;
import lk.kavi.labbookinghub.entity.Technicians;
import lombok.Data;

@Data
public class TestResultDTO {

    private Integer id;

    private String result_url;

    private String doctorName;

    private String patient_name;

    private String patient_address;

    private String patient_email;

    private Integer technicians_id;

    private String technicians_name;
}
