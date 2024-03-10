package lk.kavi.labbookinghub.service;


import lk.kavi.labbookinghub.dto.UserDto;

public interface UserService {

  void saveUser(UserDto userDto);

  UserDto findByUser(String userName);
}
