package lk.kavi.labbookinghub.service;

import lk.kavi.labbookinghub.dto.AuthenticationResponse;
import lk.kavi.labbookinghub.dto.LoginDto;
import lk.kavi.labbookinghub.dto.RegisterRequestDto;

public interface AuthenticationService {

  AuthenticationResponse authenticate(LoginDto loginDto);
  AuthenticationResponse singUp(RegisterRequestDto registerRequestDto);
}
