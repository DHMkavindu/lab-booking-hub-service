package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.DoctorDto;
import lk.kavi.labbookinghub.dto.PatientDto;
import lk.kavi.labbookinghub.entity.Patient;

import java.util.List;

public interface PatientService {

    PatientDto patientRegistration(Patient patient);

    List<PatientDto> fetchPatient();

    Patient updatePatient(Patient patient,
                             Integer patientId);

    void deletePatient(Integer patientId);
}
