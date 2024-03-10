package lk.kavi.labbookinghub.repo;

import lk.kavi.labbookinghub.entity.TechniciansAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechniciansAppointmentRepository extends JpaRepository<TechniciansAppointment,Integer> {
}
