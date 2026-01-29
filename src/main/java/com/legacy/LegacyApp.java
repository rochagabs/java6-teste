package com.legacy;

import java.util.ArrayList;
import java.util.List;

public class LegacyApp {

    public static void main(String[] args) {

        List users = new ArrayList();

        users.add(new User("Daniel", new Integer(25)));
        users.add(new User("Ester", new Integer(16)));
        users.add(new User("Filo", new Integer(30)));

        UserService service = new UserService();
        service.printAdultUsers(users);
    }
}
