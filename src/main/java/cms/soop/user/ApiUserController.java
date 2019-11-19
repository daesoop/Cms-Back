package cms.soop.user;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiUserController {


    @CrossOrigin(origins = "http://localhost:7080/")
    @GetMapping("/api/user")
    public ResponseEntity check() {
        System.out.println("back is working!");
        return new ResponseEntity("backend server is okay", HttpStatus.OK);
    }
}
