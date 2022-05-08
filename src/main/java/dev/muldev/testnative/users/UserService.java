package dev.muldev.testnative.users;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User create(User user){
        System.out.println("persisto");
        return user;
    }
}
