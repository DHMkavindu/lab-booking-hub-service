package lk.kavi.labbookinghub.repo;

import lk.kavi.labbookinghub.entity.DoctorAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Integer> {
}
