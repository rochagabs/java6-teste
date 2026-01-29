package com.legacy;

import java.util.List;

public class UserService {

    public void printAdultUsers(List<User> users) {

        if (users == null || users.isEmpty()) {
            System.out.println("Lista vazia");
            return;
        }

        users.stream()
             .filter(user -> user.age() != null && user.age() >= 18)
             .forEach(user -> System.out.println(user.name() + " é adulto"));
    }
}
