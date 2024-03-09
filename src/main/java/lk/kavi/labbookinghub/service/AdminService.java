package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.AdminDTO;
import lk.kavi.labbookinghub.dto.DoctorDto;
import lk.kavi.labbookinghub.entity.Admin;
import lk.kavi.labbookinghub.entity.Doctors;

import java.util.List;

public interface AdminService {

    AdminDTO adminRegistration(Admin admin);

    List<AdminDTO> fetchAdmins();

    Admin updateAdmin(Admin admin,
                             Integer adminId);

    void deleteAdmin(Integer adminId);
}
