package org.example.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    public UserDto create(UserDto userDto) {
        return userService.create(userDto);
    }

    public UserDto findById(Long userId) {
        return userService.findById(userId);
    }

    public List<UserDto> findAll() {
        return userService.findAll();
    }

    public UserDto updateById(Long userId, UserDto userDto) {
        return userService.updateById(userId, userDto);
    }

    public User deleteById(Long userId) {
        return userService.deleteById(userId);
    }
}
