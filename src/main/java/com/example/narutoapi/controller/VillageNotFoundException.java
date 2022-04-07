package com.example.narutoapi.controller;

public class VillageNotFoundException extends RuntimeException {
    VillageNotFoundException(String id) {
        super("Could not find Village with ID#" + id);
    }
}
