package com.datcd.demo.Dto;

import com.datcd.demo.Entity.User;

public class UserMapper {
        public static UserDto convertToUserDto(User user)
        {
                UserDto userDto = new UserDto();
                userDto.setId(user.getId());
                userDto.setName(user.getName());
                userDto.setEmail(user.getEmail());
                userDto.setPhone(user.getPhone());
                userDto.setAddress(user.getAddress());
                
                return userDto;
        }
}
