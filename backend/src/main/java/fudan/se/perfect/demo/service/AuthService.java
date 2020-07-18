package fudan.se.perfect.demo.service;


import fudan.se.perfect.demo.Repository.UserRepository;
import fudan.se.perfect.demo.domain.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@Service
public class AuthService {
    private static final String SUCCESS = "login successfully";
    private static final String EMAIL_REGEX = "^\\s*?(.+)@(.+?)\\s*$";
    public static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    UserRepository userRepository;

    public String checkLogin(String username, String password) {

        User user = userRepository.findByUsername(username);
        if (user == null ||  "".equals(user.getUsername())) {
            return "user does not exist";
        }
        if (user.getPassword().equals(password)) {
            return SUCCESS;
        }
        return "wrong password";
    }

    public String checkRegister(String username, String email, String password, String repassword){
        User user = userRepository.findByUsername(username);
        if (user != null &&  !"".equals(user.getUsername())) {
            return "user has existed";
        }
        if (!EMAIL_PATTERN.matcher(email).matches()){
            return "invalid email";
        }
        if (!password.equals(repassword)){
            return "password differences";
        }
        User s = new User(username,email,password);
        userRepository.save(s);
        return "register successfully";

    }
}
