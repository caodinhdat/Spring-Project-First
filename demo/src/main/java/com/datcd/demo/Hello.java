package com.datcd.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@RestController
public class Hello {
        int id;
        String name;
        @RequestMapping("/hello")
        public String hello()
        {
                return "Hello";
        }
}
