package dev.local.todo.service;

import dev.local.todo.dao.UserRepository;
import dev.local.todo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User adduser(String name, Integer age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userRepository.save(user);
    }

    public List<User> deleteUser(String name) {
        List<User> list = userRepository.getUsers();
        for(int i = 0;i < list.size();) {
            if(list.get(i).getName().equals(name)) {
                userRepository.delete(list.get(i));
                list.remove(list.get(i));
            }else{
                i++;
            }
        }
        return list;
    }

}
