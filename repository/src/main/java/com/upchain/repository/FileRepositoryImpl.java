package com.upchain.repository;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("!DEV")
public class FileRepositoryImpl implements FileRepository {
    @Override
    public List<String> getAll() {
        throw new RuntimeException("not impl");
    }
}
