package me.yuhee.practice.services;

import me.yuhee.practice.models.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public User getUserDetail(long userId) {
        return new User();
    }
}
