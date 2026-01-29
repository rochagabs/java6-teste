package com.legacy;

import java.util.ArrayList;
import java.util.List;

public class LegacyApp {

    public static void main(String[] args) {

        var users = new ArrayList<User>();

        users.add(new User("Daniel", 25));
        users.add(new User("Ester", 16));
        users.add(new User("Filo", 30));

        var service = new UserService();
        service.printAdultUsers(users);
    }
}
