package com.leofablos.montrack_db.user.service.Impl;


import com.leofablos.montrack_db.user.Entity.User;
import com.leofablos.montrack_db.user.Repository.UserRepository;
import com.leofablos.montrack_db.user.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public void createdUser(User user){
        userRepository.save(user);
    }

}
