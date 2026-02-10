package com.backend.Backend.controller;

import com.backend.Backend.dto.UserDTO;
import com.backend.Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getusers")
    public List<UserDTO> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/createuser")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @PutMapping("/updateuser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }
}
