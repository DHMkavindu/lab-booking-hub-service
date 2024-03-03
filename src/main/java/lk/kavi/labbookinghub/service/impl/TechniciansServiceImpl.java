package lk.kavi.labbookinghub.service.impl;

import lk.kavi.labbookinghub.dto.DoctorDto;
import lk.kavi.labbookinghub.dto.TechniciansDTO;
import lk.kavi.labbookinghub.entity.Doctors;
import lk.kavi.labbookinghub.entity.Technicians;
import lk.kavi.labbookinghub.repo.TechniciansRepository;
import lk.kavi.labbookinghub.service.TechniciansService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TechniciansServiceImpl implements TechniciansService {

    @Autowired
    TechniciansRepository techniciansRepository;

    @Override
    public TechniciansDTO techniciansRegistration(Technicians technicians) {
        try{
            TechniciansDTO techniciansDTO = new TechniciansDTO();
            Technicians result = techniciansRepository.save(technicians);
            techniciansDTO.setTech_id(result.getTech_id());
            techniciansDTO.setTech_name(result.getTech_name());
            techniciansDTO.setTech_email(result.getTech_email());
            techniciansDTO.setTech_specialization(result.getTech_specialization());
            techniciansDTO.setAvailability(result.isAvailability());
            techniciansDTO.setMax_appointment_count(result.getMax_appointment_count());
            techniciansDTO.setNIC(result.getNIC());

            return techniciansDTO;

        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TechniciansDTO> fetchTechnicians() {
        try{
            List<TechniciansDTO> techniciansDTOList =new ArrayList<>();
            List<Technicians> result = techniciansRepository.findAll();
            if(!result.isEmpty()){
                for(Technicians technicians: result){
                    TechniciansDTO techniciansDTO = new TechniciansDTO();
                    techniciansDTO.setTech_id(technicians.getTech_id());
                    techniciansDTO.setNIC(technicians.getNIC());
                    techniciansDTO.setAvailability(technicians.isAvailability());
                    techniciansDTO.setTech_email(technicians.getTech_email());
                    techniciansDTO.setTech_specialization(technicians.getTech_specialization());
                    techniciansDTO.setTech_name(technicians.getTech_name());
                    techniciansDTO.setMax_appointment_count(technicians.getMax_appointment_count());

                    techniciansDTOList.add(techniciansDTO);
                }
                return techniciansDTOList;
            }
            return null;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public Technicians updateTechnicians(Technicians technicians, Integer techId) {
        return null;
    }

    @Override
    public void deleteTechnicians(Integer techId) {
        try{
            techniciansRepository.deleteById(techId);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
