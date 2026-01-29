package com.legacy;

import java.util.ArrayList;
import java.util.List;

public class LegacyApp {

    public static void main(String[] args) {

        var users = new ArrayList<User>();

        users.add(new User("Ana", 25));
        users.add(new User("Bruno", 16));
        users.add(new User("Carlos", 30));

        var service = new UserService();
        service.printAdultUsers(users);
    }
}
