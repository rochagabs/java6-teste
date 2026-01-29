package com.legacy;

import java.util.List;

public class UserService {

    public void printAdultUsers(List<User> users) {

        if (users == null || users.isEmpty()) {
            System.out.println("Lista sem nada");
            return;
        }

        for (var user : users) {
            if (user.age() >= 18) {
                System.out.println(user.name() + " é pessoa adulta");
            }
        }
    }
}
