package lk.kavi.labbookinghub.repo;

import lk.kavi.labbookinghub.entity.TestResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestResultRepository extends JpaRepository<TestResult,Integer> {
}
