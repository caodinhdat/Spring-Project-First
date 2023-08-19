package com.datcd.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.datcd.demo.Dto.UserDto;
import com.datcd.demo.Dto.UserMapper;
import com.datcd.demo.Entity.User;

@Component
public class UserServiceIml implements IUserService{
        public static ArrayList<User> users = new ArrayList<>();
        static
        {
                users.add(new User(1,"Cao Dat", "caodat2210@gmail.com","0917112517","Ha Noi","caodinhdat"));
                users.add(new User(2,"Nha Hoang", "nhahoang1909@gmail.com","091837371","Ha Noi","trannhahoang"));
                users.add(new User(3,"Tien Cuong", "tiencuong0101@gmail.com","0282172772","Ha Noi","cuongbeo"));
                users.add(new User(4,"Ha Phuong", "haphuong1111@gmail.com","0917291817","Ha Noi","haphuong"));
        }
        @Override
        public List<UserDto> getListUser() {
                List<UserDto> userDto = new ArrayList<>();
                for(int i=0;i<users.size();i++)
                {
                        userDto.add(UserMapper.convertToUserDto(users.get(i)));
                }
                return userDto;
        }
        @Override
        public List<UserDto> updateUser(int id, User user) {
                users.get(id-1).setId(user.getId());
                users.get(id-1).setName(user.getName());
                users.get(id-1).setEmail(user.getEmail());
                users.get(id-1).setPhone(user.getPhone());
                users.get(id-1).setAddress(user.getAddress());
                users.get(id-1).setPassword(user.getPassword());

                List<UserDto> userDtos = getListUser();
                return userDtos;
        }
        @Override
        public UserDto getUserbyID(int id) {
                return UserMapper.convertToUserDto(users.get(id-1));
        }
        @Override
        public List<UserDto> deleteUser(int id) {
                List<UserDto> userDtos = getListUser();
                userDtos.remove(id-1);
                return userDtos;
        }
        @Override
        public UserDto createUser(User user) {
                User newUser = new User(user.getId(), user.getName(), user.getEmail(), user.getPhone(), user.getAddress(), user.getPassword());
                UserDto newUserDto = UserMapper.convertToUserDto(newUser);
                users.add(newUser);
                return newUserDto;
        }
}
