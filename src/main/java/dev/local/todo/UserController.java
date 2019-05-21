package dev.local.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

   @Autowired
   UserRepository userRepository;

   @RequestMapping("/finduser")
   public User FindUser() {
      return userRepository.findUser("Peter");
   }

   @RequestMapping("/getusers")
   public List<User> getUsers() {
      return userRepository.getUsers();
   }
}
