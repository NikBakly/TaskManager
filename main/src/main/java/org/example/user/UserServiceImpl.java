package org.example.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDto create(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto findById(Long userId) {
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return null;
    }

    @Override
    public UserDto updateById(Long userId, UserDto userDto) {
        return null;
    }

    @Override
    public User deleteById(Long userId) {
        return null;
    }
}
