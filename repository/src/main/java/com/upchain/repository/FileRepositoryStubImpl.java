package com.upchain.repository;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Profile("DEV") // never run this profile outside of dev, by default
public class FileRepositoryStubImpl implements FileRepository {

    @Override
    public List<String> getAll() {
        return Lists.newArrayList("filename-mock1", "filename-mock2", "filename-mock3");
    }
}
