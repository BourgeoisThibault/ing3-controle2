package controle.controllers;

import annotation.TryAgain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     13:07
 */
@RestController
@RequestMapping(path = "/book")
public class bookController {

    @TryAgain(tabException = {Exception.class, IOException.class})
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity borrowBook() {
        return new ResponseEntity("Need borrow", HttpStatus.OK);
    }

}
