package dev.muldev.testnative.users;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(UserController.USER_URL)
@AllArgsConstructor
public class UserController {

    public static final String USER_URL = "/users";

    private final UserService userService;

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user){
        return userService.create(user);
    }
}
