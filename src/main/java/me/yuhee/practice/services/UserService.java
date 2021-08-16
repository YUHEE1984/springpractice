package me.yuhee.practice.services;

import me.yuhee.practice.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public User getUserDetail(long userId) {
        return new User();
    }

    public List<User> listUsers(){
        return new ArrayList<>();
    }
}
