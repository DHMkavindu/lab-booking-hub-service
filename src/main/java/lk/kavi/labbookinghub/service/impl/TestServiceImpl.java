package lk.kavi.labbookinghub.service.impl;

import lk.kavi.labbookinghub.dto.TestDto;
import lk.kavi.labbookinghub.entity.Test;
import lk.kavi.labbookinghub.repo.TestRepository;
import lk.kavi.labbookinghub.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestServiceImpl implements TestService {

    @Autowired
    private TestRepository testRepository;

    @Override
    public TestDto addNewTest(Test test) {
        try{
            TestDto testDto = new TestDto();
            Test retsultTest = testRepository.save(test);
            testDto.setTest_name(retsultTest.getTest_name());
            testDto.setTest_category(retsultTest.getTest_category());
            testDto.setAvaliable(retsultTest.getAvaliable());
//            testDto.setTechniciansDTO(retsultTest.getTechnicians());

            return null;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TestDto> fetchAll() {
        try{
            List<TestDto> testDtoList =new ArrayList<>();
            List<Test> result = testRepository.findAll();
            if(!result.isEmpty()){
                for(Test test: result){
                    TestDto testDto = new TestDto();
                    testDto.setId(test.getId());
                    testDto.setTest_category(test.getTest_category());
                    testDto.setTest_name(test.getTest_name());
                    testDto.setAvaliable(test.getAvaliable());

                    testDtoList.add(testDto);
                }
                return testDtoList;
            }
            return null;
        }catch (Exception ex){
            return null;
        }
    }

    @Override
    public List<TestDto> fetchAvailableTests(Boolean available) {
        try{
            List<TestDto> testDtoList =new ArrayList<>();
            List<Test> result = testRepository.findAllByAvaliableOrderByIdAsc(true);
            if(!result.isEmpty()){
              for(Test test: result){
                  TestDto testDto = new TestDto();
                  testDto.setTest_category(test.getTest_category());
                  testDto.setTest_name(test.getTest_name());
                  testDto.setId(test.getId());

                  testDtoList.add(testDto);
              }
              return testDtoList;
            }
            return null;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public List<TestDto> fetchTestsFromTechnicians(Integer tech_id) {
        try{
            List<TestDto> testDtoList =new ArrayList<>();
            List<Test> result = testRepository.findAll();
            if(!result.isEmpty()){
                for(Test test: result){
                    TestDto testDto = new TestDto();
                    if(Objects.equals(test.getTechnicians().getTech_id(), tech_id)){
                        testDto.setId(test.getId());
                        testDto.setTest_category(test.getTest_category());
                        testDto.setTest_name(test.getTest_name());

                        testDtoList.add(testDto);
                    }
                }
                return testDtoList;
            }
            return null;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }


    @Override
    public TestDto updateTestDetails(TestDto testDto, Integer testId) {
        try{
            return null;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    @Override
    public void removeTestDetails(Integer testId) {
        testRepository.deleteById(testId);
    }
}
