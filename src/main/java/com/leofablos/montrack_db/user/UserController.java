package com.leofablos.montrack_db.user;


import com.leofablos.montrack_db.user.Entity.User;
import com.leofablos.montrack_db.user.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public void createdUser(@RequestBody User user){
        userService.createdUser(user);
    }
}
