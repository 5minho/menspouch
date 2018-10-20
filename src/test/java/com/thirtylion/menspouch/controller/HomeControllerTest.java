package com.thirtylion.menspouch.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.io.File;
import java.nio.file.Files;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 20/10/2018.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(HomeController.class)
public class HomeControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void indexPageRequestIsOk() throws Exception {
        File indexFile = new ClassPathResource("templates/index.html").getFile();
        String indexFileContent = new String(Files.readAllBytes(indexFile.toPath()));

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string(indexFileContent))
                .andDo(print());
    }

}