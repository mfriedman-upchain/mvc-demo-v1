package com.upchain.service;

import com.upchain.repository.FileRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FileListServiceImpl implements FileListService {

    private final FileRepository fileRepository;

    public FileListServiceImpl(FileRepository fileRepository) {
        this.fileRepository = fileRepository;
    }

    @Override
    public List<String> getAll() {
        return fileRepository.getAll();
    }
}
