package lk.kavi.labbookinghub.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Technicians {
    @Id
    private Integer tech_id;

    private String tech_name;

    private String tech_email;

    private String tech_specialization;

    private boolean availability;
}
