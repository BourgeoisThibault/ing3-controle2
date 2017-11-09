package controle.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BOURGEOIS Thibault
 * Date     09/11/2017
 * Time     11:46
 */
@RestController
@RequestMapping(path = "/")
public class myController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity getHome() {
        return new ResponseEntity("coucou", HttpStatus.OK);
    }

}