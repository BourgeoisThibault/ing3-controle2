package controle.repositories;

import controle.entities.*;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     12:52
 */
public interface bookRepository extends Repository<bookEntitiy, Long> {
    List<bookEntitiy> findAll();
}
