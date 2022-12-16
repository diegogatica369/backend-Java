package com.example.demo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;



@Entity(name = "User") // le vamos a poner el nombre a nuestra tabla en la base de datos
public class User {
    @Id //le especificamos a la base que el siguente atributo sera el id de la tabla
    @GeneratedValue //generamos la llave primaria
    private int id; //definimos el atributo id
    private String name;
    @Column(name="last_name")
    private String lastName; //este se usa en postman, no el que sale en base de datos
    @Column(name="email", unique = true) //esto hace que los correos que se ingresen tengan que ser unicos
    private String email;

 //relacion 1:1 one to one
 @OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
 private License license;

 //one to many
 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
 private List<BuySell> BuySell;

    //constructores
    public User() {
    }

    public User(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    //geters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
    
}
