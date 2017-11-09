package controle.repositories;

import controle.entities.*;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:53
 */
public interface userRepository extends Repository<userEntity, Long> {
    List<userEntity> findAll();
}
