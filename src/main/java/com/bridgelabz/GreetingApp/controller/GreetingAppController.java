package com.bridgelabz.GreetingApp.controller;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingAppController {
    @Autowired
    private GreetingService greetingService;

    @GetMapping(value={"","/"})
    public Greeting greeting(@RequestParam(value="firstName",defaultValue = "Hello")String firstname,
                             @RequestParam(value = "lastName",defaultValue = "world") String lastname){
        User user=new User();
        user.setFirstname(firstname);
        user.setLastname(lastname);
        System.out.println(user);
        return greetingService.addGreeting(user);
    }
    @PutMapping("/editGreting")
    public Greeting editGreetingName(@RequestParam Long id,@RequestParam String firstname,@RequestParam String lastname){
        return greetingService.editGreeting(id,firstname,lastname);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteGreeting(@PathVariable Long id){
        return greetingService.deleteGreeting(id);
    }

}
