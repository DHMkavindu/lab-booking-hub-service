package lk.kavi.labbookinghub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String test_name;

    private String test_category;

    private Boolean avaliable;
}
