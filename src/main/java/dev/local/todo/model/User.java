package dev.local.todo.model;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

   @Column(nullable = false)
    private String name;

   @Column(nullable = false)
    private Integer age;

   @Column(nullable = false)
    private String username;

   @Column(nullable = false)
    private String password;

   public User(){}

    public User(String name, Integer age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
