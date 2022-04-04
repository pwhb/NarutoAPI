package com.example.narutoapi.controller;

public class ShinobiNotFoundException extends RuntimeException {
    ShinobiNotFoundException(String id) {
        super("Could not find Document with ID#" + id);
    }
}
