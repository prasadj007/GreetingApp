package com.bridgelabz.GreetingApp.service;

import com.bridgelabz.GreetingApp.entity.Greeting;
import com.bridgelabz.GreetingApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class GreetinServiceImpl implements GreetingService {
        private static final String template="Hello,%s";
        private long AtomicLong counter= new AtomicLong();

        @Autowired
        private GreetingRepository greetingRepository;

        @Override
        public Greeting addGreeting(User user){
            String message =String.format(template,(user.toString().isEmpty())? "Hello world ": user.toString());
            return greetingRepository.save(new Greeting(counter.incrementAndGet(),message));
        }

        @Override
        public Greeting getGreeting(long id){
            return greetingRepository.findById(id).get();
        }

        @Override
        public Greeting editGreeting(Long id,String firstname,String lastname){
            Greeting existingGreeting=greetingRepository.findById(id).orElse(null);
            if(existingGreeting != null){
                User user =new User();
                user.setFirstname(firstname);
                user.getLastname(lastname);
                String greetingWish =String.format(template,(user.toString().isEmpty()) ? "Hello world " : user.toString());
                return greetingRepository.save(new Greeting(id,greetingWish));
            }
            return null;
        }
        @Override
        public String deleteGreeting(Long id){
            greetingRepository.deleteById(id);
            return "Greeting is deleted : "+id;
        }
    }
}
