package com.example.narutoapi.repository;

import java.util.List;

import com.example.narutoapi.model.Shinobi;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;


public interface ShinobiRepository extends MongoRepository<Shinobi, String> {
    @Query("{firstName:'?0'}")
    List<Shinobi> findAllByQuery(String firstName);

    public long count();
}
