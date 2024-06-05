package com.ange1jun.rest.webservices.restfulwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static Integer userCounter = 0;

    static {
        users.add(new User(++userCounter, "Jisu", LocalDate.now().minusYears(30)));
        users.add(new User(++userCounter, "Lisa", LocalDate.now().minusYears(20)));
        users.add(new User(++userCounter, "Solji", LocalDate.now().minusYears(18)));
    }

    public List<User> findAll(){
        return users;
    }

    public User save(User user){
        user.setId(++userCounter);
        users.add(user);
        return user;
    }

    public User findOne(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }


}
