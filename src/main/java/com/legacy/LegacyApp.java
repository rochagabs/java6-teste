package com.legacy;

import java.util.ArrayList;
import java.util.List;

public class LegacyApp {

    public static void main(String[] args) {

        List users = new ArrayList();

        users.add(new User("Ana", new Integer(25)));
        users.add(new User("Bruno", new Integer(16)));
        users.add(new User("Carlos", new Integer(30)));

        UserService service = new UserService();
        service.printAdultUsers(users);
    }
}
