package project.cinema.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/cinema")
public class CinemaController {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> testGetRequest(@RequestParam(value = "cinemaCode", required = true) int cinemaCode) {
        return new ResponseEntity<>("Response for cinema code: ", HttpStatus.OK);
    }

}
