package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.entity.Doctors;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DoctorService {

    Doctors doctorRegistration(Doctors doctors);

    List<Doctors> fetchDoctors();

    Doctors updateDepartment(Doctors doctors,
                                Integer doctorId);

    void deleteDoctors(Integer doctorId);

}
