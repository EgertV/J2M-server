package J2M.service;

import J2M.model.UserModel;
import J2M.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserService {

    @Autowired
    UserRepository userRepository;


    public UserModel getUser(long id) {
        return userRepository.getOne(id);
    }

}
