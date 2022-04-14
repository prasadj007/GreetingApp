package com.bridgelabz.GreetingApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GREETINGS")
@Data
@ToString
@AllArgsConstructor
public class Greeting{
    @Id
    private long id;
    private String message;

    public Greeting(){
        id=0;
        message="";
    }
}