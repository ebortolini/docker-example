package user.test.user.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import user.test.user.dto.UserDto;
import user.test.user.model.User;
import user.test.user.repository.UserRepository;

@Controller
@RequestMapping(path="service/api/v1/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public @ResponseBody
    String addNewUser (@RequestBody UserDto userDto) {
        User n = new User();
        n.setName(userDto.getName());
        n.setEmail(userDto.getEmail());
        userRepository.save(n);
        return "Saved";
    }
}
