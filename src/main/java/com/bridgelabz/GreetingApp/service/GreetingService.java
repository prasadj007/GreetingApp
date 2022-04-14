package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.entity.User;


public interface GreetingService {

    Greeting addGreeting(User user);
   // Greeting getGreeting(long  id);
    Greeting editGreeting(Long id, String firstName, String lastName);
    String deleteGreeting(Long id);

}