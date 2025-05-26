package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Disabled // This test wont run when we run this program test
    @Test
    public void testAdd(){
        assertNotNull(userRepository.findByUserName("Ram"));
    }

    @ParameterizedTest
    @CsvSource({
            "1,1,2",
            "2,2,4",
            "3,5,9"
    })
    public void test(int a, int b,int expected){
        assertEquals(expected, a+b);
    }
}
