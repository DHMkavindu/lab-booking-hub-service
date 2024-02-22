package lk.kavi.labbookinghub.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lk.kavi.labbookinghub.entity.Doctors;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors, Integer>{

}
