package co.id.hanif.dev.webservice.rest.controller;

import co.id.hanif.dev.webservice.rest.entity.User;
import co.id.hanif.dev.webservice.rest.repository.UserDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/users")
public class UserDBController {
    @Autowired //this means to get the bean called userDBRepository
    //which is auto-generated by spring, we will use it to handle the data
    private UserDBRepository userDBRepository;

    @GetMapping(path = "/")
    public @ResponseBody
    Iterable<User> findAll(){
        return userDBRepository.findAll();
    }

    @PostMapping(path = "/signup")
    User signup(@RequestBody User user){
//        User user = new User();
        user.setUsername("test coding");
        user.setEmail("test@coding.test");
        user.setPassword("123456");
        user.setPhone("0123456");
        user.setAddress("asdasdasdsad");
        user.setCity("aaa");
        user.setCountry("aaa");
        user.setName("postman");
        user.setPostcode("12345");
        return userDBRepository.save(user);

    }

    @PostMapping(path = "/signin")
    User signin(@RequestBody User user){
//        User user = new User();
        user.setEmail("test@coding.test");
        user.setPassword("123456");
        return userDBRepository.save(user);

    }



}
