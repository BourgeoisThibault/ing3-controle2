package controle.services;

import controle.entities.*;
import controle.repositories.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     13:10
 */
@Service
public class bookService {

    private bookRepository bookRepository;

    public bookService(bookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<bookEntitiy> getAllUsers() {
        List<bookEntitiy> bookEntitiyList = bookRepository.findAll();

        return bookEntitiyList;
    }
}
