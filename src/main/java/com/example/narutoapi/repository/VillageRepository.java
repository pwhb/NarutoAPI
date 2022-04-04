package com.example.narutoapi.repository;

import com.example.narutoapi.model.Village;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VillageRepository extends MongoRepository<Village, String> {

}
