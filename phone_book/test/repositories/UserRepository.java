package repositories;

import data.models.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserRepository {

    List<User> users = new ArrayList<>();
    public User saveNewUser(User user) {
        users.add(user);
        return user;
    }

    public List<User> getUsers(){
        return users;
    }
}
