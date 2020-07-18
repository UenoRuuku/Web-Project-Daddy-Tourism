package fudan.se.perfect.demo.controller;


import fudan.se.perfect.demo.controller.request.LoginRequest;
import fudan.se.perfect.demo.controller.request.RegisterRequest;
import fudan.se.perfect.demo.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/HelloWorld")
    public String HelloWorld() {
        return "Hello World";
    }

    @PostMapping(value = "/Login")
    public ResponseEntity<ResponseObject<String>> login(LoginRequest loginRequest) {
        return ResponseEntity.ok().
                body(new ResponseObject<>(200,
                        authService.checkLogin(loginRequest.getUsername(), loginRequest.getPassword())
                        , "not required part"));
    }

    @PostMapping(value = "/Register")
    public ResponseEntity<ResponseObject<String>> register(RegisterRequest registerRequest) {
        return ResponseEntity.ok().
                body(
                new ResponseObject<>(200,
                        authService.checkRegister(registerRequest.getUsername(), registerRequest.getEmail(), registerRequest.getPassword(), registerRequest.getRepassword()),
                        "not required part"));
    }

}
