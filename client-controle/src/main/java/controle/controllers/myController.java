package controle.controllers;

import annotation.TryAgain;
import controle.services.*;
import controle.entities.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     11:46
 */
@RestController
@RequestMapping(path = "/")
public class myController {

    private userService userService;

    public myController(controle.services.userService userService) {
        this.userService = userService;
    }

    @TryAgain(tabException = {Exception.class, IOException.class})
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getHome() {
        return new ResponseEntity("This is home...", HttpStatus.OK);
    }

    @TryAgain(tabException = {Exception.class, IOException.class})
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity borrowBook() {
        return new ResponseEntity("Need borrow", HttpStatus.OK);
    }

}