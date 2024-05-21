package com.api.triwal.keycloakapp.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello1")
    @PreAuthorize("hasRole('ROLE_admin_client_role')")
    public String helloAdmin(){
        return "Hello world - admin";
    }

    @GetMapping("/hello2")
    @PreAuthorize("hasRole('ROLE_user_client_role') or hasRole('ROLE_admin_client_role') ")
    public String helloUser(){
        return "Hello world - user";
    }



}
