package com.stanisci.project1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stanisci.project1.entitys.User;

@RestController
@RequestMapping(value = "/user")
public class UserResources {
    @GetMapping
public ResponseEntity<User>findAll(){
  User u = new User(1L,"maria","maria@gmail.com","99999999","1234");
return ResponseEntity.ok().body(u);

}


}
