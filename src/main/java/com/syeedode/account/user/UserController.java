package com.syeedode.account.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Account Services
 * <p>
 * Author: syeedode
 * Date: 9/13/17
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<UserResponse> getAccount() {
        return ResponseEntity.ok(UserResponse.getInstance());
        // 215-452-3376
        // 314-452-3376
    }
}
