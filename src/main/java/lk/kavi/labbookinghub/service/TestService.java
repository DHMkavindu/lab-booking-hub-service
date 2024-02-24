package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.TestDto;
import lk.kavi.labbookinghub.entity.Doctors;
import lk.kavi.labbookinghub.entity.Test;
import lk.kavi.labbookinghub.entity.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    Test addNewTest(Test test);

    List<TestDto> fetchAll();

    List<TestDto> fetchAvailableTests(Boolean available);

    Test updateTestDetails(Test test,
                             Integer testId);

    void removeTestDetails(Integer testId);
}
