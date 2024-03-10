package lk.kavi.labbookinghub.repo;

import lk.kavi.labbookinghub.entity.Technicians;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechniciansRepository extends JpaRepository<Technicians,Integer> {
}
