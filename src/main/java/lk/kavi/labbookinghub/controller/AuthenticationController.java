package lk.kavi.labbookinghub.controller;


import lk.kavi.labbookinghub.dto.AuthenticationResponse;
import lk.kavi.labbookinghub.dto.LoginDto;
import lk.kavi.labbookinghub.dto.RegisterRequestDto;
import lk.kavi.labbookinghub.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/authentication")
@CrossOrigin
public class AuthenticationController {

  @Autowired
  private AuthenticationService authenticationService;

  @PostMapping("/singIn")
  public ResponseEntity<?> signIn (@RequestBody LoginDto loginDto){
    AuthenticationResponse authenticate = authenticationService.authenticate(loginDto);
    return ResponseEntity.ok(authenticate);
  }

  @PostMapping("/singUp")
  public ResponseEntity<?> signUp (@RequestBody RegisterRequestDto registerRequestDto){

    AuthenticationResponse authenticate = authenticationService.singUp(registerRequestDto);

    return ResponseEntity.ok(authenticate);
  }

}
