package com.swapshop.SwapShop.controllers;

import com.swapshop.SwapShop.controllers.UserController;
import com.swapshop.SwapShop.entities.User;
import com.swapshop.SwapShop.repositories.UserRepository;
import com.swapshop.SwapShop.security.pojos.request.SignupRequest;
import com.swapshop.SwapShop.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@SpringBootTest
public class UserControllerTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserController userController;

    @Test
    public void shouldReturnValidUsernameWhenOnUsernameInput() {
        userRepository = mock(UserRepository.class);
        when(userRepository.findByUsername("user1"))
                .thenReturn(Optional.of(new User("user1", "user1@example.com", "user123")));
        assertEquals(userRepository.findByUsername("user1").get().getUsername(), userService.getUser("user1").getUsername());
    }

    @Test
    public void shouldReturnResponseEntityOKWhenRegisterUser() {
        SignupRequest request = new SignupRequest();
        request.setEmail("testCaseUser@example.com");
        request.setPassword("testCaseUser");
        request.setUsername("testCaseUser");
        assertEquals(HttpStatus.OK, userController.registerUser(request).getStatusCode());
        userRepository.delete(userRepository.findByUsername("testCaseUser").get());
    }
}
