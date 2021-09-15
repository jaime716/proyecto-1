package net.software.backendcursojava.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.software.backendcursojava.models.request.UserDetailRequestModel;

@RestController
@RequestMapping("/users") //localhost:8080/users 
public class UserController { 

    @GetMapping //obtener consultar informacion
    public String getUser(){
       return "Obtener usuarios";
    }    

    @PostMapping // creando informacion
    public UserDetailRequestModel createUser(@RequestBody UserDetailRequestModel userDetails){
        return null;
    }
    
}
