package com.datcd.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datcd.demo.Dto.UserDto;
import com.datcd.demo.Entity.User;
import com.datcd.demo.Service.UserServiceIml;

@RestController
public class UserController {

        @Autowired
        public UserServiceIml userService;

        @GetMapping("/users")
        public ResponseEntity<?> getListUser()
        {
                List<UserDto> users = userService.getListUser();
                return ResponseEntity.ok(users);
        }

        @PutMapping("/users/{id}")
        public ResponseEntity<?> updateUser(@PathVariable int id, @RequestBody User user)
        {
                List<UserDto> userUpdate = userService.updateUser(id,user);
                return ResponseEntity.ok(userUpdate);
        }

        @PostMapping("/users")
        public ResponseEntity<?> createUser(@RequestBody User newuser)
        {
                UserDto newUserDto = userService.createUser(newuser);
                return ResponseEntity.ok(newUserDto);
        }

        @GetMapping("/users/{id}")
        public ResponseEntity<?> getUserbyID(@PathVariable int id)
        {
                UserDto userGetByid = userService.getUserbyID(id);
                return ResponseEntity.ok(userGetByid);
        }

        @DeleteMapping("/users/{id}")
        public ResponseEntity<?> deleteUser(@PathVariable int id)
        {
                List<UserDto> userDtos = userService.deleteUser(id);
                return ResponseEntity.ok(userDtos);
        }
}
