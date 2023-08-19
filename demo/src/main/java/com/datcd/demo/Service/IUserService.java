package com.datcd.demo.Service;

import java.util.List;

import com.datcd.demo.Dto.UserDto;
import com.datcd.demo.Entity.User;
import org.springframework.stereotype.Component;

@Component
public interface IUserService {
        public List<UserDto> getListUser();
        public List<UserDto> updateUser(int id, User user);
        public UserDto getUserbyID(int id);
        public List<UserDto> deleteUser(int id);
        public UserDto createUser(User user);
}
