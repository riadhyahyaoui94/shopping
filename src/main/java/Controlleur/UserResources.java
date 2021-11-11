package Controlleur;
import com.boockstore.shopping.entities.User;
import com.boockstore.shopping.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/user")
public class UserResources {
    private final UserService userService;

    public UserResources(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/all")
    public ResponseEntity<List<User>>retrieveAllUsers () {
        List<User> users = userService.retrieveAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<User> retrieveUserbyID (@PathVariable("id") int id) {
        User user = userService.retrieveUserbyID(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        User newUser  = userService.addUser(user);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User  updateUser  = userService.addUser(user);
        return new ResponseEntity<>( updateUser, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }







}
