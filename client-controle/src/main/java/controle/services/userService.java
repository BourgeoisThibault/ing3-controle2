package controle.services;

import org.springframework.stereotype.Service;
import controle.repositories.*;
import controle.entities.*;

import java.util.List;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:55
 */
@Service
public class userService {

    private userRepository userRepository;

    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<userEntity> getAllUsers() {
        List<userEntity> userEntitiesList = userRepository.findAll();

        return userEntitiesList;
    }
}
