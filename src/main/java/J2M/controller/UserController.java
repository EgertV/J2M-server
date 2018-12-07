package J2M.controller;

import J2M.model.UserModel;
import J2M.repository.UserRepository;
import J2M.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value= "/{id}", method = RequestMethod.GET)
    public UserModel getUser(@PathVariable("id") long id) {
        return userRepository.getOne(id);
    }

    @RequestMapping(value="/newcomers/{id}", method = RequestMethod.GET)
    public List<UserModel> getNewcomers(@PathVariable("id") long id) {
        Collection<Long> newcomerIds = userRepository.getOne(id).getNewcomers();
        return userRepository.findAllById(newcomerIds);
    }

}
