package org.example.user;

import java.util.List;

public interface UserService {
    UserDto create(UserDto userDto);

    UserDto findById(Long userId);

    List<UserDto> findAll();

    UserDto updateById(Long userId, UserDto userDto);

    User deleteById(Long userId);
}
