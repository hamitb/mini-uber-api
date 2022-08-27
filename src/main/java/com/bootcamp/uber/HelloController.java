package com.bootcamp.uber;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping("/hello/{name}/{age}")
    public String sayHello(@PathVariable String name, @PathVariable int age) {
        return "Hello " + name + " ! " + "Your age is " + age ;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!" ;
    }


    @PostMapping("/new-user")
    public String createUser(@RequestBody User user) {
        return "Hello " + user.getName() + " ! " + "Your age is " + user.getAge();
    }
}
