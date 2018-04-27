package com.upchain.controller;

import com.upchain.service.FileListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.ui.Model;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class DemoControllerTest {

    @Mock
    private
    Model model;

    @Mock
    FileListService fileListService;

    @Test
    public void greeting() {
        DemoController demoController = new DemoController(fileListService);
        String str = demoController.greeting("World", model);
        verify(model).addAttribute("name", "World");
        assertThat(str, equalTo("greeting"));
    }
}