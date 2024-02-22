package lk.kavi.labbookinghub.entity;

import jakarta.persistence.*;

@Entity
public class Technicians {
    @Id
    private Integer tech_id;

    private String tech_name;

    private String tech_email;

    private String tech_specialization;

    private boolean availability;

    public Integer getTech_id() {
        return tech_id;
    }

    public void setTech_id(Integer tech_id) {
        this.tech_id = tech_id;
    }

    public String getTech_name() {
        return tech_name;
    }

    public void setTech_name(String tech_name) {
        this.tech_name = tech_name;
    }

    public String getTech_email() {
        return tech_email;
    }

    public void setTech_email(String tech_email) {
        this.tech_email = tech_email;
    }

    public String getTech_specialization() {
        return tech_specialization;
    }

    public void setTech_specialization(String tech_specialization) {
        this.tech_specialization = tech_specialization;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
