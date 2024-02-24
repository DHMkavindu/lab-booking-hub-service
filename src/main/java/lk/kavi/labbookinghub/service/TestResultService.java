package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.entity.Test;
import lk.kavi.labbookinghub.entity.TestResult;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TestResultService {

    TestResult addNewTestResult(TestResult testResult);

    List<TestResult> fetchAll();

    TestResult updateTestResultDetails(TestResult testResult,
                           Integer testId);

    void removeTestDetails(Integer testId);
}
