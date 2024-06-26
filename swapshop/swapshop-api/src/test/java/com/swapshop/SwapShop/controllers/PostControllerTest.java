package com.swapshop.SwapShop.controllers;

import com.swapshop.SwapShop.entities.User;
import com.swapshop.SwapShop.repositories.PostRepository;
import com.swapshop.SwapShop.services.PostService;
import com.swapshop.SwapShop.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest {

    @Autowired
    private PostService postService;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostController postController;
    @Qualifier("userService")
    @Autowired
    private UserService userService;

//    protected void setUp() throws Exception {
//
//        SecurityContextHolder.getContext().setAuthentication(
//                new UsernamePasswordAuthenticationToken(testUser.getLogin(), testUser.getPassword()));
//    }

//    @Test
//    @WithMockUser(authorities={"ROLE_USER"})
//    public void shouldIncremetVoteCountWhenUpvotedPost() {
//        when(userService.getUser(""))
//                .thenReturn(new User("user1", "user1@example.com", "user123"));
//        postController.upvotePost(postRepository.findAll().get(0).getId());
//        assertEquals(1, postRepository.getById(postRepository.findAll().get(0).getId()).getWantItCtr());
//    }


}
