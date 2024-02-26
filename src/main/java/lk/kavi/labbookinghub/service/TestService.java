package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.TestDto;
import lk.kavi.labbookinghub.entity.Doctors;
import lk.kavi.labbookinghub.entity.Test;
import lk.kavi.labbookinghub.entity.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestService {

    TestDto addNewTest(Test test);

    List<TestDto> fetchAll();

    List<TestDto> fetchAvailableTests(Boolean available);

    List<TestDto> fetchTestsFromTechnicians(Integer tech_id);

    TestDto updateTestDetails(TestDto testDto,
                             Integer testId);

    void removeTestDetails(Integer testId);
}
