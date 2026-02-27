package com.pedroantonio.workshop.resources;

import com.pedroantonio.workshop.entities.User;
import jakarta.annotation.Resources;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User("pedro@gmail.com", 1L, "Pedro", "12345" , "999999");
        return ResponseEntity.ok().body(u);
    }
}
