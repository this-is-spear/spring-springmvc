package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

/**
 * Created by Imaspear on 2022-01-13
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    @GetMapping
    public String user() {
        return "get user";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get user id= " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update user id= " + userId;
    }
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete user id= " + userId;
    }

}
