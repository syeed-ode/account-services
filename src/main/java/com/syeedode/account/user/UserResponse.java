package com.syeedode.account.user;

import com.syeedode.account.annotation.ThreadSafe;

import java.util.UUID;

/**
 * Account Services
 * <p>
 * Author: syeedode
 * Date: 9/14/17
 */
@ThreadSafe
public class UserResponse {

    private final String firstName;
    private final String lastName;
    private final String uuid;

    /** Static factory method */
    public static UserResponse getInstance() {
        return new UserResponse("UserServices", "UserServiceResource", UUID.randomUUID().toString());
    }

    /** Constructor */
    private UserResponse(String firstName, String lastName, String uuid) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.uuid = uuid;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUuid() {
        return uuid;
    }
}
