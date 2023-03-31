package by.issoft.domain.users;

import by.issoft.domain.User;

import java.util.UUID;

public class Passenger extends User {
    private final int ticket; //because generally seats are numbered from 1 to N in each carriage.

    public Passenger(UUID userID, String name, String lastName, int age, int ticket) {
        super(userID, name, lastName, age);
        this.ticket = ticket;
    }

    public int getTicket(){
        return ticket;
    }
}
