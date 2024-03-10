package lk.kavi.labbookinghub.repo;

import lk.kavi.labbookinghub.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestResultRepository extends JpaRepository<TestResult,Integer> {
}
