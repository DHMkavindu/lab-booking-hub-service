package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.TestResultDTO;
import lk.kavi.labbookinghub.entity.Test;
import lk.kavi.labbookinghub.entity.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestResultService {

    TestResultDTO addNewTestResult(TestResult testResult);

    List<TestResultDTO> fetchAll();

    TestResultDTO updateTestResultDetails(TestResult testResult,
                           Integer testId);

    void removeTestDetails(Integer testId);
}
