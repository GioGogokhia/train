package by.issoft.domain;

import java.util.UUID;

public abstract class User {
    private final UUID userID;
    private final String name;
    private final String lastName;
    private final int age;

    public User(UUID userID, String name, String lastName, int age) {
        this.userID = userID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
