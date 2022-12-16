//Controller conecta con el frontend
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import com.example.demo.service.UserServiceImpl;

@RestController
@CrossOrigin("*")
public class UserController {
    
    private UserService userService;
    private UserServiceImpl userServiceImpl;

    public UserController (@Autowired UserService userService){
        this.userService = userService;
    }
    

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id); 
    }

    @PostMapping("/user")
    public User newUser(@RequestBody User user){
        return userService.save(user);
    }

    @PutMapping("/user")
    public User updatUser(@RequestBody User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.delete(id);
    }
    
    @RequestMapping("/allUser")
    public List<User> getAllUsers(){
        List<User> listaUser = userService.getAllUsers();
        return listaUser;
    }
}
//post = crear
//put = editar