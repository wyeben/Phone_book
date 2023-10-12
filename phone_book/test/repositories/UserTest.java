package repositories;

import data.models.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {


    @Test
    public void saveNewUserTest(){
        UserRepository userRepository = new UserRepository();
        User user = new User();
        User savedUser = userRepository.saveNewUser(user);
        assertNotNull(savedUser);
        assertTrue(userRepository.getUsers().size() > 0);
        assertEquals(userRepository.getUsers().size(), 1);
    }

    @Test void testThatEachUserSavedInTheDbHasAnId(){
        UserRepository userRepository = new UserRepository();
        User user = new User();
        User savedUser = userRepository.saveNewUser(user);
        assertNotNull(savedUser.getId());
    }
}
