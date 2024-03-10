package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.DoctorDto;
import lk.kavi.labbookinghub.entity.Doctors;

import java.util.List;

public interface DoctorService {

    DoctorDto doctorRegistration(Doctors doctors);

    List<DoctorDto> fetchDoctors();

    Doctors updateDepartment(Doctors doctors,
                                Integer doctorId);

    void deleteDoctors(Integer doctorId);

}
