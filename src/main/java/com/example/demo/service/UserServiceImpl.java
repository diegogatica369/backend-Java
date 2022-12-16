package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    //esto verifica que la conexion a base de datos esta correcta
    public UserServiceImpl (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User getUser(Integer id){
        Optional <User> users = userRepository.findById(id); //select * from user Where id = id;
        return users.orElse(null); //.orElse verifica si hay o no hay datos dentro de la lista, en caso de no haber usuario, retorna null.
    }

    @Override
    public User save(User user){
        return userRepository.save(user); // insert into user (column)(value);
    }

    @Override
    public void delete(Integer id){
        userRepository.deleteById(id); //delete from user where id = id;
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();

    }
}
