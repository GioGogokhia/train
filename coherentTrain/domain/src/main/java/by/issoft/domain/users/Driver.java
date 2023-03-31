package by.issoft.domain.users;

import by.issoft.domain.User;

import java.util.UUID;

public class Driver extends User {
    private final boolean licence;

    public Driver(UUID userID, String name, String lastName, int age, boolean licence) {
        super(userID, name, lastName, age);
        if(age >= 18) {
            this.licence = licence;
        } else {
            throw new IllegalArgumentException("Driver can not be underage!");
        }
        if(!licence){
            throw new IllegalArgumentException("Driver needs to have a license");
        }
    }
}
