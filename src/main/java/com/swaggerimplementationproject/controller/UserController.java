package com.swaggerimplementationproject.controller;

import com.swaggerimplementationproject.entiry.User;
import com.swaggerimplementationproject.service.UserService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/save")
    ResponseEntity<User> save(@RequestBody User user){
        return ResponseEntity.ok().body(userService.save(user));
    }



    @GetMapping("/{id}")
    ResponseEntity<User> getById(@PathVariable Long id){
        return ResponseEntity.ok().body(userService.getById(id));
    }



    @GetMapping("/all")
    ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok().body(userService.getAll());
    }

}
