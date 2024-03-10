package lk.kavi.labbookinghub.service.impl;


import lk.kavi.labbookinghub.dto.UserDto;
import lk.kavi.labbookinghub.entity.User;
import lk.kavi.labbookinghub.repo.UserRepository;
import lk.kavi.labbookinghub.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public void saveUser(UserDto userDto) {

    User user = new User();
    if (userDto.getId() == null){
      user.setPassword(userDto.getPassword());
      user.setUserName(userDto.getUserName());
      user.setUserType(userDto.getUserType());
      user.setUserId(userDto.getUserId());
      userRepository.save(user);
    }else {
      user.setId(userDto.getId());
      user.setUserName(userDto.getUserName());
      user.setUserType(userDto.getUserType());
      user.setUserId(userDto.getUserId());
      userRepository.save(user);
    }
  }

  @Override
  public UserDto findByUser(String userName) {

    UserDto userDto= new UserDto();
    User user = userRepository.findByUserName(userName);
    userDto.setId(user.getId());
    userDto.setUserName(user.getUserName());
    userDto.setUserType(user.getUserType());
    userDto.setUserId(user.getUserId());
    userDto.setPassword(user.getPassword());
    System.out.println("-----");
    System.out.println(userDto);
    return userDto;
  }
}
