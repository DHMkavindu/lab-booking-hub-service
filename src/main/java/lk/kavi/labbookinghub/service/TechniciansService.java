package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.DoctorDto;
import lk.kavi.labbookinghub.dto.TechniciansDTO;
import lk.kavi.labbookinghub.entity.Doctors;
import lk.kavi.labbookinghub.entity.Technicians;

import java.util.List;

public interface TechniciansService {

    TechniciansDTO techniciansRegistration(Technicians technicians);

    List<TechniciansDTO> fetchTechnicians();

    Technicians updateTechnicians(Technicians technicians,
                             Integer techId);

    void deleteTechnicians(Integer techId);
}
