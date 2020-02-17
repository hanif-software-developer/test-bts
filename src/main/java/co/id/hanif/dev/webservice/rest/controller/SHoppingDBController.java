package co.id.hanif.dev.webservice.rest.controller;

import co.id.hanif.dev.webservice.rest.entity.Shopping;
import co.id.hanif.dev.webservice.rest.entity.User;
import co.id.hanif.dev.webservice.rest.repository.ShoppingDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/shopping")
public class SHoppingDBController {
    @Autowired
    private ShoppingDBRepository shoppingDBRepository;

    @GetMapping(path = "/")
    public @ResponseBody
    Iterable<Shopping> findAll(){
        return shoppingDBRepository.findAll();
    }

    @PostMapping(path = "/")
    Shopping newShopping(@RequestBody Shopping shopping){
//        User user = new User();
       shopping.setId(10);
       shopping.setCreatedDate("2019-03-18");
       shopping.setName("new shopping");
        return shoppingDBRepository.save(shopping);

    }

//    @GetMapping(path = "/")
//    public @ResponseBody
//    Shopping findAllbyId(@RequestParam String id){
//        return shoppingDBRepository.findAllById(id);
//    }

//    @GetMapping(path = "/")
//    public @ResponseBody Iterable<Shopping> findById(@RequestParam Integer theId){
//        return shoppingDBRepository.findAllById(theId);}
}
