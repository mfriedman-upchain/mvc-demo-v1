package com.upchain.service;

import com.google.common.collect.Lists;
import com.upchain.repository.FileRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FileListServiceTest {

    @InjectMocks
    FileListServiceImpl fileListService;

    @Mock
    FileRepository fileRepository;

    @Test
    public void getAll() {
        List<String> expectedFiles = Lists.newArrayList("a", "b", "c");
        when(fileRepository.getAll()).thenReturn(expectedFiles);
        List<String> actualFiles = fileListService.getAll();
        assertThat(actualFiles, equalTo(expectedFiles));
    }
}