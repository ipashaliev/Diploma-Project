package com.swapshop.SwapShop.controllers;

import com.swapshop.SwapShop.repositories.ImageRepository;
import com.swapshop.SwapShop.repositories.PostRepository;
import com.swapshop.SwapShop.services.ImageService;
import com.swapshop.SwapShop.services.PostService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class FileControllerTest {

    @Autowired
    private ImageService imageService;

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private FileController fileController;

//    protected void setUp() throws Exception {
//
//        SecurityContextHolder.getContext().setAuthentication(
//                new UsernamePasswordAuthenticationToken(testUser.getLogin(), testUser.getPassword()));
//    }



}
