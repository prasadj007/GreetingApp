package com.bridgelabz.GreetingApp.repository;

import com.bridgelabz.GreetingApp.entity.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long>{

}
